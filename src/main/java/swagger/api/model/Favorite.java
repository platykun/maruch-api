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
 * お気に入りランチ情報
 */
@ApiModel(description = "お気に入りランチ情報")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-12-27T18:46:41.493073+09:00[Asia/Tokyo]")
public class Favorite  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("date")
  private String date = null;

  public Favorite imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * ランチ画像のURL
   * @return imageUrl
  **/
  @ApiModelProperty(example = "google.com", value = "ランチ画像のURL")

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Favorite date(String date) {
    this.date = date;
    return this;
  }

  /**
   * お気に入り日時(JST)
   * @return date
  **/
  @ApiModelProperty(example = "2019-11-17T12:00:00.000+0000", value = "お気に入り日時(JST)")

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
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
    return Objects.equals(this.imageUrl, favorite.imageUrl) &&
        Objects.equals(this.date, favorite.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Favorite {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
