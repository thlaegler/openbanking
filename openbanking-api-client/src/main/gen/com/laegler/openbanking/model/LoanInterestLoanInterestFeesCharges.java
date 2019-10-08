package com.laegler.openbanking.model;

import com.laegler.openbanking.model.LoanInterestLoanInterestFeeChargeCap;
import com.laegler.openbanking.model.LoanInterestLoanInterestFeeChargeDetail;
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
  * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 **/
@ApiModel(description="Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
public class LoanInterestLoanInterestFeesCharges  {
  
  @ApiModelProperty(value = "Details about any caps (minimum/maximum charges) that apply to a particular fee/charge")
 /**
   * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
  **/
  private List<LoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap = null;

  @ApiModelProperty(required = true, value = "Other fees/charges details")
 /**
   * Other fees/charges details
  **/
  private List<LoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail = new ArrayList<LoanInterestLoanInterestFeeChargeDetail>();
 /**
   * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
   * @return loanInterestFeeChargeCap
  **/
  @JsonProperty("LoanInterestFeeChargeCap")
  public List<LoanInterestLoanInterestFeeChargeCap> getLoanInterestFeeChargeCap() {
    return loanInterestFeeChargeCap;
  }

  public void setLoanInterestFeeChargeCap(List<LoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
  }

  public LoanInterestLoanInterestFeesCharges loanInterestFeeChargeCap(List<LoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    return this;
  }

  public LoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeCapItem(LoanInterestLoanInterestFeeChargeCap loanInterestFeeChargeCapItem) {
    this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
    return this;
  }

 /**
   * Other fees/charges details
   * @return loanInterestFeeChargeDetail
  **/
  @JsonProperty("LoanInterestFeeChargeDetail")
  public List<LoanInterestLoanInterestFeeChargeDetail> getLoanInterestFeeChargeDetail() {
    return loanInterestFeeChargeDetail;
  }

  public void setLoanInterestFeeChargeDetail(List<LoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
  }

  public LoanInterestLoanInterestFeesCharges loanInterestFeeChargeDetail(List<LoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    return this;
  }

  public LoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeDetailItem(LoanInterestLoanInterestFeeChargeDetail loanInterestFeeChargeDetailItem) {
    this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

