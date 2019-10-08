package com.laegler.openbanking.model;

import com.laegler.openbanking.model.PersonalCurrentAccountResponseBrand;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Open Banking Personal Current Account product data details
 **/
@ApiModel(description="Open Banking Personal Current Account product data details")
public class PersonalCurrentAccountResponseData  {
  
  @ApiModelProperty(required = true, value = "Brand registered by the banking group at https://register.fca.org.uk/")
 /**
   * Brand registered by the banking group at https://register.fca.org.uk/
  **/
  private List<PersonalCurrentAccountResponseBrand> brand = new ArrayList<PersonalCurrentAccountResponseBrand>();
 /**
   * Brand registered by the banking group at https://register.fca.org.uk/
   * @return brand
  **/
  @JsonProperty("Brand")
  public List<PersonalCurrentAccountResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<PersonalCurrentAccountResponseBrand> brand) {
    this.brand = brand;
  }

  public PersonalCurrentAccountResponseData brand(List<PersonalCurrentAccountResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public PersonalCurrentAccountResponseData addBrandItem(PersonalCurrentAccountResponseBrand brandItem) {
    this.brand.add(brandItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

