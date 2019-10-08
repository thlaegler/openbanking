package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBChargeBearerType1Code;
import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationInstructedAmount;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationDebtorAccount;
import com.laegler.openbanking.model.OBWriteInternational2DataInitiationCreditor;
import com.laegler.openbanking.model.OBWriteInternationalStandingOrder3DataInitiationCreditorAccount;
import com.laegler.openbanking.model.OBWriteInternationalStandingOrder3DataInitiationCreditorAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for an international standing order.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for an international standing order.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBWriteInternationalStandingOrder3DataInitiation   {
  @JsonProperty("ChargeBearer")
  private OBChargeBearerType1Code chargeBearer = null;

  @JsonProperty("Creditor")
  private OBWriteInternational2DataInitiationCreditor creditor = null;

  @JsonProperty("CreditorAccount")
  private OBWriteInternationalStandingOrder3DataInitiationCreditorAccount creditorAccount = null;

  @JsonProperty("CreditorAgent")
  private OBWriteInternationalStandingOrder3DataInitiationCreditorAgent creditorAgent = null;

  @JsonProperty("CurrencyOfTransfer")
  private String currencyOfTransfer = null;

  @JsonProperty("DebtorAccount")
  private OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount = null;

  @JsonProperty("FinalPaymentDateTime")
  private String finalPaymentDateTime = null;

  @JsonProperty("FirstPaymentDateTime")
  private String firstPaymentDateTime = null;

  @JsonProperty("Frequency")
  private String frequency = null;

  @JsonProperty("InstructedAmount")
  private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = null;

  @JsonProperty("NumberOfPayments")
  private String numberOfPayments = null;

  @JsonProperty("Purpose")
  private String purpose = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBWriteInternationalStandingOrder3DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

  /**
   * Get chargeBearer
   * @return chargeBearer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBChargeBearerType1Code getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public OBWriteInternationalStandingOrder3DataInitiation creditor(OBWriteInternational2DataInitiationCreditor creditor) {
    this.creditor = creditor;
    return this;
  }

  /**
   * Get creditor
   * @return creditor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteInternational2DataInitiationCreditor getCreditor() {
    return creditor;
  }

  public void setCreditor(OBWriteInternational2DataInitiationCreditor creditor) {
    this.creditor = creditor;
  }

  public OBWriteInternationalStandingOrder3DataInitiation creditorAccount(OBWriteInternationalStandingOrder3DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBWriteInternationalStandingOrder3DataInitiationCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBWriteInternationalStandingOrder3DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBWriteInternationalStandingOrder3DataInitiation creditorAgent(OBWriteInternationalStandingOrder3DataInitiationCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBWriteInternationalStandingOrder3DataInitiationCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBWriteInternationalStandingOrder3DataInitiation currencyOfTransfer(String currencyOfTransfer) {
    this.currencyOfTransfer = currencyOfTransfer;
    return this;
  }

  /**
   * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
   * @return currencyOfTransfer
  **/
  @ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
  @NotNull

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getCurrencyOfTransfer() {
    return currencyOfTransfer;
  }

  public void setCurrencyOfTransfer(String currencyOfTransfer) {
    this.currencyOfTransfer = currencyOfTransfer;
  }

  public OBWriteInternationalStandingOrder3DataInitiation debtorAccount(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteDomesticStandingOrder3DataInitiationDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBWriteInternationalStandingOrder3DataInitiation finalPaymentDateTime(String finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

  /**
   * The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return finalPaymentDateTime
  **/
  @ApiModelProperty(value = "The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")


  public String getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(String finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBWriteInternationalStandingOrder3DataInitiation firstPaymentDateTime(String firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return firstPaymentDateTime
  **/
  @ApiModelProperty(required = true, value = "The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull


  public String getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(String firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBWriteInternationalStandingOrder3DataInitiation frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
  @NotNull

@Pattern(regexp="^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$") 
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBWriteInternationalStandingOrder3DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBWriteInternationalStandingOrder3DataInitiation numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
   * @return numberOfPayments
  **/
  @ApiModelProperty(value = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")

@Size(min=1,max=35) 
  public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public OBWriteInternationalStandingOrder3DataInitiation purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
   * @return purpose
  **/
  @ApiModelProperty(value = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.")


  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public OBWriteInternationalStandingOrder3DataInitiation reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  **/
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")

@Size(min=1,max=35) 
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBWriteInternationalStandingOrder3DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternationalStandingOrder3DataInitiation obWriteInternationalStandingOrder3DataInitiation = (OBWriteInternationalStandingOrder3DataInitiation) o;
    return Objects.equals(this.chargeBearer, obWriteInternationalStandingOrder3DataInitiation.chargeBearer) &&
        Objects.equals(this.creditor, obWriteInternationalStandingOrder3DataInitiation.creditor) &&
        Objects.equals(this.creditorAccount, obWriteInternationalStandingOrder3DataInitiation.creditorAccount) &&
        Objects.equals(this.creditorAgent, obWriteInternationalStandingOrder3DataInitiation.creditorAgent) &&
        Objects.equals(this.currencyOfTransfer, obWriteInternationalStandingOrder3DataInitiation.currencyOfTransfer) &&
        Objects.equals(this.debtorAccount, obWriteInternationalStandingOrder3DataInitiation.debtorAccount) &&
        Objects.equals(this.finalPaymentDateTime, obWriteInternationalStandingOrder3DataInitiation.finalPaymentDateTime) &&
        Objects.equals(this.firstPaymentDateTime, obWriteInternationalStandingOrder3DataInitiation.firstPaymentDateTime) &&
        Objects.equals(this.frequency, obWriteInternationalStandingOrder3DataInitiation.frequency) &&
        Objects.equals(this.instructedAmount, obWriteInternationalStandingOrder3DataInitiation.instructedAmount) &&
        Objects.equals(this.numberOfPayments, obWriteInternationalStandingOrder3DataInitiation.numberOfPayments) &&
        Objects.equals(this.purpose, obWriteInternationalStandingOrder3DataInitiation.purpose) &&
        Objects.equals(this.reference, obWriteInternationalStandingOrder3DataInitiation.reference) &&
        Objects.equals(this.supplementaryData, obWriteInternationalStandingOrder3DataInitiation.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeBearer, creditor, creditorAccount, creditorAgent, currencyOfTransfer, debtorAccount, finalPaymentDateTime, firstPaymentDateTime, frequency, instructedAmount, numberOfPayments, purpose, reference, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrder3DataInitiation {\n");
    
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

