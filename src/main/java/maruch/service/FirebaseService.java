package maruch.service;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.projectmanagement.FirebaseProjectManagement;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class FirebaseService {

    FirebaseApp firebaseApp;

    FirebaseAuth firebaseAuth;

    FirebaseDatabase firebaseDatabase;

    FirebaseProjectManagement firebaseProjectManagement;

    public FirebaseService() {
        FirebaseOptions options = null;
        try {
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.getApplicationDefault())
//                    .setDatabaseUrl("https:///maruch-fb-api.firebaseio.com/")
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        firebaseApp = FirebaseApp.initializeApp(options);

        firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
        firebaseProjectManagement = FirebaseProjectManagement.getInstance(firebaseApp);
//        firebaseDatabase = FirebaseDatabase.getInstance(firebaseApp);
    }


    /**
     * token情報から認証情報を取得する
     *
     * @param token
     * @return
     */
    public UserRecord getFirebaseToken(String token){
//        Task<FirebaseToken> firebaseTokenTask = null;
//        FirebaseToken firebaseToken = firebaseTokenTask.getResult();

        UserRecord userRecord = null;
        try {
            userRecord = firebaseAuth.getUser("hlEsUZOXp1QRNLxbax70hF3Tfol1");
            System.out.println(userRecord.toString());
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }

        return userRecord;
    }

    public UserRecord findBy(String token){
        System.out.println("==== findBy called ====");
        UserRecord userRecord = null;
        try {
            userRecord = firebaseAuth.getUser("hlEsUZOXp1QRNLxbax70hF3Tfol1");
            System.out.println(userRecord.toString());
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }
        System.out.println(userRecord.getUid());

        return userRecord;
    }
}
