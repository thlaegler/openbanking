package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.LoanInterestLoanInterestFeeChargeCap;
import com.laegler.openbanking.model.LoanInterestLoanInterestFeeChargeDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class LoanInterestLoanInterestFeesCharges   {
  @JsonProperty("LoanInterestFeeChargeCap")
  @Valid
  private List<LoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap = null;

  @JsonProperty("LoanInterestFeeChargeDetail")
  @Valid
  private List<LoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail = new ArrayList<>();

  public LoanInterestLoanInterestFeesCharges loanInterestFeeChargeCap(List<LoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    return this;
  }

  public LoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeCapItem(LoanInterestLoanInterestFeeChargeCap loanInterestFeeChargeCapItem) {
    if (this.loanInterestFeeChargeCap == null) {
      this.loanInterestFeeChargeCap = new ArrayList<>();
    }
    this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
   * @return loanInterestFeeChargeCap
  **/
  @ApiModelProperty(value = "Details about any caps (minimum/maximum charges) that apply to a particular fee/charge")

  @Valid

  public List<LoanInterestLoanInterestFeeChargeCap> getLoanInterestFeeChargeCap() {
    return loanInterestFeeChargeCap;
  }

  public void setLoanInterestFeeChargeCap(List<LoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
  }

  public LoanInterestLoanInterestFeesCharges loanInterestFeeChargeDetail(List<LoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    return this;
  }

  public LoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeDetailItem(LoanInterestLoanInterestFeeChargeDetail loanInterestFeeChargeDetailItem) {
    this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
    return this;
  }

  /**
   * Other fees/charges details
   * @return loanInterestFeeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Other fees/charges details")
  @NotNull

  @Valid
@Size(min=1) 
  public List<LoanInterestLoanInterestFeeChargeDetail> getLoanInterestFeeChargeDetail() {
    return loanInterestFeeChargeDetail;
  }

  public void setLoanInterestFeeChargeDetail(List<LoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanInterestLoanInterestFeesCharges loanInterestLoanInterestFeesCharges = (LoanInterestLoanInterestFeesCharges) o;
    return Objects.equals(this.loanInterestFeeChargeCap, loanInterestLoanInterestFeesCharges.loanInterestFeeChargeCap) &&
        Objects.equals(this.loanInterestFeeChargeDetail, loanInterestLoanInterestFeesCharges.loanInterestFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanInterestFeeChargeCap, loanInterestFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanInterestLoanInterestFeesCharges {\n");
    
    sb.append("    loanInterestFeeChargeCap: ").append(toIndentedString(loanInterestFeeChargeCap)).append("\n");
    sb.append("    loanInterestFeeChargeDetail: ").append(toIndentedString(loanInterestFeeChargeDetail)).append("\n");
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

