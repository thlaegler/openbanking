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
  * Amount of money to be confirmed as available funds in the debtor account. Contains an Amount and a Currency.
 **/
@ApiModel(description="Amount of money to be confirmed as available funds in the debtor account. Contains an Amount and a Currency.")
public class OBFundsConfirmation1DataInstructedAmount  {
  
  @ApiModelProperty(required = true, value = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
 /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
  **/
  private String amount = null;

  @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
  **/
  private String currency = null;
 /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return amount
  **/
  @JsonProperty("Amount")
  @NotNull
 @Pattern(regexp="^\\\\d{1,13}\\\\.\\\\d{1,5}$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBFundsConfirmation1DataInstructedAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.
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

  public OBFundsConfirmation1DataInstructedAmount currency(String currency) {
    this.currency = currency;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmation1DataInstructedAmount {\n");
    
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

