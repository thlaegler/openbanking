
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TierBandMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBandMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculationMethod" type="{http://laegler.com/openbanking/soap/model}CalculationMethod" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://laegler.com/openbanking/soap/model}Destination" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierBand" type="{http://laegler.com/openbanking/soap/model}TierBand" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBandMethod", propOrder = {
    "calculationMethod",
    "destination",
    "notes",
    "tierBand"
})
public class TierBandMethod {

    @XmlElement(name = "CalculationMethod")
    @XmlSchemaType(name = "string")
    protected CalculationMethod calculationMethod;
    @XmlElement(name = "Destination")
    @XmlSchemaType(name = "string")
    protected Destination destination;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "TierBand")
    protected TierBand tierBand;

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
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
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
     * @return
     *     possible object is
     *     {@link TierBand }
     *     
     */
    public TierBand getTierBand() {
        return tierBand;
    }

    /**
     * Sets the value of the tierBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBand }
     *     
     */
    public void setTierBand(TierBand value) {
        this.tierBand = value;
    }

}
