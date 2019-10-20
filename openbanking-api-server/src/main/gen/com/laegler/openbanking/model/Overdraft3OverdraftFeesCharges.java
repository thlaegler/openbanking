package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Overdraft3OverdraftFeeChargeCap;
import com.laegler.openbanking.model.Overdraft3OverdraftFeeChargeDetail;
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
  * Overdraft fees and charges details
 **/
@ApiModel(description="Overdraft fees and charges details")
public class Overdraft3OverdraftFeesCharges  {
  
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
  @Valid
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
  **/
  private List<Overdraft3OverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @ApiModelProperty(required = true, value = "Details about the fees/charges")
  @Valid
 /**
   * Details about the fees/charges
  **/
  private List<Overdraft3OverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<Overdraft3OverdraftFeeChargeDetail>();
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return overdraftFeeChargeCap
  **/
  @JsonProperty("OverdraftFeeChargeCap")
  public List<Overdraft3OverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<Overdraft3OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public Overdraft3OverdraftFeesCharges overdraftFeeChargeCap(List<Overdraft3OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public Overdraft3OverdraftFeesCharges addOverdraftFeeChargeCapItem(Overdraft3OverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

 /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  **/
  @JsonProperty("OverdraftFeeChargeDetail")
  @NotNull
 @Size(min=1)  public List<Overdraft3OverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<Overdraft3OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  public Overdraft3OverdraftFeesCharges overdraftFeeChargeDetail(List<Overdraft3OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public Overdraft3OverdraftFeesCharges addOverdraftFeeChargeDetailItem(Overdraft3OverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft3OverdraftFeesCharges {\n");
    
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

