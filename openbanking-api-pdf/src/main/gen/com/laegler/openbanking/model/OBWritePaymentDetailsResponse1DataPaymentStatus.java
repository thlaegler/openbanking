package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBWritePaymentDetailsResponse1DataStatusDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment status details.
 */
@ApiModel(description = "Payment status details.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBWritePaymentDetailsResponse1DataPaymentStatus   {
  @JsonProperty("PaymentTransactionId")
  private String paymentTransactionId = null;

  /**
   * Status of a transfe, as assigned by the transaction administrator.
   */
  public enum StatusEnum {
    ACCEPTED("Accepted"),
    
    ACCEPTEDCANCELLATIONREQUEST("AcceptedCancellationRequest"),
    
    ACCEPTEDCREDITSETTLEMENTCOMPLETED("AcceptedCreditSettlementCompleted"),
    
    ACCEPTEDCUSTOMERPROFILE("AcceptedCustomerProfile"),
    
    ACCEPTEDFUNDSCHECKED("AcceptedFundsChecked"),
    
    ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),
    
    ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),
    
    ACCEPTEDTECHNICALVALIDATION("AcceptedTechnicalValidation"),
    
    ACCEPTEDWITHCHANGE("AcceptedWithChange"),
    
    ACCEPTEDWITHOUTPOSTING("AcceptedWithoutPosting"),
    
    CANCELLED("Cancelled"),
    
    NOCANCELLATIONPROCESS("NoCancellationProcess"),
    
    PARTIALLYACCEPTEDCANCELLATIONREQUEST("PartiallyAcceptedCancellationRequest"),
    
    PARTIALLYACCEPTEDTECHNICALCORRECT("PartiallyAcceptedTechnicalCorrect"),
    
    PAYMENTCANCELLED("PaymentCancelled"),
    
    PENDING("Pending"),
    
    PENDINGCANCELLATIONREQUEST("PendingCancellationRequest"),
    
    RECEIVED("Received"),
    
    REJECTED("Rejected"),
    
    REJECTEDCANCELLATIONREQUEST("RejectedCancellationRequest");

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

  @JsonProperty("StatusDetail")
  private OBWritePaymentDetailsResponse1DataStatusDetail statusDetail = null;

  @JsonProperty("StatusUpdateDateTime")
  private String statusUpdateDateTime = null;

  public OBWritePaymentDetailsResponse1DataPaymentStatus paymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
    return this;
  }

  /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   * @return paymentTransactionId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
  @NotNull

@Size(min=1,max=210) 
  public String getPaymentTransactionId() {
    return paymentTransactionId;
  }

  public void setPaymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a transfe, as assigned by the transaction administrator.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of a transfe, as assigned by the transaction administrator.")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus statusDetail(OBWritePaymentDetailsResponse1DataStatusDetail statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  /**
   * Get statusDetail
   * @return statusDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWritePaymentDetailsResponse1DataStatusDetail getStatusDetail() {
    return statusDetail;
  }

  public void setStatusDetail(OBWritePaymentDetailsResponse1DataStatusDetail statusDetail) {
    this.statusDetail = statusDetail;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
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
    OBWritePaymentDetailsResponse1DataPaymentStatus obWritePaymentDetailsResponse1DataPaymentStatus = (OBWritePaymentDetailsResponse1DataPaymentStatus) o;
    return Objects.equals(this.paymentTransactionId, obWritePaymentDetailsResponse1DataPaymentStatus.paymentTransactionId) &&
        Objects.equals(this.status, obWritePaymentDetailsResponse1DataPaymentStatus.status) &&
        Objects.equals(this.statusDetail, obWritePaymentDetailsResponse1DataPaymentStatus.statusDetail) &&
        Objects.equals(this.statusUpdateDateTime, obWritePaymentDetailsResponse1DataPaymentStatus.statusUpdateDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionId, status, statusDetail, statusUpdateDateTime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

