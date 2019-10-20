
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ASPSP
 * 
 * <p>Java class for OBAccountPaymentServiceProviders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBAccountPaymentServiceProviders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorisationServers" type="{http://laegler.com/openbanking/soap/model}AuthorisationServer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="meta" type="{http://laegler.com/openbanking/soap/model}meta" minOccurs="0"/&gt;
 *         &lt;element name="schemas" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="urnopenbankingcompetentauthorityclaims1.0" type="{http://laegler.com/openbanking/soap/model}CompetentAuthorityClaims" minOccurs="0"/&gt;
 *         &lt;element name="urnopenbankinglegalauthorityclaims1.0" type="{http://laegler.com/openbanking/soap/model}LegalAuthotiryClaims" minOccurs="0"/&gt;
 *         &lt;element name="urnopenbankingorganisation1.0" type="{http://laegler.com/openbanking/soap/model}Organisation"/&gt;
 *         &lt;element name="urnopenbankingsoftwarestatement1.0" type="{http://laegler.com/openbanking/soap/model}SoftwareStatement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBAccountPaymentServiceProviders", propOrder = {
    "authorisationServers",
    "externalId",
    "id",
    "meta",
    "schemas",
    "urnopenbankingcompetentauthorityclaims10",
    "urnopenbankinglegalauthorityclaims10",
    "urnopenbankingorganisation10",
    "urnopenbankingsoftwarestatement10"
})
public class OBAccountPaymentServiceProviders {

    @XmlElement(name = "AuthorisationServers")
    protected List<AuthorisationServer> authorisationServers;
    protected String externalId;
    protected String id;
    protected Meta meta;
    @XmlElement(required = true)
    protected List<String> schemas;
    @XmlElement(name = "urnopenbankingcompetentauthorityclaims1.0")
    protected CompetentAuthorityClaims urnopenbankingcompetentauthorityclaims10;
    @XmlElement(name = "urnopenbankinglegalauthorityclaims1.0")
    protected LegalAuthotiryClaims urnopenbankinglegalauthorityclaims10;
    @XmlElement(name = "urnopenbankingorganisation1.0", required = true)
    protected Organisation urnopenbankingorganisation10;
    @XmlElement(name = "urnopenbankingsoftwarestatement1.0")
    protected SoftwareStatement urnopenbankingsoftwarestatement10;

    /**
     * Gets the value of the authorisationServers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorisationServers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorisationServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorisationServer }
     * 
     * 
     */
    public List<AuthorisationServer> getAuthorisationServers() {
        if (authorisationServers == null) {
            authorisationServers = new ArrayList<AuthorisationServer>();
        }
        return this.authorisationServers;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the schemas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schemas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchemas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSchemas() {
        if (schemas == null) {
            schemas = new ArrayList<String>();
        }
        return this.schemas;
    }

    /**
     * Gets the value of the urnopenbankingcompetentauthorityclaims10 property.
     * 
     * @return
     *     possible object is
     *     {@link CompetentAuthorityClaims }
     *     
     */
    public CompetentAuthorityClaims getUrnopenbankingcompetentauthorityclaims10() {
        return urnopenbankingcompetentauthorityclaims10;
    }

    /**
     * Sets the value of the urnopenbankingcompetentauthorityclaims10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetentAuthorityClaims }
     *     
     */
    public void setUrnopenbankingcompetentauthorityclaims10(CompetentAuthorityClaims value) {
        this.urnopenbankingcompetentauthorityclaims10 = value;
    }

    /**
     * Gets the value of the urnopenbankinglegalauthorityclaims10 property.
     * 
     * @return
     *     possible object is
     *     {@link LegalAuthotiryClaims }
     *     
     */
    public LegalAuthotiryClaims getUrnopenbankinglegalauthorityclaims10() {
        return urnopenbankinglegalauthorityclaims10;
    }

    /**
     * Sets the value of the urnopenbankinglegalauthorityclaims10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalAuthotiryClaims }
     *     
     */
    public void setUrnopenbankinglegalauthorityclaims10(LegalAuthotiryClaims value) {
        this.urnopenbankinglegalauthorityclaims10 = value;
    }

    /**
     * Gets the value of the urnopenbankingorganisation10 property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getUrnopenbankingorganisation10() {
        return urnopenbankingorganisation10;
    }

    /**
     * Sets the value of the urnopenbankingorganisation10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setUrnopenbankingorganisation10(Organisation value) {
        this.urnopenbankingorganisation10 = value;
    }

    /**
     * Gets the value of the urnopenbankingsoftwarestatement10 property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareStatement }
     *     
     */
    public SoftwareStatement getUrnopenbankingsoftwarestatement10() {
        return urnopenbankingsoftwarestatement10;
    }

    /**
     * Sets the value of the urnopenbankingsoftwarestatement10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareStatement }
     *     
     */
    public void setUrnopenbankingsoftwarestatement10(SoftwareStatement value) {
        this.urnopenbankingsoftwarestatement10 = value;
    }

}
