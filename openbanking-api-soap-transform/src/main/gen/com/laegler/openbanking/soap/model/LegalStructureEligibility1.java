
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Legal structure eligibility requirement to access the CCC product.
 * 
 * <p>Java class for LegalStructureEligibility1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalStructureEligibility1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalStructure" type="{http://laegler.com/openbanking/soap/model}LegalStructure1" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherLegalStructure" type="{http://laegler.com/openbanking/soap/model}OtherLegalStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalStructureEligibility1", propOrder = {
    "legalStructure",
    "notes",
    "otherLegalStructure"
})
public class LegalStructureEligibility1 {

    @XmlElement(name = "LegalStructure")
    @XmlSchemaType(name = "string")
    protected LegalStructure1 legalStructure;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherLegalStructure")
    protected OtherLegalStructure otherLegalStructure;

    /**
     * Gets the value of the legalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link LegalStructure1 }
     *     
     */
    public LegalStructure1 getLegalStructure() {
        return legalStructure;
    }

    /**
     * Sets the value of the legalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStructure1 }
     *     
     */
    public void setLegalStructure(LegalStructure1 value) {
        this.legalStructure = value;
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
     * Gets the value of the otherLegalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link OtherLegalStructure }
     *     
     */
    public OtherLegalStructure getOtherLegalStructure() {
        return otherLegalStructure;
    }

    /**
     * Sets the value of the otherLegalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherLegalStructure }
     *     
     */
    public void setOtherLegalStructure(OtherLegalStructure value) {
        this.otherLegalStructure = value;
    }

}
