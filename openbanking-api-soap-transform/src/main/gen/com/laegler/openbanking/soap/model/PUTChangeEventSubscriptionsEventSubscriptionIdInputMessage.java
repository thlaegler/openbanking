
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OBEventSubscriptionResponse1Param" type="{http://laegler.com/openbanking/soap/model}OBEventSubscriptionResponse1"/&gt;
 *         &lt;element name="EventSubscriptionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="x-fapi-auth-date" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT|UTC)$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="x-fapi-customer-ip-address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="x-fapi-interaction-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Authorization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="x-jws-signature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obEventSubscriptionResponse1Param",
    "eventSubscriptionId",
    "xFapiAuthDate",
    "xFapiCustomerIpAddress",
    "xFapiInteractionId",
    "authorization",
    "xJwsSignature"
})
@XmlRootElement(name = "PUT_ChangeEventSubscriptionsEventSubscriptionId_InputMessage")
public class PUTChangeEventSubscriptionsEventSubscriptionIdInputMessage {

    @XmlElement(name = "OBEventSubscriptionResponse1Param", required = true)
    protected OBEventSubscriptionResponse1 obEventSubscriptionResponse1Param;
    @XmlElement(name = "EventSubscriptionId", required = true)
    protected String eventSubscriptionId;
    @XmlElement(name = "x-fapi-auth-date")
    protected String xFapiAuthDate;
    @XmlElement(name = "x-fapi-customer-ip-address")
    protected String xFapiCustomerIpAddress;
    @XmlElement(name = "x-fapi-interaction-id")
    protected String xFapiInteractionId;
    @XmlElement(name = "Authorization", required = true)
    protected String authorization;
    @XmlElement(name = "x-jws-signature", required = true)
    protected String xJwsSignature;

    /**
     * Gets the value of the obEventSubscriptionResponse1Param property.
     * 
     * @return
     *     possible object is
     *     {@link OBEventSubscriptionResponse1 }
     *     
     */
    public OBEventSubscriptionResponse1 getOBEventSubscriptionResponse1Param() {
        return obEventSubscriptionResponse1Param;
    }

    /**
     * Sets the value of the obEventSubscriptionResponse1Param property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBEventSubscriptionResponse1 }
     *     
     */
    public void setOBEventSubscriptionResponse1Param(OBEventSubscriptionResponse1 value) {
        this.obEventSubscriptionResponse1Param = value;
    }

    /**
     * Gets the value of the eventSubscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSubscriptionId() {
        return eventSubscriptionId;
    }

    /**
     * Sets the value of the eventSubscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSubscriptionId(String value) {
        this.eventSubscriptionId = value;
    }

    /**
     * Gets the value of the xFapiAuthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFapiAuthDate() {
        return xFapiAuthDate;
    }

    /**
     * Sets the value of the xFapiAuthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFapiAuthDate(String value) {
        this.xFapiAuthDate = value;
    }

    /**
     * Gets the value of the xFapiCustomerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFapiCustomerIpAddress() {
        return xFapiCustomerIpAddress;
    }

    /**
     * Sets the value of the xFapiCustomerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFapiCustomerIpAddress(String value) {
        this.xFapiCustomerIpAddress = value;
    }

    /**
     * Gets the value of the xFapiInteractionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFapiInteractionId() {
        return xFapiInteractionId;
    }

    /**
     * Sets the value of the xFapiInteractionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFapiInteractionId(String value) {
        this.xFapiInteractionId = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorization(String value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the xJwsSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXJwsSignature() {
        return xJwsSignature;
    }

    /**
     * Sets the value of the xJwsSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXJwsSignature(String value) {
        this.xJwsSignature = value;
    }

}
