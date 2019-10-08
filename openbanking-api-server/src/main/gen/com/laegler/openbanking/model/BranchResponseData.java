package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchResponseBrand;
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
  * Environment of the branch
 **/
@ApiModel(description="Environment of the branch")
public class BranchResponseData  {
  
  @ApiModelProperty(required = true, value = "Brand owned by an organisation")
  @Valid
 /**
   * Brand owned by an organisation
  **/
  private List<BranchResponseBrand> brand = new ArrayList<BranchResponseBrand>();
 /**
   * Brand owned by an organisation
   * @return brand
  **/
  @JsonProperty("Brand")
  @NotNull
 @Size(min=1)  public List<BranchResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<BranchResponseBrand> brand) {
    this.brand = brand;
  }

  public BranchResponseData brand(List<BranchResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public BranchResponseData addBrandItem(BranchResponseBrand brandItem) {
    this.brand.add(brandItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchResponseData {\n");
    
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

