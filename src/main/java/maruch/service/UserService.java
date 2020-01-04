package maruch.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import maruch.domain.User;
import maruch.domain.value.SexEnum;
import maruch.entity.AppUserEntity;
import maruch.repository.AppUserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    @NonNull
    AppUserRepository appUserRepository;

    /**
     * ユーザを作成する.
     *
     * @return 作成済みユーザ情報
     */
    public User craeteUser(User user) {
        AppUserEntity appUserEntity = new AppUserEntity(
                0,
                user.getUserName(),
                user.getSex().toString()
        );

        AppUserEntity result = appUserRepository.save(appUserEntity);

        return User.craeteUser(
                result.getUserName(),
                SexEnum.toEnum(result.getSex())
        ).setId(result.getId());
    }

    /**
     * ユーザ情報を更新する.
     *
     * @param user 更新ユーザ
     * @return 更新済ユーザ情報
     * @throws IllegalArgumentException ユーザIDが不正な値の場合
     */
    public User updateUser(User user) throws IllegalArgumentException{
        if (user.getId() == 0) {
            throw new IllegalArgumentException();
        }

        AppUserEntity appUserEntity = new AppUserEntity(
                user.getId(),
                user.getUserName(),
                user.getSex().toString()
        );

        AppUserEntity result = appUserRepository.save(appUserEntity);

        return User.craeteUser(
                result.getUserName(),
                SexEnum.toEnum(result.getSex())
        ).setId(result.getId());
    }

    /**
     * ログインユーザを取得する.
     * TODO: セッション情報からユーザ情報を取得する必要がある.
     *
     * @return ログインユーザ.
     */
    public User getLoginUser() {
        return User.craeteUser(
                "alice",
                SexEnum.WOMAN
        ).setId(1);
    }

    /**
     * ログインユーザの一覧を取得する.
     *
     * @param page 取得ページ
     * @param size 取得サイズ
     * @return ログインユーザ一覧
     */
    public List<User> getLoginUsers(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        List<AppUserEntity> userEntities = appUserRepository.findAll(pageable).toList();

        return userEntities.stream()
                .map(u -> User.craeteUser(u.getUserName(), SexEnum.toEnum(u.getSex()))
                        .setId(u.getId()))
                .collect(Collectors.toList());
    }


}
