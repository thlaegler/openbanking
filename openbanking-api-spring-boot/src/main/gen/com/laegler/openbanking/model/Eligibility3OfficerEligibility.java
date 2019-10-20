package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherOfficerType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the requirement of the officers(owner, partner, directors) to access the SME Loan product.
 */
@ApiModel(description = "Describes the requirement of the officers(owner, partner, directors) to access the SME Loan product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class Eligibility3OfficerEligibility   {
  @JsonProperty("MaxAmount")
  private Integer maxAmount = null;

  @JsonProperty("MinAmount")
  private Integer minAmount = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  /**
   * Defines the types of officers eligible for the SME Loan product. Examples are Directors, Owners etc.
   */
  public enum OfficerTypeEnum {
    DIRECTOR("Director"),
    
    OWNER("Owner"),
    
    OTHER("Other"),
    
    PARTNER("Partner"),
    
    SIGNIFICANTCONTROL("SignificantControl");

    private String value;

    OfficerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OfficerTypeEnum fromValue(String text) {
      for (OfficerTypeEnum b : OfficerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("OfficerType")
  private OfficerTypeEnum officerType = null;

  @JsonProperty("OtherOfficerType")
  private OtherOfficerType otherOfficerType = null;

  public Eligibility3OfficerEligibility maxAmount(Integer maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

  /**
   * Maximum amount of officers (for a particular officer type) required to the SME Loan product
   * @return maxAmount
  **/
  @ApiModelProperty(value = "Maximum amount of officers (for a particular officer type) required to the SME Loan product")


  public Integer getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Integer maxAmount) {
    this.maxAmount = maxAmount;
  }

  public Eligibility3OfficerEligibility minAmount(Integer minAmount) {
    this.minAmount = minAmount;
    return this;
  }

  /**
   * Minimum amount of officers (for a particular officer type) required to the SME Loan product
   * @return minAmount
  **/
  @ApiModelProperty(value = "Minimum amount of officers (for a particular officer type) required to the SME Loan product")


  public Integer getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(Integer minAmount) {
    this.minAmount = minAmount;
  }

  public Eligibility3OfficerEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Eligibility3OfficerEligibility addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the OfficerEligibility details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the OfficerEligibility details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Eligibility3OfficerEligibility officerType(OfficerTypeEnum officerType) {
    this.officerType = officerType;
    return this;
  }

  /**
   * Defines the types of officers eligible for the SME Loan product. Examples are Directors, Owners etc.
   * @return officerType
  **/
  @ApiModelProperty(value = "Defines the types of officers eligible for the SME Loan product. Examples are Directors, Owners etc.")


  public OfficerTypeEnum getOfficerType() {
    return officerType;
  }

  public void setOfficerType(OfficerTypeEnum officerType) {
    this.officerType = officerType;
  }

  public Eligibility3OfficerEligibility otherOfficerType(OtherOfficerType otherOfficerType) {
    this.otherOfficerType = otherOfficerType;
    return this;
  }

  /**
   * Get otherOfficerType
   * @return otherOfficerType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherOfficerType getOtherOfficerType() {
    return otherOfficerType;
  }

  public void setOtherOfficerType(OtherOfficerType otherOfficerType) {
    this.otherOfficerType = otherOfficerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eligibility3OfficerEligibility eligibility3OfficerEligibility = (Eligibility3OfficerEligibility) o;
    return Objects.equals(this.maxAmount, eligibility3OfficerEligibility.maxAmount) &&
        Objects.equals(this.minAmount, eligibility3OfficerEligibility.minAmount) &&
        Objects.equals(this.notes, eligibility3OfficerEligibility.notes) &&
        Objects.equals(this.officerType, eligibility3OfficerEligibility.officerType) &&
        Objects.equals(this.otherOfficerType, eligibility3OfficerEligibility.otherOfficerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAmount, minAmount, notes, officerType, otherOfficerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility3OfficerEligibility {\n");
    
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    officerType: ").append(toIndentedString(officerType)).append("\n");
    sb.append("    otherOfficerType: ").append(toIndentedString(otherOfficerType)).append("\n");
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

