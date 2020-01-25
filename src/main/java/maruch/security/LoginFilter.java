package maruch.security;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.util.Base64;
import com.google.firebase.auth.UserRecord;
import io.jsonwebtoken.*;
import maruch.service.FirebaseService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;

@Component
public class LoginFilter extends OncePerRequestFilter {

    // 予めObjectMapperをBean登録しておきます
    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    FirebaseService firebaseService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        // コンテキストにログインユーザ情報をセット
        SecurityContextHolder.getContext().setAuthentication(new PreAuthenticatedAuthenticationToken(
                auth(request), null));

        filterChain.doFilter(request, response);
    }

    // ログインユーザ情報を取得
    private UserRecord auth(HttpServletRequest request) {

        // リクエストヘッダからJWTを取り出す
        String token = getToken(request);

        return firebaseService.findBy(token);

//        try {
//
//            // JWTを検証、クレーム取得
//            // 検証に失敗したら、例外がスローされる。
//            Jws<Claims> claim = Jwts.parser()
//                    .setSigningKeyResolver(new GoogleSigningKeyResolver()) // 独自のリゾルバが必要
//                    .parseClaimsJws(token);
//
//            // クレームのボディ部分からuidを取得
//            String uid = (String)claim.getBody().get("user_id");
//
//            // uidを取得し、ユーザ情報を検索
//            return firebaseService.findBy(uid);
//
//        } catch (Exception e) {
//            throw new BadCredentialsException("トークンが無効です");
//        }
    }

    // リクエストヘッダからトークンを取得します。
    private String getToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token == null || !token.startsWith("Bearer ")) {
            return null;
        }
        return token.substring("Bearer ".length());
    }

    /**
     * 署名に利用する公開鍵を返却します。
     *
     * @author h.ono
     *
     */
    public class GoogleSigningKeyResolver extends SigningKeyResolverAdapter {

        @Override
        public Key resolveSigningKey(JwsHeader jwsHeader, Claims claims) {

            try {
                Map<String, Object> map = getJwks();

                if (map.isEmpty()) {
                    return null;
                }

                String keyValue = (String) map.get(jwsHeader.getKeyId());

                if (keyValue == null) {
                    return null;
                }
                // 重要ポイント
                // 開始（BEGIN）と終了（END）のラベルを除去する。
                keyValue = keyValue
                        .replaceAll("-----BEGIN CERTIFICATE-----\n", "")
                        .replaceAll("-----END CERTIFICATE-----\n", "");

                InputStream in = new ByteArrayInputStream(Base64.decodeBase64(keyValue.getBytes("UTF-8")));
                X509Certificate certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(in);
                return certificate.getPublicKey();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        /**
         * GoogleからJWKSを取得します。
         *
         * @return JWKS
         */
        private Map<String, Object> getJwks() {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://www.googleapis.com/robot/v1/metadata/x509/securetoken@system.gserviceaccount.com")
                    .build();
            try (Response response = client.newCall(request).execute()) {
                return objectMapper.readValue(response.body().string(), new TypeReference<Map<String, Object>>() {
                });
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
