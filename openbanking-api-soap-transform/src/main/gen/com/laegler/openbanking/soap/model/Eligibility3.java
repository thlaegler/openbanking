
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eligibility details for this product i.e. the criteria that an business has to meet in order to be eligible for the SME Loan product.
 * 
 * <p>Java class for Eligibility3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eligibility3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgeEligibility" type="{http://laegler.com/openbanking/soap/model}AgeEligibility3" minOccurs="0"/&gt;
 *         &lt;element name="CreditCheckEligibility" type="{http://laegler.com/openbanking/soap/model}CreditCheckEligibility2" minOccurs="0"/&gt;
 *         &lt;element name="IDEligibility" type="{http://laegler.com/openbanking/soap/model}IDEligibility2" minOccurs="0"/&gt;
 *         &lt;element name="IndustryEligibility" type="{http://laegler.com/openbanking/soap/model}IndustryEligibility2" minOccurs="0"/&gt;
 *         &lt;element name="LegalStructureEligibility" type="{http://laegler.com/openbanking/soap/model}LegalStructureEligibility2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OfficerEligibility" type="{http://laegler.com/openbanking/soap/model}OfficerEligibility2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherEligibility" type="{http://laegler.com/openbanking/soap/model}OtherEligibility3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResidencyEligibility" type="{http://laegler.com/openbanking/soap/model}ResidencyEligibility3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradingHistoryEligibility" type="{http://laegler.com/openbanking/soap/model}TradingHistoryEligibility2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eligibility3", propOrder = {
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
public class Eligibility3 {

    @XmlElement(name = "AgeEligibility")
    protected AgeEligibility3 ageEligibility;
    @XmlElement(name = "CreditCheckEligibility")
    protected CreditCheckEligibility2 creditCheckEligibility;
    @XmlElement(name = "IDEligibility")
    protected IDEligibility2 idEligibility;
    @XmlElement(name = "IndustryEligibility")
    protected IndustryEligibility2 industryEligibility;
    @XmlElement(name = "LegalStructureEligibility")
    protected List<LegalStructureEligibility2> legalStructureEligibility;
    @XmlElement(name = "OfficerEligibility")
    protected List<OfficerEligibility2> officerEligibility;
    @XmlElement(name = "OtherEligibility")
    protected List<OtherEligibility3> otherEligibility;
    @XmlElement(name = "ResidencyEligibility")
    protected List<ResidencyEligibility3> residencyEligibility;
    @XmlElement(name = "TradingHistoryEligibility")
    protected List<TradingHistoryEligibility2> tradingHistoryEligibility;

    /**
     * Gets the value of the ageEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link AgeEligibility3 }
     *     
     */
    public AgeEligibility3 getAgeEligibility() {
        return ageEligibility;
    }

    /**
     * Sets the value of the ageEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeEligibility3 }
     *     
     */
    public void setAgeEligibility(AgeEligibility3 value) {
        this.ageEligibility = value;
    }

    /**
     * Gets the value of the creditCheckEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCheckEligibility2 }
     *     
     */
    public CreditCheckEligibility2 getCreditCheckEligibility() {
        return creditCheckEligibility;
    }

    /**
     * Sets the value of the creditCheckEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCheckEligibility2 }
     *     
     */
    public void setCreditCheckEligibility(CreditCheckEligibility2 value) {
        this.creditCheckEligibility = value;
    }

    /**
     * Gets the value of the idEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IDEligibility2 }
     *     
     */
    public IDEligibility2 getIDEligibility() {
        return idEligibility;
    }

    /**
     * Sets the value of the idEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDEligibility2 }
     *     
     */
    public void setIDEligibility(IDEligibility2 value) {
        this.idEligibility = value;
    }

    /**
     * Gets the value of the industryEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryEligibility2 }
     *     
     */
    public IndustryEligibility2 getIndustryEligibility() {
        return industryEligibility;
    }

    /**
     * Sets the value of the industryEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryEligibility2 }
     *     
     */
    public void setIndustryEligibility(IndustryEligibility2 value) {
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
     * {@link LegalStructureEligibility2 }
     * 
     * 
     */
    public List<LegalStructureEligibility2> getLegalStructureEligibility() {
        if (legalStructureEligibility == null) {
            legalStructureEligibility = new ArrayList<LegalStructureEligibility2>();
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
     * {@link OfficerEligibility2 }
     * 
     * 
     */
    public List<OfficerEligibility2> getOfficerEligibility() {
        if (officerEligibility == null) {
            officerEligibility = new ArrayList<OfficerEligibility2>();
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
     * {@link OtherEligibility3 }
     * 
     * 
     */
    public List<OtherEligibility3> getOtherEligibility() {
        if (otherEligibility == null) {
            otherEligibility = new ArrayList<OtherEligibility3>();
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
     * {@link ResidencyEligibility3 }
     * 
     * 
     */
    public List<ResidencyEligibility3> getResidencyEligibility() {
        if (residencyEligibility == null) {
            residencyEligibility = new ArrayList<ResidencyEligibility3>();
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
     * {@link TradingHistoryEligibility2 }
     * 
     * 
     */
    public List<TradingHistoryEligibility2> getTradingHistoryEligibility() {
        if (tradingHistoryEligibility == null) {
            tradingHistoryEligibility = new ArrayList<TradingHistoryEligibility2>();
        }
        return this.tradingHistoryEligibility;
    }

}
