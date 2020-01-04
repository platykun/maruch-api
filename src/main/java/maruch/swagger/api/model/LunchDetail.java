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
 * LunchDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T17:46:58.137124+09:00[Asia/Tokyo]")
public class LunchDetail  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("calorie")
  private BigDecimal calorie = null;

  @JsonProperty("carbohydrate")
  private Integer carbohydrate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fiber")
  private BigDecimal fiber = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("lipid")
  private BigDecimal lipid = null;

  @JsonProperty("protein")
  private BigDecimal protein = null;

  @JsonProperty("salt")
  private BigDecimal salt = null;

  public LunchDetail calorie(BigDecimal calorie) {
    this.calorie = calorie;
    return this;
  }

  /**
   * カロリー
   * @return calorie
  **/
  @ApiModelProperty(example = "162.0", value = "カロリー")

  @Valid
  public BigDecimal getCalorie() {
    return calorie;
  }

  public void setCalorie(BigDecimal calorie) {
    this.calorie = calorie;
  }

  public LunchDetail carbohydrate(Integer carbohydrate) {
    this.carbohydrate = carbohydrate;
    return this;
  }

  /**
   * 炭水化物
   * @return carbohydrate
  **/
  @ApiModelProperty(value = "炭水化物")

  public Integer getCarbohydrate() {
    return carbohydrate;
  }

  public void setCarbohydrate(Integer carbohydrate) {
    this.carbohydrate = carbohydrate;
  }

  public LunchDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * ランチの詳細情報
   * @return description
  **/
  @ApiModelProperty(example = "1枚分 メープルシロップバター付", value = "ランチの詳細情報")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LunchDetail fiber(BigDecimal fiber) {
    this.fiber = fiber;
    return this;
  }

  /**
   * 食物繊維
   * @return fiber
  **/
  @ApiModelProperty(example = "0.4", value = "食物繊維")

  @Valid
  public BigDecimal getFiber() {
    return fiber;
  }

  public void setFiber(BigDecimal fiber) {
    this.fiber = fiber;
  }

  public LunchDetail label(String label) {
    this.label = label;
    return this;
  }

  /**
   * ラベル
   * @return label
  **/
  @ApiModelProperty(example = "パンケーキ", value = "ラベル")

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LunchDetail lipid(BigDecimal lipid) {
    this.lipid = lipid;
    return this;
  }

  /**
   * 脂質
   * @return lipid
  **/
  @ApiModelProperty(example = "6.5", value = "脂質")

  @Valid
  public BigDecimal getLipid() {
    return lipid;
  }

  public void setLipid(BigDecimal lipid) {
    this.lipid = lipid;
  }

  public LunchDetail protein(BigDecimal protein) {
    this.protein = protein;
    return this;
  }

  /**
   * タンパク質
   * @return protein
  **/
  @ApiModelProperty(example = "3.1", value = "タンパク質")

  @Valid
  public BigDecimal getProtein() {
    return protein;
  }

  public void setProtein(BigDecimal protein) {
    this.protein = protein;
  }

  public LunchDetail salt(BigDecimal salt) {
    this.salt = salt;
    return this;
  }

  /**
   * 塩分
   * @return salt
  **/
  @ApiModelProperty(example = "0.2", value = "塩分")

  @Valid
  public BigDecimal getSalt() {
    return salt;
  }

  public void setSalt(BigDecimal salt) {
    this.salt = salt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LunchDetail lunchDetail = (LunchDetail) o;
    return Objects.equals(this.calorie, lunchDetail.calorie) &&
        Objects.equals(this.carbohydrate, lunchDetail.carbohydrate) &&
        Objects.equals(this.description, lunchDetail.description) &&
        Objects.equals(this.fiber, lunchDetail.fiber) &&
        Objects.equals(this.label, lunchDetail.label) &&
        Objects.equals(this.lipid, lunchDetail.lipid) &&
        Objects.equals(this.protein, lunchDetail.protein) &&
        Objects.equals(this.salt, lunchDetail.salt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calorie, carbohydrate, description, fiber, label, lipid, protein, salt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LunchDetail {\n");
    
    sb.append("    calorie: ").append(toIndentedString(calorie)).append("\n");
    sb.append("    carbohydrate: ").append(toIndentedString(carbohydrate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fiber: ").append(toIndentedString(fiber)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lipid: ").append(toIndentedString(lipid)).append("\n");
    sb.append("    protein: ").append(toIndentedString(protein)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
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
