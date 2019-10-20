package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CreditInterest2;
import com.laegler.openbanking.model.OtherFeesCharges1;
import com.laegler.openbanking.model.Overdraft2;
import com.laegler.openbanking.model.ProductDetails1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PCA
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class PCA   {
  @JsonProperty("CreditInterest")
  private CreditInterest2 creditInterest = null;

  @JsonProperty("OtherFeesCharges")
  private OtherFeesCharges1 otherFeesCharges = null;

  @JsonProperty("Overdraft")
  private Overdraft2 overdraft = null;

  @JsonProperty("ProductDetails")
  private ProductDetails1 productDetails = null;

  public PCA creditInterest(CreditInterest2 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditInterest2 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest2 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public PCA otherFeesCharges(OtherFeesCharges1 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherFeesCharges1 getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges1 otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public PCA overdraft(Overdraft2 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Overdraft2 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft2 overdraft) {
    this.overdraft = overdraft;
  }

  public PCA productDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetails1 getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PCA PCA = (PCA) o;
    return Objects.equals(this.creditInterest, PCA.creditInterest) &&
        Objects.equals(this.otherFeesCharges, PCA.otherFeesCharges) &&
        Objects.equals(this.overdraft, PCA.overdraft) &&
        Objects.equals(this.productDetails, PCA.productDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditInterest, otherFeesCharges, overdraft, productDetails);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

