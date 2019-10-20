
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The resource-update event.
 * 
 * <p>Java class for OBEventSubject1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBEventSubject1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="httpopenbanking.org.ukrid"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="httpopenbanking.org.ukrlk" type="{http://laegler.com/openbanking/soap/model}OBEventLink1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="httpopenbanking.org.ukrty"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subject_type"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
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
@XmlType(name = "OBEventSubject1", propOrder = {
    "httpopenbankingOrgUkrid",
    "httpopenbankingOrgUkrlk",
    "httpopenbankingOrgUkrty",
    "subjectType"
})
public class OBEventSubject1 {

    @XmlElement(name = "httpopenbanking.org.ukrid", required = true)
    protected String httpopenbankingOrgUkrid;
    @XmlElement(name = "httpopenbanking.org.ukrlk", required = true)
    protected List<OBEventLink1> httpopenbankingOrgUkrlk;
    @XmlElement(name = "httpopenbanking.org.ukrty", required = true)
    protected String httpopenbankingOrgUkrty;
    @XmlElement(name = "subject_type", required = true)
    protected String subjectType;

    /**
     * Gets the value of the httpopenbankingOrgUkrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpopenbankingOrgUkrid() {
        return httpopenbankingOrgUkrid;
    }

    /**
     * Sets the value of the httpopenbankingOrgUkrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpopenbankingOrgUkrid(String value) {
        this.httpopenbankingOrgUkrid = value;
    }

    /**
     * Gets the value of the httpopenbankingOrgUkrlk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpopenbankingOrgUkrlk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpopenbankingOrgUkrlk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBEventLink1 }
     * 
     * 
     */
    public List<OBEventLink1> getHttpopenbankingOrgUkrlk() {
        if (httpopenbankingOrgUkrlk == null) {
            httpopenbankingOrgUkrlk = new ArrayList<OBEventLink1>();
        }
        return this.httpopenbankingOrgUkrlk;
    }

    /**
     * Gets the value of the httpopenbankingOrgUkrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpopenbankingOrgUkrty() {
        return httpopenbankingOrgUkrty;
    }

    /**
     * Sets the value of the httpopenbankingOrgUkrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpopenbankingOrgUkrty(String value) {
        this.httpopenbankingOrgUkrty = value;
    }

    /**
     * Gets the value of the subjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * Sets the value of the subjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectType(String value) {
        this.subjectType = value;
    }

}
