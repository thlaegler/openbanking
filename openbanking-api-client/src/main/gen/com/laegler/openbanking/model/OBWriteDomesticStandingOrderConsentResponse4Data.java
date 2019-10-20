package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBWriteDomesticConsent3DataAuthorisation;
import com.laegler.openbanking.model.OBWriteDomesticConsent3DataSCASupportData;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3DataInitiation;
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

public class OBWriteDomesticStandingOrderConsentResponse4Data  {
  
  @ApiModelProperty(value = "")
  private OBWriteDomesticConsent3DataAuthorisation authorisation = null;

  @ApiModelProperty(value = "")
  private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
  **/
  private String consentId = null;

  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String creationDateTime = null;

  @ApiModelProperty(value = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String cutOffDateTime = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteDomesticStandingOrder3DataInitiation initiation = null;


@XmlType(name="PermissionEnum")
@XmlEnum(String.class)
public enum PermissionEnum {

@XmlEnumValue("Create") CREATE(String.valueOf("Create"));


    private String value;

    PermissionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String v) {
        for (PermissionEnum b : PermissionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Specifies the Open Banking service request types.")
 /**
   * Specifies the Open Banking service request types.
  **/
  private PermissionEnum permission = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticConsent3DataSCASupportData scASupportData = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("Authorised") AUTHORISED(String.valueOf("Authorised")), @XmlEnumValue("AwaitingAuthorisation") AWAITINGAUTHORISATION(String.valueOf("AwaitingAuthorisation")), @XmlEnumValue("Consumed") CONSUMED(String.valueOf("Consumed")), @XmlEnumValue("Rejected") REJECTED(String.valueOf("Rejected"));


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
   * Get authorisation
   * @return authorisation
  **/
  @JsonProperty("Authorisation")
  public OBWriteDomesticConsent3DataAuthorisation getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data authorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
    return this;
  }

 /**
   * Get charges
   * @return charges
  **/
  @JsonProperty("Charges")
  public List<OBWriteDomesticConsentResponse3DataCharges> getCharges() {
    return charges;
  }

  public void setCharges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
    this.charges.add(chargesItem);
    return this;
  }

 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
   * @return consentId
  **/
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

 /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @JsonProperty("CreationDateTime")
  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return cutOffDateTime
  **/
  @JsonProperty("CutOffDateTime")
  public String getCutOffDateTime() {
    return cutOffDateTime;
  }

  public void setCutOffDateTime(String cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data cutOffDateTime(String cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
    return this;
  }

 /**
   * Get initiation
   * @return initiation
  **/
  @JsonProperty("Initiation")
  public OBWriteDomesticStandingOrder3DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data initiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

 /**
   * Specifies the Open Banking service request types.
   * @return permission
  **/
  @JsonProperty("Permission")
  public String getPermission() {
    if (permission == null) {
      return null;
    }
    return permission.value();
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

 /**
   * Get scASupportData
   * @return scASupportData
  **/
  @JsonProperty("SCASupportData")
  public OBWriteDomesticConsent3DataSCASupportData getScASupportData() {
    return scASupportData;
  }

  public void setScASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
  }

  public OBWriteDomesticStandingOrderConsentResponse4Data scASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
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

  public OBWriteDomesticStandingOrderConsentResponse4Data status(StatusEnum status) {
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

  public OBWriteDomesticStandingOrderConsentResponse4Data statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticStandingOrderConsentResponse4Data {\n");
    
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
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

