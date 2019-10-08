package com.laegler.openbanking.model;

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
  * Amount of money of the cash balance after a transaction entry is applied to the account..
 **/
@ApiModel(description="Amount of money of the cash balance after a transaction entry is applied to the account..")
public class OBTransactionCashBalanceAmount  {
  
  @ApiModelProperty(required = true, value = "")
  private String amount = null;

  @ApiModelProperty(required = true, value = "")
  private String currency = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  @NotNull
 @Pattern(regexp="^\\d{1,13}\\.\\d{1,5}$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBTransactionCashBalanceAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("Currency")
  @NotNull
 @Pattern(regexp="^[A-Z]{3,3}$")  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBTransactionCashBalanceAmount currency(String currency) {
    this.currency = currency;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCashBalanceAmount {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

