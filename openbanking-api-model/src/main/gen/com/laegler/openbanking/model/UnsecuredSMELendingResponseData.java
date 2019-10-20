package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Open Banking SME Unsecured Loan product data details
 */
@ApiModel(description = "Open Banking SME Unsecured Loan product data details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class UnsecuredSMELendingResponseData   {
  @JsonProperty("Brand")
  @Valid
  private List<UnsecuredSMELendingResponseBrand> brand = new ArrayList<>();

  public UnsecuredSMELendingResponseData brand(List<UnsecuredSMELendingResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public UnsecuredSMELendingResponseData addBrandItem(UnsecuredSMELendingResponseBrand brandItem) {
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
  public List<UnsecuredSMELendingResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<UnsecuredSMELendingResponseBrand> brand) {
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
    UnsecuredSMELendingResponseData unsecuredSMELendingResponseData = (UnsecuredSMELendingResponseData) o;
    return Objects.equals(this.brand, unsecuredSMELendingResponseData.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsecuredSMELendingResponseData {\n");
    
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

