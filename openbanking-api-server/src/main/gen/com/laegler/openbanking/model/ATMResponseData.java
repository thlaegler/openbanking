package com.laegler.openbanking.model;

import com.laegler.openbanking.model.ATMResponseBrand;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Environment of the ATM.
 **/
@ApiModel(description="Environment of the ATM.")
public class ATMResponseData  {
  
  @ApiModelProperty(required = true, value = "Brand of the Acquirer of transactions captured by the ATM")
  @Valid
 /**
   * Brand of the Acquirer of transactions captured by the ATM
  **/
  private List<ATMResponseBrand> brand = new ArrayList<ATMResponseBrand>();
 /**
   * Brand of the Acquirer of transactions captured by the ATM
   * @return brand
  **/
  @JsonProperty("Brand")
  @NotNull
 @Size(min=1)  public List<ATMResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<ATMResponseBrand> brand) {
    this.brand = brand;
  }

  public ATMResponseData brand(List<ATMResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public ATMResponseData addBrandItem(ATMResponseBrand brandItem) {
    this.brand.add(brandItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

