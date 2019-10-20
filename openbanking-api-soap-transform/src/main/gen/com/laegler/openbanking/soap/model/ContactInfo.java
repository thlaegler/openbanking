
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Communication device number or electronic address used for communication.
 * 
 * <p>Java class for ContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactContent"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactType" type="{http://laegler.com/openbanking/soap/model}ContactType"/&gt;
 *         &lt;element name="OtherContactType" type="{http://laegler.com/openbanking/soap/model}OtherContactType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo", propOrder = {
    "contactContent",
    "contactDescription",
    "contactType",
    "otherContactType"
})
public class ContactInfo {

    @XmlElement(name = "ContactContent", required = true)
    protected String contactContent;
    @XmlElement(name = "ContactDescription")
    protected String contactDescription;
    @XmlElement(name = "ContactType", required = true)
    @XmlSchemaType(name = "string")
    protected ContactType contactType;
    @XmlElement(name = "OtherContactType")
    protected OtherContactType otherContactType;

    /**
     * Gets the value of the contactContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactContent() {
        return contactContent;
    }

    /**
     * Sets the value of the contactContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactContent(String value) {
        this.contactContent = value;
    }

    /**
     * Gets the value of the contactDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDescription() {
        return contactDescription;
    }

    /**
     * Sets the value of the contactDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDescription(String value) {
        this.contactDescription = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContactType(ContactType value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the otherContactType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherContactType }
     *     
     */
    public OtherContactType getOtherContactType() {
        return otherContactType;
    }

    /**
     * Sets the value of the otherContactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherContactType }
     *     
     */
    public void setOtherContactType(OtherContactType value) {
        this.otherContactType = value;
    }

}
