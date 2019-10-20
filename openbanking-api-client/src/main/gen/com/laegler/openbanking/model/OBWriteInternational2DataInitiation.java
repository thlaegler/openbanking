package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBChargeBearerType1Code;
import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationCreditorAccount;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationDebtorAccount;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationInstructedAmount;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationRemittanceInformation;
import com.laegler.openbanking.model.OBWriteInternational2DataInitiationCreditor;
import com.laegler.openbanking.model.OBWriteInternational2DataInitiationCreditorAgent;
import com.laegler.openbanking.model.OBWriteInternational2DataInitiationExchangeRateInformation;
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
  * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single international payment.
 **/
@ApiModel(description="The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single international payment.")
public class OBWriteInternational2DataInitiation  {
  
  @ApiModelProperty(value = "")
  private OBChargeBearerType1Code chargeBearer = null;

  @ApiModelProperty(value = "")
  private OBWriteInternational2DataInitiationCreditor creditor = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount = null;

  @ApiModelProperty(value = "")
  private OBWriteInternational2DataInitiationCreditorAgent creditorAgent = null;

  @ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
 /**
   * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
  **/
  private String currencyOfTransfer = null;

  @ApiModelProperty(value = "")
  private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

  @ApiModelProperty(required = true, value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
 /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
  **/
  private String endToEndIdentification = null;

  @ApiModelProperty(value = "")
  private OBWriteInternational2DataInitiationExchangeRateInformation exchangeRateInformation = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = null;

  @ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
 /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
  **/
  private String instructionIdentification = null;


@XmlType(name="InstructionPriorityEnum")
@XmlEnum(String.class)
public enum InstructionPriorityEnum {

@XmlEnumValue("Normal") NORMAL(String.valueOf("Normal")), @XmlEnumValue("Urgent") URGENT(String.valueOf("Urgent"));


    private String value;

    InstructionPriorityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InstructionPriorityEnum fromValue(String v) {
        for (InstructionPriorityEnum b : InstructionPriorityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.")
 /**
   * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
  **/
  private InstructionPriorityEnum instructionPriority = null;

  @ApiModelProperty(value = "")
  private String localInstrument = null;

  @ApiModelProperty(value = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.")
 /**
   * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
  **/
  private String purpose = null;

  @ApiModelProperty(value = "")
  private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation = null;

  @ApiModelProperty(value = "")
  private OBSupplementaryData1 supplementaryData = null;
 /**
   * Get chargeBearer
   * @return chargeBearer
  **/
  @JsonProperty("ChargeBearer")
  public OBChargeBearerType1Code getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public OBWriteInternational2DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

 /**
   * Get creditor
   * @return creditor
  **/
  @JsonProperty("Creditor")
  public OBWriteInternational2DataInitiationCreditor getCreditor() {
    return creditor;
  }

  public void setCreditor(OBWriteInternational2DataInitiationCreditor creditor) {
    this.creditor = creditor;
  }

  public OBWriteInternational2DataInitiation creditor(OBWriteInternational2DataInitiationCreditor creditor) {
    this.creditor = creditor;
    return this;
  }

 /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @JsonProperty("CreditorAccount")
  public OBWriteDomestic2DataInitiationCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBWriteInternational2DataInitiation creditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

 /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @JsonProperty("CreditorAgent")
  public OBWriteInternational2DataInitiationCreditorAgent getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBWriteInternational2DataInitiationCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBWriteInternational2DataInitiation creditorAgent(OBWriteInternational2DataInitiationCreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

 /**
   * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor&#39;s account.
   * @return currencyOfTransfer
  **/
  @JsonProperty("CurrencyOfTransfer")
  public String getCurrencyOfTransfer() {
    return currencyOfTransfer;
  }

  public void setCurrencyOfTransfer(String currencyOfTransfer) {
    this.currencyOfTransfer = currencyOfTransfer;
  }

  public OBWriteInternational2DataInitiation currencyOfTransfer(String currencyOfTransfer) {
    this.currencyOfTransfer = currencyOfTransfer;
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

  public OBWriteInternational2DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

 /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
   * @return endToEndIdentification
  **/
  @JsonProperty("EndToEndIdentification")
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public OBWriteInternational2DataInitiation endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

 /**
   * Get exchangeRateInformation
   * @return exchangeRateInformation
  **/
  @JsonProperty("ExchangeRateInformation")
  public OBWriteInternational2DataInitiationExchangeRateInformation getExchangeRateInformation() {
    return exchangeRateInformation;
  }

  public void setExchangeRateInformation(OBWriteInternational2DataInitiationExchangeRateInformation exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
  }

  public OBWriteInternational2DataInitiation exchangeRateInformation(OBWriteInternational2DataInitiationExchangeRateInformation exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
    return this;
  }

 /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @JsonProperty("InstructedAmount")
  public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBWriteInternational2DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

 /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @JsonProperty("InstructionIdentification")
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public OBWriteInternational2DataInitiation instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

 /**
   * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
   * @return instructionPriority
  **/
  @JsonProperty("InstructionPriority")
  public String getInstructionPriority() {
    if (instructionPriority == null) {
      return null;
    }
    return instructionPriority.value();
  }

  public void setInstructionPriority(InstructionPriorityEnum instructionPriority) {
    this.instructionPriority = instructionPriority;
  }

  public OBWriteInternational2DataInitiation instructionPriority(InstructionPriorityEnum instructionPriority) {
    this.instructionPriority = instructionPriority;
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

  public OBWriteInternational2DataInitiation localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

 /**
   * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
   * @return purpose
  **/
  @JsonProperty("Purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public OBWriteInternational2DataInitiation purpose(String purpose) {
    this.purpose = purpose;
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

  public OBWriteInternational2DataInitiation remittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
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

  public OBWriteInternational2DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternational2DataInitiation {\n");
    
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

