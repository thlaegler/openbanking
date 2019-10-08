package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CreditInterestCreditInterestEligibility;
import com.laegler.openbanking.model.CreditInterestTierBandMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The group of tiers or bands for which credit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which credit interest can be applied.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class CreditInterestTierBandSet   {
  @JsonProperty("CreditInterestEligibility")
  @Valid
  private List<CreditInterestCreditInterestEligibility> creditInterestEligibility = null;

  @JsonProperty("TierBandMethod")
  private CreditInterestTierBandMethod tierBandMethod = null;

  public CreditInterestTierBandSet creditInterestEligibility(List<CreditInterestCreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
    return this;
  }

  public CreditInterestTierBandSet addCreditInterestEligibilityItem(CreditInterestCreditInterestEligibility creditInterestEligibilityItem) {
    if (this.creditInterestEligibility == null) {
      this.creditInterestEligibility = new ArrayList<>();
    }
    this.creditInterestEligibility.add(creditInterestEligibilityItem);
    return this;
  }

  /**
   * Eligibility for credit interest
   * @return creditInterestEligibility
  **/
  @ApiModelProperty(value = "Eligibility for credit interest")

  @Valid

  public List<CreditInterestCreditInterestEligibility> getCreditInterestEligibility() {
    return creditInterestEligibility;
  }

  public void setCreditInterestEligibility(List<CreditInterestCreditInterestEligibility> creditInterestEligibility) {
    this.creditInterestEligibility = creditInterestEligibility;
  }

  public CreditInterestTierBandSet tierBandMethod(CreditInterestTierBandMethod tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * Get tierBandMethod
   * @return tierBandMethod
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CreditInterestTierBandMethod getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(CreditInterestTierBandMethod tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterestTierBandSet creditInterestTierBandSet = (CreditInterestTierBandSet) o;
    return Objects.equals(this.creditInterestEligibility, creditInterestTierBandSet.creditInterestEligibility) &&
        Objects.equals(this.tierBandMethod, creditInterestTierBandSet.tierBandMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditInterestEligibility, tierBandMethod);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

