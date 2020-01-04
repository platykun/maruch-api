package maruch.swagger.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * お気に入りランチ情報
 */
@ApiModel(description = "お気に入りランチ情報")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T15:52:30.862918+09:00[Asia/Tokyo]")
public class Favorite  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("lunchId")
  private Integer lunchId = null;

  @JsonProperty("date")
  private Date date = null;

  public Favorite lunchId(Integer lunchId) {
    this.lunchId = lunchId;
    return this;
  }

  /**
   * ランチID
   * @return lunchId
  **/
  @ApiModelProperty(example = "1001", value = "ランチID")

  public Integer getLunchId() {
    return lunchId;
  }

  public void setLunchId(Integer lunchId) {
    this.lunchId = lunchId;
  }

  public Favorite date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * お気に入り日時(JST)
   * @return date
  **/
  @ApiModelProperty(value = "お気に入り日時(JST)")

  @Valid
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Favorite favorite = (Favorite) o;
    return Objects.equals(this.lunchId, favorite.lunchId) &&
        Objects.equals(this.date, favorite.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lunchId, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Favorite {\n");
    
    sb.append("    lunchId: ").append(toIndentedString(lunchId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
