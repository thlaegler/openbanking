package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBFeeFrequency1Code0;
import com.laegler.openbanking.model.OBFeeFrequency1Code1;
import com.laegler.openbanking.model.OBInterestRateType1Code0;
import com.laegler.openbanking.model.OBOtherCodeType11;
import com.laegler.openbanking.model.OBOtherCodeType12;
import com.laegler.openbanking.model.OBOtherCodeType13;
import com.laegler.openbanking.model.OBOtherCodeType14;
import com.laegler.openbanking.model.OBOverdraftFeeType1Code;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap;
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
  * Details about the fees/charges
 **/
@ApiModel(description="Details about the fees/charges")
public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private OBFeeFrequency1Code0 applicationFrequency = null;

  @ApiModelProperty(value = "")
  private OBFeeFrequency1Code1 calculationFrequency = null;

  @ApiModelProperty(value = "")
  private String feeAmount = null;

  @ApiModelProperty(value = "")
  private String feeRate = null;

  @ApiModelProperty(value = "")
  private OBInterestRateType1Code0 feeRateType = null;

  @ApiModelProperty(required = true, value = "")
  private OBOverdraftFeeType1Code feeType = null;

  @ApiModelProperty(value = "")
  private String incrementalBorrowingAmount = null;

  @ApiModelProperty(value = "Indicates whether fee and charges are negotiable")
 /**
   * Indicates whether fee and charges are negotiable
  **/
  private Boolean negotiableIndicator = null;

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OBOtherCodeType11 otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  private OBOtherCodeType12 otherCalculationFrequency = null;

  @ApiModelProperty(value = "")
  private OBOtherCodeType14 otherFeeRateType = null;

  @ApiModelProperty(value = "")
  private OBOtherCodeType13 otherFeeType = null;

  @ApiModelProperty(value = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")
 /**
   * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
  **/
  private Boolean overdraftControlIndicator = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;
 /**
   * Get applicationFrequency
   * @return applicationFrequency
  **/
  @JsonProperty("ApplicationFrequency")
  public OBFeeFrequency1Code0 getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code0 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail applicationFrequency(OBFeeFrequency1Code0 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * Get calculationFrequency
   * @return calculationFrequency
  **/
  @JsonProperty("CalculationFrequency")
  public OBFeeFrequency1Code1 getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code1 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail calculationFrequency(OBFeeFrequency1Code1 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Get feeAmount
   * @return feeAmount
  **/
  @JsonProperty("FeeAmount")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

 /**
   * Get feeRate
   * @return feeRate
  **/
  @JsonProperty("FeeRate")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

 /**
   * Get feeRateType
   * @return feeRateType
  **/
  @JsonProperty("FeeRateType")
  public OBInterestRateType1Code0 getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code0 feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeRateType(OBInterestRateType1Code0 feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

 /**
   * Get feeType
   * @return feeType
  **/
  @JsonProperty("FeeType")
  public OBOverdraftFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBOverdraftFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeType(OBOverdraftFeeType1Code feeType) {
    this.feeType = feeType;
    return this;
  }

 /**
   * Get incrementalBorrowingAmount
   * @return incrementalBorrowingAmount
  **/
  @JsonProperty("IncrementalBorrowingAmount")
  public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

 /**
   * Indicates whether fee and charges are negotiable
   * @return negotiableIndicator
  **/
  @JsonProperty("NegotiableIndicator")
  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OBOtherCodeType11 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OBOtherCodeType12 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

 /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @JsonProperty("OtherFeeRateType")
  public OBOtherCodeType14 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType14 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherFeeRateType(OBOtherCodeType14 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

 /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public OBOtherCodeType13 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherCodeType13 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherFeeType(OBOtherCodeType13 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

 /**
   * Indicates if the fee/charge is already covered by an &#39;Overdraft Control&#39; fee or not.
   * @return overdraftControlIndicator
  **/
  @JsonProperty("OverdraftControlIndicator")
  public Boolean isOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

 /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
  **/
  @JsonProperty("OverdraftFeeChargeCap")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail addOverdraftFeeChargeCapItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail {\n");
    
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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

