package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.AgeEligibility2;
import com.laegler.openbanking.model.CreditCheck;
import com.laegler.openbanking.model.Eligibility2OtherEligibility;
import com.laegler.openbanking.model.Eligibility2ResidencyEligibility;
import com.laegler.openbanking.model.IDVerificationCheck;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the PCA product.
 */
@ApiModel(description = "Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the PCA product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class Eligibility2   {
  @JsonProperty("AgeEligibility")
  private AgeEligibility2 ageEligibility = null;

  @JsonProperty("CreditCheck")
  private CreditCheck creditCheck = null;

  @JsonProperty("IDVerificationCheck")
  private IDVerificationCheck idVerificationCheck = null;

  @JsonProperty("OtherEligibility")
  @Valid
  private List<Eligibility2OtherEligibility> otherEligibility = null;

  @JsonProperty("ResidencyEligibility")
  @Valid
  private List<Eligibility2ResidencyEligibility> residencyEligibility = null;

  public Eligibility2 ageEligibility(AgeEligibility2 ageEligibility) {
    this.ageEligibility = ageEligibility;
    return this;
  }

  /**
   * Get ageEligibility
   * @return ageEligibility
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AgeEligibility2 getAgeEligibility() {
    return ageEligibility;
  }

  public void setAgeEligibility(AgeEligibility2 ageEligibility) {
    this.ageEligibility = ageEligibility;
  }

  public Eligibility2 creditCheck(CreditCheck creditCheck) {
    this.creditCheck = creditCheck;
    return this;
  }

  /**
   * Get creditCheck
   * @return creditCheck
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditCheck getCreditCheck() {
    return creditCheck;
  }

  public void setCreditCheck(CreditCheck creditCheck) {
    this.creditCheck = creditCheck;
  }

  public Eligibility2 idVerificationCheck(IDVerificationCheck idVerificationCheck) {
    this.idVerificationCheck = idVerificationCheck;
    return this;
  }

  /**
   * Get idVerificationCheck
   * @return idVerificationCheck
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IDVerificationCheck getIdVerificationCheck() {
    return idVerificationCheck;
  }

  public void setIdVerificationCheck(IDVerificationCheck idVerificationCheck) {
    this.idVerificationCheck = idVerificationCheck;
  }

  public Eligibility2 otherEligibility(List<Eligibility2OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
    return this;
  }

  public Eligibility2 addOtherEligibilityItem(Eligibility2OtherEligibility otherEligibilityItem) {
    if (this.otherEligibility == null) {
      this.otherEligibility = new ArrayList<>();
    }
    this.otherEligibility.add(otherEligibilityItem);
    return this;
  }

  /**
   * Other eligibility which is not covered by the main eligibility of the PCA product
   * @return otherEligibility
  **/
  @ApiModelProperty(value = "Other eligibility which is not covered by the main eligibility of the PCA product")

  @Valid

  public List<Eligibility2OtherEligibility> getOtherEligibility() {
    return otherEligibility;
  }

  public void setOtherEligibility(List<Eligibility2OtherEligibility> otherEligibility) {
    this.otherEligibility = otherEligibility;
  }

  public Eligibility2 residencyEligibility(List<Eligibility2ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
    return this;
  }

  public Eligibility2 addResidencyEligibilityItem(Eligibility2ResidencyEligibility residencyEligibilityItem) {
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

  public List<Eligibility2ResidencyEligibility> getResidencyEligibility() {
    return residencyEligibility;
  }

  public void setResidencyEligibility(List<Eligibility2ResidencyEligibility> residencyEligibility) {
    this.residencyEligibility = residencyEligibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eligibility2 eligibility2 = (Eligibility2) o;
    return Objects.equals(this.ageEligibility, eligibility2.ageEligibility) &&
        Objects.equals(this.creditCheck, eligibility2.creditCheck) &&
        Objects.equals(this.idVerificationCheck, eligibility2.idVerificationCheck) &&
        Objects.equals(this.otherEligibility, eligibility2.otherEligibility) &&
        Objects.equals(this.residencyEligibility, eligibility2.residencyEligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageEligibility, creditCheck, idVerificationCheck, otherEligibility, residencyEligibility);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

