package maruch.swagger.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import maruch.swagger.api.model.LunchDetail;
import maruch.swagger.api.model.Shop;
import maruch.swagger.api.model.User;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lunch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T17:46:58.137124+09:00[Asia/Tokyo]")
public class Lunch  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("creator")
  private User creator = null;

  @JsonProperty("shop")
  private Shop shop = null;

  @JsonProperty("price")
  private Integer price = null;

  @JsonProperty("detail")
  private LunchDetail detail = null;

  public Lunch id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID")

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Lunch imageUrl(String imageUrl) {
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

  public Lunch creator(User creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(value = "")

  @Valid
  public User getCreator() {
    return creator;
  }

  public void setCreator(User creator) {
    this.creator = creator;
  }

  public Lunch shop(Shop shop) {
    this.shop = shop;
    return this;
  }

  /**
   * Get shop
   * @return shop
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  public Lunch price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * 値段
   * @return price
  **/
  @ApiModelProperty(example = "1200", value = "値段")

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Lunch detail(LunchDetail detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LunchDetail getDetail() {
    return detail;
  }

  public void setDetail(LunchDetail detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lunch lunch = (Lunch) o;
    return Objects.equals(this.id, lunch.id) &&
        Objects.equals(this.imageUrl, lunch.imageUrl) &&
        Objects.equals(this.creator, lunch.creator) &&
        Objects.equals(this.shop, lunch.shop) &&
        Objects.equals(this.price, lunch.price) &&
        Objects.equals(this.detail, lunch.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, imageUrl, creator, shop, price, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lunch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
