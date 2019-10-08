
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the BCA product.
 * 
 * <p>Java class for Eligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eligibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgeEligibility" type="{http://laegler.com/openbanking/soap/model}AgeEligibility" minOccurs="0"/&gt;
 *         &lt;element name="CreditCheckEligibility" type="{http://laegler.com/openbanking/soap/model}CreditCheckEligibility" minOccurs="0"/&gt;
 *         &lt;element name="IDEligibility" type="{http://laegler.com/openbanking/soap/model}IDEligibility" minOccurs="0"/&gt;
 *         &lt;element name="IndustryEligibility" type="{http://laegler.com/openbanking/soap/model}IndustryEligibility" minOccurs="0"/&gt;
 *         &lt;element name="LegalStructureEligibility" type="{http://laegler.com/openbanking/soap/model}LegalStructureEligibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OfficerEligibility" type="{http://laegler.com/openbanking/soap/model}OfficerEligibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherEligibility" type="{http://laegler.com/openbanking/soap/model}OtherEligibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResidencyEligibility" type="{http://laegler.com/openbanking/soap/model}ResidencyEligibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradingHistoryEligibility" type="{http://laegler.com/openbanking/soap/model}TradingHistoryEligibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eligibility", propOrder = {
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
public class Eligibility {

    @XmlElement(name = "AgeEligibility")
    protected AgeEligibility ageEligibility;
    @XmlElement(name = "CreditCheckEligibility")
    protected CreditCheckEligibility creditCheckEligibility;
    @XmlElement(name = "IDEligibility")
    protected IDEligibility idEligibility;
    @XmlElement(name = "IndustryEligibility")
    protected IndustryEligibility industryEligibility;
    @XmlElement(name = "LegalStructureEligibility")
    protected List<LegalStructureEligibility> legalStructureEligibility;
    @XmlElement(name = "OfficerEligibility")
    protected List<OfficerEligibility> officerEligibility;
    @XmlElement(name = "OtherEligibility")
    protected List<OtherEligibility> otherEligibility;
    @XmlElement(name = "ResidencyEligibility")
    protected List<ResidencyEligibility> residencyEligibility;
    @XmlElement(name = "TradingHistoryEligibility")
    protected List<TradingHistoryEligibility> tradingHistoryEligibility;

    /**
     * Gets the value of the ageEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link AgeEligibility }
     *     
     */
    public AgeEligibility getAgeEligibility() {
        return ageEligibility;
    }

    /**
     * Sets the value of the ageEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeEligibility }
     *     
     */
    public void setAgeEligibility(AgeEligibility value) {
        this.ageEligibility = value;
    }

    /**
     * Gets the value of the creditCheckEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCheckEligibility }
     *     
     */
    public CreditCheckEligibility getCreditCheckEligibility() {
        return creditCheckEligibility;
    }

    /**
     * Sets the value of the creditCheckEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCheckEligibility }
     *     
     */
    public void setCreditCheckEligibility(CreditCheckEligibility value) {
        this.creditCheckEligibility = value;
    }

    /**
     * Gets the value of the idEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IDEligibility }
     *     
     */
    public IDEligibility getIDEligibility() {
        return idEligibility;
    }

    /**
     * Sets the value of the idEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDEligibility }
     *     
     */
    public void setIDEligibility(IDEligibility value) {
        this.idEligibility = value;
    }

    /**
     * Gets the value of the industryEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryEligibility }
     *     
     */
    public IndustryEligibility getIndustryEligibility() {
        return industryEligibility;
    }

    /**
     * Sets the value of the industryEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryEligibility }
     *     
     */
    public void setIndustryEligibility(IndustryEligibility value) {
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
     * {@link LegalStructureEligibility }
     * 
     * 
     */
    public List<LegalStructureEligibility> getLegalStructureEligibility() {
        if (legalStructureEligibility == null) {
            legalStructureEligibility = new ArrayList<LegalStructureEligibility>();
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
     * {@link OfficerEligibility }
     * 
     * 
     */
    public List<OfficerEligibility> getOfficerEligibility() {
        if (officerEligibility == null) {
            officerEligibility = new ArrayList<OfficerEligibility>();
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
     * {@link OtherEligibility }
     * 
     * 
     */
    public List<OtherEligibility> getOtherEligibility() {
        if (otherEligibility == null) {
            otherEligibility = new ArrayList<OtherEligibility>();
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
     * {@link ResidencyEligibility }
     * 
     * 
     */
    public List<ResidencyEligibility> getResidencyEligibility() {
        if (residencyEligibility == null) {
            residencyEligibility = new ArrayList<ResidencyEligibility>();
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
     * {@link TradingHistoryEligibility }
     * 
     * 
     */
    public List<TradingHistoryEligibility> getTradingHistoryEligibility() {
        if (tradingHistoryEligibility == null) {
            tradingHistoryEligibility = new ArrayList<TradingHistoryEligibility>();
        }
        return this.tradingHistoryEligibility;
    }

}
