package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.RepaymentFeeChargesRepaymentFeeChargeCap;
import com.laegler.openbanking.model.RepaymentFeeChargesRepaymentFeeChargeDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 */
@ApiModel(description = "Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class RepaymentFeeCharges   {
  @JsonProperty("RepaymentFeeChargeCap")
  @Valid
  private List<RepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap = null;

  @JsonProperty("RepaymentFeeChargeDetail")
  @Valid
  private List<RepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail = new ArrayList<>();

  public RepaymentFeeCharges repaymentFeeChargeCap(List<RepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    return this;
  }

  public RepaymentFeeCharges addRepaymentFeeChargeCapItem(RepaymentFeeChargesRepaymentFeeChargeCap repaymentFeeChargeCapItem) {
    if (this.repaymentFeeChargeCap == null) {
      this.repaymentFeeChargeCap = new ArrayList<>();
    }
    this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
    return this;
  }

  /**
   * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
   * @return repaymentFeeChargeCap
  **/
  @ApiModelProperty(value = "RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")

  @Valid

  public List<RepaymentFeeChargesRepaymentFeeChargeCap> getRepaymentFeeChargeCap() {
    return repaymentFeeChargeCap;
  }

  public void setRepaymentFeeChargeCap(List<RepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
  }

  public RepaymentFeeCharges repaymentFeeChargeDetail(List<RepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    return this;
  }

  public RepaymentFeeCharges addRepaymentFeeChargeDetailItem(RepaymentFeeChargesRepaymentFeeChargeDetail repaymentFeeChargeDetailItem) {
    this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
    return this;
  }

  /**
   * Details about specific fees/charges that are applied for repayment
   * @return repaymentFeeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Details about specific fees/charges that are applied for repayment")
  @NotNull

  @Valid
@Size(min=1) 
  public List<RepaymentFeeChargesRepaymentFeeChargeDetail> getRepaymentFeeChargeDetail() {
    return repaymentFeeChargeDetail;
  }

  public void setRepaymentFeeChargeDetail(List<RepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentFeeCharges repaymentFeeCharges = (RepaymentFeeCharges) o;
    return Objects.equals(this.repaymentFeeChargeCap, repaymentFeeCharges.repaymentFeeChargeCap) &&
        Objects.equals(this.repaymentFeeChargeDetail, repaymentFeeCharges.repaymentFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentFeeChargeCap, repaymentFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentFeeCharges {\n");
    
    sb.append("    repaymentFeeChargeCap: ").append(toIndentedString(repaymentFeeChargeCap)).append("\n");
    sb.append("    repaymentFeeChargeDetail: ").append(toIndentedString(repaymentFeeChargeDetail)).append("\n");
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

