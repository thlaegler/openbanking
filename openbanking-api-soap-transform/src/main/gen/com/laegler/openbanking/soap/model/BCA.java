
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * BCA means a Business Current Account.
 * 
 * <p>Java class for BCA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BCAMarketingState" type="{http://laegler.com/openbanking/soap/model}BCAMarketingState" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FeeFreeLength" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeFreeLengthPeriod" type="{http://laegler.com/openbanking/soap/model}FeeFreeLengthPeriod" minOccurs="0"/&gt;
 *         &lt;element name="Identification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
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
 *         &lt;element name="OnSaleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OtherSegment" type="{http://laegler.com/openbanking/soap/model}OtherSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Segment" type="{http://laegler.com/openbanking/soap/model}Segment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCA", propOrder = {
    "bcaMarketingState",
    "feeFreeLength",
    "feeFreeLengthPeriod",
    "identification",
    "name",
    "notes",
    "onSaleIndicator",
    "otherSegment",
    "segment"
})
public class BCA {

    @XmlElement(name = "BCAMarketingState", required = true)
    protected List<BCAMarketingState> bcaMarketingState;
    @XmlElement(name = "FeeFreeLength")
    protected Double feeFreeLength;
    @XmlElement(name = "FeeFreeLengthPeriod")
    @XmlSchemaType(name = "string")
    protected FeeFreeLengthPeriod feeFreeLengthPeriod;
    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OnSaleIndicator")
    protected Boolean onSaleIndicator;
    @XmlElement(name = "OtherSegment")
    protected List<OtherSegment> otherSegment;
    @XmlElement(name = "Segment")
    @XmlSchemaType(name = "string")
    protected List<Segment> segment;

    /**
     * Gets the value of the bcaMarketingState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcaMarketingState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCAMarketingState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCAMarketingState }
     * 
     * 
     */
    public List<BCAMarketingState> getBCAMarketingState() {
        if (bcaMarketingState == null) {
            bcaMarketingState = new ArrayList<BCAMarketingState>();
        }
        return this.bcaMarketingState;
    }

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
     *     {@link FeeFreeLengthPeriod }
     *     
     */
    public FeeFreeLengthPeriod getFeeFreeLengthPeriod() {
        return feeFreeLengthPeriod;
    }

    /**
     * Sets the value of the feeFreeLengthPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeFreeLengthPeriod }
     *     
     */
    public void setFeeFreeLengthPeriod(FeeFreeLengthPeriod value) {
        this.feeFreeLengthPeriod = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the onSaleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnSaleIndicator() {
        return onSaleIndicator;
    }

    /**
     * Sets the value of the onSaleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnSaleIndicator(Boolean value) {
        this.onSaleIndicator = value;
    }

    /**
     * Gets the value of the otherSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherSegment }
     * 
     * 
     */
    public List<OtherSegment> getOtherSegment() {
        if (otherSegment == null) {
            otherSegment = new ArrayList<OtherSegment>();
        }
        return this.otherSegment;
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
     * {@link Segment }
     * 
     * 
     */
    public List<Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment>();
        }
        return this.segment;
    }

}
