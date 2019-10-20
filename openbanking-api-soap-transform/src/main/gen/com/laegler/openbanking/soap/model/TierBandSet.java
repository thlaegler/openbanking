
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The group of tiers or bands for which credit interest can be applied.
 * 
 * <p>Java class for TierBandSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBandSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditInterestEligibility" type="{http://laegler.com/openbanking/soap/model}CreditInterestEligibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TierBandMethod" type="{http://laegler.com/openbanking/soap/model}TierBandMethod"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBandSet", propOrder = {
    "creditInterestEligibility",
    "tierBandMethod"
})
public class TierBandSet {

    @XmlElement(name = "CreditInterestEligibility")
    protected List<CreditInterestEligibility> creditInterestEligibility;
    @XmlElement(name = "TierBandMethod", required = true)
    protected TierBandMethod tierBandMethod;

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
     * {@link CreditInterestEligibility }
     * 
     * 
     */
    public List<CreditInterestEligibility> getCreditInterestEligibility() {
        if (creditInterestEligibility == null) {
            creditInterestEligibility = new ArrayList<CreditInterestEligibility>();
        }
        return this.creditInterestEligibility;
    }

    /**
     * Gets the value of the tierBandMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TierBandMethod }
     *     
     */
    public TierBandMethod getTierBandMethod() {
        return tierBandMethod;
    }

    /**
     * Sets the value of the tierBandMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBandMethod }
     *     
     */
    public void setTierBandMethod(TierBandMethod value) {
        this.tierBandMethod = value;
    }

}
