package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BCAOtherFeesCharges;
import com.laegler.openbanking.model.CreditInterest1;
import com.laegler.openbanking.model.Overdraft1;
import com.laegler.openbanking.model.ProductDetails;
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

public class BCA  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CreditInterest1 creditInterest = null;

  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
  @Valid
 /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
  **/
  private List<BCAOtherFeesCharges> otherFeesCharges = null;

  @ApiModelProperty(value = "")
  @Valid
  private Overdraft1 overdraft = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductDetails productDetails = null;
 /**
   * Get creditInterest
   * @return creditInterest
  **/
  @JsonProperty("CreditInterest")
  public CreditInterest1 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public BCA creditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

 /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
   * @return otherFeesCharges
  **/
  @JsonProperty("OtherFeesCharges")
  public List<BCAOtherFeesCharges> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<BCAOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public BCA otherFeesCharges(List<BCAOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public BCA addOtherFeesChargesItem(BCAOtherFeesCharges otherFeesChargesItem) {
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

 /**
   * Get overdraft
   * @return overdraft
  **/
  @JsonProperty("Overdraft")
  public Overdraft1 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
  }

  public BCA overdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

 /**
   * Get productDetails
   * @return productDetails
  **/
  @JsonProperty("ProductDetails")
  public ProductDetails getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails productDetails) {
    this.productDetails = productDetails;
  }

  public BCA productDetails(ProductDetails productDetails) {
    this.productDetails = productDetails;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BCA {\n");
    
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

