
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Certificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Certificate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eidas_profile" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="expired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="qtsp_name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="qtsp_uri" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="revoked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="roles" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valid_eidas_certificate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="valid_obietf_certificate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certificate", propOrder = {
    "eidasProfile",
    "expired",
    "qtspName",
    "qtspUri",
    "revoked",
    "roles",
    "type",
    "validEidasCertificate",
    "validObietfCertificate"
})
public class Certificate {

    @XmlElement(name = "eidas_profile")
    protected String eidasProfile;
    protected Boolean expired;
    @XmlElement(name = "qtsp_name")
    protected String qtspName;
    @XmlElement(name = "qtsp_uri")
    protected String qtspUri;
    protected Boolean revoked;
    protected List<String> roles;
    protected String type;
    @XmlElement(name = "valid_eidas_certificate")
    protected Boolean validEidasCertificate;
    @XmlElement(name = "valid_obietf_certificate")
    protected Boolean validObietfCertificate;

    /**
     * Gets the value of the eidasProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEidasProfile() {
        return eidasProfile;
    }

    /**
     * Sets the value of the eidasProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEidasProfile(String value) {
        this.eidasProfile = value;
    }

    /**
     * Gets the value of the expired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpired() {
        return expired;
    }

    /**
     * Sets the value of the expired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpired(Boolean value) {
        this.expired = value;
    }

    /**
     * Gets the value of the qtspName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtspName() {
        return qtspName;
    }

    /**
     * Sets the value of the qtspName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtspName(String value) {
        this.qtspName = value;
    }

    /**
     * Gets the value of the qtspUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtspUri() {
        return qtspUri;
    }

    /**
     * Sets the value of the qtspUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtspUri(String value) {
        this.qtspUri = value;
    }

    /**
     * Gets the value of the revoked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevoked() {
        return revoked;
    }

    /**
     * Sets the value of the revoked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevoked(Boolean value) {
        this.revoked = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoles() {
        if (roles == null) {
            roles = new ArrayList<String>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the validEidasCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidEidasCertificate() {
        return validEidasCertificate;
    }

    /**
     * Sets the value of the validEidasCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidEidasCertificate(Boolean value) {
        this.validEidasCertificate = value;
    }

    /**
     * Gets the value of the validObietfCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidObietfCertificate() {
        return validObietfCertificate;
    }

    /**
     * Sets the value of the validObietfCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidObietfCertificate(Boolean value) {
        this.validObietfCertificate = value;
    }

}
