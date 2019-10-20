package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
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

/**
  * Supporting Data provided by TPP, when requesting SCA Exemption.
 **/
@ApiModel(description="Supporting Data provided by TPP, when requesting SCA Exemption.")
public class OBWriteDomesticConsent3DataSCASupportData  {
  

@XmlType(name="AppliedAuthenticationApproachEnum")
@XmlEnum(String.class)
public enum AppliedAuthenticationApproachEnum {

@XmlEnumValue("CA") CA(String.valueOf("CA")), @XmlEnumValue("SCA") SCA(String.valueOf("SCA"));


    private String value;

    AppliedAuthenticationApproachEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AppliedAuthenticationApproachEnum fromValue(String v) {
        for (AppliedAuthenticationApproachEnum b : AppliedAuthenticationApproachEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP")
 /**
   * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
  **/
  private AppliedAuthenticationApproachEnum appliedAuthenticationApproach = null;

  @ApiModelProperty(value = "Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.")
 /**
   * Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.
  **/
  private String referencePaymentOrderId = null;


@XmlType(name="RequestedSCAExemptionTypeEnum")
@XmlEnum(String.class)
public enum RequestedSCAExemptionTypeEnum {

@XmlEnumValue("BillPayment") BILLPAYMENT(String.valueOf("BillPayment")), @XmlEnumValue("ContactlessTravel") CONTACTLESSTRAVEL(String.valueOf("ContactlessTravel")), @XmlEnumValue("EcommerceGoods") ECOMMERCEGOODS(String.valueOf("EcommerceGoods")), @XmlEnumValue("EcommerceServices") ECOMMERCESERVICES(String.valueOf("EcommerceServices")), @XmlEnumValue("Kiosk") KIOSK(String.valueOf("Kiosk")), @XmlEnumValue("Parking") PARKING(String.valueOf("Parking")), @XmlEnumValue("PartyToParty") PARTYTOPARTY(String.valueOf("PartyToParty"));


    private String value;

    RequestedSCAExemptionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RequestedSCAExemptionTypeEnum fromValue(String v) {
        for (RequestedSCAExemptionTypeEnum b : RequestedSCAExemptionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "This field allows a PISP to request specific SCA Exemption for a Payment Initiation")
 /**
   * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
  **/
  private RequestedSCAExemptionTypeEnum requestedSCAExemptionType = null;
 /**
   * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
   * @return appliedAuthenticationApproach
  **/
  @JsonProperty("AppliedAuthenticationApproach")
  public String getAppliedAuthenticationApproach() {
    if (appliedAuthenticationApproach == null) {
      return null;
    }
    return appliedAuthenticationApproach.value();
  }

  public void setAppliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
    this.appliedAuthenticationApproach = appliedAuthenticationApproach;
  }

  public OBWriteDomesticConsent3DataSCASupportData appliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
    this.appliedAuthenticationApproach = appliedAuthenticationApproach;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.
   * @return referencePaymentOrderId
  **/
  @JsonProperty("ReferencePaymentOrderId")
 @Size(min=1,max=128)  public String getReferencePaymentOrderId() {
    return referencePaymentOrderId;
  }

  public void setReferencePaymentOrderId(String referencePaymentOrderId) {
    this.referencePaymentOrderId = referencePaymentOrderId;
  }

  public OBWriteDomesticConsent3DataSCASupportData referencePaymentOrderId(String referencePaymentOrderId) {
    this.referencePaymentOrderId = referencePaymentOrderId;
    return this;
  }

 /**
   * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
   * @return requestedSCAExemptionType
  **/
  @JsonProperty("RequestedSCAExemptionType")
  public String getRequestedSCAExemptionType() {
    if (requestedSCAExemptionType == null) {
      return null;
    }
    return requestedSCAExemptionType.value();
  }

  public void setRequestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
    this.requestedSCAExemptionType = requestedSCAExemptionType;
  }

  public OBWriteDomesticConsent3DataSCASupportData requestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
    this.requestedSCAExemptionType = requestedSCAExemptionType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

