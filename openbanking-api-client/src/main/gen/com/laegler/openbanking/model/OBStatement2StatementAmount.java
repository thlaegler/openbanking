package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount6;
import com.laegler.openbanking.model.OBCreditDebitCode0;
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
  * Set of elements used to provide details of a generic amount for the statement resource.
 **/
@ApiModel(description="Set of elements used to provide details of a generic amount for the statement resource.")
public class OBStatement2StatementAmount  {
  
  @ApiModelProperty(required = true, value = "")
  private OBActiveOrHistoricCurrencyAndAmount6 amount = null;

  @ApiModelProperty(required = true, value = "")
  private OBCreditDebitCode0 creditDebitIndicator = null;

  @ApiModelProperty(required = true, value = "")
  private String type = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  public OBActiveOrHistoricCurrencyAndAmount6 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
    this.amount = amount;
  }

  public OBStatement2StatementAmount amount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @JsonProperty("CreditDebitIndicator")
  public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatement2StatementAmount creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementAmount type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementAmount {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
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

