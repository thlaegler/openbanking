package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadDirectDebit1DataPreviousPaymentAmount;
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
  * Account to or from which a cash entry is made.
 **/
@ApiModel(description="Account to or from which a cash entry is made.")
public class OBReadDirectDebit1DataDirectDebit  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(value = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")
 /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
  **/
  private String directDebitId = null;


@XmlType(name="DirectDebitStatusCodeEnum")
@XmlEnum(String.class)
public enum DirectDebitStatusCodeEnum {

@XmlEnumValue("Active") ACTIVE(String.valueOf("Active")), @XmlEnumValue("Inactive") INACTIVE(String.valueOf("Inactive"));


    private String value;

    DirectDebitStatusCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DirectDebitStatusCodeEnum fromValue(String v) {
        for (DirectDebitStatusCodeEnum b : DirectDebitStatusCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Specifies the status of the direct debit in code form.")
 /**
   * Specifies the status of the direct debit in code form.
  **/
  private DirectDebitStatusCodeEnum directDebitStatusCode = null;

  @ApiModelProperty(required = true, value = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.")
 /**
   * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
  **/
  private String mandateIdentification = null;

  @ApiModelProperty(required = true, value = "Name of Service User.")
 /**
   * Name of Service User.
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount = null;

  @ApiModelProperty(value = "Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String previousPaymentDateTime = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  @NotNull
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadDirectDebit1DataDirectDebit accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   * @return directDebitId
  **/
  @JsonProperty("DirectDebitId")
 @Size(min=1,max=40)  public String getDirectDebitId() {
    return directDebitId;
  }

  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public OBReadDirectDebit1DataDirectDebit directDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

 /**
   * Specifies the status of the direct debit in code form.
   * @return directDebitStatusCode
  **/
  @JsonProperty("DirectDebitStatusCode")
  public String getDirectDebitStatusCode() {
    if (directDebitStatusCode == null) {
      return null;
    }
    return directDebitStatusCode.value();
  }

  public void setDirectDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public OBReadDirectDebit1DataDirectDebit directDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

 /**
   * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
   * @return mandateIdentification
  **/
  @JsonProperty("MandateIdentification")
  @NotNull
 @Size(min=1,max=35)  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public OBReadDirectDebit1DataDirectDebit mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

 /**
   * Name of Service User.
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
 @Size(min=1,max=70)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadDirectDebit1DataDirectDebit name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
  **/
  @JsonProperty("PreviousPaymentAmount")
  public OBReadDirectDebit1DataPreviousPaymentAmount getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  public void setPreviousPaymentAmount(OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }

  public OBReadDirectDebit1DataDirectDebit previousPaymentAmount(OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

 /**
   * Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return previousPaymentDateTime
  **/
  @JsonProperty("PreviousPaymentDateTime")
  public String getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(String previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public OBReadDirectDebit1DataDirectDebit previousPaymentDateTime(String previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit1DataDirectDebit {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
    sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
    sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
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

