package swagger.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 値の範囲を指定
 */
@ApiModel(description = "値の範囲を指定")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-12-27T18:46:41.493073+09:00[Asia/Tokyo]")
public class IntegerRange  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("min")
  private Integer min = null;

  @JsonProperty("max")
  private Integer max = null;

  public IntegerRange min(Integer min) {
    this.min = min;
    return this;
  }

  /**
   * 最小値
   * @return min
  **/
  @ApiModelProperty(example = "1", value = "最小値")

  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public IntegerRange max(Integer max) {
    this.max = max;
    return this;
  }

  /**
   * 最大値
   * @return max
  **/
  @ApiModelProperty(example = "1000", value = "最大値")

  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegerRange integerRange = (IntegerRange) o;
    return Objects.equals(this.min, integerRange.min) &&
        Objects.equals(this.max, integerRange.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegerRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
