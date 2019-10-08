package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteDomesticResponse3DataMultiAuthorisation;
import com.laegler.openbanking.model.OBWriteInternationalConsentResponse3DataExchangeRateInformation;
import com.laegler.openbanking.model.OBWriteInternationalScheduled2DataInitiation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalScheduledResponse3Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBWriteInternationalScheduledResponse3Data   {
  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("ExchangeRateInformation")
  private OBWriteInternationalConsentResponse3DataExchangeRateInformation exchangeRateInformation = null;

  @JsonProperty("ExpectedExecutionDateTime")
  private String expectedExecutionDateTime = null;

  @JsonProperty("ExpectedSettlementDateTime")
  private String expectedSettlementDateTime = null;

  @JsonProperty("Initiation")
  private OBWriteInternationalScheduled2DataInitiation initiation = null;

  @JsonProperty("InternationalScheduledPaymentId")
  private String internationalScheduledPaymentId = null;

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

  public OBWriteInternationalScheduledResponse3Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteInternationalScheduledResponse3Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
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

  public OBWriteInternationalScheduledResponse3Data consentId(String consentId) {
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

  public OBWriteInternationalScheduledResponse3Data creationDateTime(String creationDateTime) {
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

  public OBWriteInternationalScheduledResponse3Data exchangeRateInformation(OBWriteInternationalConsentResponse3DataExchangeRateInformation exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
    return this;
  }

  /**
   * Get exchangeRateInformation
   * @return exchangeRateInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteInternationalConsentResponse3DataExchangeRateInformation getExchangeRateInformation() {
    return exchangeRateInformation;
  }

  public void setExchangeRateInformation(OBWriteInternationalConsentResponse3DataExchangeRateInformation exchangeRateInformation) {
    this.exchangeRateInformation = exchangeRateInformation;
  }

  public OBWriteInternationalScheduledResponse3Data expectedExecutionDateTime(String expectedExecutionDateTime) {
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

  public OBWriteInternationalScheduledResponse3Data expectedSettlementDateTime(String expectedSettlementDateTime) {
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

  public OBWriteInternationalScheduledResponse3Data initiation(OBWriteInternationalScheduled2DataInitiation initiation) {
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

  public OBWriteInternationalScheduled2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteInternationalScheduled2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteInternationalScheduledResponse3Data internationalScheduledPaymentId(String internationalScheduledPaymentId) {
    this.internationalScheduledPaymentId = internationalScheduledPaymentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.
   * @return internationalScheduledPaymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international scheduled payment resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getInternationalScheduledPaymentId() {
    return internationalScheduledPaymentId;
  }

  public void setInternationalScheduledPaymentId(String internationalScheduledPaymentId) {
    this.internationalScheduledPaymentId = internationalScheduledPaymentId;
  }

  public OBWriteInternationalScheduledResponse3Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
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

  public OBWriteInternationalScheduledResponse3Data status(StatusEnum status) {
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

  public OBWriteInternationalScheduledResponse3Data statusUpdateDateTime(String statusUpdateDateTime) {
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
    OBWriteInternationalScheduledResponse3Data obWriteInternationalScheduledResponse3Data = (OBWriteInternationalScheduledResponse3Data) o;
    return Objects.equals(this.charges, obWriteInternationalScheduledResponse3Data.charges) &&
        Objects.equals(this.consentId, obWriteInternationalScheduledResponse3Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteInternationalScheduledResponse3Data.creationDateTime) &&
        Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledResponse3Data.exchangeRateInformation) &&
        Objects.equals(this.expectedExecutionDateTime, obWriteInternationalScheduledResponse3Data.expectedExecutionDateTime) &&
        Objects.equals(this.expectedSettlementDateTime, obWriteInternationalScheduledResponse3Data.expectedSettlementDateTime) &&
        Objects.equals(this.initiation, obWriteInternationalScheduledResponse3Data.initiation) &&
        Objects.equals(this.internationalScheduledPaymentId, obWriteInternationalScheduledResponse3Data.internationalScheduledPaymentId) &&
        Objects.equals(this.multiAuthorisation, obWriteInternationalScheduledResponse3Data.multiAuthorisation) &&
        Objects.equals(this.status, obWriteInternationalScheduledResponse3Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteInternationalScheduledResponse3Data.statusUpdateDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, consentId, creationDateTime, exchangeRateInformation, expectedExecutionDateTime, expectedSettlementDateTime, initiation, internationalScheduledPaymentId, multiAuthorisation, status, statusUpdateDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalScheduledResponse3Data {\n");
    
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
    sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
    sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    internationalScheduledPaymentId: ").append(toIndentedString(internationalScheduledPaymentId)).append("\n");
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

