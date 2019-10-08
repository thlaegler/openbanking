package com.laegler.openbanking.model;

import com.laegler.openbanking.model.ATMResponseATM;
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
  * Brand of the Acquirer of transactions captured by the ATM
 **/
@ApiModel(description="Brand of the Acquirer of transactions captured by the ATM")
public class ATMResponseBrand  {
  
  @ApiModelProperty(required = true, value = "ATM information.")
  @Valid
 /**
   * ATM information.
  **/
  private List<ATMResponseATM> ATM = new ArrayList<ATMResponseATM>();

  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer")
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer
  **/
  private String brandName = null;
 /**
   * ATM information.
   * @return ATM
  **/
  @JsonProperty("ATM")
  @NotNull
 @Size(min=1)  public List<ATMResponseATM> getATM() {
    return ATM;
  }

  public void setATM(List<ATMResponseATM> ATM) {
    this.ATM = ATM;
  }

  public ATMResponseBrand ATM(List<ATMResponseATM> ATM) {
    this.ATM = ATM;
    return this;
  }

  public ATMResponseBrand addATMItem(ATMResponseATM ATMItem) {
    this.ATM.add(ATMItem);
    return this;
  }

 /**
   * Brand Name that an organisation uses to market its products or services to a consumer
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

  public ATMResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMResponseBrand {\n");
    
    sb.append("    ATM: ").append(toIndentedString(ATM)).append("\n");
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

