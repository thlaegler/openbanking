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
 * OBFundsConfirmation1Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBFundsConfirmation1Data   {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("InstructedAmount")
  private OBFundsConfirmation1DataInstructedAmount instructedAmount = null;

  @JsonProperty("Reference")
  private String reference = null;

  public OBFundsConfirmation1Data consentId(String consentId) {
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

  public OBFundsConfirmation1Data instructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
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

  public OBFundsConfirmation1Data reference(String reference) {
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
    OBFundsConfirmation1Data obFundsConfirmation1Data = (OBFundsConfirmation1Data) o;
    return Objects.equals(this.consentId, obFundsConfirmation1Data.consentId) &&
        Objects.equals(this.instructedAmount, obFundsConfirmation1Data.instructedAmount) &&
        Objects.equals(this.reference, obFundsConfirmation1Data.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, instructedAmount, reference);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

