package maruch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * ランチテーブル.
 */
@Entity
@Table(name = "lunch")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LunchEntity implements Serializable {
    /**
     * ID.
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    /**
     * ランチ画像URL
     */
    private String imageUrl;

    /**
     * ランチ情報作成者のユーザID.
     */
    private int author;

    /**
     * 店舗ID.
     */
    private int shopId;

    /**
     * 価格.
     */
    private int price;
}
