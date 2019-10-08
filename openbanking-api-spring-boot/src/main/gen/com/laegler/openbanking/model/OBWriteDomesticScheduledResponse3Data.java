package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteDomesticResponse3DataMultiAuthorisation;
import com.laegler.openbanking.model.OBWriteDomesticScheduled2DataInitiation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomesticScheduledResponse3Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBWriteDomesticScheduledResponse3Data   {
  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("DomesticScheduledPaymentId")
  private String domesticScheduledPaymentId = null;

  @JsonProperty("ExpectedExecutionDateTime")
  private String expectedExecutionDateTime = null;

  @JsonProperty("ExpectedSettlementDateTime")
  private String expectedSettlementDateTime = null;

  @JsonProperty("Initiation")
  private OBWriteDomesticScheduled2DataInitiation initiation = null;

  @JsonProperty("MultiAuthorisation")
  private OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation = null;

  /**
   * Specifies the status of the payment order resource.
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

  public OBWriteDomesticScheduledResponse3Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDomesticScheduledResponse3Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
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

  public OBWriteDomesticScheduledResponse3Data consentId(String consentId) {
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

  public OBWriteDomesticScheduledResponse3Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull


  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteDomesticScheduledResponse3Data domesticScheduledPaymentId(String domesticScheduledPaymentId) {
    this.domesticScheduledPaymentId = domesticScheduledPaymentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic schedule payment resource.
   * @return domesticScheduledPaymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic schedule payment resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getDomesticScheduledPaymentId() {
    return domesticScheduledPaymentId;
  }

  public void setDomesticScheduledPaymentId(String domesticScheduledPaymentId) {
    this.domesticScheduledPaymentId = domesticScheduledPaymentId;
  }

  public OBWriteDomesticScheduledResponse3Data expectedExecutionDateTime(String expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
    return this;
  }

  /**
   * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedExecutionDateTime
  **/
  @ApiModelProperty(value = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")


  public String getExpectedExecutionDateTime() {
    return expectedExecutionDateTime;
  }

  public void setExpectedExecutionDateTime(String expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
  }

  public OBWriteDomesticScheduledResponse3Data expectedSettlementDateTime(String expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
    return this;
  }

  /**
   * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedSettlementDateTime
  **/
  @ApiModelProperty(value = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")


  public String getExpectedSettlementDateTime() {
    return expectedSettlementDateTime;
  }

  public void setExpectedSettlementDateTime(String expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
  }

  public OBWriteDomesticScheduledResponse3Data initiation(OBWriteDomesticScheduled2DataInitiation initiation) {
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

  public OBWriteDomesticScheduled2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomesticScheduled2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomesticScheduledResponse3Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
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

  public OBWriteDomesticScheduledResponse3Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of the payment order resource.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of the payment order resource.")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWriteDomesticScheduledResponse3Data statusUpdateDateTime(String statusUpdateDateTime) {
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
    OBWriteDomesticScheduledResponse3Data obWriteDomesticScheduledResponse3Data = (OBWriteDomesticScheduledResponse3Data) o;
    return Objects.equals(this.charges, obWriteDomesticScheduledResponse3Data.charges) &&
        Objects.equals(this.consentId, obWriteDomesticScheduledResponse3Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteDomesticScheduledResponse3Data.creationDateTime) &&
        Objects.equals(this.domesticScheduledPaymentId, obWriteDomesticScheduledResponse3Data.domesticScheduledPaymentId) &&
        Objects.equals(this.expectedExecutionDateTime, obWriteDomesticScheduledResponse3Data.expectedExecutionDateTime) &&
        Objects.equals(this.expectedSettlementDateTime, obWriteDomesticScheduledResponse3Data.expectedSettlementDateTime) &&
        Objects.equals(this.initiation, obWriteDomesticScheduledResponse3Data.initiation) &&
        Objects.equals(this.multiAuthorisation, obWriteDomesticScheduledResponse3Data.multiAuthorisation) &&
        Objects.equals(this.status, obWriteDomesticScheduledResponse3Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteDomesticScheduledResponse3Data.statusUpdateDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, consentId, creationDateTime, domesticScheduledPaymentId, expectedExecutionDateTime, expectedSettlementDateTime, initiation, multiAuthorisation, status, statusUpdateDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticScheduledResponse3Data {\n");
    
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    domesticScheduledPaymentId: ").append(toIndentedString(domesticScheduledPaymentId)).append("\n");
    sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
    sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

