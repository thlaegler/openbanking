package com.laegler.openbanking.model;

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
  * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the BCA product.
 **/
@ApiModel(description="Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the BCA product.")
public class Eligibility  {
  
  @ApiModelProperty(value = "")
  @Valid
  private AgeEligibility ageEligibility = null;

  @ApiModelProperty(value = "")
  @Valid
  private CreditCheckEligibility creditCheckEligibility = null;

  @ApiModelProperty(value = "")
  @Valid
  private IDEligibility idEligibility = null;

  @ApiModelProperty(value = "")
  @Valid
  private IndustryEligibility industryEligibility = null;

  @ApiModelProperty(value = "Legal structure eligibility requirement to access the BCA product.")
  @Valid
 /**
   * Legal structure eligibility requirement to access the BCA product.
  **/
  private List<EligibilityLegalStructureEligibility> legalStructureEligibility = null;

  @ApiModelProperty(value = "Describes the requirement of the officers(owner, partner, directors) to access the BCA product.")
  @Valid
 /**
   * Describes the requirement of the officers(owner, partner, directors) to access the BCA product.
  **/
  private List<EligibilityOfficerEligibility> officerEligibility = null;

  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the BCA product")
  @Valid
 /**
   * Other eligibility which is not covered by the main eligibility of the BCA product
  **/
  private List<EligibilityOtherEligibility> otherEligibility = null;

  @ApiModelProperty(value = "Countries in which an accountholder can reside and, therefore, be eligible to open an account")
  @Valid
 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
  **/
  private List<EligibilityResidencyEligibility> residencyEligibility = null;

  @ApiModelProperty(value = "Describes the trading history requirements to access the BCA product.")
  @Valid
 /**
   * Describes the trading history requirements to access the BCA product.
  **/
  private List<EligibilityTradingHistoryEligibility> tradingHistoryEligibility = null;
 /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @JsonProperty("AgeEligibility")
  public AgeEligibility getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility ageEligibility(AgeEligibility ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

 /**
   * Get creditCheckEligibility
   * @return creditCheckEligibility
  **/
  @JsonProperty("CreditCheckEligibility")
  public CreditCheckEligibility getCreditCheckEligibility() {
    return creditCheckEligibility;
  }

  public void setCreditCheckEligibility(CreditCheckEligibility creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
  }

  public Eligibility creditCheckEligibility(CreditCheckEligibility creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
    return this;
  }

 /**
   * Get idEligibility
   * @return idEligibility
  **/
  @JsonProperty("IDEligibility")
  public IDEligibility getIdEligibility() {
    return idEligibility;
  }

  public void setIdEligibility(IDEligibility idEligibility) {
    this.idEligibility = idEligibility;
  }

  public Eligibility idEligibility(IDEligibility idEligibility) {
    this.idEligibility = idEligibility;
    return this;
  }

 /**
   * Get industryEligibility
   * @return industryEligibility
  **/
  @JsonProperty("IndustryEligibility")
  public IndustryEligibility getIndustryEligibility() {
    return industryEligibility;
  }

  public void setIndustryEligibility(IndustryEligibility industryEligibility) {
    this.industryEligibility = industryEligibility;
  }

  public Eligibility industryEligibility(IndustryEligibility industryEligibility) {
    this.industryEligibility = industryEligibility;
    return this;
  }

 /**
   * Legal structure eligibility requirement to access the BCA product.
   * @return legalStructureEligibility
  **/
  @JsonProperty("LegalStructureEligibility")
  public List<EligibilityLegalStructureEligibility> getLegalStructureEligibility() {
    return legalStructureEligibility;
  }

  public void setLegalStructureEligibility(List<EligibilityLegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
  }

  public Eligibility legalStructureEligibility(List<EligibilityLegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
    return this;
  }

  public Eligibility addLegalStructureEligibilityItem(EligibilityLegalStructureEligibility legalStructureEligibilityItem) {
    this.legalStructureEligibility.add(legalStructureEligibilityItem);
    return this;
  }

 /**
   * Describes the requirement of the officers(owner, partner, directors) to access the BCA product.
   * @return officerEligibility
  **/
  @JsonProperty("OfficerEligibility")
  public List<EligibilityOfficerEligibility> getOfficerEligibility() {
    return officerEligibility;
  }

  public void setOfficerEligibility(List<EligibilityOfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
  }

  public Eligibility officerEligibility(List<EligibilityOfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
    return this;
  }

  public Eligibility addOfficerEligibilityItem(EligibilityOfficerEligibility officerEligibilityItem) {
    this.officerEligibility.add(officerEligibilityItem);
    return this;
  }

 /**
   * Other eligibility which is not covered by the main eligibility of the BCA product
   * @return otherEligibility
  **/
  @JsonProperty("OtherEligibility")
  public List<EligibilityOtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<EligibilityOtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility otherEligibility(List<EligibilityOtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility addOtherEligibilityItem(EligibilityOtherEligibility otherEligibilityItem) {
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
   * @return residencyEligibility
  **/
  @JsonProperty("ResidencyEligibility")
  public List<EligibilityResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<EligibilityResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }

  public Eligibility residencyEligibility(List<EligibilityResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility addResidencyEligibilityItem(EligibilityResidencyEligibility residencyEligibilityItem) {
    this.residencyEligibility.add(residencyEligibilityItem);
    return this;
  }

 /**
   * Describes the trading history requirements to access the BCA product.
   * @return tradingHistoryEligibility
  **/
  @JsonProperty("TradingHistoryEligibility")
  public List<EligibilityTradingHistoryEligibility> getTradingHistoryEligibility() {
    return tradingHistoryEligibility;
  }

  public void setTradingHistoryEligibility(List<EligibilityTradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
  }

  public Eligibility tradingHistoryEligibility(List<EligibilityTradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
    return this;
  }

  public Eligibility addTradingHistoryEligibilityItem(EligibilityTradingHistoryEligibility tradingHistoryEligibilityItem) {
    this.tradingHistoryEligibility.add(tradingHistoryEligibilityItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

