package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Supporting Data provided by TPP, when requesting SCA Exemption.
 */
@ApiModel(description = "Supporting Data provided by TPP, when requesting SCA Exemption.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBWriteDomesticConsent3DataSCASupportData   {
  /**
   * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
   */
  public enum AppliedAuthenticationApproachEnum {
    CA("CA"),
    
    SCA("SCA");

    private String value;

    AppliedAuthenticationApproachEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AppliedAuthenticationApproachEnum fromValue(String text) {
      for (AppliedAuthenticationApproachEnum b : AppliedAuthenticationApproachEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AppliedAuthenticationApproach")
  private AppliedAuthenticationApproachEnum appliedAuthenticationApproach = null;

  @JsonProperty("ReferencePaymentOrderId")
  private String referencePaymentOrderId = null;

  /**
   * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
   */
  public enum RequestedSCAExemptionTypeEnum {
    BILLPAYMENT("BillPayment"),
    
    CONTACTLESSTRAVEL("ContactlessTravel"),
    
    ECOMMERCEGOODS("EcommerceGoods"),
    
    ECOMMERCESERVICES("EcommerceServices"),
    
    KIOSK("Kiosk"),
    
    PARKING("Parking"),
    
    PARTYTOPARTY("PartyToParty");

    private String value;

    RequestedSCAExemptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RequestedSCAExemptionTypeEnum fromValue(String text) {
      for (RequestedSCAExemptionTypeEnum b : RequestedSCAExemptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("RequestedSCAExemptionType")
  private RequestedSCAExemptionTypeEnum requestedSCAExemptionType = null;

  public OBWriteDomesticConsent3DataSCASupportData appliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
    this.appliedAuthenticationApproach = appliedAuthenticationApproach;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
   * @return appliedAuthenticationApproach
  **/
  @ApiModelProperty(value = "Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP")


  public AppliedAuthenticationApproachEnum getAppliedAuthenticationApproach() {
    return appliedAuthenticationApproach;
  }

  public void setAppliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
    this.appliedAuthenticationApproach = appliedAuthenticationApproach;
  }

  public OBWriteDomesticConsent3DataSCASupportData referencePaymentOrderId(String referencePaymentOrderId) {
    this.referencePaymentOrderId = referencePaymentOrderId;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.
   * @return referencePaymentOrderId
  **/
  @ApiModelProperty(value = "Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.")

@Size(min=1,max=128) 
  public String getReferencePaymentOrderId() {
    return referencePaymentOrderId;
  }

  public void setReferencePaymentOrderId(String referencePaymentOrderId) {
    this.referencePaymentOrderId = referencePaymentOrderId;
  }

  public OBWriteDomesticConsent3DataSCASupportData requestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
    this.requestedSCAExemptionType = requestedSCAExemptionType;
    return this;
  }

  /**
   * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
   * @return requestedSCAExemptionType
  **/
  @ApiModelProperty(value = "This field allows a PISP to request specific SCA Exemption for a Payment Initiation")


  public RequestedSCAExemptionTypeEnum getRequestedSCAExemptionType() {
    return requestedSCAExemptionType;
  }

  public void setRequestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
    this.requestedSCAExemptionType = requestedSCAExemptionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDomesticConsent3DataSCASupportData obWriteDomesticConsent3DataSCASupportData = (OBWriteDomesticConsent3DataSCASupportData) o;
    return Objects.equals(this.appliedAuthenticationApproach, obWriteDomesticConsent3DataSCASupportData.appliedAuthenticationApproach) &&
        Objects.equals(this.referencePaymentOrderId, obWriteDomesticConsent3DataSCASupportData.referencePaymentOrderId) &&
        Objects.equals(this.requestedSCAExemptionType, obWriteDomesticConsent3DataSCASupportData.requestedSCAExemptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedAuthenticationApproach, referencePaymentOrderId, requestedSCAExemptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticConsent3DataSCASupportData {\n");
    
    sb.append("    appliedAuthenticationApproach: ").append(toIndentedString(appliedAuthenticationApproach)).append("\n");
    sb.append("    referencePaymentOrderId: ").append(toIndentedString(referencePaymentOrderId)).append("\n");
    sb.append("    requestedSCAExemptionType: ").append(toIndentedString(requestedSCAExemptionType)).append("\n");
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

