
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
 *         &lt;element name="CallbackUrlId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OBCallbackUrl1Param" type="{http://laegler.com/openbanking/soap/model}OBCallbackUrl1"/&gt;
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
    "callbackUrlId",
    "obCallbackUrl1Param",
    "xFapiInteractionId",
    "authorization",
    "xJwsSignature"
})
@XmlRootElement(name = "PUT_AmendacallbackURI_InputMessage")
public class PUTAmendacallbackURIInputMessage {

    @XmlElement(name = "CallbackUrlId", required = true)
    protected String callbackUrlId;
    @XmlElement(name = "OBCallbackUrl1Param", required = true)
    protected OBCallbackUrl1 obCallbackUrl1Param;
    @XmlElement(name = "x-fapi-interaction-id")
    protected String xFapiInteractionId;
    @XmlElement(name = "Authorization", required = true)
    protected String authorization;
    @XmlElement(name = "x-jws-signature", required = true)
    protected String xJwsSignature;

    /**
     * Gets the value of the callbackUrlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackUrlId() {
        return callbackUrlId;
    }

    /**
     * Sets the value of the callbackUrlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackUrlId(String value) {
        this.callbackUrlId = value;
    }

    /**
     * Gets the value of the obCallbackUrl1Param property.
     * 
     * @return
     *     possible object is
     *     {@link OBCallbackUrl1 }
     *     
     */
    public OBCallbackUrl1 getOBCallbackUrl1Param() {
        return obCallbackUrl1Param;
    }

    /**
     * Sets the value of the obCallbackUrl1Param property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBCallbackUrl1 }
     *     
     */
    public void setOBCallbackUrl1Param(OBCallbackUrl1 value) {
        this.obCallbackUrl1Param = value;
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
