package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Credit check criteria that the account holder will need to meet to take out the loan product
 */
@ApiModel(description = "Credit check criteria that the account holder will need to meet to take out the loan product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class CreditCheckEligibility2   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  /**
   * Opening Credit Scoring Type (Hard or Soft)
   */
  public enum ScoringTypeEnum {
    HARD("Hard"),
    
    SOFT("Soft");

    private String value;

    ScoringTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScoringTypeEnum fromValue(String text) {
      for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ScoringType")
  private ScoringTypeEnum scoringType = null;

  public CreditCheckEligibility2 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditCheckEligibility2 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the CreditCheck details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the CreditCheck details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CreditCheckEligibility2 scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

  /**
   * Opening Credit Scoring Type (Hard or Soft)
   * @return scoringType
  **/
  @ApiModelProperty(value = "Opening Credit Scoring Type (Hard or Soft)")


  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCheckEligibility2 creditCheckEligibility2 = (CreditCheckEligibility2) o;
    return Objects.equals(this.notes, creditCheckEligibility2.notes) &&
        Objects.equals(this.scoringType, creditCheckEligibility2.scoringType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, scoringType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCheckEligibility2 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    scoringType: ").append(toIndentedString(scoringType)).append("\n");
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
