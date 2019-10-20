package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount;
import com.laegler.openbanking.model.OBChargeBearerType1Code;
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
  * Set of elements used to provide details of a charge for the payment initiation.
 **/
@ApiModel(description="Set of elements used to provide details of a charge for the payment initiation.")
public class OBWriteDomesticConsentResponse3DataCharges  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBActiveOrHistoricCurrencyAndAmount amount = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBChargeBearerType1Code chargeBearer = null;

  @ApiModelProperty(required = true, value = "")
  private String type = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  @NotNull
  public OBActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }

  public OBWriteDomesticConsentResponse3DataCharges amount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get chargeBearer
   * @return chargeBearer
  **/
  @JsonProperty("ChargeBearer")
  @NotNull
  public OBChargeBearerType1Code getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public OBWriteDomesticConsentResponse3DataCharges chargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBWriteDomesticConsentResponse3DataCharges type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticConsentResponse3DataCharges {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
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

