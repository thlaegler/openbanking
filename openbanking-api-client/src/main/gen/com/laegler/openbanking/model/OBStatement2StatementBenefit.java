package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount3;
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
  * Set of elements used to provide details of a benefit or reward amount for the statement resource.
 **/
@ApiModel(description="Set of elements used to provide details of a benefit or reward amount for the statement resource.")
public class OBStatement2StatementBenefit  {
  
  @ApiModelProperty(required = true, value = "")
  private OBActiveOrHistoricCurrencyAndAmount3 amount = null;

  @ApiModelProperty(required = true, value = "")
  private String type = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  public OBActiveOrHistoricCurrencyAndAmount3 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount3 amount) {
    this.amount = amount;
  }

  public OBStatement2StatementBenefit amount(OBActiveOrHistoricCurrencyAndAmount3 amount) {
    this.amount = amount;
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

  public OBStatement2StatementBenefit type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementBenefit {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

