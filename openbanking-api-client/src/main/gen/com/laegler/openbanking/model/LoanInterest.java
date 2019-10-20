package com.laegler.openbanking.model;

import com.laegler.openbanking.model.LoanInterestLoanInterestTierBandSet;
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
  * Details about the interest that may be payable to the SME Loan
 **/
@ApiModel(description="Details about the interest that may be payable to the SME Loan")
public class LoanInterest  {
  
  @ApiModelProperty(required = true, value = "The group of tiers or bands for which debit interest can be applied.")
 /**
   * The group of tiers or bands for which debit interest can be applied.
  **/
  private List<LoanInterestLoanInterestTierBandSet> loanInterestTierBandSet = new ArrayList<LoanInterestLoanInterestTierBandSet>();

  @ApiModelProperty(value = "Optional additional notes to supplement the LoanInterest")
 /**
   * Optional additional notes to supplement the LoanInterest
  **/
  private List<String> notes = null;
 /**
   * The group of tiers or bands for which debit interest can be applied.
   * @return loanInterestTierBandSet
  **/
  @JsonProperty("LoanInterestTierBandSet")
  public List<LoanInterestLoanInterestTierBandSet> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }

  public void setLoanInterestTierBandSet(List<LoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }

  public LoanInterest loanInterestTierBandSet(List<LoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public LoanInterest addLoanInterestTierBandSetItem(LoanInterestLoanInterestTierBandSet loanInterestTierBandSetItem) {
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

 /**
   * Optional additional notes to supplement the LoanInterest
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public LoanInterest notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public LoanInterest addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

