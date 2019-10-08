
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authorisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authorisation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MemberState" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Psd2Role" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "Authorisation", propOrder = {
    "active",
    "memberState",
    "psd2Role"
})
public class Authorisation {

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "MemberState")
    protected String memberState;
    @XmlElement(name = "Psd2Role")
    protected String psd2Role;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the memberState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberState() {
        return memberState;
    }

    /**
     * Sets the value of the memberState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberState(String value) {
        this.memberState = value;
    }

    /**
     * Gets the value of the psd2Role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsd2Role() {
        return psd2Role;
    }

    /**
     * Sets the value of the psd2Role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsd2Role(String value) {
        this.psd2Role = value;
    }

}
