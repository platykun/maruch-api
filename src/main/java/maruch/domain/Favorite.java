package maruch.domain;

import lombok.Getter;

import java.util.Date;

/**
 * お気に入り.
 */
public class Favorite {

    /**
     * お気に入りを追加する.
     *
     * @param userId ユーザID.
     * @param lunchId ランチID.
     * @return お気に入り.
     */
    public static Favorite add(int userId, int lunchId) {
        Date date = new Date();
        return new Favorite(userId, lunchId, date);
    }

    /**
     * お気に入りオブジェクトを作成する.
     *
     * @param userId ユーザID.
     * @param lunchId ランチID.
     * @param date お気に入り日時.
     * @return お気に入り.
     *
     */
    public static Favorite create(int userId, int lunchId, Date date) {
        return new Favorite(userId, lunchId, date);
    }


    private Favorite(int userId, int userName, Date date) {
        this.userId = userId;
        this.lunchId = userName;
        this.date = date;
    }

    /**
     * ユーザID.
     */
    @Getter
    private int userId;

    /**
     * ランチID.
     */
    @Getter
    private int lunchId;

    /**
     * お気に入り日付.
     */
    @Getter
    private Date date;
}
