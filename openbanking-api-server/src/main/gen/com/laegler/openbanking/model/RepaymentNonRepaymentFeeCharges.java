package com.laegler.openbanking.model;

import com.laegler.openbanking.model.RepaymentNonRepaymentFeeChargeCap;
import com.laegler.openbanking.model.RepaymentNonRepaymentFeeChargeDetail;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

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
  * Non repayment fee charges details
 **/
@ApiModel(description="Non repayment fee charges details")
public class RepaymentNonRepaymentFeeCharges  {
  
  @ApiModelProperty(value = "NonRepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")
  @Valid
 /**
   * NonRepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
  **/
  private List<RepaymentNonRepaymentFeeChargeCap> nonRepaymentFeeChargeCap = null;

  @ApiModelProperty(required = true, value = "Details about specific fees/charges that are applied for non repayment")
  @Valid
 /**
   * Details about specific fees/charges that are applied for non repayment
  **/
  private List<RepaymentNonRepaymentFeeChargeDetail> nonRepaymentFeeChargeDetail = new ArrayList<RepaymentNonRepaymentFeeChargeDetail>();
 /**
   * NonRepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
   * @return nonRepaymentFeeChargeCap
  **/
  @JsonProperty("NonRepaymentFeeChargeCap")
  public List<RepaymentNonRepaymentFeeChargeCap> getNonRepaymentFeeChargeCap() {
    return nonRepaymentFeeChargeCap;
  }

  public void setNonRepaymentFeeChargeCap(List<RepaymentNonRepaymentFeeChargeCap> nonRepaymentFeeChargeCap) {
    this.nonRepaymentFeeChargeCap = nonRepaymentFeeChargeCap;
  }

  public RepaymentNonRepaymentFeeCharges nonRepaymentFeeChargeCap(List<RepaymentNonRepaymentFeeChargeCap> nonRepaymentFeeChargeCap) {
    this.nonRepaymentFeeChargeCap = nonRepaymentFeeChargeCap;
    return this;
  }

  public RepaymentNonRepaymentFeeCharges addNonRepaymentFeeChargeCapItem(RepaymentNonRepaymentFeeChargeCap nonRepaymentFeeChargeCapItem) {
    this.nonRepaymentFeeChargeCap.add(nonRepaymentFeeChargeCapItem);
    return this;
  }

 /**
   * Details about specific fees/charges that are applied for non repayment
   * @return nonRepaymentFeeChargeDetail
  **/
  @JsonProperty("NonRepaymentFeeChargeDetail")
  @NotNull
 @Size(min=1)  public List<RepaymentNonRepaymentFeeChargeDetail> getNonRepaymentFeeChargeDetail() {
    return nonRepaymentFeeChargeDetail;
  }

  public void setNonRepaymentFeeChargeDetail(List<RepaymentNonRepaymentFeeChargeDetail> nonRepaymentFeeChargeDetail) {
    this.nonRepaymentFeeChargeDetail = nonRepaymentFeeChargeDetail;
  }

  public RepaymentNonRepaymentFeeCharges nonRepaymentFeeChargeDetail(List<RepaymentNonRepaymentFeeChargeDetail> nonRepaymentFeeChargeDetail) {
    this.nonRepaymentFeeChargeDetail = nonRepaymentFeeChargeDetail;
    return this;
  }

  public RepaymentNonRepaymentFeeCharges addNonRepaymentFeeChargeDetailItem(RepaymentNonRepaymentFeeChargeDetail nonRepaymentFeeChargeDetailItem) {
    this.nonRepaymentFeeChargeDetail.add(nonRepaymentFeeChargeDetailItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

