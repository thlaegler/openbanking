package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.RepaymentAllocation;
import com.laegler.openbanking.model.RepaymentNonRepaymentFeeCharges;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Repayment details of the CCC product
 */
@ApiModel(description = "Repayment details of the CCC product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class Repayment   {
  @JsonProperty("MinBalanceRepaymentAmount")
  private String minBalanceRepaymentAmount = null;

  @JsonProperty("MinBalanceRepaymentRate")
  private String minBalanceRepaymentRate = null;

  @JsonProperty("NonRepaymentFeeCharges")
  @Valid
  private List<RepaymentNonRepaymentFeeCharges> nonRepaymentFeeCharges = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("RepaymentAllocation")
  private RepaymentAllocation repaymentAllocation = null;

  public Repayment minBalanceRepaymentAmount(String minBalanceRepaymentAmount) {
    this.minBalanceRepaymentAmount = minBalanceRepaymentAmount;
    return this;
  }

  /**
   * The minimum amount that you have to repay (if it is higher than MinBalancePaymentRate applied to outstanding balance) and if it is lower than the total outstanding balance remaining.
   * @return minBalanceRepaymentAmount
  **/
  @ApiModelProperty(value = "The minimum amount that you have to repay (if it is higher than MinBalancePaymentRate applied to outstanding balance) and if it is lower than the total outstanding balance remaining.")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMinBalanceRepaymentAmount() {
    return minBalanceRepaymentAmount;
  }

  public void setMinBalanceRepaymentAmount(String minBalanceRepaymentAmount) {
    this.minBalanceRepaymentAmount = minBalanceRepaymentAmount;
  }

  public Repayment minBalanceRepaymentRate(String minBalanceRepaymentRate) {
    this.minBalanceRepaymentRate = minBalanceRepaymentRate;
    return this;
  }

  /**
   * The percentage of the outstanding balance that you have to repay per month
   * @return minBalanceRepaymentRate
  **/
  @ApiModelProperty(value = "The percentage of the outstanding balance that you have to repay per month")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMinBalanceRepaymentRate() {
    return minBalanceRepaymentRate;
  }

  public void setMinBalanceRepaymentRate(String minBalanceRepaymentRate) {
    this.minBalanceRepaymentRate = minBalanceRepaymentRate;
  }

  public Repayment nonRepaymentFeeCharges(List<RepaymentNonRepaymentFeeCharges> nonRepaymentFeeCharges) {
    this.nonRepaymentFeeCharges = nonRepaymentFeeCharges;
    return this;
  }

  public Repayment addNonRepaymentFeeChargesItem(RepaymentNonRepaymentFeeCharges nonRepaymentFeeChargesItem) {
    if (this.nonRepaymentFeeCharges == null) {
      this.nonRepaymentFeeCharges = new ArrayList<>();
    }
    this.nonRepaymentFeeCharges.add(nonRepaymentFeeChargesItem);
    return this;
  }

  /**
   * Non repayment fee charges details
   * @return nonRepaymentFeeCharges
  **/
  @ApiModelProperty(value = "Non repayment fee charges details")

  @Valid

  public List<RepaymentNonRepaymentFeeCharges> getNonRepaymentFeeCharges() {
    return nonRepaymentFeeCharges;
  }

  public void setNonRepaymentFeeCharges(List<RepaymentNonRepaymentFeeCharges> nonRepaymentFeeCharges) {
    this.nonRepaymentFeeCharges = nonRepaymentFeeCharges;
  }

  public Repayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Repayment addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Repayment details.
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Repayment details.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Repayment repaymentAllocation(RepaymentAllocation repaymentAllocation) {
    this.repaymentAllocation = repaymentAllocation;
    return this;
  }

  /**
   * Get repaymentAllocation
   * @return repaymentAllocation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RepaymentAllocation getRepaymentAllocation() {
    return repaymentAllocation;
  }

  public void setRepaymentAllocation(RepaymentAllocation repaymentAllocation) {
    this.repaymentAllocation = repaymentAllocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repayment repayment = (Repayment) o;
    return Objects.equals(this.minBalanceRepaymentAmount, repayment.minBalanceRepaymentAmount) &&
        Objects.equals(this.minBalanceRepaymentRate, repayment.minBalanceRepaymentRate) &&
        Objects.equals(this.nonRepaymentFeeCharges, repayment.nonRepaymentFeeCharges) &&
        Objects.equals(this.notes, repayment.notes) &&
        Objects.equals(this.repaymentAllocation, repayment.repaymentAllocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minBalanceRepaymentAmount, minBalanceRepaymentRate, nonRepaymentFeeCharges, notes, repaymentAllocation);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

