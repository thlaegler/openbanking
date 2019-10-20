
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
 *         &lt;element name="CertificateValidationRequestBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "certificateValidationRequestBody"
})
@XmlRootElement(name = "POST_Validatecertificate_InputMessage")
public class POSTValidatecertificateInputMessage {

    @XmlElement(name = "CertificateValidationRequestBody", required = true)
    protected String certificateValidationRequestBody;

    /**
     * Gets the value of the certificateValidationRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateValidationRequestBody() {
        return certificateValidationRequestBody;
    }

    /**
     * Sets the value of the certificateValidationRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateValidationRequestBody(String value) {
        this.certificateValidationRequestBody = value;
    }

}
