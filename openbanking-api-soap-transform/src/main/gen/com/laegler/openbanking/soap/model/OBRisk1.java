
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 * 
 * <p>Java class for OBRisk1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBRisk1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryAddress" type="{http://laegler.com/openbanking/soap/model}DeliveryAddress" minOccurs="0"/&gt;
 *         &lt;element name="MerchantCategoryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MerchantCustomerIdentification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentContextCode" type="{http://laegler.com/openbanking/soap/model}PaymentContextCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBRisk1", propOrder = {
    "deliveryAddress",
    "merchantCategoryCode",
    "merchantCustomerIdentification",
    "paymentContextCode"
})
public class OBRisk1 {

    @XmlElement(name = "DeliveryAddress")
    protected DeliveryAddress deliveryAddress;
    @XmlElement(name = "MerchantCategoryCode")
    protected String merchantCategoryCode;
    @XmlElement(name = "MerchantCustomerIdentification")
    protected String merchantCustomerIdentification;
    @XmlElement(name = "PaymentContextCode")
    @XmlSchemaType(name = "string")
    protected PaymentContextCode paymentContextCode;

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryAddress }
     *     
     */
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryAddress }
     *     
     */
    public void setDeliveryAddress(DeliveryAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Gets the value of the merchantCustomerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCustomerIdentification() {
        return merchantCustomerIdentification;
    }

    /**
     * Sets the value of the merchantCustomerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCustomerIdentification(String value) {
        this.merchantCustomerIdentification = value;
    }

    /**
     * Gets the value of the paymentContextCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContextCode }
     *     
     */
    public PaymentContextCode getPaymentContextCode() {
        return paymentContextCode;
    }

    /**
     * Sets the value of the paymentContextCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContextCode }
     *     
     */
    public void setPaymentContextCode(PaymentContextCode value) {
        this.paymentContextCode = value;
    }

}
