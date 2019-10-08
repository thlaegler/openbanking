package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.AgeEligibility;
import com.laegler.openbanking.model.CreditCheckEligibility;
import com.laegler.openbanking.model.EligibilityLegalStructureEligibility;
import com.laegler.openbanking.model.EligibilityOfficerEligibility;
import com.laegler.openbanking.model.EligibilityOtherEligibility;
import com.laegler.openbanking.model.EligibilityResidencyEligibility;
import com.laegler.openbanking.model.EligibilityTradingHistoryEligibility;
import com.laegler.openbanking.model.IDEligibility;
import com.laegler.openbanking.model.IndustryEligibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the BCA product.
 */
@ApiModel(description = "Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the BCA product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class Eligibility   {
  @JsonProperty("AgeEligibility")
  private AgeEligibility ageEligibility = null;

  @JsonProperty("CreditCheckEligibility")
  private CreditCheckEligibility creditCheckEligibility = null;

  @JsonProperty("IDEligibility")
  private IDEligibility idEligibility = null;

  @JsonProperty("IndustryEligibility")
  private IndustryEligibility industryEligibility = null;

  @JsonProperty("LegalStructureEligibility")
  @Valid
  private List<EligibilityLegalStructureEligibility> legalStructureEligibility = null;

  @JsonProperty("OfficerEligibility")
  @Valid
  private List<EligibilityOfficerEligibility> officerEligibility = null;

  @JsonProperty("OtherEligibility")
  @Valid
  private List<EligibilityOtherEligibility> otherEligibility = null;

  @JsonProperty("ResidencyEligibility")
  @Valid
  private List<EligibilityResidencyEligibility> residencyEligibility = null;

  @JsonProperty("TradingHistoryEligibility")
  @Valid
  private List<EligibilityTradingHistoryEligibility> tradingHistoryEligibility = null;

  public Eligibility ageEligibility(AgeEligibility ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

  /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AgeEligibility getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility creditCheckEligibility(CreditCheckEligibility creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
    return this;
  }

  /**
   * Get creditCheckEligibility
   * @return creditCheckEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditCheckEligibility getCreditCheckEligibility() {
    return creditCheckEligibility;
  }

  public void setCreditCheckEligibility(CreditCheckEligibility creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
  }

  public Eligibility idEligibility(IDEligibility idEligibility) {
    this.idEligibility = idEligibility;
    return this;
  }

  /**
   * Get idEligibility
   * @return idEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IDEligibility getIdEligibility() {
    return idEligibility;
  }

  public void setIdEligibility(IDEligibility idEligibility) {
    this.idEligibility = idEligibility;
  }

  public Eligibility industryEligibility(IndustryEligibility industryEligibility) {
    this.industryEligibility = industryEligibility;
    return this;
  }

  /**
   * Get industryEligibility
   * @return industryEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IndustryEligibility getIndustryEligibility() {
    return industryEligibility;
  }

  public void setIndustryEligibility(IndustryEligibility industryEligibility) {
    this.industryEligibility = industryEligibility;
  }

  public Eligibility legalStructureEligibility(List<EligibilityLegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
    return this;
  }

  public Eligibility addLegalStructureEligibilityItem(EligibilityLegalStructureEligibility legalStructureEligibilityItem) {
    if (this.legalStructureEligibility == null) {
      this.legalStructureEligibility = new ArrayList<>();
    }
    this.legalStructureEligibility.add(legalStructureEligibilityItem);
    return this;
  }

  /**
   * Legal structure eligibility requirement to access the BCA product.
   * @return legalStructureEligibility
  **/
  @ApiModelProperty(value = "Legal structure eligibility requirement to access the BCA product.")

  @Valid

  public List<EligibilityLegalStructureEligibility> getLegalStructureEligibility() {
    return legalStructureEligibility;
  }

  public void setLegalStructureEligibility(List<EligibilityLegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
  }

  public Eligibility officerEligibility(List<EligibilityOfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
    return this;
  }

  public Eligibility addOfficerEligibilityItem(EligibilityOfficerEligibility officerEligibilityItem) {
    if (this.officerEligibility == null) {
      this.officerEligibility = new ArrayList<>();
    }
    this.officerEligibility.add(officerEligibilityItem);
    return this;
  }

  /**
   * Describes the requirement of the officers(owner, partner, directors) to access the BCA product.
   * @return officerEligibility
  **/
  @ApiModelProperty(value = "Describes the requirement of the officers(owner, partner, directors) to access the BCA product.")

  @Valid

  public List<EligibilityOfficerEligibility> getOfficerEligibility() {
    return officerEligibility;
  }

  public void setOfficerEligibility(List<EligibilityOfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
  }

  public Eligibility otherEligibility(List<EligibilityOtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility addOtherEligibilityItem(EligibilityOtherEligibility otherEligibilityItem) {
    if (this.otherEligibility == null) {
      this.otherEligibility = new ArrayList<>();
    }
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

  /**
   * Other eligibility which is not covered by the main eligibility of the BCA product
   * @return otherEligibility
  **/
  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the BCA product")

  @Valid

  public List<EligibilityOtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<EligibilityOtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility residencyEligibility(List<EligibilityResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility addResidencyEligibilityItem(EligibilityResidencyEligibility residencyEligibilityItem) {
    if (this.residencyEligibility == null) {
      this.residencyEligibility = new ArrayList<>();
    }
    this.residencyEligibility.add(residencyEligibilityItem);
    return this;
  }

  /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
   * @return residencyEligibility
  **/
  @ApiModelProperty(value = "Countries in which an accountholder can reside and, therefore, be eligible to open an account")

  @Valid

  public List<EligibilityResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<EligibilityResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }

  public Eligibility tradingHistoryEligibility(List<EligibilityTradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
    return this;
  }

  public Eligibility addTradingHistoryEligibilityItem(EligibilityTradingHistoryEligibility tradingHistoryEligibilityItem) {
    if (this.tradingHistoryEligibility == null) {
      this.tradingHistoryEligibility = new ArrayList<>();
    }
    this.tradingHistoryEligibility.add(tradingHistoryEligibilityItem);
    return this;
  }

  /**
   * Describes the trading history requirements to access the BCA product.
   * @return tradingHistoryEligibility
  **/
  @ApiModelProperty(value = "Describes the trading history requirements to access the BCA product.")

  @Valid

  public List<EligibilityTradingHistoryEligibility> getTradingHistoryEligibility() {
    return tradingHistoryEligibility;
  }

  public void setTradingHistoryEligibility(List<EligibilityTradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eligibility eligibility = (Eligibility) o;
    return Objects.equals(this.ageEligibility, eligibility.ageEligibility) &&
        Objects.equals(this.creditCheckEligibility, eligibility.creditCheckEligibility) &&
        Objects.equals(this.idEligibility, eligibility.idEligibility) &&
        Objects.equals(this.industryEligibility, eligibility.industryEligibility) &&
        Objects.equals(this.legalStructureEligibility, eligibility.legalStructureEligibility) &&
        Objects.equals(this.officerEligibility, eligibility.officerEligibility) &&
        Objects.equals(this.otherEligibility, eligibility.otherEligibility) &&
        Objects.equals(this.residencyEligibility, eligibility.residencyEligibility) &&
        Objects.equals(this.tradingHistoryEligibility, eligibility.tradingHistoryEligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageEligibility, creditCheckEligibility, idEligibility, industryEligibility, legalStructureEligibility, officerEligibility, otherEligibility, residencyEligibility, tradingHistoryEligibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility {\n");
    
    sb.append("    ageEligibility: ").append(toIndentedString(ageEligibility)).append("\n");
    sb.append("    creditCheckEligibility: ").append(toIndentedString(creditCheckEligibility)).append("\n");
    sb.append("    idEligibility: ").append(toIndentedString(idEligibility)).append("\n");
    sb.append("    industryEligibility: ").append(toIndentedString(industryEligibility)).append("\n");
    sb.append("    legalStructureEligibility: ").append(toIndentedString(legalStructureEligibility)).append("\n");
    sb.append("    officerEligibility: ").append(toIndentedString(officerEligibility)).append("\n");
    sb.append("    otherEligibility: ").append(toIndentedString(otherEligibility)).append("\n");
    sb.append("    residencyEligibility: ").append(toIndentedString(residencyEligibility)).append("\n");
    sb.append("    tradingHistoryEligibility: ").append(toIndentedString(tradingHistoryEligibility)).append("\n");
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

