package com.laegler.openbanking.model;

import com.laegler.openbanking.model.AgeEligibility2;
import com.laegler.openbanking.model.CreditCheck;
import com.laegler.openbanking.model.Eligibility2OtherEligibility;
import com.laegler.openbanking.model.Eligibility2ResidencyEligibility;
import com.laegler.openbanking.model.IDVerificationCheck;
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
  * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the PCA product.
 **/
@ApiModel(description="Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the PCA product.")
public class Eligibility2  {
  
  @ApiModelProperty(value = "")
  private AgeEligibility2 ageEligibility = null;

  @ApiModelProperty(value = "")
  private CreditCheck creditCheck = null;

  @ApiModelProperty(value = "")
  private IDVerificationCheck idVerificationCheck = null;

  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the PCA product")
 /**
   * Other eligibility which is not covered by the main eligibility of the PCA product
  **/
  private List<Eligibility2OtherEligibility> otherEligibility = null;

  @ApiModelProperty(value = "Countries in which an accountholder can reside and, therefore, be eligible to open an account")
 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
  **/
  private List<Eligibility2ResidencyEligibility> residencyEligibility = null;
 /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @JsonProperty("AgeEligibility")
  public AgeEligibility2 getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility2 ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility2 ageEligibility(AgeEligibility2 ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

 /**
   * Get creditCheck
   * @return creditCheck
  **/
  @JsonProperty("CreditCheck")
  public CreditCheck getCreditCheck() {
    return creditCheck;
  }

  public void setCreditCheck(CreditCheck creditCheck) {
    this.creditCheck = creditCheck;
  }

  public Eligibility2 creditCheck(CreditCheck creditCheck) {
    this.creditCheck = creditCheck;
    return this;
  }

 /**
   * Get idVerificationCheck
   * @return idVerificationCheck
  **/
  @JsonProperty("IDVerificationCheck")
  public IDVerificationCheck getIdVerificationCheck() {
    return idVerificationCheck;
  }

  public void setIdVerificationCheck(IDVerificationCheck idVerificationCheck) {
    this.idVerificationCheck = idVerificationCheck;
  }

  public Eligibility2 idVerificationCheck(IDVerificationCheck idVerificationCheck) {
    this.idVerificationCheck = idVerificationCheck;
    return this;
  }

 /**
   * Other eligibility which is not covered by the main eligibility of the PCA product
   * @return otherEligibility
  **/
  @JsonProperty("OtherEligibility")
  public List<Eligibility2OtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<Eligibility2OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility2 otherEligibility(List<Eligibility2OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility2 addOtherEligibilityItem(Eligibility2OtherEligibility otherEligibilityItem) {
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

 /**
   * Countries in which an accountholder can reside and, therefore, be eligible to open an account
   * @return residencyEligibility
  **/
  @JsonProperty("ResidencyEligibility")
  public List<Eligibility2ResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<Eligibility2ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }

  public Eligibility2 residencyEligibility(List<Eligibility2ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility2 addResidencyEligibilityItem(Eligibility2ResidencyEligibility residencyEligibilityItem) {
    this.residencyEligibility.add(residencyEligibilityItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility2 {\n");
    
    sb.append("    ageEligibility: ").append(toIndentedString(ageEligibility)).append("\n");
    sb.append("    creditCheck: ").append(toIndentedString(creditCheck)).append("\n");
    sb.append("    idVerificationCheck: ").append(toIndentedString(idVerificationCheck)).append("\n");
    sb.append("    otherEligibility: ").append(toIndentedString(otherEligibility)).append("\n");
    sb.append("    residencyEligibility: ").append(toIndentedString(residencyEligibility)).append("\n");
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

