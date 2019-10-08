
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The authorisation type request from the TPP.
 * 
 * <p>Java class for Authorisation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authorisation2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorisationType" type="{http://laegler.com/openbanking/soap/model}AuthorisationType1"/&gt;
 *         &lt;element name="CompletionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorisation2", propOrder = {
    "authorisationType",
    "completionDateTime"
})
public class Authorisation2 {

    @XmlElement(name = "AuthorisationType", required = true)
    @XmlSchemaType(name = "string")
    protected AuthorisationType1 authorisationType;
    @XmlElement(name = "CompletionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDateTime;

    /**
     * Gets the value of the authorisationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationType1 }
     *     
     */
    public AuthorisationType1 getAuthorisationType() {
        return authorisationType;
    }

    /**
     * Sets the value of the authorisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationType1 }
     *     
     */
    public void setAuthorisationType(AuthorisationType1 value) {
        this.authorisationType = value;
    }

    /**
     * Gets the value of the completionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDateTime() {
        return completionDateTime;
    }

    /**
     * Sets the value of the completionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDateTime(XMLGregorianCalendar value) {
        this.completionDateTime = value;
    }

}
