package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail;
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
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges  {
  
  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap = null;

  @ApiModelProperty(required = true, value = "")
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail>();
 /**
   * Get loanInterestFeeChargeCap
   * @return loanInterestFeeChargeCap
  **/
  @JsonProperty("LoanInterestFeeChargeCap")
  public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> getLoanInterestFeeChargeCap() {
    return loanInterestFeeChargeCap;
  }

  public void setLoanInterestFeeChargeCap(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeeChargeCap(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeCapItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap loanInterestFeeChargeCapItem) {
    this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
    return this;
  }

 /**
   * Get loanInterestFeeChargeDetail
   * @return loanInterestFeeChargeDetail
  **/
  @JsonProperty("LoanInterestFeeChargeDetail")
  public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> getLoanInterestFeeChargeDetail() {
    return loanInterestFeeChargeDetail;
  }

  public void setLoanInterestFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail loanInterestFeeChargeDetailItem) {
    this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges {\n");
    
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

