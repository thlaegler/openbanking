package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Age eligibility apply for the SME Loan product
 */
@ApiModel(description = "Age eligibility apply for the SME Loan product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class AgeEligibility3   {
  @JsonProperty("MaximumAge")
  private Float maximumAge = null;

  @JsonProperty("MinimumAge")
  private Float minimumAge = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  public AgeEligibility3 maximumAge(Float maximumAge) {
    this.maximumAge = maximumAge;
    return this;
  }

  /**
   * Maximum age that a person is eligible to apply for this account
   * @return maximumAge
  **/
  @ApiModelProperty(value = "Maximum age that a person is eligible to apply for this account")


  public Float getMaximumAge() {
    return maximumAge;
  }

  public void setMaximumAge(Float maximumAge) {
    this.maximumAge = maximumAge;
  }

  public AgeEligibility3 minimumAge(Float minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

  /**
   * Minimum age that a person is eligible to apply for this account
   * @return minimumAge
  **/
  @ApiModelProperty(value = "Minimum age that a person is eligible to apply for this account")


  public Float getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(Float minimumAge) {
    this.minimumAge = minimumAge;
  }

  public AgeEligibility3 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public AgeEligibility3 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the AgeEligibility details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the AgeEligibility details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeEligibility3 ageEligibility3 = (AgeEligibility3) o;
    return Objects.equals(this.maximumAge, ageEligibility3.maximumAge) &&
        Objects.equals(this.minimumAge, ageEligibility3.minimumAge) &&
        Objects.equals(this.notes, ageEligibility3.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumAge, minimumAge, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeEligibility3 {\n");
    
    sb.append("    maximumAge: ").append(toIndentedString(maximumAge)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

