package maruch.helper;

import maruch.domain.value.SearchPropertiesValue;

/**
 * swaggerオブジェクトとドメインオブジェクトを変換する
 */
public class SearchPropertiesHelper {

    /**
     * リスト情報を検索するためのmodelを作成する.
     *
     * @param req 検索条件
     * @return 検索条件model
     */
    public static SearchPropertiesValue convertToModel(
            maruch.swagger.api.model.SearchProperties req
    ) {
        return SearchPropertiesValue.create(req.getCount().intValue(), req.getCursor().intValue());
    }
}
