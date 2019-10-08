
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Supporting Data provided by TPP, when requesting SCA Exemption.
 * 
 * <p>Java class for SCASupportData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCASupportData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppliedAuthenticationApproach" type="{http://laegler.com/openbanking/soap/model}AppliedAuthenticationApproach" minOccurs="0"/&gt;
 *         &lt;element name="ReferencePaymentOrderId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestedSCAExemptionType" type="{http://laegler.com/openbanking/soap/model}RequestedSCAExemptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCASupportData", propOrder = {
    "appliedAuthenticationApproach",
    "referencePaymentOrderId",
    "requestedSCAExemptionType"
})
public class SCASupportData {

    @XmlElement(name = "AppliedAuthenticationApproach")
    @XmlSchemaType(name = "string")
    protected AppliedAuthenticationApproach appliedAuthenticationApproach;
    @XmlElement(name = "ReferencePaymentOrderId")
    protected String referencePaymentOrderId;
    @XmlElement(name = "RequestedSCAExemptionType")
    @XmlSchemaType(name = "string")
    protected RequestedSCAExemptionType requestedSCAExemptionType;

    /**
     * Gets the value of the appliedAuthenticationApproach property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedAuthenticationApproach }
     *     
     */
    public AppliedAuthenticationApproach getAppliedAuthenticationApproach() {
        return appliedAuthenticationApproach;
    }

    /**
     * Sets the value of the appliedAuthenticationApproach property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedAuthenticationApproach }
     *     
     */
    public void setAppliedAuthenticationApproach(AppliedAuthenticationApproach value) {
        this.appliedAuthenticationApproach = value;
    }

    /**
     * Gets the value of the referencePaymentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePaymentOrderId() {
        return referencePaymentOrderId;
    }

    /**
     * Sets the value of the referencePaymentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePaymentOrderId(String value) {
        this.referencePaymentOrderId = value;
    }

    /**
     * Gets the value of the requestedSCAExemptionType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedSCAExemptionType }
     *     
     */
    public RequestedSCAExemptionType getRequestedSCAExemptionType() {
        return requestedSCAExemptionType;
    }

    /**
     * Sets the value of the requestedSCAExemptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedSCAExemptionType }
     *     
     */
    public void setRequestedSCAExemptionType(RequestedSCAExemptionType value) {
        this.requestedSCAExemptionType = value;
    }

}
