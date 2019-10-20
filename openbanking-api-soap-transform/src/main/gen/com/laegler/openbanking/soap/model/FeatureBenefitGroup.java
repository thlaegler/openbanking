
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level). E.g. Barclays Student Account allows you to purchase extra benefits packages
 * 
 * <p>Java class for FeatureBenefitGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureBenefitGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}ApplicationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="BenefitGroupNominalValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}CalculationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="FeatureBenefitEligibility" type="{http://laegler.com/openbanking/soap/model}FeatureBenefitEligibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeatureBenefitItem" type="{http://laegler.com/openbanking/soap/model}FeatureBenefitItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fee" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
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
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherApplicationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherCalculationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="OtherType" type="{http://laegler.com/openbanking/soap/model}OtherType6" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://laegler.com/openbanking/soap/model}Type6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureBenefitGroup", propOrder = {
    "applicationFrequency",
    "benefitGroupNominalValue",
    "calculationFrequency",
    "featureBenefitEligibility",
    "featureBenefitItem",
    "fee",
    "name",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherType",
    "type"
})
public class FeatureBenefitGroup {

    @XmlElement(name = "ApplicationFrequency")
    @XmlSchemaType(name = "string")
    protected ApplicationFrequency applicationFrequency;
    @XmlElement(name = "BenefitGroupNominalValue")
    protected String benefitGroupNominalValue;
    @XmlElement(name = "CalculationFrequency")
    @XmlSchemaType(name = "string")
    protected CalculationFrequency calculationFrequency;
    @XmlElement(name = "FeatureBenefitEligibility")
    protected List<FeatureBenefitEligibility> featureBenefitEligibility;
    @XmlElement(name = "FeatureBenefitItem")
    protected List<FeatureBenefitItem> featureBenefitItem;
    @XmlElement(name = "Fee")
    protected String fee;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OtherApplicationFrequency otherApplicationFrequency;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OtherCalculationFrequency otherCalculationFrequency;
    @XmlElement(name = "OtherType")
    protected OtherType6 otherType;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected Type6 type;

    /**
     * Gets the value of the applicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationFrequency }
     *     
     */
    public ApplicationFrequency getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationFrequency }
     *     
     */
    public void setApplicationFrequency(ApplicationFrequency value) {
        this.applicationFrequency = value;
    }

    /**
     * Gets the value of the benefitGroupNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitGroupNominalValue() {
        return benefitGroupNominalValue;
    }

    /**
     * Sets the value of the benefitGroupNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitGroupNominalValue(String value) {
        this.benefitGroupNominalValue = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationFrequency }
     *     
     */
    public CalculationFrequency getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationFrequency }
     *     
     */
    public void setCalculationFrequency(CalculationFrequency value) {
        this.calculationFrequency = value;
    }

    /**
     * Gets the value of the featureBenefitEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureBenefitEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureBenefitEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureBenefitEligibility }
     * 
     * 
     */
    public List<FeatureBenefitEligibility> getFeatureBenefitEligibility() {
        if (featureBenefitEligibility == null) {
            featureBenefitEligibility = new ArrayList<FeatureBenefitEligibility>();
        }
        return this.featureBenefitEligibility;
    }

    /**
     * Gets the value of the featureBenefitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureBenefitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureBenefitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureBenefitItem }
     * 
     * 
     */
    public List<FeatureBenefitItem> getFeatureBenefitItem() {
        if (featureBenefitItem == null) {
            featureBenefitItem = new ArrayList<FeatureBenefitItem>();
        }
        return this.featureBenefitItem;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the otherApplicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherApplicationFrequency }
     *     
     */
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    /**
     * Sets the value of the otherApplicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherApplicationFrequency }
     *     
     */
    public void setOtherApplicationFrequency(OtherApplicationFrequency value) {
        this.otherApplicationFrequency = value;
    }

    /**
     * Gets the value of the otherCalculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCalculationFrequency }
     *     
     */
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    /**
     * Sets the value of the otherCalculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCalculationFrequency }
     *     
     */
    public void setOtherCalculationFrequency(OtherCalculationFrequency value) {
        this.otherCalculationFrequency = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherType6 }
     *     
     */
    public OtherType6 getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherType6 }
     *     
     */
    public void setOtherType(OtherType6 value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type6 }
     *     
     */
    public Type6 getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type6 }
     *     
     */
    public void setType(Type6 value) {
        this.type = value;
    }

}
