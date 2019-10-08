package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadBalance1DataAmount1;
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
  * Set of elements used to provide details on the credit line.
 **/
@ApiModel(description="Set of elements used to provide details on the credit line.")
public class OBReadBalance1DataCreditLine  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OBReadBalance1DataAmount1 amount = null;

  @ApiModelProperty(required = true, value = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.")
 /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
  **/
  private Boolean included = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("Available") AVAILABLE(String.valueOf("Available")), @XmlEnumValue("Credit") CREDIT(String.valueOf("Credit")), @XmlEnumValue("Emergency") EMERGENCY(String.valueOf("Emergency")), @XmlEnumValue("PreAgreed") PREAGREED(String.valueOf("PreAgreed")), @XmlEnumValue("Temporary") TEMPORARY(String.valueOf("Temporary"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Limit type, in a coded form.")
 /**
   * Limit type, in a coded form.
  **/
  private TypeEnum type = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  public OBReadBalance1DataAmount1 getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataAmount1 amount) {
    this.amount = amount;
  }

  public OBReadBalance1DataCreditLine amount(OBReadBalance1DataAmount1 amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   * @return included
  **/
  @JsonProperty("Included")
  @NotNull
  public Boolean isIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public OBReadBalance1DataCreditLine included(Boolean included) {
    this.included = included;
    return this;
  }

 /**
   * Limit type, in a coded form.
   * @return type
  **/
  @JsonProperty("Type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OBReadBalance1DataCreditLine type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataCreditLine {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

