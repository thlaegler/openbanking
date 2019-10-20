package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CommercialCreditCardResponseCCC;
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
public class CommercialCreditCardResponseBrand  {
  
  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/")
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
  **/
  private String brandName = null;

  @ApiModelProperty(required = true, value = "CCC means a Commercial Credit Card.")
  @Valid
 /**
   * CCC means a Commercial Credit Card.
  **/
  private List<CommercialCreditCardResponseCCC> CCC = new ArrayList<CommercialCreditCardResponseCCC>();
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

  public CommercialCreditCardResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

 /**
   * CCC means a Commercial Credit Card.
   * @return CCC
  **/
  @JsonProperty("CCC")
  @NotNull
 @Size(min=1)  public List<CommercialCreditCardResponseCCC> getCCC() {
    return CCC;
  }

  public void setCCC(List<CommercialCreditCardResponseCCC> CCC) {
    this.CCC = CCC;
  }

  public CommercialCreditCardResponseBrand CCC(List<CommercialCreditCardResponseCCC> CCC) {
    this.CCC = CCC;
    return this;
  }

  public CommercialCreditCardResponseBrand addCCCItem(CommercialCreditCardResponseCCC CCCItem) {
    this.CCC.add(CCCItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

