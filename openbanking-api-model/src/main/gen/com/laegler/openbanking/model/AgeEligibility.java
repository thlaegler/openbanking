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
 * Age eligibility for BCA product
 */
@ApiModel(description = "Age eligibility for BCA product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class AgeEligibility   {
  @JsonProperty("MaximumAge")
  private Float maximumAge = null;

  @JsonProperty("MinimumAge")
  private Float minimumAge = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  public AgeEligibility maximumAge(Float maximumAge) {
    this.maximumAge = maximumAge;
    return this;
  }

  /**
   * Maximum age that a person is eligible to hold this account
   * @return maximumAge
  **/
  @ApiModelProperty(value = "Maximum age that a person is eligible to hold this account")


  public Float getMaximumAge() {
    return maximumAge;
  }

  public void setMaximumAge(Float maximumAge) {
    this.maximumAge = maximumAge;
  }

  public AgeEligibility minimumAge(Float minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

  /**
   * Minimum age that a person is eligible to hold this account
   * @return minimumAge
  **/
  @ApiModelProperty(value = "Minimum age that a person is eligible to hold this account")


  public Float getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(Float minimumAge) {
    this.minimumAge = minimumAge;
  }

  public AgeEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public AgeEligibility addNotesItem(String notesItem) {
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
    AgeEligibility ageEligibility = (AgeEligibility) o;
    return Objects.equals(this.maximumAge, ageEligibility.maximumAge) &&
        Objects.equals(this.minimumAge, ageEligibility.minimumAge) &&
        Objects.equals(this.notes, ageEligibility.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumAge, minimumAge, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeEligibility {\n");
    
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

