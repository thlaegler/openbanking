
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 * 
 * <p>Java class for FeeChargeCap9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeChargeCap9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CappingPeriod" type="{http://laegler.com/openbanking/soap/model}CappingPeriod5" minOccurs="0"/&gt;
 *         &lt;element name="FeeCapAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeCapOccurrence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeType" type="{http://laegler.com/openbanking/soap/model}FeeType47" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MinMaxType" type="{http://laegler.com/openbanking/soap/model}MinMaxType"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherFeeType" type="{http://laegler.com/openbanking/soap/model}OtherFeeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeChargeCap9", propOrder = {
    "cappingPeriod",
    "feeCapAmount",
    "feeCapOccurrence",
    "feeType",
    "minMaxType",
    "notes",
    "otherFeeType"
})
public class FeeChargeCap9 {

    @XmlElement(name = "CappingPeriod")
    @XmlSchemaType(name = "string")
    protected CappingPeriod5 cappingPeriod;
    @XmlElement(name = "FeeCapAmount")
    protected String feeCapAmount;
    @XmlElement(name = "FeeCapOccurrence")
    protected Double feeCapOccurrence;
    @XmlElement(name = "FeeType", required = true)
    @XmlSchemaType(name = "string")
    protected List<FeeType47> feeType;
    @XmlElement(name = "MinMaxType", required = true)
    @XmlSchemaType(name = "string")
    protected MinMaxType minMaxType;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherFeeType")
    protected List<OtherFeeType> otherFeeType;

    /**
     * Gets the value of the cappingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CappingPeriod5 }
     *     
     */
    public CappingPeriod5 getCappingPeriod() {
        return cappingPeriod;
    }

    /**
     * Sets the value of the cappingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CappingPeriod5 }
     *     
     */
    public void setCappingPeriod(CappingPeriod5 value) {
        this.cappingPeriod = value;
    }

    /**
     * Gets the value of the feeCapAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    /**
     * Sets the value of the feeCapAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCapAmount(String value) {
        this.feeCapAmount = value;
    }

    /**
     * Gets the value of the feeCapOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    /**
     * Sets the value of the feeCapOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFeeCapOccurrence(Double value) {
        this.feeCapOccurrence = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType47 }
     * 
     * 
     */
    public List<FeeType47> getFeeType() {
        if (feeType == null) {
            feeType = new ArrayList<FeeType47>();
        }
        return this.feeType;
    }

    /**
     * Gets the value of the minMaxType property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxType }
     *     
     */
    public MinMaxType getMinMaxType() {
        return minMaxType;
    }

    /**
     * Sets the value of the minMaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxType }
     *     
     */
    public void setMinMaxType(MinMaxType value) {
        this.minMaxType = value;
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
     * Gets the value of the otherFeeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFeeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFeeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherFeeType }
     * 
     * 
     */
    public List<OtherFeeType> getOtherFeeType() {
        if (otherFeeType == null) {
            otherFeeType = new ArrayList<OtherFeeType>();
        }
        return this.otherFeeType;
    }

}
