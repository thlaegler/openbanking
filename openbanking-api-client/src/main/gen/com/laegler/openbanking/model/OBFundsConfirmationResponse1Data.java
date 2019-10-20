package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBFundsConfirmation1DataInstructedAmount;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBFundsConfirmationResponse1Data  {
  
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
 /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
  **/
  private String consentId = null;

  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String creationDateTime = null;

  @ApiModelProperty(required = true, value = "Flag to indicate the result of a confirmation of funds check.")
 /**
   * Flag to indicate the result of a confirmation of funds check.
  **/
  private Boolean fundsAvailable = null;

  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.")
 /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
  **/
  private String fundsConfirmationId = null;

  @ApiModelProperty(required = true, value = "")
  private OBFundsConfirmation1DataInstructedAmount instructedAmount = null;

  @ApiModelProperty(required = true, value = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")
 /**
   * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
  **/
  private String reference = null;
 /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
   * @return consentId
  **/
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationResponse1Data consentId(String consentId) {
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

  public OBFundsConfirmationResponse1Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Flag to indicate the result of a confirmation of funds check.
   * @return fundsAvailable
  **/
  @JsonProperty("FundsAvailable")
  public Boolean isFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public OBFundsConfirmationResponse1Data fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

 /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
   * @return fundsConfirmationId
  **/
  @JsonProperty("FundsConfirmationId")
  public String getFundsConfirmationId() {
    return fundsConfirmationId;
  }

  public void setFundsConfirmationId(String fundsConfirmationId) {
    this.fundsConfirmationId = fundsConfirmationId;
  }

  public OBFundsConfirmationResponse1Data fundsConfirmationId(String fundsConfirmationId) {
    this.fundsConfirmationId = fundsConfirmationId;
    return this;
  }

 /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @JsonProperty("InstructedAmount")
  public OBFundsConfirmation1DataInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBFundsConfirmationResponse1Data instructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

 /**
   * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
   * @return reference
  **/
  @JsonProperty("Reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBFundsConfirmationResponse1Data reference(String reference) {
    this.reference = reference;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

