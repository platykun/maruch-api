package maruch.domain;

import lombok.Getter;
import maruch.domain.value.SexEnum;

public class User {
    /**
     * ユーザを作成する.
     *
     * @param userName ユーザ名.
     * @param sex 性別.
     * @return ユーザ.
     */
    public static User craeteUser(String userName, SexEnum sex) {
        return new User(userName, sex);
    }

    /**
     * ユーザIDを設定する.
     *
     * @param id ユーザID
     * @return ユーザID
     */
    public User setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * コンストラクタ.
     *
     * @param userName ユーザ名.
     * @param sex 性別.
     */
    private User(String userName, SexEnum sex) {
        this.userName = userName;
        this.sex = sex;
    }

    /**
     * ユーザID.
     */
    @Getter
    private int id;

    /**
     * ユーザ名.
     */
    @Getter
    private String userName;

    /**
     * 性別.
     */
    @Getter
    private SexEnum sex;
}
