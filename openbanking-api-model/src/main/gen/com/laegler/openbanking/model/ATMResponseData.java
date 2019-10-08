package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.ATMResponseBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Environment of the ATM.
 */
@ApiModel(description = "Environment of the ATM.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class ATMResponseData   {
  @JsonProperty("Brand")
  @Valid
  private List<ATMResponseBrand> brand = new ArrayList<>();

  public ATMResponseData brand(List<ATMResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public ATMResponseData addBrandItem(ATMResponseBrand brandItem) {
    this.brand.add(brandItem);
    return this;
  }

  /**
   * Brand of the Acquirer of transactions captured by the ATM
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "Brand of the Acquirer of transactions captured by the ATM")
  @NotNull

  @Valid
@Size(min=1) 
  public List<ATMResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<ATMResponseBrand> brand) {
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
    ATMResponseData atMResponseData = (ATMResponseData) o;
    return Objects.equals(this.brand, atMResponseData.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMResponseData {\n");
    
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

