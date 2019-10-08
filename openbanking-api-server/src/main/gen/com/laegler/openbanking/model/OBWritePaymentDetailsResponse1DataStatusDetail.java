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
  * Payment status details as per underlying Payment Rail.
 **/
@ApiModel(description="Payment status details as per underlying Payment Rail.")
public class OBWritePaymentDetailsResponse1DataStatusDetail  {
  
  @ApiModelProperty(value = "")
  private String localInstrument = null;

  @ApiModelProperty(required = true, value = "Status of a transfer, as assigned by the transaction administrator.")
 /**
   * Status of a transfer, as assigned by the transaction administrator.
  **/
  private String status = null;


@XmlType(name="StatusReasonEnum")
@XmlEnum(String.class)
public enum StatusReasonEnum {

@XmlEnumValue("Cancelled") CANCELLED(String.valueOf("Cancelled")), @XmlEnumValue("PendingFailingSettlement") PENDINGFAILINGSETTLEMENT(String.valueOf("PendingFailingSettlement")), @XmlEnumValue("PendingSettlement") PENDINGSETTLEMENT(String.valueOf("PendingSettlement")), @XmlEnumValue("Proprietary") PROPRIETARY(String.valueOf("Proprietary")), @XmlEnumValue("ProprietaryRejection") PROPRIETARYREJECTION(String.valueOf("ProprietaryRejection")), @XmlEnumValue("Suspended") SUSPENDED(String.valueOf("Suspended")), @XmlEnumValue("Unmatched") UNMATCHED(String.valueOf("Unmatched"));


    private String value;

    StatusReasonEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusReasonEnum fromValue(String v) {
        for (StatusReasonEnum b : StatusReasonEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Reason Code provided for the status of a transfer.")
 /**
   * Reason Code provided for the status of a transfer.
  **/
  private StatusReasonEnum statusReason = null;

  @ApiModelProperty(value = "Reason provided for the status of a transfer.")
 /**
   * Reason provided for the status of a transfer.
  **/
  private String statusReasonDescription = null;
 /**
   * Get localInstrument
   * @return localInstrument
  **/
  @JsonProperty("LocalInstrument")
  public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

 /**
   * Status of a transfer, as assigned by the transaction administrator.
   * @return status
  **/
  @JsonProperty("Status")
  @NotNull
 @Size(min=1,max=128)  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Reason Code provided for the status of a transfer.
   * @return statusReason
  **/
  @JsonProperty("StatusReason")
  public String getStatusReason() {
    if (statusReason == null) {
      return null;
    }
    return statusReason.value();
  }

  public void setStatusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail statusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
    return this;
  }

 /**
   * Reason provided for the status of a transfer.
   * @return statusReasonDescription
  **/
  @JsonProperty("StatusReasonDescription")
 @Size(min=1,max=256)  public String getStatusReasonDescription() {
    return statusReasonDescription;
  }

  public void setStatusReasonDescription(String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail statusReasonDescription(String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWritePaymentDetailsResponse1DataStatusDetail {\n");
    
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
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

