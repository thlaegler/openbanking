package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.PersonalCurrentAccountResponseBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Open Banking Personal Current Account product data details
 */
@ApiModel(description = "Open Banking Personal Current Account product data details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class PersonalCurrentAccountResponseData   {
  @JsonProperty("Brand")
  @Valid
  private List<PersonalCurrentAccountResponseBrand> brand = new ArrayList<>();

  public PersonalCurrentAccountResponseData brand(List<PersonalCurrentAccountResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public PersonalCurrentAccountResponseData addBrandItem(PersonalCurrentAccountResponseBrand brandItem) {
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
  public List<PersonalCurrentAccountResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<PersonalCurrentAccountResponseBrand> brand) {
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
    PersonalCurrentAccountResponseData personalCurrentAccountResponseData = (PersonalCurrentAccountResponseData) o;
    return Objects.equals(this.brand, personalCurrentAccountResponseData.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalCurrentAccountResponseData {\n");
    
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

