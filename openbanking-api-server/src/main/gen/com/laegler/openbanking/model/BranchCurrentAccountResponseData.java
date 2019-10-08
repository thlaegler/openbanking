package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseBrand;
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
  * Open Banking Business Current Account product data details
 **/
@ApiModel(description="Open Banking Business Current Account product data details")
public class BranchCurrentAccountResponseData  {
  
  @ApiModelProperty(required = true, value = "Brand registered by the banking group at https://register.fca.org.uk/")
  @Valid
 /**
   * Brand registered by the banking group at https://register.fca.org.uk/
  **/
  private List<BranchCurrentAccountResponseBrand> brand = new ArrayList<BranchCurrentAccountResponseBrand>();
 /**
   * Brand registered by the banking group at https://register.fca.org.uk/
   * @return brand
  **/
  @JsonProperty("Brand")
  @NotNull
 @Size(min=1)  public List<BranchCurrentAccountResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<BranchCurrentAccountResponseBrand> brand) {
    this.brand = brand;
  }

  public BranchCurrentAccountResponseData brand(List<BranchCurrentAccountResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public BranchCurrentAccountResponseData addBrandItem(BranchCurrentAccountResponseBrand brandItem) {
    this.brand.add(brandItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseData {\n");
    
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

