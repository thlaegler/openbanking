
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
 * The marketing state (promotional or regular) of the SME Loan Product.
 * 
 * <p>Java class for SMELoanMarketingState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMELoanMarketingState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoreProduct" type="{http://laegler.com/openbanking/soap/model}CoreProduct3"/&gt;
 *         &lt;element name="Eligibility" type="{http://laegler.com/openbanking/soap/model}Eligibility3"/&gt;
 *         &lt;element name="FeaturesAndBenefits" type="{http://laegler.com/openbanking/soap/model}FeaturesAndBenefits3"/&gt;
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
 *         &lt;element name="LoanInterest" type="{http://laegler.com/openbanking/soap/model}LoanInterest1"/&gt;
 *         &lt;element name="MarketingState" type="{http://laegler.com/openbanking/soap/model}MarketingState3"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherFeesCharges" type="{http://laegler.com/openbanking/soap/model}OtherFeesCharges5" minOccurs="0"/&gt;
 *         &lt;element name="PredecessorID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Repayment" type="{http://laegler.com/openbanking/soap/model}Repayment2" maxOccurs="unbounded"/&gt;
 *         &lt;element name="StateTenureLength" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StateTenurePeriod" type="{http://laegler.com/openbanking/soap/model}StateTenurePeriod1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMELoanMarketingState", propOrder = {
    "coreProduct",
    "eligibility",
    "featuresAndBenefits",
    "firstMarketedDate",
    "identification",
    "lastMarketedDate",
    "loanInterest",
    "marketingState",
    "notes",
    "otherFeesCharges",
    "predecessorID",
    "repayment",
    "stateTenureLength",
    "stateTenurePeriod"
})
public class SMELoanMarketingState {

    @XmlElement(name = "CoreProduct", required = true)
    protected CoreProduct3 coreProduct;
    @XmlElement(name = "Eligibility", required = true)
    protected Eligibility3 eligibility;
    @XmlElement(name = "FeaturesAndBenefits", required = true)
    protected FeaturesAndBenefits3 featuresAndBenefits;
    @XmlElement(name = "FirstMarketedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstMarketedDate;
    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "LastMarketedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastMarketedDate;
    @XmlElement(name = "LoanInterest", required = true)
    protected LoanInterest1 loanInterest;
    @XmlElement(name = "MarketingState", required = true)
    @XmlSchemaType(name = "string")
    protected MarketingState3 marketingState;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherFeesCharges")
    protected OtherFeesCharges5 otherFeesCharges;
    @XmlElement(name = "PredecessorID")
    protected String predecessorID;
    @XmlElement(name = "Repayment", required = true)
    protected List<Repayment2> repayment;
    @XmlElement(name = "StateTenureLength")
    protected Double stateTenureLength;
    @XmlElement(name = "StateTenurePeriod")
    @XmlSchemaType(name = "string")
    protected StateTenurePeriod1 stateTenurePeriod;

    /**
     * Gets the value of the coreProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CoreProduct3 }
     *     
     */
    public CoreProduct3 getCoreProduct() {
        return coreProduct;
    }

    /**
     * Sets the value of the coreProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreProduct3 }
     *     
     */
    public void setCoreProduct(CoreProduct3 value) {
        this.coreProduct = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility3 }
     *     
     */
    public Eligibility3 getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility3 }
     *     
     */
    public void setEligibility(Eligibility3 value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the featuresAndBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesAndBenefits3 }
     *     
     */
    public FeaturesAndBenefits3 getFeaturesAndBenefits() {
        return featuresAndBenefits;
    }

    /**
     * Sets the value of the featuresAndBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesAndBenefits3 }
     *     
     */
    public void setFeaturesAndBenefits(FeaturesAndBenefits3 value) {
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
     * Gets the value of the loanInterest property.
     * 
     * @return
     *     possible object is
     *     {@link LoanInterest1 }
     *     
     */
    public LoanInterest1 getLoanInterest() {
        return loanInterest;
    }

    /**
     * Sets the value of the loanInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanInterest1 }
     *     
     */
    public void setLoanInterest(LoanInterest1 value) {
        this.loanInterest = value;
    }

    /**
     * Gets the value of the marketingState property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingState3 }
     *     
     */
    public MarketingState3 getMarketingState() {
        return marketingState;
    }

    /**
     * Sets the value of the marketingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingState3 }
     *     
     */
    public void setMarketingState(MarketingState3 value) {
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
     * @return
     *     possible object is
     *     {@link OtherFeesCharges5 }
     *     
     */
    public OtherFeesCharges5 getOtherFeesCharges() {
        return otherFeesCharges;
    }

    /**
     * Sets the value of the otherFeesCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeesCharges5 }
     *     
     */
    public void setOtherFeesCharges(OtherFeesCharges5 value) {
        this.otherFeesCharges = value;
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
     * Gets the value of the repayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Repayment2 }
     * 
     * 
     */
    public List<Repayment2> getRepayment() {
        if (repayment == null) {
            repayment = new ArrayList<Repayment2>();
        }
        return this.repayment;
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
     *     {@link StateTenurePeriod1 }
     *     
     */
    public StateTenurePeriod1 getStateTenurePeriod() {
        return stateTenurePeriod;
    }

    /**
     * Sets the value of the stateTenurePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTenurePeriod1 }
     *     
     */
    public void setStateTenurePeriod(StateTenurePeriod1 value) {
        this.stateTenurePeriod = value;
    }

}
