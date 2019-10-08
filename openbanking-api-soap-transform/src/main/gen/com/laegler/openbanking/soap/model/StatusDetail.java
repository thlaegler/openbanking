
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Payment status details as per underlying Payment Rail.
 * 
 * <p>Java class for StatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalInstrument" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatusReason" type="{http://laegler.com/openbanking/soap/model}StatusReason" minOccurs="0"/&gt;
 *         &lt;element name="StatusReasonDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetail", propOrder = {
    "localInstrument",
    "status",
    "statusReason",
    "statusReasonDescription"
})
public class StatusDetail {

    @XmlElement(name = "LocalInstrument")
    protected String localInstrument;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "StatusReason")
    @XmlSchemaType(name = "string")
    protected StatusReason statusReason;
    @XmlElement(name = "StatusReasonDescription")
    protected String statusReasonDescription;

    /**
     * Gets the value of the localInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalInstrument() {
        return localInstrument;
    }

    /**
     * Sets the value of the localInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalInstrument(String value) {
        this.localInstrument = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason }
     *     
     */
    public StatusReason getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason }
     *     
     */
    public void setStatusReason(StatusReason value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the statusReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReasonDescription() {
        return statusReasonDescription;
    }

    /**
     * Sets the value of the statusReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReasonDescription(String value) {
        this.statusReasonDescription = value;
    }

}
