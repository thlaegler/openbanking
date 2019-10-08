package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.RepaymentNonRepaymentFeeChargeCap;
import com.laegler.openbanking.model.RepaymentNonRepaymentFeeChargeDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Non repayment fee charges details
 */
@ApiModel(description = "Non repayment fee charges details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class RepaymentNonRepaymentFeeCharges   {
  @JsonProperty("NonRepaymentFeeChargeCap")
  @Valid
  private List<RepaymentNonRepaymentFeeChargeCap> nonRepaymentFeeChargeCap = null;

  @JsonProperty("NonRepaymentFeeChargeDetail")
  @Valid
  private List<RepaymentNonRepaymentFeeChargeDetail> nonRepaymentFeeChargeDetail = new ArrayList<>();

  public RepaymentNonRepaymentFeeCharges nonRepaymentFeeChargeCap(List<RepaymentNonRepaymentFeeChargeCap> nonRepaymentFeeChargeCap) {
    this.nonRepaymentFeeChargeCap = nonRepaymentFeeChargeCap;
    return this;
  }

  public RepaymentNonRepaymentFeeCharges addNonRepaymentFeeChargeCapItem(RepaymentNonRepaymentFeeChargeCap nonRepaymentFeeChargeCapItem) {
    if (this.nonRepaymentFeeChargeCap == null) {
      this.nonRepaymentFeeChargeCap = new ArrayList<>();
    }
    this.nonRepaymentFeeChargeCap.add(nonRepaymentFeeChargeCapItem);
    return this;
  }

  /**
   * NonRepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
   * @return nonRepaymentFeeChargeCap
  **/
  @ApiModelProperty(value = "NonRepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")

  @Valid

  public List<RepaymentNonRepaymentFeeChargeCap> getNonRepaymentFeeChargeCap() {
    return nonRepaymentFeeChargeCap;
  }

  public void setNonRepaymentFeeChargeCap(List<RepaymentNonRepaymentFeeChargeCap> nonRepaymentFeeChargeCap) {
    this.nonRepaymentFeeChargeCap = nonRepaymentFeeChargeCap;
  }

  public RepaymentNonRepaymentFeeCharges nonRepaymentFeeChargeDetail(List<RepaymentNonRepaymentFeeChargeDetail> nonRepaymentFeeChargeDetail) {
    this.nonRepaymentFeeChargeDetail = nonRepaymentFeeChargeDetail;
    return this;
  }

  public RepaymentNonRepaymentFeeCharges addNonRepaymentFeeChargeDetailItem(RepaymentNonRepaymentFeeChargeDetail nonRepaymentFeeChargeDetailItem) {
    this.nonRepaymentFeeChargeDetail.add(nonRepaymentFeeChargeDetailItem);
    return this;
  }

  /**
   * Details about specific fees/charges that are applied for non repayment
   * @return nonRepaymentFeeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Details about specific fees/charges that are applied for non repayment")
  @NotNull

  @Valid
@Size(min=1) 
  public List<RepaymentNonRepaymentFeeChargeDetail> getNonRepaymentFeeChargeDetail() {
    return nonRepaymentFeeChargeDetail;
  }

  public void setNonRepaymentFeeChargeDetail(List<RepaymentNonRepaymentFeeChargeDetail> nonRepaymentFeeChargeDetail) {
    this.nonRepaymentFeeChargeDetail = nonRepaymentFeeChargeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentNonRepaymentFeeCharges repaymentNonRepaymentFeeCharges = (RepaymentNonRepaymentFeeCharges) o;
    return Objects.equals(this.nonRepaymentFeeChargeCap, repaymentNonRepaymentFeeCharges.nonRepaymentFeeChargeCap) &&
        Objects.equals(this.nonRepaymentFeeChargeDetail, repaymentNonRepaymentFeeCharges.nonRepaymentFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonRepaymentFeeChargeCap, nonRepaymentFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentNonRepaymentFeeCharges {\n");
    
    sb.append("    nonRepaymentFeeChargeCap: ").append(toIndentedString(nonRepaymentFeeChargeCap)).append("\n");
    sb.append("    nonRepaymentFeeChargeDetail: ").append(toIndentedString(nonRepaymentFeeChargeDetail)).append("\n");
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

