
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganisationType" type="{http://laegler.com/openbanking/soap/model}OrganisationType"/&gt;
 *         &lt;element name="OrganisationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SoftwareStatementId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="22"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SoftwareStatementRedirectURI" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organisationType",
    "organisationId",
    "softwareStatementId",
    "softwareStatementRedirectURI"
})
@XmlRootElement(name = "POST_AddaredirectURItothegivenSoftwareStatement_InputMessage")
public class POSTAddaredirectURItothegivenSoftwareStatementInputMessage {

    @XmlElement(name = "OrganisationType", required = true)
    @XmlSchemaType(name = "string")
    protected OrganisationType organisationType;
    @XmlElement(name = "OrganisationId", required = true)
    protected String organisationId;
    @XmlElement(name = "SoftwareStatementId", required = true)
    protected String softwareStatementId;
    @XmlElement(name = "SoftwareStatementRedirectURI", required = true)
    protected List<String> softwareStatementRedirectURI;

    /**
     * Gets the value of the organisationType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisationType() {
        return organisationType;
    }

    /**
     * Sets the value of the organisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisationType(OrganisationType value) {
        this.organisationType = value;
    }

    /**
     * Gets the value of the organisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationId() {
        return organisationId;
    }

    /**
     * Sets the value of the organisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationId(String value) {
        this.organisationId = value;
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
     * Gets the value of the softwareStatementRedirectURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareStatementRedirectURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareStatementRedirectURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSoftwareStatementRedirectURI() {
        if (softwareStatementRedirectURI == null) {
            softwareStatementRedirectURI = new ArrayList<String>();
        }
        return this.softwareStatementRedirectURI;
    }

}
