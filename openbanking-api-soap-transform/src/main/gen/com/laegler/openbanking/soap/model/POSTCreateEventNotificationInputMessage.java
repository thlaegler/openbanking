
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="OBEventNotification1Param" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *         &lt;element name="x-fapi-financial-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="x-fapi-interaction-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "obEventNotification1Param",
    "xFapiFinancialId",
    "xFapiInteractionId"
})
@XmlRootElement(name = "POST_CreateEventNotification_InputMessage")
public class POSTCreateEventNotificationInputMessage {

    @XmlElement(name = "OBEventNotification1Param", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] obEventNotification1Param;
    @XmlElement(name = "x-fapi-financial-id", required = true)
    protected String xFapiFinancialId;
    @XmlElement(name = "x-fapi-interaction-id")
    protected String xFapiInteractionId;

    /**
     * Gets the value of the obEventNotification1Param property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getOBEventNotification1Param() {
        return obEventNotification1Param;
    }

    /**
     * Sets the value of the obEventNotification1Param property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBEventNotification1Param(byte[] value) {
        this.obEventNotification1Param = value;
    }

    /**
     * Gets the value of the xFapiFinancialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFapiFinancialId() {
        return xFapiFinancialId;
    }

    /**
     * Sets the value of the xFapiFinancialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFapiFinancialId(String value) {
        this.xFapiFinancialId = value;
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

}
