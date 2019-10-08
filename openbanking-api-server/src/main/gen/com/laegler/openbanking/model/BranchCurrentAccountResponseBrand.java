package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseBCA;
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
  * Brand registered by the banking group at https://register.fca.org.uk/
 **/
@ApiModel(description="Brand registered by the banking group at https://register.fca.org.uk/")
public class BranchCurrentAccountResponseBrand  {
  
  @ApiModelProperty(required = true, value = "BCA means a Business Current Account.")
  @Valid
 /**
   * BCA means a Business Current Account.
  **/
  private List<BranchCurrentAccountResponseBCA> BCA = new ArrayList<BranchCurrentAccountResponseBCA>();

  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/")
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
  **/
  private String brandName = null;
 /**
   * BCA means a Business Current Account.
   * @return BCA
  **/
  @JsonProperty("BCA")
  @NotNull
 @Size(min=1)  public List<BranchCurrentAccountResponseBCA> getBCA() {
    return BCA;
  }

  public void setBCA(List<BranchCurrentAccountResponseBCA> BCA) {
    this.BCA = BCA;
  }

  public BranchCurrentAccountResponseBrand BCA(List<BranchCurrentAccountResponseBCA> BCA) {
    this.BCA = BCA;
    return this;
  }

  public BranchCurrentAccountResponseBrand addBCAItem(BranchCurrentAccountResponseBCA BCAItem) {
    this.BCA.add(BCAItem);
    return this;
  }

 /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
   * @return brandName
  **/
  @JsonProperty("BrandName")
  @NotNull
 @Size(min=1,max=140)  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public BranchCurrentAccountResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseBrand {\n");
    
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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

