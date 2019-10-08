
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements to describe the card instrument used in the transaction.
 * 
 * <p>Java class for OBTransactionCardInstrument1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBTransactionCardInstrument1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorisationType" type="{http://laegler.com/openbanking/soap/model}AuthorisationType" minOccurs="0"/&gt;
 *         &lt;element name="CardSchemeName" type="{http://laegler.com/openbanking/soap/model}CardSchemeName"/&gt;
 *         &lt;element name="Identification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
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
@XmlType(name = "OBTransactionCardInstrument1", propOrder = {
    "authorisationType",
    "cardSchemeName",
    "identification",
    "name"
})
public class OBTransactionCardInstrument1 {

    @XmlElement(name = "AuthorisationType")
    @XmlSchemaType(name = "string")
    protected AuthorisationType authorisationType;
    @XmlElement(name = "CardSchemeName", required = true)
    @XmlSchemaType(name = "string")
    protected CardSchemeName cardSchemeName;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the authorisationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationType }
     *     
     */
    public AuthorisationType getAuthorisationType() {
        return authorisationType;
    }

    /**
     * Sets the value of the authorisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationType }
     *     
     */
    public void setAuthorisationType(AuthorisationType value) {
        this.authorisationType = value;
    }

    /**
     * Gets the value of the cardSchemeName property.
     * 
     * @return
     *     possible object is
     *     {@link CardSchemeName }
     *     
     */
    public CardSchemeName getCardSchemeName() {
        return cardSchemeName;
    }

    /**
     * Sets the value of the cardSchemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSchemeName }
     *     
     */
    public void setCardSchemeName(CardSchemeName value) {
        this.cardSchemeName = value;
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

}
