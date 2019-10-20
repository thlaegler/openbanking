
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
 *         &lt;element name="OBFundsConfirmation1Param" type="{http://laegler.com/openbanking/soap/model}OBFundsConfirmation1"/&gt;
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
    "obFundsConfirmation1Param",
    "xFapiAuthDate",
    "xFapiCustomerIpAddress",
    "xFapiInteractionId",
    "authorization"
})
@XmlRootElement(name = "POST_CreateFundsConfirmations_InputMessage")
public class POSTCreateFundsConfirmationsInputMessage {

    @XmlElement(name = "OBFundsConfirmation1Param", required = true)
    protected OBFundsConfirmation1 obFundsConfirmation1Param;
    @XmlElement(name = "x-fapi-auth-date")
    protected String xFapiAuthDate;
    @XmlElement(name = "x-fapi-customer-ip-address")
    protected String xFapiCustomerIpAddress;
    @XmlElement(name = "x-fapi-interaction-id")
    protected String xFapiInteractionId;
    @XmlElement(name = "Authorization", required = true)
    protected String authorization;

    /**
     * Gets the value of the obFundsConfirmation1Param property.
     * 
     * @return
     *     possible object is
     *     {@link OBFundsConfirmation1 }
     *     
     */
    public OBFundsConfirmation1 getOBFundsConfirmation1Param() {
        return obFundsConfirmation1Param;
    }

    /**
     * Sets the value of the obFundsConfirmation1Param property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBFundsConfirmation1 }
     *     
     */
    public void setOBFundsConfirmation1Param(OBFundsConfirmation1 value) {
        this.obFundsConfirmation1Param = value;
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

}
