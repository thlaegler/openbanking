
package com.laegler.openbanking.soap.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the requirement of the officers(owner, partner, directors) to access the BCA product.
 * 
 * <p>Java class for OfficerEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficerEligibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MinAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfficerType" type="{http://laegler.com/openbanking/soap/model}OfficerType" minOccurs="0"/&gt;
 *         &lt;element name="OtherOfficerType" type="{http://laegler.com/openbanking/soap/model}OtherOfficerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficerEligibility", propOrder = {
    "maxAmount",
    "minAmount",
    "notes",
    "officerType",
    "otherOfficerType"
})
public class OfficerEligibility {

    @XmlElement(name = "MaxAmount")
    protected BigInteger maxAmount;
    @XmlElement(name = "MinAmount")
    protected BigInteger minAmount;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OfficerType")
    @XmlSchemaType(name = "string")
    protected OfficerType officerType;
    @XmlElement(name = "OtherOfficerType")
    protected OtherOfficerType otherOfficerType;

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAmount(BigInteger value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinAmount(BigInteger value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the officerType property.
     * 
     * @return
     *     possible object is
     *     {@link OfficerType }
     *     
     */
    public OfficerType getOfficerType() {
        return officerType;
    }

    /**
     * Sets the value of the officerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerType }
     *     
     */
    public void setOfficerType(OfficerType value) {
        this.officerType = value;
    }

    /**
     * Gets the value of the otherOfficerType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOfficerType }
     *     
     */
    public OtherOfficerType getOtherOfficerType() {
        return otherOfficerType;
    }

    /**
     * Sets the value of the otherOfficerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOfficerType }
     *     
     */
    public void setOtherOfficerType(OtherOfficerType value) {
        this.otherOfficerType = value;
    }

}
