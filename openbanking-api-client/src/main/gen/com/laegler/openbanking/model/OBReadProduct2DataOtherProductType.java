package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeCreditInterest;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterest;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOtherFeesCharges;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOverdraft;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeProductDetails;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepayment;
import com.laegler.openbanking.model.OBSupplementaryData1;
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
  * Other product type details associated with the account.
 **/
@ApiModel(description="Other product type details associated with the account.")
public class OBReadProduct2DataOtherProductType  {
  
  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeCreditInterest creditInterest = null;

  @ApiModelProperty(required = true, value = "Description of the Product associated with the account")
 /**
   * Description of the Product associated with the account
  **/
  private String description = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeLoanInterest loanInterest = null;

  @ApiModelProperty(required = true, value = "Long name associated with the product")
 /**
   * Long name associated with the product
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeOverdraft overdraft = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeProductDetails productDetails = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeRepayment repayment = null;

  @ApiModelProperty(value = "")
  private OBSupplementaryData1 supplementaryData = null;
 /**
   * Get creditInterest
   * @return creditInterest
  **/
  @JsonProperty("CreditInterest")
  public OBReadProduct2DataOtherProductTypeCreditInterest getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(OBReadProduct2DataOtherProductTypeCreditInterest creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBReadProduct2DataOtherProductType creditInterest(OBReadProduct2DataOtherProductTypeCreditInterest creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

 /**
   * Description of the Product associated with the account
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBReadProduct2DataOtherProductType description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get loanInterest
   * @return loanInterest
  **/
  @JsonProperty("LoanInterest")
  public OBReadProduct2DataOtherProductTypeLoanInterest getLoanInterest() {
    return loanInterest;
  }

  public void setLoanInterest(OBReadProduct2DataOtherProductTypeLoanInterest loanInterest) {
    this.loanInterest = loanInterest;
  }

  public OBReadProduct2DataOtherProductType loanInterest(OBReadProduct2DataOtherProductTypeLoanInterest loanInterest) {
    this.loanInterest = loanInterest;
    return this;
  }

 /**
   * Long name associated with the product
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataOtherProductType name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @JsonProperty("OtherFeesCharges")
  public List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public OBReadProduct2DataOtherProductType otherFeesCharges(List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public OBReadProduct2DataOtherProductType addOtherFeesChargesItem(OBReadProduct2DataOtherProductTypeOtherFeesCharges otherFeesChargesItem) {
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

 /**
   * Get overdraft
   * @return overdraft
  **/
  @JsonProperty("Overdraft")
  public OBReadProduct2DataOtherProductTypeOverdraft getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(OBReadProduct2DataOtherProductTypeOverdraft overdraft) {
    this.overdraft = overdraft;
  }

  public OBReadProduct2DataOtherProductType overdraft(OBReadProduct2DataOtherProductTypeOverdraft overdraft) {
    this.overdraft = overdraft;
    return this;
  }

 /**
   * Get productDetails
   * @return productDetails
  **/
  @JsonProperty("ProductDetails")
  public OBReadProduct2DataOtherProductTypeProductDetails getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(OBReadProduct2DataOtherProductTypeProductDetails productDetails) {
    this.productDetails = productDetails;
  }

  public OBReadProduct2DataOtherProductType productDetails(OBReadProduct2DataOtherProductTypeProductDetails productDetails) {
    this.productDetails = productDetails;
    return this;
  }

 /**
   * Get repayment
   * @return repayment
  **/
  @JsonProperty("Repayment")
  public OBReadProduct2DataOtherProductTypeRepayment getRepayment() {
    return repayment;
  }

  public void setRepayment(OBReadProduct2DataOtherProductTypeRepayment repayment) {
    this.repayment = repayment;
  }

  public OBReadProduct2DataOtherProductType repayment(OBReadProduct2DataOtherProductTypeRepayment repayment) {
    this.repayment = repayment;
    return this;
  }

 /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @JsonProperty("SupplementaryData")
  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBReadProduct2DataOtherProductType supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductType {\n");
    
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

