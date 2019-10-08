package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.LoanInterestLoanInterestTierBandSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the interest that may be payable to the SME Loan
 */
@ApiModel(description = "Details about the interest that may be payable to the SME Loan")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class LoanInterest   {
  @JsonProperty("LoanInterestTierBandSet")
  @Valid
  private List<LoanInterestLoanInterestTierBandSet> loanInterestTierBandSet = new ArrayList<>();

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  public LoanInterest loanInterestTierBandSet(List<LoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public LoanInterest addLoanInterestTierBandSetItem(LoanInterestLoanInterestTierBandSet loanInterestTierBandSetItem) {
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

  /**
   * The group of tiers or bands for which debit interest can be applied.
   * @return loanInterestTierBandSet
  **/
  @ApiModelProperty(required = true, value = "The group of tiers or bands for which debit interest can be applied.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<LoanInterestLoanInterestTierBandSet> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }

  public void setLoanInterestTierBandSet(List<LoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }

  public LoanInterest notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public LoanInterest addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the LoanInterest
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the LoanInterest")


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
    LoanInterest loanInterest = (LoanInterest) o;
    return Objects.equals(this.loanInterestTierBandSet, loanInterest.loanInterestTierBandSet) &&
        Objects.equals(this.notes, loanInterest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanInterestTierBandSet, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanInterest {\n");
    
    sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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

