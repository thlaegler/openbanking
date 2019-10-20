
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
 * <p>Java class for LoanInterestTierBandSet1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanInterestTierBandSet1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculationMethod" type="{http://laegler.com/openbanking/soap/model}CalculationMethod"/&gt;
 *         &lt;element name="Identification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LoanInterestFeesCharges" type="{http://laegler.com/openbanking/soap/model}LoanInterestFeesCharge2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoanInterestTierBand" type="{http://laegler.com/openbanking/soap/model}LoanInterestTierBand1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierBandMethod" type="{http://laegler.com/openbanking/soap/model}TierBandMethod11"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanInterestTierBandSet1", propOrder = {
    "calculationMethod",
    "identification",
    "loanInterestFeesCharges",
    "loanInterestTierBand",
    "notes",
    "tierBandMethod"
})
public class LoanInterestTierBandSet1 {

    @XmlElement(name = "CalculationMethod", required = true)
    @XmlSchemaType(name = "string")
    protected CalculationMethod calculationMethod;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "LoanInterestFeesCharges")
    protected List<LoanInterestFeesCharge2> loanInterestFeesCharges;
    @XmlElement(name = "LoanInterestTierBand", required = true)
    protected List<LoanInterestTierBand1> loanInterestTierBand;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "TierBandMethod", required = true)
    @XmlSchemaType(name = "string")
    protected TierBandMethod11 tierBandMethod;

    /**
     * Gets the value of the calculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethod }
     *     
     */
    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * Sets the value of the calculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethod }
     *     
     */
    public void setCalculationMethod(CalculationMethod value) {
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
     * {@link LoanInterestFeesCharge2 }
     * 
     * 
     */
    public List<LoanInterestFeesCharge2> getLoanInterestFeesCharges() {
        if (loanInterestFeesCharges == null) {
            loanInterestFeesCharges = new ArrayList<LoanInterestFeesCharge2>();
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
     * {@link LoanInterestTierBand1 }
     * 
     * 
     */
    public List<LoanInterestTierBand1> getLoanInterestTierBand() {
        if (loanInterestTierBand == null) {
            loanInterestTierBand = new ArrayList<LoanInterestTierBand1>();
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
     * Gets the value of the tierBandMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TierBandMethod11 }
     *     
     */
    public TierBandMethod11 getTierBandMethod() {
        return tierBandMethod;
    }

    /**
     * Sets the value of the tierBandMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBandMethod11 }
     *     
     */
    public void setTierBandMethod(TierBandMethod11 value) {
        this.tierBandMethod = value;
    }

}
