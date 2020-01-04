package maruch.domain;

import lombok.Getter;

/**
 * ランチ詳細情報.
 */
public class LunchDetail {
    /**
     * ランチ詳細情報オブジェクトを作成する.
     */
    public static LunchDetail create(int id, int calorie, String description, float fiber, String label, float lipid, float protein, float salt) {
        return new LunchDetail(
                id, calorie, description, fiber, label, lipid, protein, salt
        );
    }

    private LunchDetail(int id, int calorie, String description, float fiber, String label, float lipid, float protein, float salt) {
        this.lunchId = id;
        this.calorie = calorie;
        this.description = description;
        this.fiber = fiber;
        this.label = label;
        this.lipid = lipid;
        this.protein = protein;
        this.salt = salt;
    }

    /**
     * ランチID.
     */
    @Getter
    private int lunchId;


    /**
     * カロリー.
     */
    @Getter
    private int calorie;

    /**
     * 炭水化物.
     */
    @Getter
    private int carbohydrate;

    /**
     * ランチの詳細情報.
     */
    @Getter
    private String description;

    /**
     * 食物繊維.
     */
    @Getter
    private float fiber;

    /**
     * ラベル.
     */
    @Getter
    private String label;

    /**
     * 脂質.
     */
    @Getter
    private float lipid;

    /**
     * タンパク質.
     */
    @Getter
    private float protein;

    /**
     * 塩分.
     */
    @Getter
    private float salt;
}
