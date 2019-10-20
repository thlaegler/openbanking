
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Resource-Update Event.
 * 
 * <p>Java class for OBEventResourceUpdate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBEventResourceUpdate1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subject" type="{http://laegler.com/openbanking/soap/model}OBEventSubject1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBEventResourceUpdate1", propOrder = {
    "subject"
})
public class OBEventResourceUpdate1 {

    @XmlElement(required = true)
    protected OBEventSubject1 subject;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link OBEventSubject1 }
     *     
     */
    public OBEventSubject1 getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBEventSubject1 }
     *     
     */
    public void setSubject(OBEventSubject1 value) {
        this.subject = value;
    }

}
