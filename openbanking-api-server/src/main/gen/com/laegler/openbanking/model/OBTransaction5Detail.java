package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount7;
import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount8;
import com.laegler.openbanking.model.OBBankTransactionCodeStructure1;
import com.laegler.openbanking.model.OBBranchAndFinancialInstitutionIdentification60;
import com.laegler.openbanking.model.OBBranchAndFinancialInstitutionIdentification61;
import com.laegler.openbanking.model.OBCashAccount60;
import com.laegler.openbanking.model.OBCashAccount61;
import com.laegler.openbanking.model.OBCreditDebitCode1;
import com.laegler.openbanking.model.OBCurrencyExchange5;
import com.laegler.openbanking.model.OBEntryStatus1Code;
import com.laegler.openbanking.model.OBMerchantDetails1;
import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBTransactionCardInstrument1;
import com.laegler.openbanking.model.OBTransactionCashBalance;
import com.laegler.openbanking.model.ProprietaryBankTransactionCodeStructure1;
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
  * Provides further details on an entry in the report.
 **/
@ApiModel(description="Provides further details on an entry in the report.")
public class OBTransaction5Detail  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(value = "")
  private String addressLine = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBActiveOrHistoricCurrencyAndAmount7 amount = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBTransactionCashBalance balance = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBBankTransactionCodeStructure1 bankTransactionCode = null;

  @ApiModelProperty(required = true, value = "")
  private String bookingDateTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBTransactionCardInstrument1 cardInstrument = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBActiveOrHistoricCurrencyAndAmount8 chargeAmount = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBCreditDebitCode1 creditDebitIndicator = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBCashAccount60 creditorAccount = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBBranchAndFinancialInstitutionIdentification60 creditorAgent = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBCurrencyExchange5 currencyExchange = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBCashAccount61 debtorAccount = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBBranchAndFinancialInstitutionIdentification61 debtorAgent = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBMerchantDetails1 merchantDetails = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode = null;

  @ApiModelProperty(value = "")
  private List<String> statementReference = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBEntryStatus1Code status = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBSupplementaryData1 supplementaryData = null;

  @ApiModelProperty(value = "")
  private String transactionId = null;

  @ApiModelProperty(value = "")
  private String transactionInformation = null;

  @ApiModelProperty(value = "")
  private String transactionReference = null;

  @ApiModelProperty(value = "")
  private String valueDateTime = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  @NotNull
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBTransaction5Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get addressLine
   * @return addressLine
  **/
  @JsonProperty("AddressLine")
 @Size(min=1,max=70)  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OBTransaction5Detail addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  @NotNull
  public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    this.amount = amount;
  }

  public OBTransaction5Detail amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get balance
   * @return balance
  **/
  @JsonProperty("Balance")
  public OBTransactionCashBalance getBalance() {
    return balance;
  }

  public void setBalance(OBTransactionCashBalance balance) {
    this.balance = balance;
  }

  public OBTransaction5Detail balance(OBTransactionCashBalance balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Get bankTransactionCode
   * @return bankTransactionCode
  **/
  @JsonProperty("BankTransactionCode")
  public OBBankTransactionCodeStructure1 getBankTransactionCode() {
    return bankTransactionCode;
  }

  public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  public OBTransaction5Detail bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

 /**
   * Get bookingDateTime
   * @return bookingDateTime
  **/
  @JsonProperty("BookingDateTime")
  @NotNull
  public String getBookingDateTime() {
    return bookingDateTime;
  }

  public void setBookingDateTime(String bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  public OBTransaction5Detail bookingDateTime(String bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
    return this;
  }

 /**
   * Get cardInstrument
   * @return cardInstrument
  **/
  @JsonProperty("CardInstrument")
  public OBTransactionCardInstrument1 getCardInstrument() {
    return cardInstrument;
  }

  public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
  }

  public OBTransaction5Detail cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
    return this;
  }

 /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @JsonProperty("ChargeAmount")
  public OBActiveOrHistoricCurrencyAndAmount8 getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount8 chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public OBTransaction5Detail chargeAmount(OBActiveOrHistoricCurrencyAndAmount8 chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

 /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @JsonProperty("CreditDebitIndicator")
  @NotNull
  public OBCreditDebitCode1 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction5Detail creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

 /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @JsonProperty("CreditorAccount")
  public OBCashAccount60 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount60 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBTransaction5Detail creditorAccount(OBCashAccount60 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

 /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @JsonProperty("CreditorAgent")
  public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBTransaction5Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

 /**
   * Get currencyExchange
   * @return currencyExchange
  **/
  @JsonProperty("CurrencyExchange")
  public OBCurrencyExchange5 getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public OBTransaction5Detail currencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

 /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @JsonProperty("DebtorAccount")
  public OBCashAccount61 getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBCashAccount61 debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBTransaction5Detail debtorAccount(OBCashAccount61 debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

 /**
   * Get debtorAgent
   * @return debtorAgent
  **/
  @JsonProperty("DebtorAgent")
  public OBBranchAndFinancialInstitutionIdentification61 getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification61 debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public OBTransaction5Detail debtorAgent(OBBranchAndFinancialInstitutionIdentification61 debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

 /**
   * Get merchantDetails
   * @return merchantDetails
  **/
  @JsonProperty("MerchantDetails")
  public OBMerchantDetails1 getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public OBTransaction5Detail merchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

 /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  **/
  @JsonProperty("ProprietaryBankTransactionCode")
  public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction5Detail proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

 /**
   * Get statementReference
   * @return statementReference
  **/
  @JsonProperty("StatementReference")
  public List<String> getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(List<String> statementReference) {
    this.statementReference = statementReference;
  }

  public OBTransaction5Detail statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction5Detail addStatementReferenceItem(String statementReferenceItem) {
    this.statementReference.add(statementReferenceItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("Status")
  @NotNull
  public OBEntryStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBEntryStatus1Code status) {
    this.status = status;
  }

  public OBTransaction5Detail status(OBEntryStatus1Code status) {
    this.status = status;
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

  public OBTransaction5Detail supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

 /**
   * Get transactionId
   * @return transactionId
  **/
  @JsonProperty("TransactionId")
 @Size(min=1,max=210)  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OBTransaction5Detail transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

 /**
   * Get transactionInformation
   * @return transactionInformation
  **/
  @JsonProperty("TransactionInformation")
 @Size(min=1,max=500)  public String getTransactionInformation() {
    return transactionInformation;
  }

  public void setTransactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
  }

  public OBTransaction5Detail transactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
    return this;
  }

 /**
   * Get transactionReference
   * @return transactionReference
  **/
  @JsonProperty("TransactionReference")
 @Size(min=1,max=35)  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }

  public OBTransaction5Detail transactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

 /**
   * Get valueDateTime
   * @return valueDateTime
  **/
  @JsonProperty("ValueDateTime")
  public String getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public OBTransaction5Detail valueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction5Detail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
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

