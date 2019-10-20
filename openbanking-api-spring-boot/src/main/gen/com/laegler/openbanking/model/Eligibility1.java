package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.AgeEligibility1;
import com.laegler.openbanking.model.CreditCheckEligibility1;
import com.laegler.openbanking.model.Eligibility1LegalStructureEligibility;
import com.laegler.openbanking.model.Eligibility1OfficerEligibility;
import com.laegler.openbanking.model.Eligibility1OtherEligibility;
import com.laegler.openbanking.model.Eligibility1ResidencyEligibility;
import com.laegler.openbanking.model.Eligibility1TradingHistoryEligibility;
import com.laegler.openbanking.model.IDEligibility1;
import com.laegler.openbanking.model.IndustryEligibility1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the CCC product.
 */
@ApiModel(description = "Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the CCC product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class Eligibility1   {
  @JsonProperty("AgeEligibility")
  private AgeEligibility1 ageEligibility = null;

  @JsonProperty("CreditCheckEligibility")
  private CreditCheckEligibility1 creditCheckEligibility = null;

  @JsonProperty("IDEligibility")
  private IDEligibility1 idEligibility = null;

  @JsonProperty("IndustryEligibility")
  private IndustryEligibility1 industryEligibility = null;

  @JsonProperty("LegalStructureEligibility")
  @Valid
  private List<Eligibility1LegalStructureEligibility> legalStructureEligibility = null;

  @JsonProperty("OfficerEligibility")
  @Valid
  private List<Eligibility1OfficerEligibility> officerEligibility = null;

  @JsonProperty("OtherEligibility")
  @Valid
  private List<Eligibility1OtherEligibility> otherEligibility = null;

  @JsonProperty("ResidencyEligibility")
  @Valid
  private List<Eligibility1ResidencyEligibility> residencyEligibility = null;

  @JsonProperty("TradingHistoryEligibility")
  @Valid
  private List<Eligibility1TradingHistoryEligibility> tradingHistoryEligibility = null;

  public Eligibility1 ageEligibility(AgeEligibility1 ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

  /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AgeEligibility1 getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility1 ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility1 creditCheckEligibility(CreditCheckEligibility1 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
    return this;
  }

  /**
   * Get creditCheckEligibility
   * @return creditCheckEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditCheckEligibility1 getCreditCheckEligibility() {
    return creditCheckEligibility;
  }

  public void setCreditCheckEligibility(CreditCheckEligibility1 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
  }

  public Eligibility1 idEligibility(IDEligibility1 idEligibility) {
    this.idEligibility = idEligibility;
    return this;
  }

  /**
   * Get idEligibility
   * @return idEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IDEligibility1 getIdEligibility() {
    return idEligibility;
  }

  public void setIdEligibility(IDEligibility1 idEligibility) {
    this.idEligibility = idEligibility;
  }

  public Eligibility1 industryEligibility(IndustryEligibility1 industryEligibility) {
    this.industryEligibility = industryEligibility;
    return this;
  }

  /**
   * Get industryEligibility
   * @return industryEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IndustryEligibility1 getIndustryEligibility() {
    return industryEligibility;
  }

  public void setIndustryEligibility(IndustryEligibility1 industryEligibility) {
    this.industryEligibility = industryEligibility;
  }

  public Eligibility1 legalStructureEligibility(List<Eligibility1LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
    return this;
  }

  public Eligibility1 addLegalStructureEligibilityItem(Eligibility1LegalStructureEligibility legalStructureEligibilityItem) {
    if (this.legalStructureEligibility == null) {
      this.legalStructureEligibility = new ArrayList<>();
    }
    this.legalStructureEligibility.add(legalStructureEligibilityItem);
    return this;
  }

  /**
   * Legal structure eligibility requirement to access the CCC product.
   * @return legalStructureEligibility
  **/
  @ApiModelProperty(value = "Legal structure eligibility requirement to access the CCC product.")

  @Valid

  public List<Eligibility1LegalStructureEligibility> getLegalStructureEligibility() {
    return legalStructureEligibility;
  }

  public void setLegalStructureEligibility(List<Eligibility1LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
  }

  public Eligibility1 officerEligibility(List<Eligibility1OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
    return this;
  }

  public Eligibility1 addOfficerEligibilityItem(Eligibility1OfficerEligibility officerEligibilityItem) {
    if (this.officerEligibility == null) {
      this.officerEligibility = new ArrayList<>();
    }
    this.officerEligibility.add(officerEligibilityItem);
    return this;
  }

  /**
   * Describes the requirement of the officers(owner, partner, directors) to access the CCC product.
   * @return officerEligibility
  **/
  @ApiModelProperty(value = "Describes the requirement of the officers(owner, partner, directors) to access the CCC product.")

  @Valid

  public List<Eligibility1OfficerEligibility> getOfficerEligibility() {
    return officerEligibility;
  }

  public void setOfficerEligibility(List<Eligibility1OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
  }

  public Eligibility1 otherEligibility(List<Eligibility1OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility1 addOtherEligibilityItem(Eligibility1OtherEligibility otherEligibilityItem) {
    if (this.otherEligibility == null) {
      this.otherEligibility = new ArrayList<>();
    }
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

  /**
   * Other eligibility which is not covered by the main eligibility of the CCC product
   * @return otherEligibility
  **/
  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the CCC product")

  @Valid

  public List<Eligibility1OtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<Eligibility1OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility1 residencyEligibility(List<Eligibility1ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility1 addResidencyEligibilityItem(Eligibility1ResidencyEligibility residencyEligibilityItem) {
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

  public List<Eligibility1ResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<Eligibility1ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }

  public Eligibility1 tradingHistoryEligibility(List<Eligibility1TradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
    return this;
  }

  public Eligibility1 addTradingHistoryEligibilityItem(Eligibility1TradingHistoryEligibility tradingHistoryEligibilityItem) {
    if (this.tradingHistoryEligibility == null) {
      this.tradingHistoryEligibility = new ArrayList<>();
    }
    this.tradingHistoryEligibility.add(tradingHistoryEligibilityItem);
    return this;
  }

  /**
   * Describes the trading history requirements to access the CCC product.
   * @return tradingHistoryEligibility
  **/
  @ApiModelProperty(value = "Describes the trading history requirements to access the CCC product.")

  @Valid

  public List<Eligibility1TradingHistoryEligibility> getTradingHistoryEligibility() {
    return tradingHistoryEligibility;
  }

  public void setTradingHistoryEligibility(List<Eligibility1TradingHistoryEligibility> tradingHistoryEligibility) {
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
    Eligibility1 eligibility1 = (Eligibility1) o;
    return Objects.equals(this.ageEligibility, eligibility1.ageEligibility) &&
        Objects.equals(this.creditCheckEligibility, eligibility1.creditCheckEligibility) &&
        Objects.equals(this.idEligibility, eligibility1.idEligibility) &&
        Objects.equals(this.industryEligibility, eligibility1.industryEligibility) &&
        Objects.equals(this.legalStructureEligibility, eligibility1.legalStructureEligibility) &&
        Objects.equals(this.officerEligibility, eligibility1.officerEligibility) &&
        Objects.equals(this.otherEligibility, eligibility1.otherEligibility) &&
        Objects.equals(this.residencyEligibility, eligibility1.residencyEligibility) &&
        Objects.equals(this.tradingHistoryEligibility, eligibility1.tradingHistoryEligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageEligibility, creditCheckEligibility, idEligibility, industryEligibility, legalStructureEligibility, officerEligibility, otherEligibility, residencyEligibility, tradingHistoryEligibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility1 {\n");
    
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

