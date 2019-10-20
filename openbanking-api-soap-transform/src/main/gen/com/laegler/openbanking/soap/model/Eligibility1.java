
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the CCC product.
 * 
 * <p>Java class for Eligibility1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eligibility1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgeEligibility" type="{http://laegler.com/openbanking/soap/model}AgeEligibility1" minOccurs="0"/&gt;
 *         &lt;element name="CreditCheckEligibility" type="{http://laegler.com/openbanking/soap/model}CreditCheckEligibility1" minOccurs="0"/&gt;
 *         &lt;element name="IDEligibility" type="{http://laegler.com/openbanking/soap/model}IDEligibility1" minOccurs="0"/&gt;
 *         &lt;element name="IndustryEligibility" type="{http://laegler.com/openbanking/soap/model}IndustryEligibility1" minOccurs="0"/&gt;
 *         &lt;element name="LegalStructureEligibility" type="{http://laegler.com/openbanking/soap/model}LegalStructureEligibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OfficerEligibility" type="{http://laegler.com/openbanking/soap/model}OfficerEligibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherEligibility" type="{http://laegler.com/openbanking/soap/model}OtherEligibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResidencyEligibility" type="{http://laegler.com/openbanking/soap/model}ResidencyEligibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradingHistoryEligibility" type="{http://laegler.com/openbanking/soap/model}TradingHistoryEligibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eligibility1", propOrder = {
    "ageEligibility",
    "creditCheckEligibility",
    "idEligibility",
    "industryEligibility",
    "legalStructureEligibility",
    "officerEligibility",
    "otherEligibility",
    "residencyEligibility",
    "tradingHistoryEligibility"
})
public class Eligibility1 {

    @XmlElement(name = "AgeEligibility")
    protected AgeEligibility1 ageEligibility;
    @XmlElement(name = "CreditCheckEligibility")
    protected CreditCheckEligibility1 creditCheckEligibility;
    @XmlElement(name = "IDEligibility")
    protected IDEligibility1 idEligibility;
    @XmlElement(name = "IndustryEligibility")
    protected IndustryEligibility1 industryEligibility;
    @XmlElement(name = "LegalStructureEligibility")
    protected List<LegalStructureEligibility1> legalStructureEligibility;
    @XmlElement(name = "OfficerEligibility")
    protected List<OfficerEligibility1> officerEligibility;
    @XmlElement(name = "OtherEligibility")
    protected List<OtherEligibility1> otherEligibility;
    @XmlElement(name = "ResidencyEligibility")
    protected List<ResidencyEligibility1> residencyEligibility;
    @XmlElement(name = "TradingHistoryEligibility")
    protected List<TradingHistoryEligibility1> tradingHistoryEligibility;

    /**
     * Gets the value of the ageEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link AgeEligibility1 }
     *     
     */
    public AgeEligibility1 getAgeEligibility() {
        return ageEligibility;
    }

    /**
     * Sets the value of the ageEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeEligibility1 }
     *     
     */
    public void setAgeEligibility(AgeEligibility1 value) {
        this.ageEligibility = value;
    }

    /**
     * Gets the value of the creditCheckEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCheckEligibility1 }
     *     
     */
    public CreditCheckEligibility1 getCreditCheckEligibility() {
        return creditCheckEligibility;
    }

    /**
     * Sets the value of the creditCheckEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCheckEligibility1 }
     *     
     */
    public void setCreditCheckEligibility(CreditCheckEligibility1 value) {
        this.creditCheckEligibility = value;
    }

    /**
     * Gets the value of the idEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IDEligibility1 }
     *     
     */
    public IDEligibility1 getIDEligibility() {
        return idEligibility;
    }

    /**
     * Sets the value of the idEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDEligibility1 }
     *     
     */
    public void setIDEligibility(IDEligibility1 value) {
        this.idEligibility = value;
    }

    /**
     * Gets the value of the industryEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryEligibility1 }
     *     
     */
    public IndustryEligibility1 getIndustryEligibility() {
        return industryEligibility;
    }

    /**
     * Sets the value of the industryEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryEligibility1 }
     *     
     */
    public void setIndustryEligibility(IndustryEligibility1 value) {
        this.industryEligibility = value;
    }

    /**
     * Gets the value of the legalStructureEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalStructureEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalStructureEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalStructureEligibility1 }
     * 
     * 
     */
    public List<LegalStructureEligibility1> getLegalStructureEligibility() {
        if (legalStructureEligibility == null) {
            legalStructureEligibility = new ArrayList<LegalStructureEligibility1>();
        }
        return this.legalStructureEligibility;
    }

    /**
     * Gets the value of the officerEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officerEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficerEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfficerEligibility1 }
     * 
     * 
     */
    public List<OfficerEligibility1> getOfficerEligibility() {
        if (officerEligibility == null) {
            officerEligibility = new ArrayList<OfficerEligibility1>();
        }
        return this.officerEligibility;
    }

    /**
     * Gets the value of the otherEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherEligibility1 }
     * 
     * 
     */
    public List<OtherEligibility1> getOtherEligibility() {
        if (otherEligibility == null) {
            otherEligibility = new ArrayList<OtherEligibility1>();
        }
        return this.otherEligibility;
    }

    /**
     * Gets the value of the residencyEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residencyEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResidencyEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidencyEligibility1 }
     * 
     * 
     */
    public List<ResidencyEligibility1> getResidencyEligibility() {
        if (residencyEligibility == null) {
            residencyEligibility = new ArrayList<ResidencyEligibility1>();
        }
        return this.residencyEligibility;
    }

    /**
     * Gets the value of the tradingHistoryEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingHistoryEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingHistoryEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingHistoryEligibility1 }
     * 
     * 
     */
    public List<TradingHistoryEligibility1> getTradingHistoryEligibility() {
        if (tradingHistoryEligibility == null) {
            tradingHistoryEligibility = new ArrayList<TradingHistoryEligibility1>();
        }
        return this.tradingHistoryEligibility;
    }

}
