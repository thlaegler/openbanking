package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBRisk1DeliveryAddress;
import io.swagger.annotations.ApiModel;

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
  * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 **/
@ApiModel(description="The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.")
public class OBRisk1  {
  
  @ApiModelProperty(value = "")
  private OBRisk1DeliveryAddress deliveryAddress = null;

  @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
 /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
  **/
  private String merchantCategoryCode = null;

  @ApiModelProperty(value = "The unique customer identifier of the PSU with the merchant.")
 /**
   * The unique customer identifier of the PSU with the merchant.
  **/
  private String merchantCustomerIdentification = null;


@XmlType(name="PaymentContextCodeEnum")
@XmlEnum(String.class)
public enum PaymentContextCodeEnum {

@XmlEnumValue("BillPayment") BILLPAYMENT(String.valueOf("BillPayment")), @XmlEnumValue("EcommerceGoods") ECOMMERCEGOODS(String.valueOf("EcommerceGoods")), @XmlEnumValue("EcommerceServices") ECOMMERCESERVICES(String.valueOf("EcommerceServices")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PartyToParty") PARTYTOPARTY(String.valueOf("PartyToParty"));


    private String value;

    PaymentContextCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentContextCodeEnum fromValue(String v) {
        for (PaymentContextCodeEnum b : PaymentContextCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Specifies the payment context")
 /**
   * Specifies the payment context
  **/
  private PaymentContextCodeEnum paymentContextCode = null;
 /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @JsonProperty("DeliveryAddress")
  public OBRisk1DeliveryAddress getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public OBRisk1 deliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

 /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
   * @return merchantCategoryCode
  **/
  @JsonProperty("MerchantCategoryCode")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public OBRisk1 merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

 /**
   * The unique customer identifier of the PSU with the merchant.
   * @return merchantCustomerIdentification
  **/
  @JsonProperty("MerchantCustomerIdentification")
  public String getMerchantCustomerIdentification() {
    return merchantCustomerIdentification;
  }

  public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
  }

  public OBRisk1 merchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
    return this;
  }

 /**
   * Specifies the payment context
   * @return paymentContextCode
  **/
  @JsonProperty("PaymentContextCode")
  public String getPaymentContextCode() {
    if (paymentContextCode == null) {
      return null;
    }
    return paymentContextCode.value();
  }

  public void setPaymentContextCode(PaymentContextCodeEnum paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
  }

  public OBRisk1 paymentContextCode(PaymentContextCodeEnum paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

