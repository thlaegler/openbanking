package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.AgeEligibility3;
import com.laegler.openbanking.model.CreditCheckEligibility2;
import com.laegler.openbanking.model.Eligibility3LegalStructureEligibility;
import com.laegler.openbanking.model.Eligibility3OfficerEligibility;
import com.laegler.openbanking.model.Eligibility3OtherEligibility;
import com.laegler.openbanking.model.Eligibility3ResidencyEligibility;
import com.laegler.openbanking.model.Eligibility3TradingHistoryEligibility;
import com.laegler.openbanking.model.IDEligibility2;
import com.laegler.openbanking.model.IndustryEligibility2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Eligibility details for this product i.e. the criteria that an business has to meet in order to be eligible for the SME Loan product.
 */
@ApiModel(description = "Eligibility details for this product i.e. the criteria that an business has to meet in order to be eligible for the SME Loan product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class Eligibility3   {
  @JsonProperty("AgeEligibility")
  private AgeEligibility3 ageEligibility = null;

  @JsonProperty("CreditCheckEligibility")
  private CreditCheckEligibility2 creditCheckEligibility = null;

  @JsonProperty("IDEligibility")
  private IDEligibility2 idEligibility = null;

  @JsonProperty("IndustryEligibility")
  private IndustryEligibility2 industryEligibility = null;

  @JsonProperty("LegalStructureEligibility")
  @Valid
  private List<Eligibility3LegalStructureEligibility> legalStructureEligibility = null;

  @JsonProperty("OfficerEligibility")
  @Valid
  private List<Eligibility3OfficerEligibility> officerEligibility = null;

  @JsonProperty("OtherEligibility")
  @Valid
  private List<Eligibility3OtherEligibility> otherEligibility = null;

  @JsonProperty("ResidencyEligibility")
  @Valid
  private List<Eligibility3ResidencyEligibility> residencyEligibility = null;

  @JsonProperty("TradingHistoryEligibility")
  @Valid
  private List<Eligibility3TradingHistoryEligibility> tradingHistoryEligibility = null;

  public Eligibility3 ageEligibility(AgeEligibility3 ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

  /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AgeEligibility3 getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility3 ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility3 creditCheckEligibility(CreditCheckEligibility2 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
    return this;
  }

  /**
   * Get creditCheckEligibility
   * @return creditCheckEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditCheckEligibility2 getCreditCheckEligibility() {
    return creditCheckEligibility;
  }

  public void setCreditCheckEligibility(CreditCheckEligibility2 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
  }

  public Eligibility3 idEligibility(IDEligibility2 idEligibility) {
    this.idEligibility = idEligibility;
    return this;
  }

  /**
   * Get idEligibility
   * @return idEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IDEligibility2 getIdEligibility() {
    return idEligibility;
  }

  public void setIdEligibility(IDEligibility2 idEligibility) {
    this.idEligibility = idEligibility;
  }

  public Eligibility3 industryEligibility(IndustryEligibility2 industryEligibility) {
    this.industryEligibility = industryEligibility;
    return this;
  }

  /**
   * Get industryEligibility
   * @return industryEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IndustryEligibility2 getIndustryEligibility() {
    return industryEligibility;
  }

  public void setIndustryEligibility(IndustryEligibility2 industryEligibility) {
    this.industryEligibility = industryEligibility;
  }

  public Eligibility3 legalStructureEligibility(List<Eligibility3LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
    return this;
  }

  public Eligibility3 addLegalStructureEligibilityItem(Eligibility3LegalStructureEligibility legalStructureEligibilityItem) {
    if (this.legalStructureEligibility == null) {
      this.legalStructureEligibility = new ArrayList<>();
    }
    this.legalStructureEligibility.add(legalStructureEligibilityItem);
    return this;
  }

  /**
   * Legal structure eligibility requirement to access the SME Loan product.
   * @return legalStructureEligibility
  **/
  @ApiModelProperty(value = "Legal structure eligibility requirement to access the SME Loan product.")

  @Valid

  public List<Eligibility3LegalStructureEligibility> getLegalStructureEligibility() {
    return legalStructureEligibility;
  }

  public void setLegalStructureEligibility(List<Eligibility3LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
  }

  public Eligibility3 officerEligibility(List<Eligibility3OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
    return this;
  }

  public Eligibility3 addOfficerEligibilityItem(Eligibility3OfficerEligibility officerEligibilityItem) {
    if (this.officerEligibility == null) {
      this.officerEligibility = new ArrayList<>();
    }
    this.officerEligibility.add(officerEligibilityItem);
    return this;
  }

  /**
   * Describes the requirement of the officers(owner, partner, directors) to access the SME Loan product.
   * @return officerEligibility
  **/
  @ApiModelProperty(value = "Describes the requirement of the officers(owner, partner, directors) to access the SME Loan product.")

  @Valid

  public List<Eligibility3OfficerEligibility> getOfficerEligibility() {
    return officerEligibility;
  }

  public void setOfficerEligibility(List<Eligibility3OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
  }

  public Eligibility3 otherEligibility(List<Eligibility3OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility3 addOtherEligibilityItem(Eligibility3OtherEligibility otherEligibilityItem) {
    if (this.otherEligibility == null) {
      this.otherEligibility = new ArrayList<>();
    }
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

  /**
   * Other eligibility which is not covered by the main eligibility of the SME Loan product
   * @return otherEligibility
  **/
  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the SME Loan product")

  @Valid

  public List<Eligibility3OtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<Eligibility3OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility3 residencyEligibility(List<Eligibility3ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility3 addResidencyEligibilityItem(Eligibility3ResidencyEligibility residencyEligibilityItem) {
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

  public List<Eligibility3ResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<Eligibility3ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }

  public Eligibility3 tradingHistoryEligibility(List<Eligibility3TradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
    return this;
  }

  public Eligibility3 addTradingHistoryEligibilityItem(Eligibility3TradingHistoryEligibility tradingHistoryEligibilityItem) {
    if (this.tradingHistoryEligibility == null) {
      this.tradingHistoryEligibility = new ArrayList<>();
    }
    this.tradingHistoryEligibility.add(tradingHistoryEligibilityItem);
    return this;
  }

  /**
   * Describes the trading history requirements to access the SME Loan product.
   * @return tradingHistoryEligibility
  **/
  @ApiModelProperty(value = "Describes the trading history requirements to access the SME Loan product.")

  @Valid

  public List<Eligibility3TradingHistoryEligibility> getTradingHistoryEligibility() {
    return tradingHistoryEligibility;
  }

  public void setTradingHistoryEligibility(List<Eligibility3TradingHistoryEligibility> tradingHistoryEligibility) {
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
    Eligibility3 eligibility3 = (Eligibility3) o;
    return Objects.equals(this.ageEligibility, eligibility3.ageEligibility) &&
        Objects.equals(this.creditCheckEligibility, eligibility3.creditCheckEligibility) &&
        Objects.equals(this.idEligibility, eligibility3.idEligibility) &&
        Objects.equals(this.industryEligibility, eligibility3.industryEligibility) &&
        Objects.equals(this.legalStructureEligibility, eligibility3.legalStructureEligibility) &&
        Objects.equals(this.officerEligibility, eligibility3.officerEligibility) &&
        Objects.equals(this.otherEligibility, eligibility3.otherEligibility) &&
        Objects.equals(this.residencyEligibility, eligibility3.residencyEligibility) &&
        Objects.equals(this.tradingHistoryEligibility, eligibility3.tradingHistoryEligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageEligibility, creditCheckEligibility, idEligibility, industryEligibility, legalStructureEligibility, officerEligibility, otherEligibility, residencyEligibility, tradingHistoryEligibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility3 {\n");
    
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

