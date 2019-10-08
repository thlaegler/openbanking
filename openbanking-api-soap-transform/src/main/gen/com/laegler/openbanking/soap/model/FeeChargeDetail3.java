
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
 * <p>Java class for FeeChargeDetail3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeChargeDetail3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_FeeFrequency1Code_2"/&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_FeeFrequency1Code_3" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeApplicableRange" type="{http://laegler.com/openbanking/soap/model}FeeApplicableRange3" minOccurs="0"/&gt;
 *         &lt;element name="FeeCategory" type="{http://laegler.com/openbanking/soap/model}OB_FeeCategory1Code"/&gt;
 *         &lt;element name="FeeChargeCap" type="{http://laegler.com/openbanking/soap/model}FeeChargeCap4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeRateType" type="{http://laegler.com/openbanking/soap/model}OB_InterestRateType1Code_1" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://laegler.com/openbanking/soap/model}OB_FeeType1Code"/&gt;
 *         &lt;element name="NegotiableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_6" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_7" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeCategoryType" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_0" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeRateType" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_8" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeType" type="{http://laegler.com/openbanking/soap/model}OB_OtherFeeChargeDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeChargeDetail3", propOrder = {
    "applicationFrequency",
    "calculationFrequency",
    "feeAmount",
    "feeApplicableRange",
    "feeCategory",
    "feeChargeCap",
    "feeRate",
    "feeRateType",
    "feeType",
    "negotiableIndicator",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherFeeCategoryType",
    "otherFeeRateType",
    "otherFeeType"
})
public class FeeChargeDetail3 {

    @XmlElement(name = "ApplicationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected OBFeeFrequency1Code2 applicationFrequency;
    @XmlElement(name = "CalculationFrequency")
    @XmlSchemaType(name = "string")
    protected OBFeeFrequency1Code3 calculationFrequency;
    @XmlElement(name = "FeeAmount")
    protected String feeAmount;
    @XmlElement(name = "FeeApplicableRange")
    protected FeeApplicableRange3 feeApplicableRange;
    @XmlElement(name = "FeeCategory", required = true)
    @XmlSchemaType(name = "string")
    protected OBFeeCategory1Code feeCategory;
    @XmlElement(name = "FeeChargeCap")
    protected List<FeeChargeCap4> feeChargeCap;
    @XmlElement(name = "FeeRate")
    protected String feeRate;
    @XmlElement(name = "FeeRateType")
    @XmlSchemaType(name = "string")
    protected OBInterestRateType1Code1 feeRateType;
    @XmlElement(name = "FeeType", required = true)
    @XmlSchemaType(name = "string")
    protected OBFeeType1Code feeType;
    @XmlElement(name = "NegotiableIndicator")
    protected Boolean negotiableIndicator;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OBOtherCodeType16 otherApplicationFrequency;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OBOtherCodeType17 otherCalculationFrequency;
    @XmlElement(name = "OtherFeeCategoryType")
    protected OBOtherCodeType10 otherFeeCategoryType;
    @XmlElement(name = "OtherFeeRateType")
    protected OBOtherCodeType18 otherFeeRateType;
    @XmlElement(name = "OtherFeeType")
    protected OBOtherFeeChargeDetailType otherFeeType;

    /**
     * Gets the value of the applicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OBFeeFrequency1Code2 }
     *     
     */
    public OBFeeFrequency1Code2 getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBFeeFrequency1Code2 }
     *     
     */
    public void setApplicationFrequency(OBFeeFrequency1Code2 value) {
        this.applicationFrequency = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OBFeeFrequency1Code3 }
     *     
     */
    public OBFeeFrequency1Code3 getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBFeeFrequency1Code3 }
     *     
     */
    public void setCalculationFrequency(OBFeeFrequency1Code3 value) {
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
     *     {@link FeeApplicableRange3 }
     *     
     */
    public FeeApplicableRange3 getFeeApplicableRange() {
        return feeApplicableRange;
    }

    /**
     * Sets the value of the feeApplicableRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplicableRange3 }
     *     
     */
    public void setFeeApplicableRange(FeeApplicableRange3 value) {
        this.feeApplicableRange = value;
    }

    /**
     * Gets the value of the feeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link OBFeeCategory1Code }
     *     
     */
    public OBFeeCategory1Code getFeeCategory() {
        return feeCategory;
    }

    /**
     * Sets the value of the feeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBFeeCategory1Code }
     *     
     */
    public void setFeeCategory(OBFeeCategory1Code value) {
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
     * {@link FeeChargeCap4 }
     * 
     * 
     */
    public List<FeeChargeCap4> getFeeChargeCap() {
        if (feeChargeCap == null) {
            feeChargeCap = new ArrayList<FeeChargeCap4>();
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
     *     {@link OBInterestRateType1Code1 }
     *     
     */
    public OBInterestRateType1Code1 getFeeRateType() {
        return feeRateType;
    }

    /**
     * Sets the value of the feeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBInterestRateType1Code1 }
     *     
     */
    public void setFeeRateType(OBInterestRateType1Code1 value) {
        this.feeRateType = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link OBFeeType1Code }
     *     
     */
    public OBFeeType1Code getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBFeeType1Code }
     *     
     */
    public void setFeeType(OBFeeType1Code value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the negotiableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiableIndicator() {
        return negotiableIndicator;
    }

    /**
     * Sets the value of the negotiableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiableIndicator(Boolean value) {
        this.negotiableIndicator = value;
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
     *     {@link OBOtherCodeType16 }
     *     
     */
    public OBOtherCodeType16 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    /**
     * Sets the value of the otherApplicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType16 }
     *     
     */
    public void setOtherApplicationFrequency(OBOtherCodeType16 value) {
        this.otherApplicationFrequency = value;
    }

    /**
     * Gets the value of the otherCalculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType17 }
     *     
     */
    public OBOtherCodeType17 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    /**
     * Sets the value of the otherCalculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType17 }
     *     
     */
    public void setOtherCalculationFrequency(OBOtherCodeType17 value) {
        this.otherCalculationFrequency = value;
    }

    /**
     * Gets the value of the otherFeeCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType10 }
     *     
     */
    public OBOtherCodeType10 getOtherFeeCategoryType() {
        return otherFeeCategoryType;
    }

    /**
     * Sets the value of the otherFeeCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType10 }
     *     
     */
    public void setOtherFeeCategoryType(OBOtherCodeType10 value) {
        this.otherFeeCategoryType = value;
    }

    /**
     * Gets the value of the otherFeeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType18 }
     *     
     */
    public OBOtherCodeType18 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    /**
     * Sets the value of the otherFeeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType18 }
     *     
     */
    public void setOtherFeeRateType(OBOtherCodeType18 value) {
        this.otherFeeRateType = value;
    }

    /**
     * Gets the value of the otherFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherFeeChargeDetailType }
     *     
     */
    public OBOtherFeeChargeDetailType getOtherFeeType() {
        return otherFeeType;
    }

    /**
     * Sets the value of the otherFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherFeeChargeDetailType }
     *     
     */
    public void setOtherFeeType(OBOtherFeeChargeDetailType value) {
        this.otherFeeType = value;
    }

}
