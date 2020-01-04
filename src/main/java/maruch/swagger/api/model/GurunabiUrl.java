package maruch.swagger.api.model;

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
 * ぐるなびサイトのURL
 */
@ApiModel(description = "ぐるなびサイトのURL")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T18:32:38.687264+09:00[Asia/Tokyo]")
public class GurunabiUrl  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("pc_url")
  private String pcUrl = null;

  @JsonProperty("mobile_url")
  private String mobileUrl = null;

  public GurunabiUrl pcUrl(String pcUrl) {
    this.pcUrl = pcUrl;
    return this;
  }

  /**
   * PCサイトURL
   * @return pcUrl
  **/
  @ApiModelProperty(example = "https://r.gnavi.co.jp/dnj1y43c0000/", value = "PCサイトURL")

  public String getPcUrl() {
    return pcUrl;
  }

  public void setPcUrl(String pcUrl) {
    this.pcUrl = pcUrl;
  }

  public GurunabiUrl mobileUrl(String mobileUrl) {
    this.mobileUrl = mobileUrl;
    return this;
  }

  /**
   * スマホサイトURL
   * @return mobileUrl
  **/
  @ApiModelProperty(example = "https://r.gnavi.co.jp/dnj1y43c0000/", value = "スマホサイトURL")

  public String getMobileUrl() {
    return mobileUrl;
  }

  public void setMobileUrl(String mobileUrl) {
    this.mobileUrl = mobileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GurunabiUrl gurunabiUrl = (GurunabiUrl) o;
    return Objects.equals(this.pcUrl, gurunabiUrl.pcUrl) &&
        Objects.equals(this.mobileUrl, gurunabiUrl.mobileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pcUrl, mobileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GurunabiUrl {\n");
    
    sb.append("    pcUrl: ").append(toIndentedString(pcUrl)).append("\n");
    sb.append("    mobileUrl: ").append(toIndentedString(mobileUrl)).append("\n");
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
