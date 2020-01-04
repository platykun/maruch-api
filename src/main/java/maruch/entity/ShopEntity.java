package maruch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 店舗テーブル.
 */
@Entity
@Table(name = "shop")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopEntity implements Serializable {
    /**
     * ID.
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    /**
     * 店舗名.
     */
    private String name;

    /**
     * 店舗名かな.
     */
    private String nameKana;

    /**
     * 電話番号.
     */
    private String tel;

    /**
     * 住所.
     */
    private String address;

    /**
     * 開店時間.
     */
    private String openTime;

    /**
     * 祝日.
     */
    private String holiday;

    /**
     * サイトURL.
     */
    private String url;
}
