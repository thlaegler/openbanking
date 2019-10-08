package com.laegler.openbanking.model;

import com.laegler.openbanking.model.RepaymentAllocation;
import com.laegler.openbanking.model.RepaymentNonRepaymentFeeCharges;
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
  * Repayment details of the CCC product
 **/
@ApiModel(description="Repayment details of the CCC product")
public class Repayment  {
  
  @ApiModelProperty(value = "The minimum amount that you have to repay (if it is higher than MinBalancePaymentRate applied to outstanding balance) and if it is lower than the total outstanding balance remaining.")
 /**
   * The minimum amount that you have to repay (if it is higher than MinBalancePaymentRate applied to outstanding balance) and if it is lower than the total outstanding balance remaining.
  **/
  private String minBalanceRepaymentAmount = null;

  @ApiModelProperty(value = "The percentage of the outstanding balance that you have to repay per month")
 /**
   * The percentage of the outstanding balance that you have to repay per month
  **/
  private String minBalanceRepaymentRate = null;

  @ApiModelProperty(value = "Non repayment fee charges details")
 /**
   * Non repayment fee charges details
  **/
  private List<RepaymentNonRepaymentFeeCharges> nonRepaymentFeeCharges = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Repayment details.")
 /**
   * Optional additional notes to supplement the Repayment details.
  **/
  private List<String> notes = null;

  @ApiModelProperty(required = true, value = "")
  private RepaymentAllocation repaymentAllocation = null;
 /**
   * The minimum amount that you have to repay (if it is higher than MinBalancePaymentRate applied to outstanding balance) and if it is lower than the total outstanding balance remaining.
   * @return minBalanceRepaymentAmount
  **/
  @JsonProperty("MinBalanceRepaymentAmount")
  public String getMinBalanceRepaymentAmount() {
    return minBalanceRepaymentAmount;
  }

  public void setMinBalanceRepaymentAmount(String minBalanceRepaymentAmount) {
    this.minBalanceRepaymentAmount = minBalanceRepaymentAmount;
  }

  public Repayment minBalanceRepaymentAmount(String minBalanceRepaymentAmount) {
    this.minBalanceRepaymentAmount = minBalanceRepaymentAmount;
    return this;
  }

 /**
   * The percentage of the outstanding balance that you have to repay per month
   * @return minBalanceRepaymentRate
  **/
  @JsonProperty("MinBalanceRepaymentRate")
  public String getMinBalanceRepaymentRate() {
    return minBalanceRepaymentRate;
  }

  public void setMinBalanceRepaymentRate(String minBalanceRepaymentRate) {
    this.minBalanceRepaymentRate = minBalanceRepaymentRate;
  }

  public Repayment minBalanceRepaymentRate(String minBalanceRepaymentRate) {
    this.minBalanceRepaymentRate = minBalanceRepaymentRate;
    return this;
  }

 /**
   * Non repayment fee charges details
   * @return nonRepaymentFeeCharges
  **/
  @JsonProperty("NonRepaymentFeeCharges")
  public List<RepaymentNonRepaymentFeeCharges> getNonRepaymentFeeCharges() {
    return nonRepaymentFeeCharges;
  }

  public void setNonRepaymentFeeCharges(List<RepaymentNonRepaymentFeeCharges> nonRepaymentFeeCharges) {
    this.nonRepaymentFeeCharges = nonRepaymentFeeCharges;
  }

  public Repayment nonRepaymentFeeCharges(List<RepaymentNonRepaymentFeeCharges> nonRepaymentFeeCharges) {
    this.nonRepaymentFeeCharges = nonRepaymentFeeCharges;
    return this;
  }

  public Repayment addNonRepaymentFeeChargesItem(RepaymentNonRepaymentFeeCharges nonRepaymentFeeChargesItem) {
    this.nonRepaymentFeeCharges.add(nonRepaymentFeeChargesItem);
    return this;
  }

 /**
   * Optional additional notes to supplement the Repayment details.
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Repayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Repayment addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get repaymentAllocation
   * @return repaymentAllocation
  **/
  @JsonProperty("RepaymentAllocation")
  public RepaymentAllocation getRepaymentAllocation() {
    return repaymentAllocation;
  }

  public void setRepaymentAllocation(RepaymentAllocation repaymentAllocation) {
    this.repaymentAllocation = repaymentAllocation;
  }

  public Repayment repaymentAllocation(RepaymentAllocation repaymentAllocation) {
    this.repaymentAllocation = repaymentAllocation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repayment {\n");
    
    sb.append("    minBalanceRepaymentAmount: ").append(toIndentedString(minBalanceRepaymentAmount)).append("\n");
    sb.append("    minBalanceRepaymentRate: ").append(toIndentedString(minBalanceRepaymentRate)).append("\n");
    sb.append("    nonRepaymentFeeCharges: ").append(toIndentedString(nonRepaymentFeeCharges)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    repaymentAllocation: ").append(toIndentedString(repaymentAllocation)).append("\n");
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

