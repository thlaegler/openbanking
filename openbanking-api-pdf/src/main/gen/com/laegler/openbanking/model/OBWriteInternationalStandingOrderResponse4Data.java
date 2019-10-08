package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteDomesticResponse3DataMultiAuthorisation;
import com.laegler.openbanking.model.OBWriteInternationalStandingOrder3DataInitiation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalStandingOrderResponse4Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBWriteInternationalStandingOrderResponse4Data   {
  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("Initiation")
  private OBWriteInternationalStandingOrder3DataInitiation initiation = null;

  @JsonProperty("InternationalStandingOrderId")
  private String internationalStandingOrderId = null;

  @JsonProperty("MultiAuthorisation")
  private OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation = null;

  /**
   * Specifies the status of resource in code form.
   */
  public enum StatusEnum {
    CANCELLED("Cancelled"),
    
    INITIATIONCOMPLETED("InitiationCompleted"),
    
    INITIATIONFAILED("InitiationFailed"),
    
    INITIATIONPENDING("InitiationPending");

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

  public OBWriteInternationalStandingOrderResponse4Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteInternationalStandingOrderResponse4Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
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

  public OBWriteInternationalStandingOrderResponse4Data consentId(String consentId) {
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

  public OBWriteInternationalStandingOrderResponse4Data creationDateTime(String creationDateTime) {
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

  public OBWriteInternationalStandingOrderResponse4Data initiation(OBWriteInternationalStandingOrder3DataInitiation initiation) {
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

  public OBWriteInternationalStandingOrderResponse4Data internationalStandingOrderId(String internationalStandingOrderId) {
    this.internationalStandingOrderId = internationalStandingOrderId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.
   * @return internationalStandingOrderId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getInternationalStandingOrderId() {
    return internationalStandingOrderId;
  }

  public void setInternationalStandingOrderId(String internationalStandingOrderId) {
    this.internationalStandingOrderId = internationalStandingOrderId;
  }

  public OBWriteInternationalStandingOrderResponse4Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
    return this;
  }

  /**
   * Get multiAuthorisation
   * @return multiAuthorisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteDomesticResponse3DataMultiAuthorisation getMultiAuthorisation() {
    return multiAuthorisation;
  }

  public void setMultiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
  }

  public OBWriteInternationalStandingOrderResponse4Data status(StatusEnum status) {
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

  public OBWriteInternationalStandingOrderResponse4Data statusUpdateDateTime(String statusUpdateDateTime) {
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
    OBWriteInternationalStandingOrderResponse4Data obWriteInternationalStandingOrderResponse4Data = (OBWriteInternationalStandingOrderResponse4Data) o;
    return Objects.equals(this.charges, obWriteInternationalStandingOrderResponse4Data.charges) &&
        Objects.equals(this.consentId, obWriteInternationalStandingOrderResponse4Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteInternationalStandingOrderResponse4Data.creationDateTime) &&
        Objects.equals(this.initiation, obWriteInternationalStandingOrderResponse4Data.initiation) &&
        Objects.equals(this.internationalStandingOrderId, obWriteInternationalStandingOrderResponse4Data.internationalStandingOrderId) &&
        Objects.equals(this.multiAuthorisation, obWriteInternationalStandingOrderResponse4Data.multiAuthorisation) &&
        Objects.equals(this.status, obWriteInternationalStandingOrderResponse4Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteInternationalStandingOrderResponse4Data.statusUpdateDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, consentId, creationDateTime, initiation, internationalStandingOrderId, multiAuthorisation, status, statusUpdateDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrderResponse4Data {\n");
    
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    internationalStandingOrderId: ").append(toIndentedString(internationalStandingOrderId)).append("\n");
    sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
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

