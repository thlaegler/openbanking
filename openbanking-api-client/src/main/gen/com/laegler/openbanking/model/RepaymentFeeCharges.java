package com.laegler.openbanking.model;

import com.laegler.openbanking.model.RepaymentFeeChargesRepaymentFeeChargeCap;
import com.laegler.openbanking.model.RepaymentFeeChargesRepaymentFeeChargeDetail;
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
  * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 **/
@ApiModel(description="Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
public class RepaymentFeeCharges  {
  
  @ApiModelProperty(value = "RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")
 /**
   * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
  **/
  private List<RepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap = null;

  @ApiModelProperty(required = true, value = "Details about specific fees/charges that are applied for repayment")
 /**
   * Details about specific fees/charges that are applied for repayment
  **/
  private List<RepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail = new ArrayList<RepaymentFeeChargesRepaymentFeeChargeDetail>();
 /**
   * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
   * @return repaymentFeeChargeCap
  **/
  @JsonProperty("RepaymentFeeChargeCap")
  public List<RepaymentFeeChargesRepaymentFeeChargeCap> getRepaymentFeeChargeCap() {
    return repaymentFeeChargeCap;
  }

  public void setRepaymentFeeChargeCap(List<RepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
  }

  public RepaymentFeeCharges repaymentFeeChargeCap(List<RepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    return this;
  }

  public RepaymentFeeCharges addRepaymentFeeChargeCapItem(RepaymentFeeChargesRepaymentFeeChargeCap repaymentFeeChargeCapItem) {
    this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
    return this;
  }

 /**
   * Details about specific fees/charges that are applied for repayment
   * @return repaymentFeeChargeDetail
  **/
  @JsonProperty("RepaymentFeeChargeDetail")
  public List<RepaymentFeeChargesRepaymentFeeChargeDetail> getRepaymentFeeChargeDetail() {
    return repaymentFeeChargeDetail;
  }

  public void setRepaymentFeeChargeDetail(List<RepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
  }

  public RepaymentFeeCharges repaymentFeeChargeDetail(List<RepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    return this;
  }

  public RepaymentFeeCharges addRepaymentFeeChargeDetailItem(RepaymentFeeChargesRepaymentFeeChargeDetail repaymentFeeChargeDetailItem) {
    this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

