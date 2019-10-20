package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherResidencyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Countries in which an accountholder can reside and, therefore, be eligible to open an account
 */
@ApiModel(description = "Countries in which an accountholder can reside and, therefore, be eligible to open an account")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class Eligibility1ResidencyEligibility   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherResidencyType")
  private OtherResidencyType otherResidencyType = null;

  @JsonProperty("ResidencyIncluded")
  @Valid
  private List<String> residencyIncluded = new ArrayList<>();

  /**
   * Residency type like Tax residency, Owner residency etc.
   */
  public enum ResidencyTypeEnum {
    INCORPORATED("Incorporated"),
    
    OWNER("Owner"),
    
    OTHER("Other"),
    
    TRADING("Trading"),
    
    COMPANYTAX("CompanyTax");

    private String value;

    ResidencyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResidencyTypeEnum fromValue(String text) {
      for (ResidencyTypeEnum b : ResidencyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ResidencyType")
  private ResidencyTypeEnum residencyType = null;

  public Eligibility1ResidencyEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Eligibility1ResidencyEligibility addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the ResidencyEligibility details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the ResidencyEligibility details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Eligibility1ResidencyEligibility otherResidencyType(OtherResidencyType otherResidencyType) {
    this.otherResidencyType = otherResidencyType;
    return this;
  }

  /**
   * Get otherResidencyType
   * @return otherResidencyType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherResidencyType getOtherResidencyType() {
    return otherResidencyType;
  }

  public void setOtherResidencyType(OtherResidencyType otherResidencyType) {
    this.otherResidencyType = otherResidencyType;
  }

  public Eligibility1ResidencyEligibility residencyIncluded(List<String> residencyIncluded) {
    this.residencyIncluded = residencyIncluded;
    return this;
  }

  public Eligibility1ResidencyEligibility addResidencyIncludedItem(String residencyIncludedItem) {
    this.residencyIncluded.add(residencyIncludedItem);
    return this;
  }

  /**
   * Country code for which CCC product is allowed.
   * @return residencyIncluded
  **/
  @ApiModelProperty(required = true, value = "Country code for which CCC product is allowed.")
  @NotNull

@Size(min=1) 
  public List<String> getResidencyIncluded() {
    return residencyIncluded;
  }

  public void setResidencyIncluded(List<String> residencyIncluded) {
    this.residencyIncluded = residencyIncluded;
  }

  public Eligibility1ResidencyEligibility residencyType(ResidencyTypeEnum residencyType) {
    this.residencyType = residencyType;
    return this;
  }

  /**
   * Residency type like Tax residency, Owner residency etc.
   * @return residencyType
  **/
  @ApiModelProperty(value = "Residency type like Tax residency, Owner residency etc.")


  public ResidencyTypeEnum getResidencyType() {
    return residencyType;
  }

  public void setResidencyType(ResidencyTypeEnum residencyType) {
    this.residencyType = residencyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eligibility1ResidencyEligibility eligibility1ResidencyEligibility = (Eligibility1ResidencyEligibility) o;
    return Objects.equals(this.notes, eligibility1ResidencyEligibility.notes) &&
        Objects.equals(this.otherResidencyType, eligibility1ResidencyEligibility.otherResidencyType) &&
        Objects.equals(this.residencyIncluded, eligibility1ResidencyEligibility.residencyIncluded) &&
        Objects.equals(this.residencyType, eligibility1ResidencyEligibility.residencyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, otherResidencyType, residencyIncluded, residencyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility1ResidencyEligibility {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherResidencyType: ").append(toIndentedString(otherResidencyType)).append("\n");
    sb.append("    residencyIncluded: ").append(toIndentedString(residencyIncluded)).append("\n");
    sb.append("    residencyType: ").append(toIndentedString(residencyType)).append("\n");
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

