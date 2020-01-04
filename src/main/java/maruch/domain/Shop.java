package maruch.domain;

import lombok.Getter;

/**
 * 店舗.
 */
public class Shop {
    /**
     * 店舗オブジェクトを作成する.
     *
     * @param id ユーザID.
     * @param name 店舗名.
     * @param nameKana 店舗名かな.
     * @param tel 電話番号.
     * @param address 住所.
     * @param openTime 開店時間.
     * @param holiday 祝日.
     * @param url サイトURL.
     * @return 店舗オブジェクト
     */
    static Shop create(String id, String name, String nameKana, String tel, String address, String openTime, String holiday, String url){
        return new Shop(
                id,
                name,
                nameKana,
                tel,
                address,
                openTime,
                holiday,
                url
        );
    }


    private Shop(String id, String name, String nameKana, String tel, String address, String openTime, String holiday, String url) {
        this.id = id;
        this.name = name;
        this.nameKana = nameKana;
        this.tel = tel;
        this.address = address;
        this.openTime = openTime;
        this.holiday = holiday;
        this.url = url;
    }
    /**
     * ユーザID.
     */
    @Getter
    private String id;

    /**
     * 店舗名.
     */
    @Getter
    private String name;

    /**
     * 店舗名かな.
     */
    @Getter
    private String nameKana;

    /**
     * 電話番号.
     */
    @Getter
    private String tel;

    /**
     * 住所.
     */
    @Getter
    private String address;

    /**
     * 開店時間.
     */
    @Getter
    private String openTime;

    /**
     * 祝日.
     */
    @Getter
    private String holiday;

    /**
     * サイトURL.
     */
    @Getter
    private String url;
}
