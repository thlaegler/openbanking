package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBPostalAddress6;
import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationCreditorAccount;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationDebtorAccount;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationInstructedAmount;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationRemittanceInformation;
import io.swagger.annotations.ApiModel;
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
  * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled domestic payment.
 **/
@ApiModel(description="The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled domestic payment.")
public class OBWriteDomesticScheduled2DataInitiation  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBPostalAddress6 creditorPostalAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

  @ApiModelProperty(value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
 /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
  **/
  private String endToEndIdentification = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = null;

  @ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
 /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
  **/
  private String instructionIdentification = null;

  @ApiModelProperty(value = "")
  private String localInstrument = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation = null;

  @ApiModelProperty(required = true, value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String requestedExecutionDateTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBSupplementaryData1 supplementaryData = null;
 /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @JsonProperty("CreditorAccount")
  @NotNull
  public OBWriteDomestic2DataInitiationCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBWriteDomesticScheduled2DataInitiation creditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

 /**
   * Get creditorPostalAddress
   * @return creditorPostalAddress
  **/
  @JsonProperty("CreditorPostalAddress")
  public OBPostalAddress6 getCreditorPostalAddress() {
    return creditorPostalAddress;
  }

  public void setCreditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
    this.creditorPostalAddress = creditorPostalAddress;
  }

  public OBWriteDomesticScheduled2DataInitiation creditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
    this.creditorPostalAddress = creditorPostalAddress;
    return this;
  }

 /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @JsonProperty("DebtorAccount")
  public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBWriteDomesticScheduled2DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

 /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
   * @return endToEndIdentification
  **/
  @JsonProperty("EndToEndIdentification")
 @Size(min=1,max=35)  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public OBWriteDomesticScheduled2DataInitiation endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

 /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @JsonProperty("InstructedAmount")
  @NotNull
  public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBWriteDomesticScheduled2DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

 /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @JsonProperty("InstructionIdentification")
  @NotNull
 @Size(min=1,max=35)  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public OBWriteDomesticScheduled2DataInitiation instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

 /**
   * Get localInstrument
   * @return localInstrument
  **/
  @JsonProperty("LocalInstrument")
  public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBWriteDomesticScheduled2DataInitiation localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

 /**
   * Get remittanceInformation
   * @return remittanceInformation
  **/
  @JsonProperty("RemittanceInformation")
  public OBWriteDomestic2DataInitiationRemittanceInformation getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  public OBWriteDomesticScheduled2DataInitiation remittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

 /**
   * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor&#39;s account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return requestedExecutionDateTime
  **/
  @JsonProperty("RequestedExecutionDateTime")
  @NotNull
  public String getRequestedExecutionDateTime() {
    return requestedExecutionDateTime;
  }

  public void setRequestedExecutionDateTime(String requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
  }

  public OBWriteDomesticScheduled2DataInitiation requestedExecutionDateTime(String requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
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

  public OBWriteDomesticScheduled2DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticScheduled2DataInitiation {\n");
    
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorPostalAddress: ").append(toIndentedString(creditorPostalAddress)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
    sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
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

