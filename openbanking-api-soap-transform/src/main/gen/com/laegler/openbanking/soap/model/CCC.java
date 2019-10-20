
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * CCC means a Commercial Credit Card.
 * 
 * <p>Java class for CCC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CCCMarketingState" type="{http://laegler.com/openbanking/soap/model}CCCMarketingState" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Identification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherSegment" type="{http://laegler.com/openbanking/soap/model}OtherSegment1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Segment" type="{http://laegler.com/openbanking/soap/model}Segment1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCC", propOrder = {
    "cccMarketingState",
    "identification",
    "name",
    "otherSegment",
    "segment"
})
public class CCC {

    @XmlElement(name = "CCCMarketingState", required = true)
    protected List<CCCMarketingState> cccMarketingState;
    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OtherSegment")
    protected List<OtherSegment1> otherSegment;
    @XmlElement(name = "Segment", required = true)
    @XmlSchemaType(name = "string")
    protected List<Segment1> segment;

    /**
     * Gets the value of the cccMarketingState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cccMarketingState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCCMarketingState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCCMarketingState }
     * 
     * 
     */
    public List<CCCMarketingState> getCCCMarketingState() {
        if (cccMarketingState == null) {
            cccMarketingState = new ArrayList<CCCMarketingState>();
        }
        return this.cccMarketingState;
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

    /**
     * Gets the value of the otherSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherSegment1 }
     * 
     * 
     */
    public List<OtherSegment1> getOtherSegment() {
        if (otherSegment == null) {
            otherSegment = new ArrayList<OtherSegment1>();
        }
        return this.otherSegment;
    }

    /**
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment1 }
     * 
     * 
     */
    public List<Segment1> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment1>();
        }
        return this.segment;
    }

}
