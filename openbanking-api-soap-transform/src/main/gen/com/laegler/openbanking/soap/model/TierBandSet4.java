
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The group of tiers or bands for which credit interest can be applied.
 * 
 * <p>Java class for TierBandSet4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBandSet4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculationMethod" type="{http://laegler.com/openbanking/soap/model}CalculationMethod" minOccurs="0"/&gt;
 *         &lt;element name="CreditInterestEligibility" type="{http://laegler.com/openbanking/soap/model}CreditInterestEligibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://laegler.com/openbanking/soap/model}Destination3" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierBand" type="{http://laegler.com/openbanking/soap/model}TierBand4" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TierBandMethod" type="{http://laegler.com/openbanking/soap/model}TierBandMethod9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBandSet4", propOrder = {
    "calculationMethod",
    "creditInterestEligibility",
    "destination",
    "notes",
    "tierBand",
    "tierBandMethod"
})
public class TierBandSet4 {

    @XmlElement(name = "CalculationMethod")
    @XmlSchemaType(name = "string")
    protected CalculationMethod calculationMethod;
    @XmlElement(name = "CreditInterestEligibility")
    protected List<CreditInterestEligibility1> creditInterestEligibility;
    @XmlElement(name = "Destination")
    @XmlSchemaType(name = "string")
    protected Destination3 destination;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "TierBand", required = true)
    protected List<TierBand4> tierBand;
    @XmlElement(name = "TierBandMethod", required = true)
    @XmlSchemaType(name = "string")
    protected TierBandMethod9 tierBandMethod;

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
     * Gets the value of the creditInterestEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditInterestEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditInterestEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditInterestEligibility1 }
     * 
     * 
     */
    public List<CreditInterestEligibility1> getCreditInterestEligibility() {
        if (creditInterestEligibility == null) {
            creditInterestEligibility = new ArrayList<CreditInterestEligibility1>();
        }
        return this.creditInterestEligibility;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination3 }
     *     
     */
    public Destination3 getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination3 }
     *     
     */
    public void setDestination(Destination3 value) {
        this.destination = value;
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
     * Gets the value of the tierBand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tierBand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TierBand4 }
     * 
     * 
     */
    public List<TierBand4> getTierBand() {
        if (tierBand == null) {
            tierBand = new ArrayList<TierBand4>();
        }
        return this.tierBand;
    }

    /**
     * Gets the value of the tierBandMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TierBandMethod9 }
     *     
     */
    public TierBandMethod9 getTierBandMethod() {
        return tierBandMethod;
    }

    /**
     * Sets the value of the tierBandMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBandMethod9 }
     *     
     */
    public void setTierBandMethod(TierBandMethod9 value) {
        this.tierBandMethod = value;
    }

}
