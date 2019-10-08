package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides further details on an entry in the report.
 */
@ApiModel(description = "Provides further details on an entry in the report.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBTransaction5Detail   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("AddressLine")
  private String addressLine = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount7 amount = null;

  @JsonProperty("Balance")
  private OBTransactionCashBalance balance = null;

  @JsonProperty("BankTransactionCode")
  private OBBankTransactionCodeStructure1 bankTransactionCode = null;

  @JsonProperty("BookingDateTime")
  private String bookingDateTime = null;

  @JsonProperty("CardInstrument")
  private OBTransactionCardInstrument1 cardInstrument = null;

  @JsonProperty("ChargeAmount")
  private OBActiveOrHistoricCurrencyAndAmount8 chargeAmount = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode1 creditDebitIndicator = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount60 creditorAccount = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification60 creditorAgent = null;

  @JsonProperty("CurrencyExchange")
  private OBCurrencyExchange5 currencyExchange = null;

  @JsonProperty("DebtorAccount")
  private OBCashAccount61 debtorAccount = null;

  @JsonProperty("DebtorAgent")
  private OBBranchAndFinancialInstitutionIdentification61 debtorAgent = null;

  @JsonProperty("MerchantDetails")
  private OBMerchantDetails1 merchantDetails = null;

  @JsonProperty("ProprietaryBankTransactionCode")
  private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode = null;

  @JsonProperty("StatementReference")
  @Valid
  private List<String> statementReference = null;

  @JsonProperty("Status")
  private OBEntryStatus1Code status = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  @JsonProperty("TransactionId")
  private String transactionId = null;

  @JsonProperty("TransactionInformation")
  private String transactionInformation = null;

  @JsonProperty("TransactionReference")
  private String transactionReference = null;

  @JsonProperty("ValueDateTime")
  private String valueDateTime = null;

  public OBTransaction5Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=40) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBTransaction5Detail addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=70) 
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OBTransaction5Detail amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    this.amount = amount;
  }

  public OBTransaction5Detail balance(OBTransactionCashBalance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBTransactionCashBalance getBalance() {
    return balance;
  }

  public void setBalance(OBTransactionCashBalance balance) {
    this.balance = balance;
  }

  public OBTransaction5Detail bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  /**
   * Get bankTransactionCode
   * @return bankTransactionCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBankTransactionCodeStructure1 getBankTransactionCode() {
    return bankTransactionCode;
  }

  public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  public OBTransaction5Detail bookingDateTime(String bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
    return this;
  }

  /**
   * Get bookingDateTime
   * @return bookingDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBookingDateTime() {
    return bookingDateTime;
  }

  public void setBookingDateTime(String bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  public OBTransaction5Detail cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
    return this;
  }

  /**
   * Get cardInstrument
   * @return cardInstrument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBTransactionCardInstrument1 getCardInstrument() {
    return cardInstrument;
  }

  public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
  }

  public OBTransaction5Detail chargeAmount(OBActiveOrHistoricCurrencyAndAmount8 chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount8 getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount8 chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public OBTransaction5Detail creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBCreditDebitCode1 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction5Detail creditorAccount(OBCashAccount60 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCashAccount60 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount60 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBTransaction5Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBTransaction5Detail currencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

  /**
   * Get currencyExchange
   * @return currencyExchange
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCurrencyExchange5 getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public OBTransaction5Detail debtorAccount(OBCashAccount61 debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCashAccount61 getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBCashAccount61 debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBTransaction5Detail debtorAgent(OBBranchAndFinancialInstitutionIdentification61 debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

  /**
   * Get debtorAgent
   * @return debtorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification61 getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification61 debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public OBTransaction5Detail merchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
    return this;
  }

  /**
   * Get merchantDetails
   * @return merchantDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBMerchantDetails1 getMerchantDetails() {
    return merchantDetails;
  }

  public void setMerchantDetails(OBMerchantDetails1 merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public OBTransaction5Detail proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction5Detail statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction5Detail addStatementReferenceItem(String statementReferenceItem) {
    if (this.statementReference == null) {
      this.statementReference = new ArrayList<>();
    }
    this.statementReference.add(statementReferenceItem);
    return this;
  }

  /**
   * Get statementReference
   * @return statementReference
  **/
  @ApiModelProperty(value = "")


  public List<String> getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(List<String> statementReference) {
    this.statementReference = statementReference;
  }

  public OBTransaction5Detail status(OBEntryStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBEntryStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBEntryStatus1Code status) {
    this.status = status;
  }

  public OBTransaction5Detail supplementaryData(OBSupplementaryData1 supplementaryData) {
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

  public OBTransaction5Detail transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=210) 
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OBTransaction5Detail transactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
    return this;
  }

  /**
   * Get transactionInformation
   * @return transactionInformation
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=500) 
  public String getTransactionInformation() {
    return transactionInformation;
  }

  public void setTransactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
  }

  public OBTransaction5Detail transactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

  /**
   * Get transactionReference
   * @return transactionReference
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=35) 
  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }

  public OBTransaction5Detail valueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Get valueDateTime
   * @return valueDateTime
  **/
  @ApiModelProperty(value = "")


  public String getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction5Detail obTransaction5Detail = (OBTransaction5Detail) o;
    return Objects.equals(this.accountId, obTransaction5Detail.accountId) &&
        Objects.equals(this.addressLine, obTransaction5Detail.addressLine) &&
        Objects.equals(this.amount, obTransaction5Detail.amount) &&
        Objects.equals(this.balance, obTransaction5Detail.balance) &&
        Objects.equals(this.bankTransactionCode, obTransaction5Detail.bankTransactionCode) &&
        Objects.equals(this.bookingDateTime, obTransaction5Detail.bookingDateTime) &&
        Objects.equals(this.cardInstrument, obTransaction5Detail.cardInstrument) &&
        Objects.equals(this.chargeAmount, obTransaction5Detail.chargeAmount) &&
        Objects.equals(this.creditDebitIndicator, obTransaction5Detail.creditDebitIndicator) &&
        Objects.equals(this.creditorAccount, obTransaction5Detail.creditorAccount) &&
        Objects.equals(this.creditorAgent, obTransaction5Detail.creditorAgent) &&
        Objects.equals(this.currencyExchange, obTransaction5Detail.currencyExchange) &&
        Objects.equals(this.debtorAccount, obTransaction5Detail.debtorAccount) &&
        Objects.equals(this.debtorAgent, obTransaction5Detail.debtorAgent) &&
        Objects.equals(this.merchantDetails, obTransaction5Detail.merchantDetails) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction5Detail.proprietaryBankTransactionCode) &&
        Objects.equals(this.statementReference, obTransaction5Detail.statementReference) &&
        Objects.equals(this.status, obTransaction5Detail.status) &&
        Objects.equals(this.supplementaryData, obTransaction5Detail.supplementaryData) &&
        Objects.equals(this.transactionId, obTransaction5Detail.transactionId) &&
        Objects.equals(this.transactionInformation, obTransaction5Detail.transactionInformation) &&
        Objects.equals(this.transactionReference, obTransaction5Detail.transactionReference) &&
        Objects.equals(this.valueDateTime, obTransaction5Detail.valueDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, addressLine, amount, balance, bankTransactionCode, bookingDateTime, cardInstrument, chargeAmount, creditDebitIndicator, creditorAccount, creditorAgent, currencyExchange, debtorAccount, debtorAgent, merchantDetails, proprietaryBankTransactionCode, statementReference, status, supplementaryData, transactionId, transactionInformation, transactionReference, valueDateTime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

