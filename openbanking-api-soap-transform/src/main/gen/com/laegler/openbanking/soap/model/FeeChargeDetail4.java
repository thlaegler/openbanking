
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Other fees/charges details
 * 
 * <p>Java class for FeeChargeDetail4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeChargeDetail4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}ApplicationFrequency13"/&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}CalculationFrequency13" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeApplicableRange" type="{http://laegler.com/openbanking/soap/model}FeeApplicableRange" minOccurs="0"/&gt;
 *         &lt;element name="FeeCategory" type="{http://laegler.com/openbanking/soap/model}FeeCategory5"/&gt;
 *         &lt;element name="FeeChargeCap" type="{http://laegler.com/openbanking/soap/model}FeeChargeCap6" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeRateType" type="{http://laegler.com/openbanking/soap/model}FeeRateType8" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://laegler.com/openbanking/soap/model}FeeType32"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherApplicationFrequency2" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherCalculationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeCategoryType" type="{http://laegler.com/openbanking/soap/model}OtherFeeCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeRateType" type="{http://laegler.com/openbanking/soap/model}OtherFeeRateType" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeType" type="{http://laegler.com/openbanking/soap/model}OtherFeeType14" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeChargeDetail4", propOrder = {
    "applicationFrequency",
    "calculationFrequency",
    "feeAmount",
    "feeApplicableRange",
    "feeCategory",
    "feeChargeCap",
    "feeRate",
    "feeRateType",
    "feeType",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherFeeCategoryType",
    "otherFeeRateType",
    "otherFeeType"
})
public class FeeChargeDetail4 {

    @XmlElement(name = "ApplicationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected ApplicationFrequency13 applicationFrequency;
    @XmlElement(name = "CalculationFrequency")
    @XmlSchemaType(name = "string")
    protected CalculationFrequency13 calculationFrequency;
    @XmlElement(name = "FeeAmount")
    protected String feeAmount;
    @XmlElement(name = "FeeApplicableRange")
    protected FeeApplicableRange feeApplicableRange;
    @XmlElement(name = "FeeCategory", required = true)
    @XmlSchemaType(name = "string")
    protected FeeCategory5 feeCategory;
    @XmlElement(name = "FeeChargeCap")
    protected List<FeeChargeCap6> feeChargeCap;
    @XmlElement(name = "FeeRate")
    protected String feeRate;
    @XmlElement(name = "FeeRateType")
    @XmlSchemaType(name = "string")
    protected FeeRateType8 feeRateType;
    @XmlElement(name = "FeeType", required = true)
    @XmlSchemaType(name = "string")
    protected FeeType32 feeType;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OtherApplicationFrequency2 otherApplicationFrequency;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OtherCalculationFrequency otherCalculationFrequency;
    @XmlElement(name = "OtherFeeCategoryType")
    protected OtherFeeCategoryType otherFeeCategoryType;
    @XmlElement(name = "OtherFeeRateType")
    protected OtherFeeRateType otherFeeRateType;
    @XmlElement(name = "OtherFeeType")
    protected OtherFeeType14 otherFeeType;

    /**
     * Gets the value of the applicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationFrequency13 }
     *     
     */
    public ApplicationFrequency13 getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationFrequency13 }
     *     
     */
    public void setApplicationFrequency(ApplicationFrequency13 value) {
        this.applicationFrequency = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationFrequency13 }
     *     
     */
    public CalculationFrequency13 getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationFrequency13 }
     *     
     */
    public void setCalculationFrequency(CalculationFrequency13 value) {
        this.calculationFrequency = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAmount(String value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeApplicableRange property.
     * 
     * @return
     *     possible object is
     *     {@link FeeApplicableRange }
     *     
     */
    public FeeApplicableRange getFeeApplicableRange() {
        return feeApplicableRange;
    }

    /**
     * Sets the value of the feeApplicableRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplicableRange }
     *     
     */
    public void setFeeApplicableRange(FeeApplicableRange value) {
        this.feeApplicableRange = value;
    }

    /**
     * Gets the value of the feeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCategory5 }
     *     
     */
    public FeeCategory5 getFeeCategory() {
        return feeCategory;
    }

    /**
     * Sets the value of the feeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCategory5 }
     *     
     */
    public void setFeeCategory(FeeCategory5 value) {
        this.feeCategory = value;
    }

    /**
     * Gets the value of the feeChargeCap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeChargeCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeChargeCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeChargeCap6 }
     * 
     * 
     */
    public List<FeeChargeCap6> getFeeChargeCap() {
        if (feeChargeCap == null) {
            feeChargeCap = new ArrayList<FeeChargeCap6>();
        }
        return this.feeChargeCap;
    }

    /**
     * Gets the value of the feeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeRate() {
        return feeRate;
    }

    /**
     * Sets the value of the feeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeRate(String value) {
        this.feeRate = value;
    }

    /**
     * Gets the value of the feeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeRateType8 }
     *     
     */
    public FeeRateType8 getFeeRateType() {
        return feeRateType;
    }

    /**
     * Sets the value of the feeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeRateType8 }
     *     
     */
    public void setFeeRateType(FeeRateType8 value) {
        this.feeRateType = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType32 }
     *     
     */
    public FeeType32 getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType32 }
     *     
     */
    public void setFeeType(FeeType32 value) {
        this.feeType = value;
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
     * Gets the value of the otherApplicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherApplicationFrequency2 }
     *     
     */
    public OtherApplicationFrequency2 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    /**
     * Sets the value of the otherApplicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherApplicationFrequency2 }
     *     
     */
    public void setOtherApplicationFrequency(OtherApplicationFrequency2 value) {
        this.otherApplicationFrequency = value;
    }

    /**
     * Gets the value of the otherCalculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCalculationFrequency }
     *     
     */
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    /**
     * Sets the value of the otherCalculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCalculationFrequency }
     *     
     */
    public void setOtherCalculationFrequency(OtherCalculationFrequency value) {
        this.otherCalculationFrequency = value;
    }

    /**
     * Gets the value of the otherFeeCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeCategoryType }
     *     
     */
    public OtherFeeCategoryType getOtherFeeCategoryType() {
        return otherFeeCategoryType;
    }

    /**
     * Sets the value of the otherFeeCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeCategoryType }
     *     
     */
    public void setOtherFeeCategoryType(OtherFeeCategoryType value) {
        this.otherFeeCategoryType = value;
    }

    /**
     * Gets the value of the otherFeeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeRateType }
     *     
     */
    public OtherFeeRateType getOtherFeeRateType() {
        return otherFeeRateType;
    }

    /**
     * Sets the value of the otherFeeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeRateType }
     *     
     */
    public void setOtherFeeRateType(OtherFeeRateType value) {
        this.otherFeeRateType = value;
    }

    /**
     * Gets the value of the otherFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeType14 }
     *     
     */
    public OtherFeeType14 getOtherFeeType() {
        return otherFeeType;
    }

    /**
     * Sets the value of the otherFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeType14 }
     *     
     */
    public void setOtherFeeType(OtherFeeType14 value) {
        this.otherFeeType = value;
    }

}
