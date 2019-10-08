
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Tier band set details
 * 
 * <p>Java class for OverdraftTierBandSet4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdraftTierBandSet4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorisedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BufferAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Identification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MinimumArrangedOverdraftAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverdraftFeesCharges" type="{http://laegler.com/openbanking/soap/model}OverdraftFeesCharge8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftTierBand" type="{http://laegler.com/openbanking/soap/model}OverdraftTierBand4" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OverdraftType" type="{http://laegler.com/openbanking/soap/model}OverdraftType3" minOccurs="0"/&gt;
 *         &lt;element name="TierBandMethod" type="{http://laegler.com/openbanking/soap/model}TierBandMethod10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdraftTierBandSet4", propOrder = {
    "authorisedIndicator",
    "bufferAmount",
    "identification",
    "minimumArrangedOverdraftAmount",
    "notes",
    "overdraftFeesCharges",
    "overdraftTierBand",
    "overdraftType",
    "tierBandMethod"
})
public class OverdraftTierBandSet4 {

    @XmlElement(name = "AuthorisedIndicator")
    protected Boolean authorisedIndicator;
    @XmlElement(name = "BufferAmount")
    protected String bufferAmount;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "MinimumArrangedOverdraftAmount")
    protected String minimumArrangedOverdraftAmount;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OverdraftFeesCharges")
    protected List<OverdraftFeesCharge8> overdraftFeesCharges;
    @XmlElement(name = "OverdraftTierBand", required = true)
    protected List<OverdraftTierBand4> overdraftTierBand;
    @XmlElement(name = "OverdraftType")
    @XmlSchemaType(name = "string")
    protected OverdraftType3 overdraftType;
    @XmlElement(name = "TierBandMethod", required = true)
    @XmlSchemaType(name = "string")
    protected TierBandMethod10 tierBandMethod;

    /**
     * Gets the value of the authorisedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorisedIndicator() {
        return authorisedIndicator;
    }

    /**
     * Sets the value of the authorisedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorisedIndicator(Boolean value) {
        this.authorisedIndicator = value;
    }

    /**
     * Gets the value of the bufferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBufferAmount() {
        return bufferAmount;
    }

    /**
     * Sets the value of the bufferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferAmount(String value) {
        this.bufferAmount = value;
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
     * Gets the value of the minimumArrangedOverdraftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumArrangedOverdraftAmount() {
        return minimumArrangedOverdraftAmount;
    }

    /**
     * Sets the value of the minimumArrangedOverdraftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumArrangedOverdraftAmount(String value) {
        this.minimumArrangedOverdraftAmount = value;
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
     * Gets the value of the overdraftFeesCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftFeesCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftFeesCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftFeesCharge8 }
     * 
     * 
     */
    public List<OverdraftFeesCharge8> getOverdraftFeesCharges() {
        if (overdraftFeesCharges == null) {
            overdraftFeesCharges = new ArrayList<OverdraftFeesCharge8>();
        }
        return this.overdraftFeesCharges;
    }

    /**
     * Gets the value of the overdraftTierBand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftTierBand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftTierBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftTierBand4 }
     * 
     * 
     */
    public List<OverdraftTierBand4> getOverdraftTierBand() {
        if (overdraftTierBand == null) {
            overdraftTierBand = new ArrayList<OverdraftTierBand4>();
        }
        return this.overdraftTierBand;
    }

    /**
     * Gets the value of the overdraftType property.
     * 
     * @return
     *     possible object is
     *     {@link OverdraftType3 }
     *     
     */
    public OverdraftType3 getOverdraftType() {
        return overdraftType;
    }

    /**
     * Sets the value of the overdraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdraftType3 }
     *     
     */
    public void setOverdraftType(OverdraftType3 value) {
        this.overdraftType = value;
    }

    /**
     * Gets the value of the tierBandMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TierBandMethod10 }
     *     
     */
    public TierBandMethod10 getTierBandMethod() {
        return tierBandMethod;
    }

    /**
     * Sets the value of the tierBandMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBandMethod10 }
     *     
     */
    public void setTierBandMethod(TierBandMethod10 value) {
        this.tierBandMethod = value;
    }

}
