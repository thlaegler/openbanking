package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationCreditorAccount;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationDebtorAccount;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount;
import io.swagger.annotations.ApiModel;

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
  * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.
 **/
@ApiModel(description="The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.")
public class OBWriteDomesticStandingOrder3DataInitiation  {
  
  @ApiModelProperty(required = true, value = "")
  private OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount = null;

  @ApiModelProperty(value = "The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String finalPaymentDateTime = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount = null;

  @ApiModelProperty(required = true, value = "The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String firstPaymentDateTime = null;

  @ApiModelProperty(required = true, value = "Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
 /**
   * Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
  **/
  private String frequency = null;

  @ApiModelProperty(value = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")
 /**
   * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
  **/
  private String numberOfPayments = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount = null;

  @ApiModelProperty(value = "The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String recurringPaymentDateTime = null;

  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
 /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
  **/
  private String reference = null;

  @ApiModelProperty(value = "")
  private OBSupplementaryData1 supplementaryData = null;
 /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @JsonProperty("CreditorAccount")
  public OBWriteDomesticStandingOrder3DataInitiationCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBWriteDomesticStandingOrder3DataInitiation creditorAccount(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

 /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @JsonProperty("DebtorAccount")
  public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBWriteDomesticStandingOrder3DataInitiation debtorAccount(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

 /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
  **/
  @JsonProperty("FinalPaymentAmount")
  public OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBWriteDomesticStandingOrder3DataInitiation finalPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

 /**
   * The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return finalPaymentDateTime
  **/
  @JsonProperty("FinalPaymentDateTime")
  public String getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(String finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBWriteDomesticStandingOrder3DataInitiation finalPaymentDateTime(String finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

 /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
  **/
  @JsonProperty("FirstPaymentAmount")
  public OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBWriteDomesticStandingOrder3DataInitiation firstPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

 /**
   * The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return firstPaymentDateTime
  **/
  @JsonProperty("FirstPaymentDateTime")
  public String getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(String firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBWriteDomesticStandingOrder3DataInitiation firstPaymentDateTime(String firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

 /**
   * Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH &#x3D; Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH &#x3D; Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED &#x3D; Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
   * @return frequency
  **/
  @JsonProperty("Frequency")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBWriteDomesticStandingOrder3DataInitiation frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

 /**
   * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
   * @return numberOfPayments
  **/
  @JsonProperty("NumberOfPayments")
  public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public OBWriteDomesticStandingOrder3DataInitiation numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

 /**
   * Get recurringPaymentAmount
   * @return recurringPaymentAmount
  **/
  @JsonProperty("RecurringPaymentAmount")
  public OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount getRecurringPaymentAmount() {
    return recurringPaymentAmount;
  }

  public void setRecurringPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount) {
    this.recurringPaymentAmount = recurringPaymentAmount;
  }

  public OBWriteDomesticStandingOrder3DataInitiation recurringPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount) {
    this.recurringPaymentAmount = recurringPaymentAmount;
    return this;
  }

 /**
   * The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return recurringPaymentDateTime
  **/
  @JsonProperty("RecurringPaymentDateTime")
  public String getRecurringPaymentDateTime() {
    return recurringPaymentDateTime;
  }

  public void setRecurringPaymentDateTime(String recurringPaymentDateTime) {
    this.recurringPaymentDateTime = recurringPaymentDateTime;
  }

  public OBWriteDomesticStandingOrder3DataInitiation recurringPaymentDateTime(String recurringPaymentDateTime) {
    this.recurringPaymentDateTime = recurringPaymentDateTime;
    return this;
  }

 /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  **/
  @JsonProperty("Reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBWriteDomesticStandingOrder3DataInitiation reference(String reference) {
    this.reference = reference;
    return this;
  }

 /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @JsonProperty("SupplementaryData")
  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBWriteDomesticStandingOrder3DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticStandingOrder3DataInitiation {\n");
    
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    recurringPaymentAmount: ").append(toIndentedString(recurringPaymentAmount)).append("\n");
    sb.append("    recurringPaymentDateTime: ").append(toIndentedString(recurringPaymentDateTime)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

