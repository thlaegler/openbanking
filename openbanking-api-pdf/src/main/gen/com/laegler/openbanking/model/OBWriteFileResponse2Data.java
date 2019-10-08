package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteDomesticResponse3DataMultiAuthorisation;
import com.laegler.openbanking.model.OBWriteFile2DataInitiation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteFileResponse2Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBWriteFileResponse2Data   {
  @JsonProperty("Charges")
  @Valid
  private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("FilePaymentId")
  private String filePaymentId = null;

  @JsonProperty("Initiation")
  private OBWriteFile2DataInitiation initiation = null;

  @JsonProperty("MultiAuthorisation")
  private OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation = null;

  /**
   * Specifies the status of the payment order resource.
   */
  public enum StatusEnum {
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

  public OBWriteFileResponse2Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteFileResponse2Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
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

  public OBWriteFileResponse2Data consentId(String consentId) {
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

  public OBWriteFileResponse2Data creationDateTime(String creationDateTime) {
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

  public OBWriteFileResponse2Data filePaymentId(String filePaymentId) {
    this.filePaymentId = filePaymentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the file payment resource.
   * @return filePaymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the file payment resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getFilePaymentId() {
    return filePaymentId;
  }

  public void setFilePaymentId(String filePaymentId) {
    this.filePaymentId = filePaymentId;
  }

  public OBWriteFileResponse2Data initiation(OBWriteFile2DataInitiation initiation) {
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

  public OBWriteFile2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteFile2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteFileResponse2Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
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

  public OBWriteFileResponse2Data status(StatusEnum status) {
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

  public OBWriteFileResponse2Data statusUpdateDateTime(String statusUpdateDateTime) {
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
    OBWriteFileResponse2Data obWriteFileResponse2Data = (OBWriteFileResponse2Data) o;
    return Objects.equals(this.charges, obWriteFileResponse2Data.charges) &&
        Objects.equals(this.consentId, obWriteFileResponse2Data.consentId) &&
        Objects.equals(this.creationDateTime, obWriteFileResponse2Data.creationDateTime) &&
        Objects.equals(this.filePaymentId, obWriteFileResponse2Data.filePaymentId) &&
        Objects.equals(this.initiation, obWriteFileResponse2Data.initiation) &&
        Objects.equals(this.multiAuthorisation, obWriteFileResponse2Data.multiAuthorisation) &&
        Objects.equals(this.status, obWriteFileResponse2Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteFileResponse2Data.statusUpdateDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, consentId, creationDateTime, filePaymentId, initiation, multiAuthorisation, status, statusUpdateDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFileResponse2Data {\n");
    
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    filePaymentId: ").append(toIndentedString(filePaymentId)).append("\n");
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

