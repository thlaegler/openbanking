package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBBalanceType1Code;
import com.laegler.openbanking.model.OBCreditDebitCode2;
import com.laegler.openbanking.model.OBReadBalance1DataAmount;
import com.laegler.openbanking.model.OBReadBalance1DataCreditLine;
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
  * Set of elements used to define the balance details.
 **/
@ApiModel(description="Set of elements used to define the balance details.")
public class OBReadBalance1DataBalance  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(required = true, value = "")
  private OBReadBalance1DataAmount amount = null;

  @ApiModelProperty(required = true, value = "")
  private OBCreditDebitCode2 creditDebitIndicator = null;

  @ApiModelProperty(value = "")
  private List<OBReadBalance1DataCreditLine> creditLine = null;

  @ApiModelProperty(required = true, value = "Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String dateTime = null;

  @ApiModelProperty(required = true, value = "")
  private OBBalanceType1Code type = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadBalance1DataBalance accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  public OBReadBalance1DataAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataAmount amount) {
    this.amount = amount;
  }

  public OBReadBalance1DataBalance amount(OBReadBalance1DataAmount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @JsonProperty("CreditDebitIndicator")
  public OBCreditDebitCode2 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBReadBalance1DataBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

 /**
   * Get creditLine
   * @return creditLine
  **/
  @JsonProperty("CreditLine")
  public List<OBReadBalance1DataCreditLine> getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(List<OBReadBalance1DataCreditLine> creditLine) {
    this.creditLine = creditLine;
  }

  public OBReadBalance1DataBalance creditLine(List<OBReadBalance1DataCreditLine> creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  public OBReadBalance1DataBalance addCreditLineItem(OBReadBalance1DataCreditLine creditLineItem) {
    this.creditLine.add(creditLineItem);
    return this;
  }

 /**
   * Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return dateTime
  **/
  @JsonProperty("DateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public OBReadBalance1DataBalance dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("Type")
  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBReadBalance1DataBalance type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalance {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

