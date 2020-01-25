package maruch.swagger.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import maruch.swagger.api.model.GurunabiUrl;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 店舗情報の概要
 */
@ApiModel(description = "店舗情報の概要")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-25T20:44:48.245351+09:00[Asia/Tokyo]")
public class Shop  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("name_kana")
  private String nameKana = null;

  @JsonProperty("tel")
  private String tel = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("opentime")
  private String opentime = null;

  @JsonProperty("holiday")
  private String holiday = null;

  @JsonProperty("url")
  private GurunabiUrl url = null;

  public Shop id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 店舗ID
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "店舗ID")

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Shop name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 店舗名
   * @return name
  **/
  @ApiModelProperty(example = "完全個室居酒屋 初代鳥万作 東京八重洲店", value = "店舗名")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Shop nameKana(String nameKana) {
    this.nameKana = nameKana;
    return this;
  }

  /**
   * 店舗名読み
   * @return nameKana
  **/
  @ApiModelProperty(example = "カンゼンコシツイザカヤショダイトリマンサク トウキョウヤエステン", value = "店舗名読み")

  public String getNameKana() {
    return nameKana;
  }

  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }

  public Shop tel(String tel) {
    this.tel = tel;
    return this;
  }

  /**
   * 電話番号
   * @return tel
  **/
  @ApiModelProperty(example = "050-1234-5678", value = "電話番号")

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public Shop address(String address) {
    this.address = address;
    return this;
  }

  /**
   * 住所
   * @return address
  **/
  @ApiModelProperty(example = "〒103-0028 東京都中央区八重洲1-7-10 1F", value = "住所")

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Shop opentime(String opentime) {
    this.opentime = opentime;
    return this;
  }

  /**
   * 営業時間
   * @return opentime
  **/
  @ApiModelProperty(example = "月～金 昼食　11:30～14:00（L.O.13:30、ドリンクL.O.13:30）毎日ランチタイムを行っております。・・・", value = "営業時間")

  public String getOpentime() {
    return opentime;
  }

  public void setOpentime(String opentime) {
    this.opentime = opentime;
  }

  public Shop holiday(String holiday) {
    this.holiday = holiday;
    return this;
  }

  /**
   * 休業日
   * @return holiday
  **/
  @ApiModelProperty(example = "年中無休 定休日はございません。平日や休日なども休まず営業いたします。金曜や祝前日は朝5時まで営業いたします！", value = "休業日")

  public String getHoliday() {
    return holiday;
  }

  public void setHoliday(String holiday) {
    this.holiday = holiday;
  }

  public Shop url(GurunabiUrl url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")

  @Valid
  public GurunabiUrl getUrl() {
    return url;
  }

  public void setUrl(GurunabiUrl url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shop shop = (Shop) o;
    return Objects.equals(this.id, shop.id) &&
        Objects.equals(this.name, shop.name) &&
        Objects.equals(this.nameKana, shop.nameKana) &&
        Objects.equals(this.tel, shop.tel) &&
        Objects.equals(this.address, shop.address) &&
        Objects.equals(this.opentime, shop.opentime) &&
        Objects.equals(this.holiday, shop.holiday) &&
        Objects.equals(this.url, shop.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nameKana, tel, address, opentime, holiday, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shop {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameKana: ").append(toIndentedString(nameKana)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    opentime: ").append(toIndentedString(opentime)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
