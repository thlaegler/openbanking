package com.laegler.openbanking.model;

import java.util.ArrayList;
import java.util.List;
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

public class OBReadConsentResponse1Data  {
  
  @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the account access consent resource.")
 /**
   * Unique identification as assigned to identify the account access consent resource.
  **/
  private String consentId = null;

  @ApiModelProperty(required = true, value = "")
  private String creationDateTime = null;

  @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String expirationDateTime = null;


@XmlType(name="PermissionsEnum")
@XmlEnum(String.class)
public enum PermissionsEnum {

@XmlEnumValue("ReadAccountsBasic") READACCOUNTSBASIC(String.valueOf("ReadAccountsBasic")), @XmlEnumValue("ReadAccountsDetail") READACCOUNTSDETAIL(String.valueOf("ReadAccountsDetail")), @XmlEnumValue("ReadBalances") READBALANCES(String.valueOf("ReadBalances")), @XmlEnumValue("ReadBeneficiariesBasic") READBENEFICIARIESBASIC(String.valueOf("ReadBeneficiariesBasic")), @XmlEnumValue("ReadBeneficiariesDetail") READBENEFICIARIESDETAIL(String.valueOf("ReadBeneficiariesDetail")), @XmlEnumValue("ReadDirectDebits") READDIRECTDEBITS(String.valueOf("ReadDirectDebits")), @XmlEnumValue("ReadOffers") READOFFERS(String.valueOf("ReadOffers")), @XmlEnumValue("ReadPAN") READPAN(String.valueOf("ReadPAN")), @XmlEnumValue("ReadParty") READPARTY(String.valueOf("ReadParty")), @XmlEnumValue("ReadPartyPSU") READPARTYPSU(String.valueOf("ReadPartyPSU")), @XmlEnumValue("ReadProducts") READPRODUCTS(String.valueOf("ReadProducts")), @XmlEnumValue("ReadScheduledPaymentsBasic") READSCHEDULEDPAYMENTSBASIC(String.valueOf("ReadScheduledPaymentsBasic")), @XmlEnumValue("ReadScheduledPaymentsDetail") READSCHEDULEDPAYMENTSDETAIL(String.valueOf("ReadScheduledPaymentsDetail")), @XmlEnumValue("ReadStandingOrdersBasic") READSTANDINGORDERSBASIC(String.valueOf("ReadStandingOrdersBasic")), @XmlEnumValue("ReadStandingOrdersDetail") READSTANDINGORDERSDETAIL(String.valueOf("ReadStandingOrdersDetail")), @XmlEnumValue("ReadStatementsBasic") READSTATEMENTSBASIC(String.valueOf("ReadStatementsBasic")), @XmlEnumValue("ReadStatementsDetail") READSTATEMENTSDETAIL(String.valueOf("ReadStatementsDetail")), @XmlEnumValue("ReadTransactionsBasic") READTRANSACTIONSBASIC(String.valueOf("ReadTransactionsBasic")), @XmlEnumValue("ReadTransactionsCredits") READTRANSACTIONSCREDITS(String.valueOf("ReadTransactionsCredits")), @XmlEnumValue("ReadTransactionsDebits") READTRANSACTIONSDEBITS(String.valueOf("ReadTransactionsDebits")), @XmlEnumValue("ReadTransactionsDetail") READTRANSACTIONSDETAIL(String.valueOf("ReadTransactionsDetail"));


    private String value;

    PermissionsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String v) {
        for (PermissionsEnum b : PermissionsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private List<PermissionsEnum> permissions = new ArrayList<PermissionsEnum>();


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

  @ApiModelProperty(required = true, value = "")
  private String statusUpdateDateTime = null;

  @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String transactionFromDateTime = null;

  @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String transactionToDateTime = null;
 /**
   * Unique identification as assigned to identify the account access consent resource.
   * @return consentId
  **/
  @JsonProperty("ConsentId")
  @NotNull
 @Size(min=1,max=128)  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBReadConsentResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

 /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @JsonProperty("CreationDateTime")
  @NotNull
  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBReadConsentResponse1Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @JsonProperty("ExpirationDateTime")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBReadConsentResponse1Data expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("Permissions")
  @NotNull
 @Size(min=1)  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsentResponse1Data permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadConsentResponse1Data addPermissionsItem(PermissionsEnum permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
   * Specifies the status of consent resource in code form.
   * @return status
  **/
  @JsonProperty("Status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBReadConsentResponse1Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get statusUpdateDateTime
   * @return statusUpdateDateTime
  **/
  @JsonProperty("StatusUpdateDateTime")
  @NotNull
  public String getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBReadConsentResponse1Data statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

 /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionFromDateTime
  **/
  @JsonProperty("TransactionFromDateTime")
  public String getTransactionFromDateTime() {
    return transactionFromDateTime;
  }

  public void setTransactionFromDateTime(String transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
  }

  public OBReadConsentResponse1Data transactionFromDateTime(String transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

 /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionToDateTime
  **/
  @JsonProperty("TransactionToDateTime")
  public String getTransactionToDateTime() {
    return transactionToDateTime;
  }

  public void setTransactionToDateTime(String transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
  }

  public OBReadConsentResponse1Data transactionToDateTime(String transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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

