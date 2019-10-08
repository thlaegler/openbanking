package com.laegler.openbanking.model;

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
import java.util.ArrayList;
import java.util.List;

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
  * Eligibility details for this product i.e. the criteria that an business has to meet in order to be eligible for the SME Loan product.
 **/
@ApiModel(description="Eligibility details for this product i.e. the criteria that an business has to meet in order to be eligible for the SME Loan product.")
public class Eligibility3  {
  
  @ApiModelProperty(value = "")
  private AgeEligibility3 ageEligibility = null;

  @ApiModelProperty(value = "")
  private CreditCheckEligibility2 creditCheckEligibility = null;

  @ApiModelProperty(value = "")
  private IDEligibility2 idEligibility = null;

  @ApiModelProperty(value = "")
  private IndustryEligibility2 industryEligibility = null;

  @ApiModelProperty(value = "Legal structure eligibility requirement to access the SME Loan product.")
 /**
   * Legal structure eligibility requirement to access the SME Loan product.
  **/
  private List<Eligibility3LegalStructureEligibility> legalStructureEligibility = null;

  @ApiModelProperty(value = "Describes the requirement of the officers(owner, partner, directors) to access the SME Loan product.")
 /**
   * Describes the requirement of the officers(owner, partner, directors) to access the SME Loan product.
  **/
  private List<Eligibility3OfficerEligibility> officerEligibility = null;

  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the SME Loan product")
 /**
   * Other eligibility which is not covered by the main eligibility of the SME Loan product
  **/
  private List<Eligibility3OtherEligibility> otherEligibility = null;

  @ApiModelProperty(value = "Countries in which an accountholder can reside and, therefore, be eligible to open an account")
 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
  **/
  private List<Eligibility3ResidencyEligibility> residencyEligibility = null;

  @ApiModelProperty(value = "Describes the trading history requirements to access the SME Loan product.")
 /**
   * Describes the trading history requirements to access the SME Loan product.
  **/
  private List<Eligibility3TradingHistoryEligibility> tradingHistoryEligibility = null;
 /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @JsonProperty("AgeEligibility")
  public AgeEligibility3 getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility3 ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility3 ageEligibility(AgeEligibility3 ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

 /**
   * Get creditCheckEligibility
   * @return creditCheckEligibility
  **/
  @JsonProperty("CreditCheckEligibility")
  public CreditCheckEligibility2 getCreditCheckEligibility() {
    return creditCheckEligibility;
  }

  public void setCreditCheckEligibility(CreditCheckEligibility2 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
  }

  public Eligibility3 creditCheckEligibility(CreditCheckEligibility2 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
    return this;
  }

 /**
   * Get idEligibility
   * @return idEligibility
  **/
  @JsonProperty("IDEligibility")
  public IDEligibility2 getIdEligibility() {
    return idEligibility;
  }

  public void setIdEligibility(IDEligibility2 idEligibility) {
    this.idEligibility = idEligibility;
  }

  public Eligibility3 idEligibility(IDEligibility2 idEligibility) {
    this.idEligibility = idEligibility;
    return this;
  }

 /**
   * Get industryEligibility
   * @return industryEligibility
  **/
  @JsonProperty("IndustryEligibility")
  public IndustryEligibility2 getIndustryEligibility() {
    return industryEligibility;
  }

  public void setIndustryEligibility(IndustryEligibility2 industryEligibility) {
    this.industryEligibility = industryEligibility;
  }

  public Eligibility3 industryEligibility(IndustryEligibility2 industryEligibility) {
    this.industryEligibility = industryEligibility;
    return this;
  }

 /**
   * Legal structure eligibility requirement to access the SME Loan product.
   * @return legalStructureEligibility
  **/
  @JsonProperty("LegalStructureEligibility")
  public List<Eligibility3LegalStructureEligibility> getLegalStructureEligibility() {
    return legalStructureEligibility;
  }

  public void setLegalStructureEligibility(List<Eligibility3LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
  }

  public Eligibility3 legalStructureEligibility(List<Eligibility3LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
    return this;
  }

  public Eligibility3 addLegalStructureEligibilityItem(Eligibility3LegalStructureEligibility legalStructureEligibilityItem) {
    this.legalStructureEligibility.add(legalStructureEligibilityItem);
    return this;
  }

 /**
   * Describes the requirement of the officers(owner, partner, directors) to access the SME Loan product.
   * @return officerEligibility
  **/
  @JsonProperty("OfficerEligibility")
  public List<Eligibility3OfficerEligibility> getOfficerEligibility() {
    return officerEligibility;
  }

  public void setOfficerEligibility(List<Eligibility3OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
  }

  public Eligibility3 officerEligibility(List<Eligibility3OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
    return this;
  }

  public Eligibility3 addOfficerEligibilityItem(Eligibility3OfficerEligibility officerEligibilityItem) {
    this.officerEligibility.add(officerEligibilityItem);
    return this;
  }

 /**
   * Other eligibility which is not covered by the main eligibility of the SME Loan product
   * @return otherEligibility
  **/
  @JsonProperty("OtherEligibility")
  public List<Eligibility3OtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<Eligibility3OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility3 otherEligibility(List<Eligibility3OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility3 addOtherEligibilityItem(Eligibility3OtherEligibility otherEligibilityItem) {
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
   * @return residencyEligibility
  **/
  @JsonProperty("ResidencyEligibility")
  public List<Eligibility3ResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<Eligibility3ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }

  public Eligibility3 residencyEligibility(List<Eligibility3ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility3 addResidencyEligibilityItem(Eligibility3ResidencyEligibility residencyEligibilityItem) {
    this.residencyEligibility.add(residencyEligibilityItem);
    return this;
  }

 /**
   * Describes the trading history requirements to access the SME Loan product.
   * @return tradingHistoryEligibility
  **/
  @JsonProperty("TradingHistoryEligibility")
  public List<Eligibility3TradingHistoryEligibility> getTradingHistoryEligibility() {
    return tradingHistoryEligibility;
  }

  public void setTradingHistoryEligibility(List<Eligibility3TradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
  }

  public Eligibility3 tradingHistoryEligibility(List<Eligibility3TradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
    return this;
  }

  public Eligibility3 addTradingHistoryEligibilityItem(Eligibility3TradingHistoryEligibility tradingHistoryEligibilityItem) {
    this.tradingHistoryEligibility.add(tradingHistoryEligibilityItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

