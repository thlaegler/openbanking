
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
 * The marketing state (promotional or regular) of the CCC Product.
 * 
 * <p>Java class for CCCMarketingState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCMarketingState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoreProduct" type="{http://laegler.com/openbanking/soap/model}CoreProduct1"/&gt;
 *         &lt;element name="Eligibility" type="{http://laegler.com/openbanking/soap/model}Eligibility1"/&gt;
 *         &lt;element name="FeaturesAndBenefits" type="{http://laegler.com/openbanking/soap/model}FeaturesAndBenefits1"/&gt;
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
 *         &lt;element name="MarketingState" type="{http://laegler.com/openbanking/soap/model}MarketingState1"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherFeesCharges" type="{http://laegler.com/openbanking/soap/model}OtherFeesCharges"/&gt;
 *         &lt;element name="PredecessorID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Repayment" type="{http://laegler.com/openbanking/soap/model}Repayment" minOccurs="0"/&gt;
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
@XmlType(name = "CCCMarketingState", propOrder = {
    "coreProduct",
    "eligibility",
    "featuresAndBenefits",
    "firstMarketedDate",
    "identification",
    "lastMarketedDate",
    "marketingState",
    "notes",
    "otherFeesCharges",
    "predecessorID",
    "repayment",
    "stateTenureLength",
    "stateTenurePeriod"
})
public class CCCMarketingState {

    @XmlElement(name = "CoreProduct", required = true)
    protected CoreProduct1 coreProduct;
    @XmlElement(name = "Eligibility", required = true)
    protected Eligibility1 eligibility;
    @XmlElement(name = "FeaturesAndBenefits", required = true)
    protected FeaturesAndBenefits1 featuresAndBenefits;
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
    protected MarketingState1 marketingState;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherFeesCharges", required = true)
    protected OtherFeesCharges otherFeesCharges;
    @XmlElement(name = "PredecessorID")
    protected String predecessorID;
    @XmlElement(name = "Repayment")
    protected Repayment repayment;
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
     *     {@link CoreProduct1 }
     *     
     */
    public CoreProduct1 getCoreProduct() {
        return coreProduct;
    }

    /**
     * Sets the value of the coreProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreProduct1 }
     *     
     */
    public void setCoreProduct(CoreProduct1 value) {
        this.coreProduct = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility1 }
     *     
     */
    public Eligibility1 getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility1 }
     *     
     */
    public void setEligibility(Eligibility1 value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the featuresAndBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesAndBenefits1 }
     *     
     */
    public FeaturesAndBenefits1 getFeaturesAndBenefits() {
        return featuresAndBenefits;
    }

    /**
     * Sets the value of the featuresAndBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesAndBenefits1 }
     *     
     */
    public void setFeaturesAndBenefits(FeaturesAndBenefits1 value) {
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
     *     {@link MarketingState1 }
     *     
     */
    public MarketingState1 getMarketingState() {
        return marketingState;
    }

    /**
     * Sets the value of the marketingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingState1 }
     *     
     */
    public void setMarketingState(MarketingState1 value) {
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
     *     {@link OtherFeesCharges }
     *     
     */
    public OtherFeesCharges getOtherFeesCharges() {
        return otherFeesCharges;
    }

    /**
     * Sets the value of the otherFeesCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeesCharges }
     *     
     */
    public void setOtherFeesCharges(OtherFeesCharges value) {
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
     * @return
     *     possible object is
     *     {@link Repayment }
     *     
     */
    public Repayment getRepayment() {
        return repayment;
    }

    /**
     * Sets the value of the repayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repayment }
     *     
     */
    public void setRepayment(Repayment value) {
        this.repayment = value;
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
