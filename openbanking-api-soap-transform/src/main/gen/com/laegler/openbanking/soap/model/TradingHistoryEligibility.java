
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the trading history requirements to access the BCA product.
 * 
 * <p>Java class for TradingHistoryEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingHistoryEligibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinMaxType" type="{http://laegler.com/openbanking/soap/model}MinMaxType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherTradingType" type="{http://laegler.com/openbanking/soap/model}OtherTradingType" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://laegler.com/openbanking/soap/model}Period2" minOccurs="0"/&gt;
 *         &lt;element name="Textual" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TradingType" type="{http://laegler.com/openbanking/soap/model}TradingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingHistoryEligibility", propOrder = {
    "amount",
    "indicator",
    "minMaxType",
    "notes",
    "otherTradingType",
    "period",
    "textual",
    "tradingType"
})
public class TradingHistoryEligibility {

    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Indicator")
    protected Boolean indicator;
    @XmlElement(name = "MinMaxType")
    @XmlSchemaType(name = "string")
    protected MinMaxType minMaxType;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherTradingType")
    protected OtherTradingType otherTradingType;
    @XmlElement(name = "Period")
    @XmlSchemaType(name = "string")
    protected Period2 period;
    @XmlElement(name = "Textual")
    protected String textual;
    @XmlElement(name = "TradingType")
    @XmlSchemaType(name = "string")
    protected TradingType tradingType;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicator(Boolean value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the minMaxType property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxType }
     *     
     */
    public MinMaxType getMinMaxType() {
        return minMaxType;
    }

    /**
     * Sets the value of the minMaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxType }
     *     
     */
    public void setMinMaxType(MinMaxType value) {
        this.minMaxType = value;
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
     * Gets the value of the otherTradingType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTradingType }
     *     
     */
    public OtherTradingType getOtherTradingType() {
        return otherTradingType;
    }

    /**
     * Sets the value of the otherTradingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTradingType }
     *     
     */
    public void setOtherTradingType(OtherTradingType value) {
        this.otherTradingType = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public void setPeriod(Period2 value) {
        this.period = value;
    }

    /**
     * Gets the value of the textual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextual() {
        return textual;
    }

    /**
     * Sets the value of the textual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextual(String value) {
        this.textual = value;
    }

    /**
     * Gets the value of the tradingType property.
     * 
     * @return
     *     possible object is
     *     {@link TradingType }
     *     
     */
    public TradingType getTradingType() {
        return tradingType;
    }

    /**
     * Sets the value of the tradingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingType }
     *     
     */
    public void setTradingType(TradingType value) {
        this.tradingType = value;
    }

}
