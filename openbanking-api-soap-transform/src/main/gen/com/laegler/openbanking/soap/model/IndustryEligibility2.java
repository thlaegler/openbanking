
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Industry Eligibility that the account holder will need to meet to take out the SME Loan product
 * 
 * <p>Java class for IndustryEligibility2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryEligibility2"&gt;
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
 *         &lt;element name="OtherSICCodeExluded" type="{http://laegler.com/openbanking/soap/model}OtherSICCodeExluded" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherSICCodeIncluded" type="{http://laegler.com/openbanking/soap/model}OtherSICCodeIncluded1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SICCodeExcluded" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[0-9]{0,5}$"/&gt;
 *               &lt;maxLength value="5"/&gt;
 *               &lt;minLength value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SICCodeIncluded" maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "IndustryEligibility2", propOrder = {
    "notes",
    "otherSICCodeExluded",
    "otherSICCodeIncluded",
    "sicCodeExcluded",
    "sicCodeIncluded"
})
public class IndustryEligibility2 {

    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherSICCodeExluded")
    protected List<OtherSICCodeExluded> otherSICCodeExluded;
    @XmlElement(name = "OtherSICCodeIncluded")
    protected List<OtherSICCodeIncluded1> otherSICCodeIncluded;
    @XmlElement(name = "SICCodeExcluded")
    protected List<String> sicCodeExcluded;
    @XmlElement(name = "SICCodeIncluded")
    protected List<String> sicCodeIncluded;

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
     * Gets the value of the otherSICCodeExluded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSICCodeExluded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSICCodeExluded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherSICCodeExluded }
     * 
     * 
     */
    public List<OtherSICCodeExluded> getOtherSICCodeExluded() {
        if (otherSICCodeExluded == null) {
            otherSICCodeExluded = new ArrayList<OtherSICCodeExluded>();
        }
        return this.otherSICCodeExluded;
    }

    /**
     * Gets the value of the otherSICCodeIncluded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSICCodeIncluded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSICCodeIncluded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherSICCodeIncluded1 }
     * 
     * 
     */
    public List<OtherSICCodeIncluded1> getOtherSICCodeIncluded() {
        if (otherSICCodeIncluded == null) {
            otherSICCodeIncluded = new ArrayList<OtherSICCodeIncluded1>();
        }
        return this.otherSICCodeIncluded;
    }

    /**
     * Gets the value of the sicCodeExcluded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicCodeExcluded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICCodeExcluded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSICCodeExcluded() {
        if (sicCodeExcluded == null) {
            sicCodeExcluded = new ArrayList<String>();
        }
        return this.sicCodeExcluded;
    }

    /**
     * Gets the value of the sicCodeIncluded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicCodeIncluded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICCodeIncluded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSICCodeIncluded() {
        if (sicCodeIncluded == null) {
            sicCodeIncluded = new ArrayList<String>();
        }
        return this.sicCodeIncluded;
    }

}
