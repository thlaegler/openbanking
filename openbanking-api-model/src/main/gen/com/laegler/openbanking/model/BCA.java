package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.BCAOtherFeesCharges;
import com.laegler.openbanking.model.CreditInterest1;
import com.laegler.openbanking.model.Overdraft1;
import com.laegler.openbanking.model.ProductDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BCA
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class BCA   {
  @JsonProperty("CreditInterest")
  private CreditInterest1 creditInterest = null;

  @JsonProperty("OtherFeesCharges")
  @Valid
  private List<BCAOtherFeesCharges> otherFeesCharges = null;

  @JsonProperty("Overdraft")
  private Overdraft1 overdraft = null;

  @JsonProperty("ProductDetails")
  private ProductDetails productDetails = null;

  public BCA creditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditInterest1 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public BCA otherFeesCharges(List<BCAOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public BCA addOtherFeesChargesItem(BCAOtherFeesCharges otherFeesChargesItem) {
    if (this.otherFeesCharges == null) {
      this.otherFeesCharges = new ArrayList<>();
    }
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

  /**
   * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
   * @return otherFeesCharges
  **/
  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")

  @Valid

  public List<BCAOtherFeesCharges> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<BCAOtherFeesCharges> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public BCA overdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Overdraft1 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
  }

  public BCA productDetails(ProductDetails productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductDetails getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails productDetails) {
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
    BCA BCA = (BCA) o;
    return Objects.equals(this.creditInterest, BCA.creditInterest) &&
        Objects.equals(this.otherFeesCharges, BCA.otherFeesCharges) &&
        Objects.equals(this.overdraft, BCA.overdraft) &&
        Objects.equals(this.productDetails, BCA.productDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditInterest, otherFeesCharges, overdraft, productDetails);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

