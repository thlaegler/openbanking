package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBFundsConfirmation1DataInstructedAmount;
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

public class OBFundsConfirmation1Data  {
  
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
 /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
  **/
  private String consentId = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
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
  @NotNull
 @Size(min=1,max=128)  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmation1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

 /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @JsonProperty("InstructedAmount")
  @NotNull
  public OBFundsConfirmation1DataInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBFundsConfirmation1Data instructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

 /**
   * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
   * @return reference
  **/
  @JsonProperty("Reference")
  @NotNull
 @Size(min=1,max=35)  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBFundsConfirmation1Data reference(String reference) {
    this.reference = reference;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmation1Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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

