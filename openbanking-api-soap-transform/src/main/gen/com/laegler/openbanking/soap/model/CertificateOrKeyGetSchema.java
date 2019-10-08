
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
 * <p>Java class for CertificateOrKeyGetSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateOrKeyGetSchema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isFalse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="e" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="expiryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="keyType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="kid" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="kty" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="obOrganisationId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="softwareStatementId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="use" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="x5c" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="x5t" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="x5tS256" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="x5u" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "CertificateOrKeyGetSchema", propOrder = {
    "isFalse",
    "e",
    "expiryDateTime",
    "keyType",
    "kid",
    "kty",
    "obOrganisationId",
    "softwareStatementId",
    "status",
    "use",
    "x5C",
    "x5T",
    "x5TS256",
    "x5U"
})
public class CertificateOrKeyGetSchema {

    protected String isFalse;
    protected String e;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDateTime;
    protected String keyType;
    protected String kid;
    protected String kty;
    protected String obOrganisationId;
    protected String softwareStatementId;
    protected String status;
    protected String use;
    @XmlElement(name = "x5c")
    protected List<String> x5C;
    @XmlElement(name = "x5t")
    protected String x5T;
    @XmlElement(name = "x5tS256")
    protected String x5TS256;
    @XmlElement(name = "x5u")
    protected String x5U;

    /**
     * Gets the value of the isFalse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFalse() {
        return isFalse;
    }

    /**
     * Sets the value of the isFalse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFalse(String value) {
        this.isFalse = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE(String value) {
        this.e = value;
    }

    /**
     * Gets the value of the expiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Sets the value of the expiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateTime(XMLGregorianCalendar value) {
        this.expiryDateTime = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the kid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKid() {
        return kid;
    }

    /**
     * Sets the value of the kid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKid(String value) {
        this.kid = value;
    }

    /**
     * Gets the value of the kty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKty() {
        return kty;
    }

    /**
     * Sets the value of the kty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKty(String value) {
        this.kty = value;
    }

    /**
     * Gets the value of the obOrganisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObOrganisationId() {
        return obOrganisationId;
    }

    /**
     * Sets the value of the obOrganisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObOrganisationId(String value) {
        this.obOrganisationId = value;
    }

    /**
     * Gets the value of the softwareStatementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareStatementId() {
        return softwareStatementId;
    }

    /**
     * Sets the value of the softwareStatementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareStatementId(String value) {
        this.softwareStatementId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse(String value) {
        this.use = value;
    }

    /**
     * Gets the value of the x5C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x5C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX5C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getX5C() {
        if (x5C == null) {
            x5C = new ArrayList<String>();
        }
        return this.x5C;
    }

    /**
     * Gets the value of the x5T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX5T() {
        return x5T;
    }

    /**
     * Sets the value of the x5T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX5T(String value) {
        this.x5T = value;
    }

    /**
     * Gets the value of the x5TS256 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX5TS256() {
        return x5TS256;
    }

    /**
     * Sets the value of the x5TS256 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX5TS256(String value) {
        this.x5TS256 = value;
    }

    /**
     * Gets the value of the x5U property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX5U() {
        return x5U;
    }

    /**
     * Sets the value of the x5U property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX5U(String value) {
        this.x5U = value;
    }

}
