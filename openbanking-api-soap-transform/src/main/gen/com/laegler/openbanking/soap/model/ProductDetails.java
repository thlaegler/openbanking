
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeFreeLength" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeFreeLengthPeriod" type="{http://laegler.com/openbanking/soap/model}FeeFreeLengthPeriod1" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Segment" type="{http://laegler.com/openbanking/soap/model}Segment2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetails", propOrder = {
    "feeFreeLength",
    "feeFreeLengthPeriod",
    "notes",
    "segment"
})
public class ProductDetails {

    @XmlElement(name = "FeeFreeLength")
    protected Double feeFreeLength;
    @XmlElement(name = "FeeFreeLengthPeriod")
    @XmlSchemaType(name = "string")
    protected FeeFreeLengthPeriod1 feeFreeLengthPeriod;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "Segment")
    @XmlSchemaType(name = "string")
    protected List<Segment2> segment;

    /**
     * Gets the value of the feeFreeLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFeeFreeLength() {
        return feeFreeLength;
    }

    /**
     * Sets the value of the feeFreeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFeeFreeLength(Double value) {
        this.feeFreeLength = value;
    }

    /**
     * Gets the value of the feeFreeLengthPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FeeFreeLengthPeriod1 }
     *     
     */
    public FeeFreeLengthPeriod1 getFeeFreeLengthPeriod() {
        return feeFreeLengthPeriod;
    }

    /**
     * Sets the value of the feeFreeLengthPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeFreeLengthPeriod1 }
     *     
     */
    public void setFeeFreeLengthPeriod(FeeFreeLengthPeriod1 value) {
        this.feeFreeLengthPeriod = value;
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
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment2 }
     * 
     * 
     */
    public List<Segment2> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment2>();
        }
        return this.segment;
    }

}
