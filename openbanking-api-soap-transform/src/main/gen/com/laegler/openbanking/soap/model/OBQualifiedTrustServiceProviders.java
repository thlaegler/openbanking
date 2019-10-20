
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * eIDAS Qualified Trust Service Provider
 * 
 * <p>Java class for OBQualifiedTrustServiceProviders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBQualifiedTrustServiceProviders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateFingerprint"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreateTimestamp" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ModifyTimestamp" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceCountry"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceExtensions" type="{http://laegler.com/openbanking/soap/model}ServiceExtension" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ServiceLanguage"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatusStartingTime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="X509Certificate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="X509SKI"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="X509SubjectName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBQualifiedTrustServiceProviders", propOrder = {
    "certificateFingerprint",
    "createTimestamp",
    "modifyTimestamp",
    "serviceCountry",
    "serviceExtensions",
    "serviceLanguage",
    "serviceName",
    "serviceStatus",
    "serviceType",
    "statusStartingTime",
    "x509Certificate",
    "x509SKI",
    "x509SubjectName",
    "externalId",
    "id",
    "meta",
    "schemas"
})
public class OBQualifiedTrustServiceProviders {

    @XmlElement(name = "CertificateFingerprint", required = true)
    protected String certificateFingerprint;
    @XmlElement(name = "CreateTimestamp")
    protected String createTimestamp;
    @XmlElement(name = "ModifyTimestamp")
    protected String modifyTimestamp;
    @XmlElement(name = "ServiceCountry", required = true)
    protected String serviceCountry;
    @XmlElement(name = "ServiceExtensions", required = true)
    protected List<ServiceExtension> serviceExtensions;
    @XmlElement(name = "ServiceLanguage", required = true)
    protected String serviceLanguage;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "ServiceStatus", required = true)
    protected String serviceStatus;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "StatusStartingTime", required = true)
    protected String statusStartingTime;
    @XmlElement(name = "X509Certificate", required = true)
    protected String x509Certificate;
    @XmlElement(name = "X509SKI", required = true)
    protected String x509SKI;
    @XmlElement(name = "X509SubjectName", required = true)
    protected String x509SubjectName;
    protected String externalId;
    protected String id;
    protected Meta meta;
    @XmlElement(required = true)
    protected List<String> schemas;

    /**
     * Gets the value of the certificateFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateFingerprint() {
        return certificateFingerprint;
    }

    /**
     * Sets the value of the certificateFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateFingerprint(String value) {
        this.certificateFingerprint = value;
    }

    /**
     * Gets the value of the createTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * Sets the value of the createTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimestamp(String value) {
        this.createTimestamp = value;
    }

    /**
     * Gets the value of the modifyTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyTimestamp() {
        return modifyTimestamp;
    }

    /**
     * Sets the value of the modifyTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyTimestamp(String value) {
        this.modifyTimestamp = value;
    }

    /**
     * Gets the value of the serviceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCountry() {
        return serviceCountry;
    }

    /**
     * Sets the value of the serviceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCountry(String value) {
        this.serviceCountry = value;
    }

    /**
     * Gets the value of the serviceExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceExtension }
     * 
     * 
     */
    public List<ServiceExtension> getServiceExtensions() {
        if (serviceExtensions == null) {
            serviceExtensions = new ArrayList<ServiceExtension>();
        }
        return this.serviceExtensions;
    }

    /**
     * Gets the value of the serviceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLanguage() {
        return serviceLanguage;
    }

    /**
     * Sets the value of the serviceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLanguage(String value) {
        this.serviceLanguage = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the statusStartingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusStartingTime() {
        return statusStartingTime;
    }

    /**
     * Sets the value of the statusStartingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusStartingTime(String value) {
        this.statusStartingTime = value;
    }

    /**
     * Gets the value of the x509Certificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Sets the value of the x509Certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX509Certificate(String value) {
        this.x509Certificate = value;
    }

    /**
     * Gets the value of the x509SKI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX509SKI() {
        return x509SKI;
    }

    /**
     * Sets the value of the x509SKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX509SKI(String value) {
        this.x509SKI = value;
    }

    /**
     * Gets the value of the x509SubjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX509SubjectName() {
        return x509SubjectName;
    }

    /**
     * Sets the value of the x509SubjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX509SubjectName(String value) {
        this.x509SubjectName = value;
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

}
