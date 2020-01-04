package maruch.domain.value;

import lombok.Getter;

/**
 * 検索情報を取得するためのパラメータ情報.
 */
public class SearchPropertiesValue {

    static public SearchPropertiesValue create(int count, int cursor) {
        return new SearchPropertiesValue(count, cursor);
    }

    private SearchPropertiesValue(int count, int cursor) {
        this.count = count;
        this.cursor = cursor;
    }

    /**
     * 返却するデータのサイズ.
     */
    @Getter
    private int count;

    /**
     * 取得するデータのページ数。
     */
    @Getter
    private int cursor;
}
