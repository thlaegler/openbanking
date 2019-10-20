
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Set of elements used to provide details on the currency exchange.
 * 
 * <p>Java class for OBCurrencyExchange5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBCurrencyExchange5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractIdentification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExchangeRate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InstructedAmount" type="{http://laegler.com/openbanking/soap/model}InstructedAmount" minOccurs="0"/&gt;
 *         &lt;element name="QuotationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SourceCurrency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-Z]{3,3}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TargetCurrency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-Z]{3,3}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnitCurrency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-Z]{3,3}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBCurrencyExchange5", propOrder = {
    "contractIdentification",
    "exchangeRate",
    "instructedAmount",
    "quotationDate",
    "sourceCurrency",
    "targetCurrency",
    "unitCurrency"
})
public class OBCurrencyExchange5 {

    @XmlElement(name = "ContractIdentification")
    protected String contractIdentification;
    @XmlElement(name = "ExchangeRate")
    protected double exchangeRate;
    @XmlElement(name = "InstructedAmount")
    protected InstructedAmount instructedAmount;
    @XmlElement(name = "QuotationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quotationDate;
    @XmlElement(name = "SourceCurrency", required = true)
    protected String sourceCurrency;
    @XmlElement(name = "TargetCurrency")
    protected String targetCurrency;
    @XmlElement(name = "UnitCurrency")
    protected String unitCurrency;

    /**
     * Gets the value of the contractIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractIdentification() {
        return contractIdentification;
    }

    /**
     * Sets the value of the contractIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractIdentification(String value) {
        this.contractIdentification = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     */
    public void setExchangeRate(double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the instructedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedAmount }
     *     
     */
    public InstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    /**
     * Sets the value of the instructedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedAmount }
     *     
     */
    public void setInstructedAmount(InstructedAmount value) {
        this.instructedAmount = value;
    }

    /**
     * Gets the value of the quotationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuotationDate() {
        return quotationDate;
    }

    /**
     * Sets the value of the quotationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuotationDate(XMLGregorianCalendar value) {
        this.quotationDate = value;
    }

    /**
     * Gets the value of the sourceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCurrency() {
        return sourceCurrency;
    }

    /**
     * Sets the value of the sourceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCurrency(String value) {
        this.sourceCurrency = value;
    }

    /**
     * Gets the value of the targetCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCurrency() {
        return targetCurrency;
    }

    /**
     * Sets the value of the targetCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCurrency(String value) {
        this.targetCurrency = value;
    }

    /**
     * Gets the value of the unitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCurrency() {
        return unitCurrency;
    }

    /**
     * Sets the value of the unitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCurrency(String value) {
        this.unitCurrency = value;
    }

}
