
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Industry Eligibility that the account holder will need to meet to take out the BCA product
 * 
 * <p>Java class for IndustryEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryEligibility"&gt;
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
 *         &lt;element name="OtherSICCode" type="{http://laegler.com/openbanking/soap/model}OtherSICCode" minOccurs="0"/&gt;
 *         &lt;element name="SICCode" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[0-9]{0,5}$"/&gt;
 *               &lt;maxLength value="5"/&gt;
 *               &lt;minLength value="0"/&gt;
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
@XmlType(name = "IndustryEligibility", propOrder = {
    "notes",
    "otherSICCode",
    "sicCode"
})
public class IndustryEligibility {

    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherSICCode")
    protected OtherSICCode otherSICCode;
    @XmlElement(name = "SICCode", required = true)
    protected List<String> sicCode;

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
     * Gets the value of the otherSICCode property.
     * 
     * @return
     *     possible object is
     *     {@link OtherSICCode }
     *     
     */
    public OtherSICCode getOtherSICCode() {
        return otherSICCode;
    }

    /**
     * Sets the value of the otherSICCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSICCode }
     *     
     */
    public void setOtherSICCode(OtherSICCode value) {
        this.otherSICCode = value;
    }

    /**
     * Gets the value of the sicCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSICCode() {
        if (sicCode == null) {
            sicCode = new ArrayList<String>();
        }
        return this.sicCode;
    }

}
