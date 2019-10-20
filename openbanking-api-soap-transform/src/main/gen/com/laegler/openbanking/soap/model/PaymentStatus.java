
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Payment status details.
 * 
 * <p>Java class for PaymentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentTransactionId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="210"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" type="{http://laegler.com/openbanking/soap/model}Status23"/&gt;
 *         &lt;element name="StatusDetail" type="{http://laegler.com/openbanking/soap/model}StatusDetail" minOccurs="0"/&gt;
 *         &lt;element name="StatusUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatus", propOrder = {
    "paymentTransactionId",
    "status",
    "statusDetail",
    "statusUpdateDateTime"
})
public class PaymentStatus {

    @XmlElement(name = "PaymentTransactionId", required = true)
    protected String paymentTransactionId;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected Status23 status;
    @XmlElement(name = "StatusDetail")
    protected StatusDetail statusDetail;
    @XmlElement(name = "StatusUpdateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdateDateTime;

    /**
     * Gets the value of the paymentTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    /**
     * Sets the value of the paymentTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionId(String value) {
        this.paymentTransactionId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status23 }
     *     
     */
    public Status23 getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status23 }
     *     
     */
    public void setStatus(Status23 value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetail }
     *     
     */
    public StatusDetail getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetail }
     *     
     */
    public void setStatusDetail(StatusDetail value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the statusUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    /**
     * Sets the value of the statusUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusUpdateDateTime(XMLGregorianCalendar value) {
        this.statusUpdateDateTime = value;
    }

}
