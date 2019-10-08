package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Overdraft2OverdraftFeeChargeCap;
import com.laegler.openbanking.model.Overdraft2OverdraftFeeChargeDetail;
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
  * Overdraft fees and charges
 **/
@ApiModel(description="Overdraft fees and charges")
public class Overdraft2OverdraftFeesCharges1  {
  
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
  **/
  private List<Overdraft2OverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @ApiModelProperty(required = true, value = "Details about the fees/charges")
 /**
   * Details about the fees/charges
  **/
  private List<Overdraft2OverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<Overdraft2OverdraftFeeChargeDetail>();
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return overdraftFeeChargeCap
  **/
  @JsonProperty("OverdraftFeeChargeCap")
  public List<Overdraft2OverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<Overdraft2OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public Overdraft2OverdraftFeesCharges1 overdraftFeeChargeCap(List<Overdraft2OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public Overdraft2OverdraftFeesCharges1 addOverdraftFeeChargeCapItem(Overdraft2OverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

 /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  **/
  @JsonProperty("OverdraftFeeChargeDetail")
  public List<Overdraft2OverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<Overdraft2OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  public Overdraft2OverdraftFeesCharges1 overdraftFeeChargeDetail(List<Overdraft2OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public Overdraft2OverdraftFeesCharges1 addOverdraftFeeChargeDetailItem(Overdraft2OverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft2OverdraftFeesCharges1 {\n");
    
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

