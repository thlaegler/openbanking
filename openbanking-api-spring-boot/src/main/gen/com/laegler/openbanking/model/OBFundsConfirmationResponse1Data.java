package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBFundsConfirmation1DataInstructedAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBFundsConfirmationResponse1Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBFundsConfirmationResponse1Data   {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("FundsAvailable")
  private Boolean fundsAvailable = null;

  @JsonProperty("FundsConfirmationId")
  private String fundsConfirmationId = null;

  @JsonProperty("InstructedAmount")
  private OBFundsConfirmation1DataInstructedAmount instructedAmount = null;

  @JsonProperty("Reference")
  private String reference = null;

  public OBFundsConfirmationResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
  @NotNull

@Size(min=1,max=128) 
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationResponse1Data creationDateTime(String creationDateTime) {
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

  public OBFundsConfirmationResponse1Data fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  /**
   * Flag to indicate the result of a confirmation of funds check.
   * @return fundsAvailable
  **/
  @ApiModelProperty(required = true, value = "Flag to indicate the result of a confirmation of funds check.")
  @NotNull


  public Boolean isFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public OBFundsConfirmationResponse1Data fundsConfirmationId(String fundsConfirmationId) {
    this.fundsConfirmationId = fundsConfirmationId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
   * @return fundsConfirmationId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getFundsConfirmationId() {
    return fundsConfirmationId;
  }

  public void setFundsConfirmationId(String fundsConfirmationId) {
    this.fundsConfirmationId = fundsConfirmationId;
  }

  public OBFundsConfirmationResponse1Data instructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBFundsConfirmation1DataInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBFundsConfirmationResponse1Data reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")
  @NotNull

@Size(min=1,max=35) 
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFundsConfirmationResponse1Data obFundsConfirmationResponse1Data = (OBFundsConfirmationResponse1Data) o;
    return Objects.equals(this.consentId, obFundsConfirmationResponse1Data.consentId) &&
        Objects.equals(this.creationDateTime, obFundsConfirmationResponse1Data.creationDateTime) &&
        Objects.equals(this.fundsAvailable, obFundsConfirmationResponse1Data.fundsAvailable) &&
        Objects.equals(this.fundsConfirmationId, obFundsConfirmationResponse1Data.fundsConfirmationId) &&
        Objects.equals(this.instructedAmount, obFundsConfirmationResponse1Data.instructedAmount) &&
        Objects.equals(this.reference, obFundsConfirmationResponse1Data.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, fundsAvailable, fundsConfirmationId, instructedAmount, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationResponse1Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    fundsConfirmationId: ").append(toIndentedString(fundsConfirmationId)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

