package maruch.swagger.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-25T20:44:48.245351+09:00[Asia/Tokyo]")
public class SearchProperties  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private BigDecimal count = null;

  @JsonProperty("cursor")
  private BigDecimal cursor = null;

  public SearchProperties count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * 返却するデータのサイズ。
   * minimum: 0
   * maximum: 100
   * @return count
  **/
  @ApiModelProperty(example = "20.0", value = "返却するデータのサイズ。")

  @Valid
@DecimalMin("0") @DecimalMax("100")   public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public SearchProperties cursor(BigDecimal cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * 取得するデータのページ数。
   * minimum: 0
   * maximum: 100
   * @return cursor
  **/
  @ApiModelProperty(example = "0.0", value = "取得するデータのページ数。")

  @Valid
@DecimalMin("0") @DecimalMax("100")   public BigDecimal getCursor() {
    return cursor;
  }

  public void setCursor(BigDecimal cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchProperties searchProperties = (SearchProperties) o;
    return Objects.equals(this.count, searchProperties.count) &&
        Objects.equals(this.cursor, searchProperties.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchProperties {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
