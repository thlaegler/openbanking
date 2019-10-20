package com.laegler.openbanking.model;

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
  * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the CCC product.
 **/
@ApiModel(description="Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the CCC product.")
public class Eligibility1  {
  
  @ApiModelProperty(value = "")
  @Valid
  private AgeEligibility1 ageEligibility = null;

  @ApiModelProperty(value = "")
  @Valid
  private CreditCheckEligibility1 creditCheckEligibility = null;

  @ApiModelProperty(value = "")
  @Valid
  private IDEligibility1 idEligibility = null;

  @ApiModelProperty(value = "")
  @Valid
  private IndustryEligibility1 industryEligibility = null;

  @ApiModelProperty(value = "Legal structure eligibility requirement to access the CCC product.")
  @Valid
 /**
   * Legal structure eligibility requirement to access the CCC product.
  **/
  private List<Eligibility1LegalStructureEligibility> legalStructureEligibility = null;

  @ApiModelProperty(value = "Describes the requirement of the officers(owner, partner, directors) to access the CCC product.")
  @Valid
 /**
   * Describes the requirement of the officers(owner, partner, directors) to access the CCC product.
  **/
  private List<Eligibility1OfficerEligibility> officerEligibility = null;

  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the CCC product")
  @Valid
 /**
   * Other eligibility which is not covered by the main eligibility of the CCC product
  **/
  private List<Eligibility1OtherEligibility> otherEligibility = null;

  @ApiModelProperty(value = "Countries in which an accountholder can reside and, therefore, be eligible to open an account")
  @Valid
 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
  **/
  private List<Eligibility1ResidencyEligibility> residencyEligibility = null;

  @ApiModelProperty(value = "Describes the trading history requirements to access the CCC product.")
  @Valid
 /**
   * Describes the trading history requirements to access the CCC product.
  **/
  private List<Eligibility1TradingHistoryEligibility> tradingHistoryEligibility = null;
 /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @JsonProperty("AgeEligibility")
  public AgeEligibility1 getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility1 ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility1 ageEligibility(AgeEligibility1 ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

 /**
   * Get creditCheckEligibility
   * @return creditCheckEligibility
  **/
  @JsonProperty("CreditCheckEligibility")
  public CreditCheckEligibility1 getCreditCheckEligibility() {
    return creditCheckEligibility;
  }

  public void setCreditCheckEligibility(CreditCheckEligibility1 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
  }

  public Eligibility1 creditCheckEligibility(CreditCheckEligibility1 creditCheckEligibility) {
    this.creditCheckEligibility = creditCheckEligibility;
    return this;
  }

 /**
   * Get idEligibility
   * @return idEligibility
  **/
  @JsonProperty("IDEligibility")
  public IDEligibility1 getIdEligibility() {
    return idEligibility;
  }

  public void setIdEligibility(IDEligibility1 idEligibility) {
    this.idEligibility = idEligibility;
  }

  public Eligibility1 idEligibility(IDEligibility1 idEligibility) {
    this.idEligibility = idEligibility;
    return this;
  }

 /**
   * Get industryEligibility
   * @return industryEligibility
  **/
  @JsonProperty("IndustryEligibility")
  public IndustryEligibility1 getIndustryEligibility() {
    return industryEligibility;
  }

  public void setIndustryEligibility(IndustryEligibility1 industryEligibility) {
    this.industryEligibility = industryEligibility;
  }

  public Eligibility1 industryEligibility(IndustryEligibility1 industryEligibility) {
    this.industryEligibility = industryEligibility;
    return this;
  }

 /**
   * Legal structure eligibility requirement to access the CCC product.
   * @return legalStructureEligibility
  **/
  @JsonProperty("LegalStructureEligibility")
  public List<Eligibility1LegalStructureEligibility> getLegalStructureEligibility() {
    return legalStructureEligibility;
  }

  public void setLegalStructureEligibility(List<Eligibility1LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
  }

  public Eligibility1 legalStructureEligibility(List<Eligibility1LegalStructureEligibility> legalStructureEligibility) {
    this.legalStructureEligibility = legalStructureEligibility;
    return this;
  }

  public Eligibility1 addLegalStructureEligibilityItem(Eligibility1LegalStructureEligibility legalStructureEligibilityItem) {
    this.legalStructureEligibility.add(legalStructureEligibilityItem);
    return this;
  }

 /**
   * Describes the requirement of the officers(owner, partner, directors) to access the CCC product.
   * @return officerEligibility
  **/
  @JsonProperty("OfficerEligibility")
  public List<Eligibility1OfficerEligibility> getOfficerEligibility() {
    return officerEligibility;
  }

  public void setOfficerEligibility(List<Eligibility1OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
  }

  public Eligibility1 officerEligibility(List<Eligibility1OfficerEligibility> officerEligibility) {
    this.officerEligibility = officerEligibility;
    return this;
  }

  public Eligibility1 addOfficerEligibilityItem(Eligibility1OfficerEligibility officerEligibilityItem) {
    this.officerEligibility.add(officerEligibilityItem);
    return this;
  }

 /**
   * Other eligibility which is not covered by the main eligibility of the CCC product
   * @return otherEligibility
  **/
  @JsonProperty("OtherEligibility")
  public List<Eligibility1OtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<Eligibility1OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility1 otherEligibility(List<Eligibility1OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility1 addOtherEligibilityItem(Eligibility1OtherEligibility otherEligibilityItem) {
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
   * @return residencyEligibility
  **/
  @JsonProperty("ResidencyEligibility")
  public List<Eligibility1ResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<Eligibility1ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }

  public Eligibility1 residencyEligibility(List<Eligibility1ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility1 addResidencyEligibilityItem(Eligibility1ResidencyEligibility residencyEligibilityItem) {
    this.residencyEligibility.add(residencyEligibilityItem);
    return this;
  }

 /**
   * Describes the trading history requirements to access the CCC product.
   * @return tradingHistoryEligibility
  **/
  @JsonProperty("TradingHistoryEligibility")
  public List<Eligibility1TradingHistoryEligibility> getTradingHistoryEligibility() {
    return tradingHistoryEligibility;
  }

  public void setTradingHistoryEligibility(List<Eligibility1TradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
  }

  public Eligibility1 tradingHistoryEligibility(List<Eligibility1TradingHistoryEligibility> tradingHistoryEligibility) {
    this.tradingHistoryEligibility = tradingHistoryEligibility;
    return this;
  }

  public Eligibility1 addTradingHistoryEligibilityItem(Eligibility1TradingHistoryEligibility tradingHistoryEligibilityItem) {
    this.tradingHistoryEligibility.add(tradingHistoryEligibilityItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

