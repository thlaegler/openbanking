package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CommercialCreditCardResponseBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Open Banking Commercial Credit Card product data details
 */
@ApiModel(description = "Open Banking Commercial Credit Card product data details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class CommercialCreditCardResponseData   {
  @JsonProperty("Brand")
  @Valid
  private List<CommercialCreditCardResponseBrand> brand = new ArrayList<>();

  public CommercialCreditCardResponseData brand(List<CommercialCreditCardResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public CommercialCreditCardResponseData addBrandItem(CommercialCreditCardResponseBrand brandItem) {
    this.brand.add(brandItem);
    return this;
  }

  /**
   * Brand registered by the banking group at https://register.fca.org.uk/
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "Brand registered by the banking group at https://register.fca.org.uk/")
  @NotNull

  @Valid
@Size(min=1) 
  public List<CommercialCreditCardResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<CommercialCreditCardResponseBrand> brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommercialCreditCardResponseData commercialCreditCardResponseData = (CommercialCreditCardResponseData) o;
    return Objects.equals(this.brand, commercialCreditCardResponseData.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercialCreditCardResponseData {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

