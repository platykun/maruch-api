package maruch.domain.value;

import lombok.Getter;

import java.util.List;

/**
 * ランチ情報一覧取得するためのパラメータ情報.
 */
public class LunchSearchValue {

    /**
     * ランチ検索用オブジェクトを作成する.
     *
     * @param spv 検索条件
     * @param se ソート条件
     * @param vr 値段の取得範囲
     * @param lr 脂質の取得範囲
     * @return ランチ検索用オブジェクト
     */
    public static LunchSearchValue create(SearchPropertiesValue spv, List<SortEnum> se, IntegerRangeValue vr, IntegerRangeValue lr){
        return new LunchSearchValue(spv, se, vr, lr);
    }

    private LunchSearchValue(SearchPropertiesValue spv, List<SortEnum> se, IntegerRangeValue vr, IntegerRangeValue lr) {
        this.searchPropertiesValue = spv;
        this.sort = se;
        this.valueRange = vr;
        this.lipidRange = lr;
    }

    /**
     * 検索条件.
     */
    @Getter
    private SearchPropertiesValue searchPropertiesValue;

    /**
     * ソート条件.
     */
    @Getter
    private List<SortEnum> sort;

    /**
     * 値段の取得範囲.
     */
    @Getter
    private IntegerRangeValue valueRange;

    /**
     * 脂質の取得範囲.
     */
    @Getter
    private IntegerRangeValue lipidRange;

    /**
     * ソート条件を表すEnum.
     */
    public enum SortEnum{
        VALUE("price"),
        LIPID("lipid"),
        RANDOM("random");

        @Getter
        private String value;

        SortEnum(String value) {
            this.value = value;
        }

        /**
         * Enumへ変換する.
         *
         * @param value 変換元String
         * @return 変換先
         */
        public static SortEnum toEnum(String value) {
            for (SortEnum val : SortEnum.values()) {
                if (val.getValue().equals(value)) {
                    return val;
                }
            }
            return null;
        }
    }
}
