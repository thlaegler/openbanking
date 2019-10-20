package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CreditInterest2;
import com.laegler.openbanking.model.OtherFeesCharges1;
import com.laegler.openbanking.model.Overdraft2;
import com.laegler.openbanking.model.ProductDetails1;
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

public class PCA  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CreditInterest2 creditInterest = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherFeesCharges1 otherFeesCharges = null;

  @ApiModelProperty(value = "")
  @Valid
  private Overdraft2 overdraft = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductDetails1 productDetails = null;
 /**
   * Get creditInterest
   * @return creditInterest
  **/
  @JsonProperty("CreditInterest")
  public CreditInterest2 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest2 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public PCA creditInterest(CreditInterest2 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

 /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @JsonProperty("OtherFeesCharges")
  public OtherFeesCharges1 getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges1 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public PCA otherFeesCharges(OtherFeesCharges1 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

 /**
   * Get overdraft
   * @return overdraft
  **/
  @JsonProperty("Overdraft")
  public Overdraft2 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft2 overdraft) {
    this.overdraft = overdraft;
  }

  public PCA overdraft(Overdraft2 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

 /**
   * Get productDetails
   * @return productDetails
  **/
  @JsonProperty("ProductDetails")
  public ProductDetails1 getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
  }

  public PCA productDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PCA {\n");
    
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
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

