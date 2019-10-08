
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
    "xFapiInteractionId",
    "authorization"
})
@XmlRootElement(name = "GET_ReadallcallbackURLs_InputMessage")
public class GETReadallcallbackURLsInputMessage {

    @XmlElement(name = "x-fapi-interaction-id")
    protected String xFapiInteractionId;
    @XmlElement(name = "Authorization", required = true)
    protected String authorization;

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
