package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBFundsConfirmationConsentResponse1DataDebtorAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBFundsConfirmationConsentResponse1Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBFundsConfirmationConsentResponse1Data   {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("DebtorAccount")
  private OBFundsConfirmationConsentResponse1DataDebtorAccount debtorAccount = null;

  @JsonProperty("ExpirationDateTime")
  private String expirationDateTime = null;

  /**
   * Specifies the status of consent resource in code form.
   */
  public enum StatusEnum {
    AUTHORISED("Authorised"),
    
    AWAITINGAUTHORISATION("AwaitingAuthorisation"),
    
    REJECTED("Rejected"),
    
    REVOKED("Revoked");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("StatusUpdateDateTime")
  private String statusUpdateDateTime = null;

  public OBFundsConfirmationConsentResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned to identify the funds confirmation consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the funds confirmation consent resource.")
  @NotNull

@Size(min=1,max=128) 
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationConsentResponse1Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00")
  @NotNull


  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data debtorAccount(OBFundsConfirmationConsentResponse1DataDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBFundsConfirmationConsentResponse1DataDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBFundsConfirmationConsentResponse1DataDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBFundsConfirmationConsentResponse1Data expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Specified date and time the funds confirmation authorisation will expire.\\nIf this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @ApiModelProperty(value = "Specified date and time the funds confirmation authorisation will expire.\\nIf this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00")


  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of consent resource in code form.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBFundsConfirmationConsentResponse1Data statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull


  public String getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFundsConfirmationConsentResponse1Data obFundsConfirmationConsentResponse1Data = (OBFundsConfirmationConsentResponse1Data) o;
    return Objects.equals(this.consentId, obFundsConfirmationConsentResponse1Data.consentId) &&
        Objects.equals(this.creationDateTime, obFundsConfirmationConsentResponse1Data.creationDateTime) &&
        Objects.equals(this.debtorAccount, obFundsConfirmationConsentResponse1Data.debtorAccount) &&
        Objects.equals(this.expirationDateTime, obFundsConfirmationConsentResponse1Data.expirationDateTime) &&
        Objects.equals(this.status, obFundsConfirmationConsentResponse1Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obFundsConfirmationConsentResponse1Data.statusUpdateDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, debtorAccount, expirationDateTime, status, statusUpdateDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationConsentResponse1Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
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

