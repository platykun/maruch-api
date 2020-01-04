package maruch.swagger.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import maruch.swagger.api.model.IntegerRange;
import maruch.swagger.api.model.SearchProperties;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LunchListSearchProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T15:52:30.862918+09:00[Asia/Tokyo]")
public class LunchListSearchProperties  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("page")
  private SearchProperties page = null;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    VALUE("value"),
    
    LIPID("lipid"),
    
    RANDOM("random");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortEnum fromValue(String text) {
      for (SortEnum b : SortEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sort")
  @Valid
  private List<SortEnum> sort = null;

  @JsonProperty("price")
  private IntegerRange price = null;

  @JsonProperty("lipid")
  private IntegerRange lipid = null;

  public LunchListSearchProperties page(SearchProperties page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")

  @Valid
  public SearchProperties getPage() {
    return page;
  }

  public void setPage(SearchProperties page) {
    this.page = page;
  }

  public LunchListSearchProperties sort(List<SortEnum> sort) {
    this.sort = sort;
    return this;
  }

  public LunchListSearchProperties addSortItem(SortEnum sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<SortEnum>();
    }
    this.sort.add(sortItem);
    return this;
  }

  /**
   * レスポンスの表示順を指定。
   * @return sort
  **/
  @ApiModelProperty(value = "レスポンスの表示順を指定。")

  public List<SortEnum> getSort() {
    return sort;
  }

  public void setSort(List<SortEnum> sort) {
    this.sort = sort;
  }

  public LunchListSearchProperties price(IntegerRange price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid
  public IntegerRange getPrice() {
    return price;
  }

  public void setPrice(IntegerRange price) {
    this.price = price;
  }

  public LunchListSearchProperties lipid(IntegerRange lipid) {
    this.lipid = lipid;
    return this;
  }

  /**
   * Get lipid
   * @return lipid
  **/
  @ApiModelProperty(value = "")

  @Valid
  public IntegerRange getLipid() {
    return lipid;
  }

  public void setLipid(IntegerRange lipid) {
    this.lipid = lipid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LunchListSearchProperties lunchListSearchProperties = (LunchListSearchProperties) o;
    return Objects.equals(this.page, lunchListSearchProperties.page) &&
        Objects.equals(this.sort, lunchListSearchProperties.sort) &&
        Objects.equals(this.price, lunchListSearchProperties.price) &&
        Objects.equals(this.lipid, lunchListSearchProperties.lipid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, sort, price, lipid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LunchListSearchProperties {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    lipid: ").append(toIndentedString(lipid)).append("\n");
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
