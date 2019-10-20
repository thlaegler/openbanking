package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBBalanceType1Code;
import com.laegler.openbanking.model.OBCreditDebitCode2;
import com.laegler.openbanking.model.OBTransactionCashBalanceAmount;
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
  * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 **/
@ApiModel(description="Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
public class OBTransactionCashBalance  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBTransactionCashBalanceAmount amount = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBCreditDebitCode2 creditDebitIndicator = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBBalanceType1Code type = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  @NotNull
  public OBTransactionCashBalanceAmount getAmount() {
    return amount;
  }

  public void setAmount(OBTransactionCashBalanceAmount amount) {
    this.amount = amount;
  }

  public OBTransactionCashBalance amount(OBTransactionCashBalanceAmount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @JsonProperty("CreditDebitIndicator")
  @NotNull
  public OBCreditDebitCode2 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransactionCashBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBTransactionCashBalance type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCashBalance {\n");
    
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

