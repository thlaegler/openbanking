package com.laegler.openbanking.model;

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
  * The amount of the most recent direct debit collection.
 **/
@ApiModel(description="The amount of the most recent direct debit collection.")
public class OBReadDirectDebit1DataPreviousPaymentAmount  {
  
  @ApiModelProperty(required = true, value = "")
  private String amount = null;

  @ApiModelProperty(required = true, value = "")
  private String currency = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBReadDirectDebit1DataPreviousPaymentAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBReadDirectDebit1DataPreviousPaymentAmount currency(String currency) {
    this.currency = currency;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit1DataPreviousPaymentAmount {\n");
    
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

