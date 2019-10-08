package com.laegler.openbanking.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBReadConsent1Data  {
  
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

  public OBReadConsent1Data expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("Permissions")
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsent1Data permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadConsent1Data addPermissionsItem(PermissionsEnum permissionsItem) {
    this.permissions.add(permissionsItem);
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

  public OBReadConsent1Data transactionFromDateTime(String transactionFromDateTime) {
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

  public OBReadConsent1Data transactionToDateTime(String transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsent1Data {\n");
    
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

