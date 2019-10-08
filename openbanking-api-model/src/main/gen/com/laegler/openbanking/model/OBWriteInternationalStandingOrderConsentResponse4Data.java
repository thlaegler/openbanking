package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBWriteDomesticConsent3DataAuthorisation;
import com.laegler.openbanking.model.OBWriteDomesticConsent3DataSCASupportData;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteInternationalStandingOrder3DataInitiation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalStandingOrderConsentResponse4Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBWriteInternationalStandingOrderConsentResponse4Data   {
  @JsonProperty("Authorisation")
  private OBWriteDomesticConsent3DataAuthorisation authorisation = null;

  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("CutOffDateTime")
  private String cutOffDateTime = null;

  @JsonProperty("Initiation")
  private OBWriteInternationalStandingOrder3DataInitiation initiation = null;

  /**
   * Specifies the Open Banking service request types.
   */
  public enum PermissionEnum {
    CREATE("Create");

    private String value;

    PermissionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionEnum fromValue(String text) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Permission")
  private PermissionEnum permission = null;

  @JsonProperty("SCASupportData")
  private OBWriteDomesticConsent3DataSCASupportData scASupportData = null;

  /**
   * Specifies the status of resource in code form.
   */
  public enum StatusEnum {
    AUTHORISED("Authorised"),
    
    AWAITINGAUTHORISATION("AwaitingAuthorisation"),
    
    CONSUMED("Consumed"),
    
    REJECTED("Rejected");

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

  public OBWriteInternationalStandingOrderConsentResponse4Data authorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
    return this;
  }

  /**
   * Get authorisation
   * @return authorisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteDomesticConsent3DataAuthorisation getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * Get charges
   * @return charges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBWriteDomesticConsentResponse3DataCharges> getCharges() {
    return charges;
  }

  public void setCharges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
  @NotNull

@Size(min=1,max=128) 
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull


  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data cutOffDateTime(String cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
    return this;
  }

  /**
   * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return cutOffDateTime
  **/
  @ApiModelProperty(value = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")


  public String getCutOffDateTime() {
    return cutOffDateTime;
  }

  public void setCutOffDateTime(String cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data initiation(OBWriteInternationalStandingOrder3DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBWriteInternationalStandingOrder3DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteInternationalStandingOrder3DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Specifies the Open Banking service request types.
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "Specifies the Open Banking service request types.")
  @NotNull


  public PermissionEnum getPermission() {
    return permission;
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data scASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
    return this;
  }

  /**
   * Get scASupportData
   * @return scASupportData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteDomesticConsent3DataSCASupportData getScASupportData() {
    return scASupportData;
  }

  public void setScASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of resource in code form.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of resource in code form.")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWriteInternationalStandingOrderConsentResponse4Data statusUpdateDateTime(String statusUpdateDateTime) {
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
    OBWriteInternationalStandingOrderConsentResponse4Data obWriteInternationalStandingOrderConsentResponse4Data = (OBWriteInternationalStandingOrderConsentResponse4Data) o;
    return Objects.equals(this.authorisation, obWriteInternationalStandingOrderConsentResponse4Data.authorisation) &&
        Objects.equals(this.charges, obWriteInternationalStandingOrderConsentResponse4Data.charges) &&
        Objects.equals(this.consentId, obWriteInternationalStandingOrderConsentResponse4Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteInternationalStandingOrderConsentResponse4Data.creationDateTime) &&
        Objects.equals(this.cutOffDateTime, obWriteInternationalStandingOrderConsentResponse4Data.cutOffDateTime) &&
        Objects.equals(this.initiation, obWriteInternationalStandingOrderConsentResponse4Data.initiation) &&
        Objects.equals(this.permission, obWriteInternationalStandingOrderConsentResponse4Data.permission) &&
        Objects.equals(this.scASupportData, obWriteInternationalStandingOrderConsentResponse4Data.scASupportData) &&
        Objects.equals(this.status, obWriteInternationalStandingOrderConsentResponse4Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteInternationalStandingOrderConsentResponse4Data.statusUpdateDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisation, charges, consentId, creationDateTime, cutOffDateTime, initiation, permission, scASupportData, status, statusUpdateDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrderConsentResponse4Data {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

