package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherFeesCharges2FeeChargeCap;
import com.laegler.openbanking.model.OtherFeesCharges2FeeChargeDetail;
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
  * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 **/
@ApiModel(description="Contains details of fees and charges which are not associated with either borrowing or features/benefits")
public class OtherFeesCharges2  {
  
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
  **/
  private List<OtherFeesCharges2FeeChargeCap> feeChargeCap = null;

  @ApiModelProperty(required = true, value = "Other fees/charges details")
 /**
   * Other fees/charges details
  **/
  private List<OtherFeesCharges2FeeChargeDetail> feeChargeDetail = new ArrayList<OtherFeesCharges2FeeChargeDetail>();
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return feeChargeCap
  **/
  @JsonProperty("FeeChargeCap")
  public List<OtherFeesCharges2FeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OtherFeesCharges2FeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OtherFeesCharges2 feeChargeCap(List<OtherFeesCharges2FeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesCharges2 addFeeChargeCapItem(OtherFeesCharges2FeeChargeCap feeChargeCapItem) {
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

 /**
   * Other fees/charges details
   * @return feeChargeDetail
  **/
  @JsonProperty("FeeChargeDetail")
  public List<OtherFeesCharges2FeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OtherFeesCharges2FeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OtherFeesCharges2 feeChargeDetail(List<OtherFeesCharges2FeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OtherFeesCharges2 addFeeChargeDetailItem(OtherFeesCharges2FeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges2 {\n");
    
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
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

