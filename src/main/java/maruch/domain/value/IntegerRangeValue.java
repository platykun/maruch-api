package maruch.domain.value;

import lombok.Getter;

/**
 * 値の範囲を表す.
 */
public class IntegerRangeValue {
    /**
     * 最小値.
     */
    @Getter
    private int min;

    /**
     * 最大値.
     */
    @Getter
    private int max;

    public static IntegerRangeValue create(int min, int max) {
        return new IntegerRangeValue(min, max);
    }

    private IntegerRangeValue(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
