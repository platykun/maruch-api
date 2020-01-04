package maruch.helper;

import maruch.domain.value.SearchPropertiesValue;

import java.math.BigDecimal;

/**
 * swaggerオブジェクトとドメインオブジェクトを変換する
 */
public class SearchPropertiesHelper {

    /**
     * リスト情報を検索するためのmodelを作成する.
     *
     * @return 検索条件model
     */
    public static SearchPropertiesValue convertToModel(BigDecimal count, BigDecimal cursor) {
        return SearchPropertiesValue.create(count.intValue(), cursor.intValue());
    }
}
