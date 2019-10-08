package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount7;
import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount8;
import com.laegler.openbanking.model.OBBankTransactionCodeStructure1;
import com.laegler.openbanking.model.OBCreditDebitCode1;
import com.laegler.openbanking.model.OBCurrencyExchange5;
import com.laegler.openbanking.model.OBEntryStatus1Code;
import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBTransactionCardInstrument1;
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

public class OBTransaction5Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("AddressLine")
  private String addressLine = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount7 amount = null;

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

  @JsonProperty("CurrencyExchange")
  private OBCurrencyExchange5 currencyExchange = null;

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

  @JsonProperty("TransactionReference")
  private String transactionReference = null;

  @JsonProperty("ValueDateTime")
  private String valueDateTime = null;

  public OBTransaction5Basic accountId(String accountId) {
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

  public OBTransaction5Basic addressLine(String addressLine) {
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

  public OBTransaction5Basic amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
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

  public OBTransaction5Basic bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
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

  public OBTransaction5Basic bookingDateTime(String bookingDateTime) {
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

  public OBTransaction5Basic cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
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

  public OBTransaction5Basic chargeAmount(OBActiveOrHistoricCurrencyAndAmount8 chargeAmount) {
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

  public OBTransaction5Basic creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
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

  public OBTransaction5Basic currencyExchange(OBCurrencyExchange5 currencyExchange) {
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

  public OBTransaction5Basic proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
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

  public OBTransaction5Basic statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction5Basic addStatementReferenceItem(String statementReferenceItem) {
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

  public OBTransaction5Basic status(OBEntryStatus1Code status) {
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

  public OBTransaction5Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
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

  public OBTransaction5Basic transactionId(String transactionId) {
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

  public OBTransaction5Basic transactionReference(String transactionReference) {
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

  public OBTransaction5Basic valueDateTime(String valueDateTime) {
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
    OBTransaction5Basic obTransaction5Basic = (OBTransaction5Basic) o;
    return Objects.equals(this.accountId, obTransaction5Basic.accountId) &&
        Objects.equals(this.addressLine, obTransaction5Basic.addressLine) &&
        Objects.equals(this.amount, obTransaction5Basic.amount) &&
        Objects.equals(this.bankTransactionCode, obTransaction5Basic.bankTransactionCode) &&
        Objects.equals(this.bookingDateTime, obTransaction5Basic.bookingDateTime) &&
        Objects.equals(this.cardInstrument, obTransaction5Basic.cardInstrument) &&
        Objects.equals(this.chargeAmount, obTransaction5Basic.chargeAmount) &&
        Objects.equals(this.creditDebitIndicator, obTransaction5Basic.creditDebitIndicator) &&
        Objects.equals(this.currencyExchange, obTransaction5Basic.currencyExchange) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction5Basic.proprietaryBankTransactionCode) &&
        Objects.equals(this.statementReference, obTransaction5Basic.statementReference) &&
        Objects.equals(this.status, obTransaction5Basic.status) &&
        Objects.equals(this.supplementaryData, obTransaction5Basic.supplementaryData) &&
        Objects.equals(this.transactionId, obTransaction5Basic.transactionId) &&
        Objects.equals(this.transactionReference, obTransaction5Basic.transactionReference) &&
        Objects.equals(this.valueDateTime, obTransaction5Basic.valueDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, addressLine, amount, bankTransactionCode, bookingDateTime, cardInstrument, chargeAmount, creditDebitIndicator, currencyExchange, proprietaryBankTransactionCode, statementReference, status, supplementaryData, transactionId, transactionReference, valueDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction5Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

