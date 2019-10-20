package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBWritePaymentDetailsResponse1DataStatusDetail;
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
  * Payment status details.
 **/
@ApiModel(description="Payment status details.")
public class OBWritePaymentDetailsResponse1DataPaymentStatus  {
  
  @ApiModelProperty(required = true, value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
 /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
  **/
  private String paymentTransactionId = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("Accepted") ACCEPTED(String.valueOf("Accepted")), @XmlEnumValue("AcceptedCancellationRequest") ACCEPTEDCANCELLATIONREQUEST(String.valueOf("AcceptedCancellationRequest")), @XmlEnumValue("AcceptedCreditSettlementCompleted") ACCEPTEDCREDITSETTLEMENTCOMPLETED(String.valueOf("AcceptedCreditSettlementCompleted")), @XmlEnumValue("AcceptedCustomerProfile") ACCEPTEDCUSTOMERPROFILE(String.valueOf("AcceptedCustomerProfile")), @XmlEnumValue("AcceptedFundsChecked") ACCEPTEDFUNDSCHECKED(String.valueOf("AcceptedFundsChecked")), @XmlEnumValue("AcceptedSettlementCompleted") ACCEPTEDSETTLEMENTCOMPLETED(String.valueOf("AcceptedSettlementCompleted")), @XmlEnumValue("AcceptedSettlementInProcess") ACCEPTEDSETTLEMENTINPROCESS(String.valueOf("AcceptedSettlementInProcess")), @XmlEnumValue("AcceptedTechnicalValidation") ACCEPTEDTECHNICALVALIDATION(String.valueOf("AcceptedTechnicalValidation")), @XmlEnumValue("AcceptedWithChange") ACCEPTEDWITHCHANGE(String.valueOf("AcceptedWithChange")), @XmlEnumValue("AcceptedWithoutPosting") ACCEPTEDWITHOUTPOSTING(String.valueOf("AcceptedWithoutPosting")), @XmlEnumValue("Cancelled") CANCELLED(String.valueOf("Cancelled")), @XmlEnumValue("NoCancellationProcess") NOCANCELLATIONPROCESS(String.valueOf("NoCancellationProcess")), @XmlEnumValue("PartiallyAcceptedCancellationRequest") PARTIALLYACCEPTEDCANCELLATIONREQUEST(String.valueOf("PartiallyAcceptedCancellationRequest")), @XmlEnumValue("PartiallyAcceptedTechnicalCorrect") PARTIALLYACCEPTEDTECHNICALCORRECT(String.valueOf("PartiallyAcceptedTechnicalCorrect")), @XmlEnumValue("PaymentCancelled") PAYMENTCANCELLED(String.valueOf("PaymentCancelled")), @XmlEnumValue("Pending") PENDING(String.valueOf("Pending")), @XmlEnumValue("PendingCancellationRequest") PENDINGCANCELLATIONREQUEST(String.valueOf("PendingCancellationRequest")), @XmlEnumValue("Received") RECEIVED(String.valueOf("Received")), @XmlEnumValue("Rejected") REJECTED(String.valueOf("Rejected")), @XmlEnumValue("RejectedCancellationRequest") REJECTEDCANCELLATIONREQUEST(String.valueOf("RejectedCancellationRequest"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Status of a transfe, as assigned by the transaction administrator.")
 /**
   * Status of a transfe, as assigned by the transaction administrator.
  **/
  private StatusEnum status = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBWritePaymentDetailsResponse1DataStatusDetail statusDetail = null;

  @ApiModelProperty(required = true, value = "Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String statusUpdateDateTime = null;
 /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   * @return paymentTransactionId
  **/
  @JsonProperty("PaymentTransactionId")
  @NotNull
 @Size(min=1,max=210)  public String getPaymentTransactionId() {
    return paymentTransactionId;
  }

  public void setPaymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus paymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
    return this;
  }

 /**
   * Status of a transfe, as assigned by the transaction administrator.
   * @return status
  **/
  @JsonProperty("Status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get statusDetail
   * @return statusDetail
  **/
  @JsonProperty("StatusDetail")
  public OBWritePaymentDetailsResponse1DataStatusDetail getStatusDetail() {
    return statusDetail;
  }

  public void setStatusDetail(OBWritePaymentDetailsResponse1DataStatusDetail statusDetail) {
    this.statusDetail = statusDetail;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus statusDetail(OBWritePaymentDetailsResponse1DataStatusDetail statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

 /**
   * Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @JsonProperty("StatusUpdateDateTime")
  @NotNull
  public String getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWritePaymentDetailsResponse1DataPaymentStatus {\n");
    
    sb.append("    paymentTransactionId: ").append(toIndentedString(paymentTransactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
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

