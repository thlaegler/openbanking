
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Further detailed information on the exchange rate that has been used in the payment transaction.
 * 
 * <p>Java class for ExchangeRateInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateInformation2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractIdentification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
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
 *         &lt;element name="ExpirationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RateType" type="{http://laegler.com/openbanking/soap/model}RateType"/&gt;
 *         &lt;element name="UnitCurrency"&gt;
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
@XmlType(name = "ExchangeRateInformation2", propOrder = {
    "contractIdentification",
    "exchangeRate",
    "expirationDateTime",
    "rateType",
    "unitCurrency"
})
public class ExchangeRateInformation2 {

    @XmlElement(name = "ContractIdentification")
    protected String contractIdentification;
    @XmlElement(name = "ExchangeRate")
    protected double exchangeRate;
    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "RateType", required = true)
    @XmlSchemaType(name = "string")
    protected RateType rateType;
    @XmlElement(name = "UnitCurrency", required = true)
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
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRateType(RateType value) {
        this.rateType = value;
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
