
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
 * <p>Java class for ProductDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDetails1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeFreeLength" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeFreeLengthPeriod" type="{http://laegler.com/openbanking/soap/model}FeeFreeLengthPeriod2" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyMaximumCharge" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$"/&gt;
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
 *         &lt;element name="OtherSegment" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_0" minOccurs="0"/&gt;
 *         &lt;element name="Segment" type="{http://laegler.com/openbanking/soap/model}Segment3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetails1", propOrder = {
    "feeFreeLength",
    "feeFreeLengthPeriod",
    "monthlyMaximumCharge",
    "notes",
    "otherSegment",
    "segment"
})
public class ProductDetails1 {

    @XmlElement(name = "FeeFreeLength")
    protected BigInteger feeFreeLength;
    @XmlElement(name = "FeeFreeLengthPeriod")
    @XmlSchemaType(name = "string")
    protected FeeFreeLengthPeriod2 feeFreeLengthPeriod;
    @XmlElement(name = "MonthlyMaximumCharge")
    protected String monthlyMaximumCharge;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherSegment")
    protected OBOtherCodeType10 otherSegment;
    @XmlElement(name = "Segment")
    @XmlSchemaType(name = "string")
    protected List<Segment3> segment;

    /**
     * Gets the value of the feeFreeLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeeFreeLength() {
        return feeFreeLength;
    }

    /**
     * Sets the value of the feeFreeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeeFreeLength(BigInteger value) {
        this.feeFreeLength = value;
    }

    /**
     * Gets the value of the feeFreeLengthPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FeeFreeLengthPeriod2 }
     *     
     */
    public FeeFreeLengthPeriod2 getFeeFreeLengthPeriod() {
        return feeFreeLengthPeriod;
    }

    /**
     * Sets the value of the feeFreeLengthPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeFreeLengthPeriod2 }
     *     
     */
    public void setFeeFreeLengthPeriod(FeeFreeLengthPeriod2 value) {
        this.feeFreeLengthPeriod = value;
    }

    /**
     * Gets the value of the monthlyMaximumCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyMaximumCharge() {
        return monthlyMaximumCharge;
    }

    /**
     * Sets the value of the monthlyMaximumCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyMaximumCharge(String value) {
        this.monthlyMaximumCharge = value;
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
     * Gets the value of the otherSegment property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType10 }
     *     
     */
    public OBOtherCodeType10 getOtherSegment() {
        return otherSegment;
    }

    /**
     * Sets the value of the otherSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType10 }
     *     
     */
    public void setOtherSegment(OBOtherCodeType10 value) {
        this.otherSegment = value;
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
     * {@link Segment3 }
     * 
     * 
     */
    public List<Segment3> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment3>();
        }
        return this.segment;
    }

}
