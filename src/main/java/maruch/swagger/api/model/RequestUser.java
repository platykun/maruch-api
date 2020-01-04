package maruch.swagger.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ユーザ情報
 */
@ApiModel(description = "ユーザ情報")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T15:52:30.862918+09:00[Asia/Tokyo]")
public class RequestUser  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  /**
   * 性別
   */
  public enum SexEnum {
    MAN("man"),
    
    WOMAN("woman"),
    
    OTHER("other");

    private String value;

    SexEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SexEnum fromValue(String text) {
      for (SexEnum b : SexEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sex")
  private SexEnum sex = null;

  @JsonProperty("birth")
  private String birth = null;

  public RequestUser name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ユーザ名
   * @return name
  **/
  @ApiModelProperty(example = "alice", value = "ユーザ名")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RequestUser sex(SexEnum sex) {
    this.sex = sex;
    return this;
  }

  /**
   * 性別
   * @return sex
  **/
  @ApiModelProperty(example = "woman", value = "性別")

  public SexEnum getSex() {
    return sex;
  }

  public void setSex(SexEnum sex) {
    this.sex = sex;
  }

  public RequestUser birth(String birth) {
    this.birth = birth;
    return this;
  }

  /**
   * 誕生年月日(yyyy-mm-dd)
   * @return birth
  **/
  @ApiModelProperty(example = "1992-12-11T00:00:00.000+0000", value = "誕生年月日(yyyy-mm-dd)")

  public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestUser requestUser = (RequestUser) o;
    return Objects.equals(this.name, requestUser.name) &&
        Objects.equals(this.sex, requestUser.sex) &&
        Objects.equals(this.birth, requestUser.birth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sex, birth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestUser {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
