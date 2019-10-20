package com.laegler.openbanking.model;

import com.laegler.openbanking.model.UnsecuredSMELendingResponseSMELoan;
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
  * Brand registered by the banking group at https://register.fca.org.uk/
 **/
@ApiModel(description="Brand registered by the banking group at https://register.fca.org.uk/")
public class UnsecuredSMELendingResponseBrand  {
  
  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/")
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
  **/
  private String brandName = null;

  @ApiModelProperty(required = true, value = "SMELoan means SME unsecured loan.")
 /**
   * SMELoan means SME unsecured loan.
  **/
  private List<UnsecuredSMELendingResponseSMELoan> smELoan = new ArrayList<UnsecuredSMELendingResponseSMELoan>();
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
   * @return brandName
  **/
  @JsonProperty("BrandName")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public UnsecuredSMELendingResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

 /**
   * SMELoan means SME unsecured loan.
   * @return smELoan
  **/
  @JsonProperty("SMELoan")
  public List<UnsecuredSMELendingResponseSMELoan> getSmELoan() {
    return smELoan;
  }

  public void setSmELoan(List<UnsecuredSMELendingResponseSMELoan> smELoan) {
    this.smELoan = smELoan;
  }

  public UnsecuredSMELendingResponseBrand smELoan(List<UnsecuredSMELendingResponseSMELoan> smELoan) {
    this.smELoan = smELoan;
    return this;
  }

  public UnsecuredSMELendingResponseBrand addSmELoanItem(UnsecuredSMELendingResponseSMELoan smELoanItem) {
    this.smELoan.add(smELoanItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsecuredSMELendingResponseBrand {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    smELoan: ").append(toIndentedString(smELoan)).append("\n");
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

