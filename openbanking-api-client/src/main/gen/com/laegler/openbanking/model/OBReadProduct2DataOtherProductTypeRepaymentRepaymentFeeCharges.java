package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail;
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
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges  {
  
  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap = null;

  @ApiModelProperty(required = true, value = "")
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail>();
 /**
   * Get repaymentFeeChargeCap
   * @return repaymentFeeChargeCap
  **/
  @JsonProperty("RepaymentFeeChargeCap")
  public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> getRepaymentFeeChargeCap() {
    return repaymentFeeChargeCap;
  }

  public void setRepaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeCapItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap repaymentFeeChargeCapItem) {
    this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
    return this;
  }

 /**
   * Get repaymentFeeChargeDetail
   * @return repaymentFeeChargeDetail
  **/
  @JsonProperty("RepaymentFeeChargeDetail")
  public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> getRepaymentFeeChargeDetail() {
    return repaymentFeeChargeDetail;
  }

  public void setRepaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail repaymentFeeChargeDetailItem) {
    this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges {\n");
    
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

