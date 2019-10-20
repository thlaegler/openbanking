package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CreditInterestCreditInterestEligibility;
import com.laegler.openbanking.model.CreditInterestTierBandMethod;
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
  * The group of tiers or bands for which credit interest can be applied.
 **/
@ApiModel(description="The group of tiers or bands for which credit interest can be applied.")
public class CreditInterestTierBandSet  {
  
  @ApiModelProperty(value = "Eligibility for credit interest")
  @Valid
 /**
   * Eligibility for credit interest
  **/
  private List<CreditInterestCreditInterestEligibility> creditInterestEligibility = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreditInterestTierBandMethod tierBandMethod = null;
 /**
   * Eligibility for credit interest
   * @return creditInterestEligibility
  **/
  @JsonProperty("CreditInterestEligibility")
  public List<CreditInterestCreditInterestEligibility> getCreditInterestEligibility() {
    return creditInterestEligibility;
  }

  public void setCreditInterestEligibility(List<CreditInterestCreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
  }

  public CreditInterestTierBandSet creditInterestEligibility(List<CreditInterestCreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
    return this;
  }

  public CreditInterestTierBandSet addCreditInterestEligibilityItem(CreditInterestCreditInterestEligibility creditInterestEligibilityItem) {
    this.creditInterestEligibility.add(creditInterestEligibilityItem);
    return this;
  }

 /**
   * Get tierBandMethod
   * @return tierBandMethod
  **/
  @JsonProperty("TierBandMethod")
  @NotNull
  public CreditInterestTierBandMethod getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(CreditInterestTierBandMethod tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public CreditInterestTierBandSet tierBandMethod(CreditInterestTierBandMethod tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterestTierBandSet {\n");
    
    sb.append("    creditInterestEligibility: ").append(toIndentedString(creditInterestEligibility)).append("\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
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

