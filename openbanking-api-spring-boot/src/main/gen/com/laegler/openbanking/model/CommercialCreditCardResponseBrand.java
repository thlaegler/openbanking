package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CommercialCreditCardResponseCCC;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brand registered by the banking group at https://register.fca.org.uk/
 */
@ApiModel(description = "Brand registered by the banking group at https://register.fca.org.uk/")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CommercialCreditCardResponseBrand   {
  @JsonProperty("BrandName")
  private String brandName = null;

  @JsonProperty("CCC")
  @Valid
  private List<CommercialCreditCardResponseCCC> CCC = new ArrayList<>();

  public CommercialCreditCardResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
   * @return brandName
  **/
  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/")
  @NotNull

@Size(min=1,max=140) 
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public CommercialCreditCardResponseBrand CCC(List<CommercialCreditCardResponseCCC> CCC) {
    this.CCC = CCC;
    return this;
  }

  public CommercialCreditCardResponseBrand addCCCItem(CommercialCreditCardResponseCCC CCCItem) {
    this.CCC.add(CCCItem);
    return this;
  }

  /**
   * CCC means a Commercial Credit Card.
   * @return CCC
  **/
  @ApiModelProperty(required = true, value = "CCC means a Commercial Credit Card.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<CommercialCreditCardResponseCCC> getCCC() {
    return CCC;
  }

  public void setCCC(List<CommercialCreditCardResponseCCC> CCC) {
    this.CCC = CCC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommercialCreditCardResponseBrand commercialCreditCardResponseBrand = (CommercialCreditCardResponseBrand) o;
    return Objects.equals(this.brandName, commercialCreditCardResponseBrand.brandName) &&
        Objects.equals(this.CCC, commercialCreditCardResponseBrand.CCC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, CCC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercialCreditCardResponseBrand {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    CCC: ").append(toIndentedString(CCC)).append("\n");
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

