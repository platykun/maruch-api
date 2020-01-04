package maruch.domain.value;

import lombok.Getter;

/**
 * 性別を表す.
 */
@Getter
public enum SexEnum {
    MAN("man"),

    WOMAN("woman"),

    OTHER("other");

    private String value;

    SexEnum(String value) {
        this.value = value;
    }

    /**
     * Enumへ変換する.
     *
     * @param value 変換元String
     * @return 変換先
     */
    public static SexEnum toEnum(String value) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getValue().equals(value)) {
                return sex;
            }
        }
        return null;
    }
}
