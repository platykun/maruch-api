package maruch.domain;

import lombok.Getter;

/**
 * ランチ.
 */
public class Lunch {
    /**
     * ランチオブジェクトを作成する.
     *
     * @param id ランチID.
     * @param imageUrl ランチ画像URL.
     * @param author ランチ情報作成者のユーザID.
     * @param shopId 店舗ID.
     * @param price 価格.
     * @return ランチオブジェクト.
     */
    public static Lunch create(int id, String imageUrl, int author, int shopId, int price){
        return new Lunch(
          id,
          imageUrl,
          author,
          shopId,
          price
        );
    }

    /**
     * 詳細情報を追加する.
     * @param detail 詳細情報.
     * @return ランチオブジェクト.
     */
    public Lunch addDetail(LunchDetail detail) {
        this.lunchDetail = detail;
        return this;
    }


    private Lunch(int id, String imageUrl, int author, int shopId, int price) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.author = author;
        this.shopId = shopId;
        this.price = price;
    }

    /**
     * ランチID.
     */
    @Getter
    private int id;

    /**
     * ランチ画像URL
     */
    @Getter
    private String imageUrl;

    /**
     * ランチ情報作成者のユーザID.
     */
    @Getter
    private int author;

    /**
     * 店舗ID.
     */
    @Getter
    private int shopId;

    /**
     * 価格.
     */
    @Getter
    private int price;

    /**
     * ランチ詳細情報.
     */
    @Getter
    private LunchDetail lunchDetail;
}
