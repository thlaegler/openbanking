
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The marketing state (promotional or regular) of the BCA Product.
 * 
 * <p>Java class for BCAMarketingState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCAMarketingState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoreProduct" type="{http://laegler.com/openbanking/soap/model}CoreProduct" minOccurs="0"/&gt;
 *         &lt;element name="CreditInterest" type="{http://laegler.com/openbanking/soap/model}CreditInterest" minOccurs="0"/&gt;
 *         &lt;element name="Eligibility" type="{http://laegler.com/openbanking/soap/model}Eligibility" minOccurs="0"/&gt;
 *         &lt;element name="FeaturesAndBenefits" type="{http://laegler.com/openbanking/soap/model}FeaturesAndBenefits" minOccurs="0"/&gt;
 *         &lt;element name="FirstMarketedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Identification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LastMarketedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MarketingState" type="{http://laegler.com/openbanking/soap/model}MarketingState"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherFeesCharges" type="{http://laegler.com/openbanking/soap/model}OtherFeesCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Overdraft" type="{http://laegler.com/openbanking/soap/model}Overdraft" minOccurs="0"/&gt;
 *         &lt;element name="PredecessorID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StateTenureLength" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StateTenurePeriod" type="{http://laegler.com/openbanking/soap/model}StateTenurePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCAMarketingState", propOrder = {
    "coreProduct",
    "creditInterest",
    "eligibility",
    "featuresAndBenefits",
    "firstMarketedDate",
    "identification",
    "lastMarketedDate",
    "marketingState",
    "notes",
    "otherFeesCharges",
    "overdraft",
    "predecessorID",
    "stateTenureLength",
    "stateTenurePeriod"
})
public class BCAMarketingState {

    @XmlElement(name = "CoreProduct")
    protected CoreProduct coreProduct;
    @XmlElement(name = "CreditInterest")
    protected CreditInterest creditInterest;
    @XmlElement(name = "Eligibility")
    protected Eligibility eligibility;
    @XmlElement(name = "FeaturesAndBenefits")
    protected FeaturesAndBenefits featuresAndBenefits;
    @XmlElement(name = "FirstMarketedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstMarketedDate;
    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "LastMarketedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastMarketedDate;
    @XmlElement(name = "MarketingState", required = true)
    @XmlSchemaType(name = "string")
    protected MarketingState marketingState;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherFeesCharges")
    protected List<OtherFeesCharge> otherFeesCharges;
    @XmlElement(name = "Overdraft")
    protected Overdraft overdraft;
    @XmlElement(name = "PredecessorID")
    protected String predecessorID;
    @XmlElement(name = "StateTenureLength")
    protected Double stateTenureLength;
    @XmlElement(name = "StateTenurePeriod")
    @XmlSchemaType(name = "string")
    protected StateTenurePeriod stateTenurePeriod;

    /**
     * Gets the value of the coreProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CoreProduct }
     *     
     */
    public CoreProduct getCoreProduct() {
        return coreProduct;
    }

    /**
     * Sets the value of the coreProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreProduct }
     *     
     */
    public void setCoreProduct(CoreProduct value) {
        this.coreProduct = value;
    }

    /**
     * Gets the value of the creditInterest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditInterest }
     *     
     */
    public CreditInterest getCreditInterest() {
        return creditInterest;
    }

    /**
     * Sets the value of the creditInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditInterest }
     *     
     */
    public void setCreditInterest(CreditInterest value) {
        this.creditInterest = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility }
     *     
     */
    public Eligibility getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility }
     *     
     */
    public void setEligibility(Eligibility value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the featuresAndBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesAndBenefits }
     *     
     */
    public FeaturesAndBenefits getFeaturesAndBenefits() {
        return featuresAndBenefits;
    }

    /**
     * Sets the value of the featuresAndBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesAndBenefits }
     *     
     */
    public void setFeaturesAndBenefits(FeaturesAndBenefits value) {
        this.featuresAndBenefits = value;
    }

    /**
     * Gets the value of the firstMarketedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstMarketedDate() {
        return firstMarketedDate;
    }

    /**
     * Sets the value of the firstMarketedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstMarketedDate(XMLGregorianCalendar value) {
        this.firstMarketedDate = value;
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
     * Gets the value of the lastMarketedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastMarketedDate() {
        return lastMarketedDate;
    }

    /**
     * Sets the value of the lastMarketedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastMarketedDate(XMLGregorianCalendar value) {
        this.lastMarketedDate = value;
    }

    /**
     * Gets the value of the marketingState property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingState }
     *     
     */
    public MarketingState getMarketingState() {
        return marketingState;
    }

    /**
     * Sets the value of the marketingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingState }
     *     
     */
    public void setMarketingState(MarketingState value) {
        this.marketingState = value;
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
     * Gets the value of the otherFeesCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFeesCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFeesCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherFeesCharge }
     * 
     * 
     */
    public List<OtherFeesCharge> getOtherFeesCharges() {
        if (otherFeesCharges == null) {
            otherFeesCharges = new ArrayList<OtherFeesCharge>();
        }
        return this.otherFeesCharges;
    }

    /**
     * Gets the value of the overdraft property.
     * 
     * @return
     *     possible object is
     *     {@link Overdraft }
     *     
     */
    public Overdraft getOverdraft() {
        return overdraft;
    }

    /**
     * Sets the value of the overdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overdraft }
     *     
     */
    public void setOverdraft(Overdraft value) {
        this.overdraft = value;
    }

    /**
     * Gets the value of the predecessorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredecessorID() {
        return predecessorID;
    }

    /**
     * Sets the value of the predecessorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredecessorID(String value) {
        this.predecessorID = value;
    }

    /**
     * Gets the value of the stateTenureLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStateTenureLength() {
        return stateTenureLength;
    }

    /**
     * Sets the value of the stateTenureLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStateTenureLength(Double value) {
        this.stateTenureLength = value;
    }

    /**
     * Gets the value of the stateTenurePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StateTenurePeriod }
     *     
     */
    public StateTenurePeriod getStateTenurePeriod() {
        return stateTenurePeriod;
    }

    /**
     * Sets the value of the stateTenurePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTenurePeriod }
     *     
     */
    public void setStateTenurePeriod(StateTenurePeriod value) {
        this.stateTenurePeriod = value;
    }

}
