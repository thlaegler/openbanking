package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBFundsConfirmationConsentResponse1DataDebtorAccount;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBFundsConfirmationConsentResponse1Data  {
  
  @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the funds confirmation consent resource.")
 /**
   * Unique identification as assigned to identify the funds confirmation consent resource.
  **/
  private String consentId = null;

  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00
  **/
  private String creationDateTime = null;

  @ApiModelProperty(required = true, value = "")
  private OBFundsConfirmationConsentResponse1DataDebtorAccount debtorAccount = null;

  @ApiModelProperty(value = "Specified date and time the funds confirmation authorisation will expire.\\nIf this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00")
 /**
   * Specified date and time the funds confirmation authorisation will expire.\\nIf this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00
  **/
  private String expirationDateTime = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("Authorised") AUTHORISED(String.valueOf("Authorised")), @XmlEnumValue("AwaitingAuthorisation") AWAITINGAUTHORISATION(String.valueOf("AwaitingAuthorisation")), @XmlEnumValue("Rejected") REJECTED(String.valueOf("Rejected")), @XmlEnumValue("Revoked") REVOKED(String.valueOf("Revoked"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
 /**
   * Specifies the status of consent resource in code form.
  **/
  private StatusEnum status = null;

  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String statusUpdateDateTime = null;
 /**
   * Unique identification as assigned to identify the funds confirmation consent resource.
   * @return consentId
  **/
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationConsentResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

 /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @JsonProperty("CreationDateTime")
  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @JsonProperty("DebtorAccount")
  public OBFundsConfirmationConsentResponse1DataDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBFundsConfirmationConsentResponse1DataDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBFundsConfirmationConsentResponse1Data debtorAccount(OBFundsConfirmationConsentResponse1DataDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

 /**
   * Specified date and time the funds confirmation authorisation will expire.\\nIf this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @JsonProperty("ExpirationDateTime")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

 /**
   * Specifies the status of consent resource in code form.
   * @return status
  **/
  @JsonProperty("Status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBFundsConfirmationConsentResponse1Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @JsonProperty("StatusUpdateDateTime")
  public String getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

