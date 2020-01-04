package maruch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * ランチ詳細テーブル.
 */
@Entity
@Table(name = "lunch_detail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LunchDetailEntity implements Serializable {
    /**
     * ランチID.
     */
    @Id
    private int lunchId;

    /**
     * カロリー.
     */
    private int calorie;

    /**
     * 炭水化物.
     */
    private int carbohydrate;

    /**
     * ランチの詳細情報.
     */
    private String description;

    /**
     * 食物繊維.
     */
    private float fiber;

    /**
     * ラベル.
     */
    private String label;

    /**
     * 脂質.
     */
    private float lipid;

    /**
     * タンパク質.
     */
    private float protein;

    /**
     * 塩分.
     */
    private float salt;
}
