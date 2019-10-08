
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Countries in which an accountholder can reside and, therefore, be eligible to open an account
 * 
 * <p>Java class for ResidencyEligibility1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidencyEligibility1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherResidencyType" type="{http://laegler.com/openbanking/soap/model}OtherResidencyType" minOccurs="0"/&gt;
 *         &lt;element name="ResidencyIncluded" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^\w{0,4}$"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;minLength value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResidencyType" type="{http://laegler.com/openbanking/soap/model}ResidencyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidencyEligibility1", propOrder = {
    "notes",
    "otherResidencyType",
    "residencyIncluded",
    "residencyType"
})
public class ResidencyEligibility1 {

    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherResidencyType")
    protected OtherResidencyType otherResidencyType;
    @XmlElement(name = "ResidencyIncluded", required = true)
    protected List<String> residencyIncluded;
    @XmlElement(name = "ResidencyType")
    @XmlSchemaType(name = "string")
    protected ResidencyType residencyType;

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
     * Gets the value of the otherResidencyType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherResidencyType }
     *     
     */
    public OtherResidencyType getOtherResidencyType() {
        return otherResidencyType;
    }

    /**
     * Sets the value of the otherResidencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherResidencyType }
     *     
     */
    public void setOtherResidencyType(OtherResidencyType value) {
        this.otherResidencyType = value;
    }

    /**
     * Gets the value of the residencyIncluded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residencyIncluded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResidencyIncluded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResidencyIncluded() {
        if (residencyIncluded == null) {
            residencyIncluded = new ArrayList<String>();
        }
        return this.residencyIncluded;
    }

    /**
     * Gets the value of the residencyType property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencyType }
     *     
     */
    public ResidencyType getResidencyType() {
        return residencyType;
    }

    /**
     * Sets the value of the residencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencyType }
     *     
     */
    public void setResidencyType(ResidencyType value) {
        this.residencyType = value;
    }

}
