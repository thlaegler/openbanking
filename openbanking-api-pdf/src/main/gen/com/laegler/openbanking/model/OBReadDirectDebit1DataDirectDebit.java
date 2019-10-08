package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBReadDirectDebit1DataPreviousPaymentAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account to or from which a cash entry is made.
 */
@ApiModel(description = "Account to or from which a cash entry is made.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBReadDirectDebit1DataDirectDebit   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("DirectDebitId")
  private String directDebitId = null;

  /**
   * Specifies the status of the direct debit in code form.
   */
  public enum DirectDebitStatusCodeEnum {
    ACTIVE("Active"),
    
    INACTIVE("Inactive");

    private String value;

    DirectDebitStatusCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectDebitStatusCodeEnum fromValue(String text) {
      for (DirectDebitStatusCodeEnum b : DirectDebitStatusCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("DirectDebitStatusCode")
  private DirectDebitStatusCodeEnum directDebitStatusCode = null;

  @JsonProperty("MandateIdentification")
  private String mandateIdentification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PreviousPaymentAmount")
  private OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount = null;

  @JsonProperty("PreviousPaymentDateTime")
  private String previousPaymentDateTime = null;

  public OBReadDirectDebit1DataDirectDebit accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=40) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadDirectDebit1DataDirectDebit directDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   * @return directDebitId
  **/
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")

@Size(min=1,max=40) 
  public String getDirectDebitId() {
    return directDebitId;
  }

  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public OBReadDirectDebit1DataDirectDebit directDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

  /**
   * Specifies the status of the direct debit in code form.
   * @return directDebitStatusCode
  **/
  @ApiModelProperty(value = "Specifies the status of the direct debit in code form.")


  public DirectDebitStatusCodeEnum getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }

  public void setDirectDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public OBReadDirectDebit1DataDirectDebit mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
   * @return mandateIdentification
  **/
  @ApiModelProperty(required = true, value = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.")
  @NotNull

@Size(min=1,max=35) 
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public OBReadDirectDebit1DataDirectDebit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Service User.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Service User.")
  @NotNull

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadDirectDebit1DataDirectDebit previousPaymentAmount(OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

  /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBReadDirectDebit1DataPreviousPaymentAmount getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  public void setPreviousPaymentAmount(OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }

  public OBReadDirectDebit1DataDirectDebit previousPaymentDateTime(String previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }

  /**
   * Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return previousPaymentDateTime
  **/
  @ApiModelProperty(value = "Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")


  public String getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(String previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit1DataDirectDebit obReadDirectDebit1DataDirectDebit = (OBReadDirectDebit1DataDirectDebit) o;
    return Objects.equals(this.accountId, obReadDirectDebit1DataDirectDebit.accountId) &&
        Objects.equals(this.directDebitId, obReadDirectDebit1DataDirectDebit.directDebitId) &&
        Objects.equals(this.directDebitStatusCode, obReadDirectDebit1DataDirectDebit.directDebitStatusCode) &&
        Objects.equals(this.mandateIdentification, obReadDirectDebit1DataDirectDebit.mandateIdentification) &&
        Objects.equals(this.name, obReadDirectDebit1DataDirectDebit.name) &&
        Objects.equals(this.previousPaymentAmount, obReadDirectDebit1DataDirectDebit.previousPaymentAmount) &&
        Objects.equals(this.previousPaymentDateTime, obReadDirectDebit1DataDirectDebit.previousPaymentDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, directDebitStatusCode, mandateIdentification, name, previousPaymentAmount, previousPaymentDateTime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

