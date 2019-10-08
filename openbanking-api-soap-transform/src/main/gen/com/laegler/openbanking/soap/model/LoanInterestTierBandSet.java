
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The group of tiers or bands for which debit interest can be applied.
 * 
 * <p>Java class for LoanInterestTierBandSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanInterestTierBandSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculationMethod" type="{http://laegler.com/openbanking/soap/model}OB_InterestCalculationMethod1Code"/&gt;
 *         &lt;element name="Identification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LoanInterestFeesCharges" type="{http://laegler.com/openbanking/soap/model}LoanInterestFeesCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoanInterestTierBand" type="{http://laegler.com/openbanking/soap/model}LoanInterestTierBand" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherCalculationMethod" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_0" minOccurs="0"/&gt;
 *         &lt;element name="TierBandMethod" type="{http://laegler.com/openbanking/soap/model}TierBandMethod5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanInterestTierBandSet", propOrder = {
    "calculationMethod",
    "identification",
    "loanInterestFeesCharges",
    "loanInterestTierBand",
    "notes",
    "otherCalculationMethod",
    "tierBandMethod"
})
public class LoanInterestTierBandSet {

    @XmlElement(name = "CalculationMethod", required = true)
    @XmlSchemaType(name = "string")
    protected OBInterestCalculationMethod1Code calculationMethod;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "LoanInterestFeesCharges")
    protected List<LoanInterestFeesCharge> loanInterestFeesCharges;
    @XmlElement(name = "LoanInterestTierBand", required = true)
    protected List<LoanInterestTierBand> loanInterestTierBand;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherCalculationMethod")
    protected OBOtherCodeType10 otherCalculationMethod;
    @XmlElement(name = "TierBandMethod", required = true)
    @XmlSchemaType(name = "string")
    protected TierBandMethod5 tierBandMethod;

    /**
     * Gets the value of the calculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OBInterestCalculationMethod1Code }
     *     
     */
    public OBInterestCalculationMethod1Code getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * Sets the value of the calculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBInterestCalculationMethod1Code }
     *     
     */
    public void setCalculationMethod(OBInterestCalculationMethod1Code value) {
        this.calculationMethod = value;
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
     * Gets the value of the loanInterestFeesCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanInterestFeesCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanInterestFeesCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanInterestFeesCharge }
     * 
     * 
     */
    public List<LoanInterestFeesCharge> getLoanInterestFeesCharges() {
        if (loanInterestFeesCharges == null) {
            loanInterestFeesCharges = new ArrayList<LoanInterestFeesCharge>();
        }
        return this.loanInterestFeesCharges;
    }

    /**
     * Gets the value of the loanInterestTierBand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanInterestTierBand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanInterestTierBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanInterestTierBand }
     * 
     * 
     */
    public List<LoanInterestTierBand> getLoanInterestTierBand() {
        if (loanInterestTierBand == null) {
            loanInterestTierBand = new ArrayList<LoanInterestTierBand>();
        }
        return this.loanInterestTierBand;
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
     * Gets the value of the otherCalculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType10 }
     *     
     */
    public OBOtherCodeType10 getOtherCalculationMethod() {
        return otherCalculationMethod;
    }

    /**
     * Sets the value of the otherCalculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType10 }
     *     
     */
    public void setOtherCalculationMethod(OBOtherCodeType10 value) {
        this.otherCalculationMethod = value;
    }

    /**
     * Gets the value of the tierBandMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TierBandMethod5 }
     *     
     */
    public TierBandMethod5 getTierBandMethod() {
        return tierBandMethod;
    }

    /**
     * Sets the value of the tierBandMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBandMethod5 }
     *     
     */
    public void setTierBandMethod(TierBandMethod5 value) {
        this.tierBandMethod = value;
    }

}
