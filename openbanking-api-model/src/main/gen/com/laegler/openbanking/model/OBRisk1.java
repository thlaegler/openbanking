package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBRisk1DeliveryAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 */
@ApiModel(description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBRisk1   {
  @JsonProperty("DeliveryAddress")
  private OBRisk1DeliveryAddress deliveryAddress = null;

  @JsonProperty("MerchantCategoryCode")
  private String merchantCategoryCode = null;

  @JsonProperty("MerchantCustomerIdentification")
  private String merchantCustomerIdentification = null;

  /**
   * Specifies the payment context
   */
  public enum PaymentContextCodeEnum {
    BILLPAYMENT("BillPayment"),
    
    ECOMMERCEGOODS("EcommerceGoods"),
    
    ECOMMERCESERVICES("EcommerceServices"),
    
    OTHER("Other"),
    
    PARTYTOPARTY("PartyToParty");

    private String value;

    PaymentContextCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentContextCodeEnum fromValue(String text) {
      for (PaymentContextCodeEnum b : PaymentContextCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("PaymentContextCode")
  private PaymentContextCodeEnum paymentContextCode = null;

  public OBRisk1 deliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBRisk1DeliveryAddress getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public OBRisk1 merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")

@Size(min=3,max=4) 
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public OBRisk1 merchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
    return this;
  }

  /**
   * The unique customer identifier of the PSU with the merchant.
   * @return merchantCustomerIdentification
  **/
  @ApiModelProperty(value = "The unique customer identifier of the PSU with the merchant.")

@Size(min=1,max=70) 
  public String getMerchantCustomerIdentification() {
    return merchantCustomerIdentification;
  }

  public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
  }

  public OBRisk1 paymentContextCode(PaymentContextCodeEnum paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
    return this;
  }

  /**
   * Specifies the payment context
   * @return paymentContextCode
  **/
  @ApiModelProperty(value = "Specifies the payment context")


  public PaymentContextCodeEnum getPaymentContextCode() {
    return paymentContextCode;
  }

  public void setPaymentContextCode(PaymentContextCodeEnum paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBRisk1 obRisk1 = (OBRisk1) o;
    return Objects.equals(this.deliveryAddress, obRisk1.deliveryAddress) &&
        Objects.equals(this.merchantCategoryCode, obRisk1.merchantCategoryCode) &&
        Objects.equals(this.merchantCustomerIdentification, obRisk1.merchantCustomerIdentification) &&
        Objects.equals(this.paymentContextCode, obRisk1.paymentContextCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryAddress, merchantCategoryCode, merchantCustomerIdentification, paymentContextCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRisk1 {\n");
    
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantCustomerIdentification: ").append(toIndentedString(merchantCustomerIdentification)).append("\n");
    sb.append("    paymentContextCode: ").append(toIndentedString(paymentContextCode)).append("\n");
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

