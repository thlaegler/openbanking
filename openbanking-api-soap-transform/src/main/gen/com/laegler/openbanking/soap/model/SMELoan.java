
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * SMELoan means SME unsecured loan.
 * 
 * <p>Java class for SMELoan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMELoan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *         &lt;element name="OtherSegment" type="{http://laegler.com/openbanking/soap/model}OtherSegment3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SMELoanMarketingState" type="{http://laegler.com/openbanking/soap/model}SMELoanMarketingState" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Segment" type="{http://laegler.com/openbanking/soap/model}Segment6" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMELoan", propOrder = {
    "identification",
    "name",
    "otherSegment",
    "smeLoanMarketingState",
    "segment"
})
public class SMELoan {

    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OtherSegment")
    protected List<OtherSegment3> otherSegment;
    @XmlElement(name = "SMELoanMarketingState", required = true)
    protected List<SMELoanMarketingState> smeLoanMarketingState;
    @XmlElement(name = "Segment", required = true)
    @XmlSchemaType(name = "string")
    protected List<Segment6> segment;

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
     * {@link OtherSegment3 }
     * 
     * 
     */
    public List<OtherSegment3> getOtherSegment() {
        if (otherSegment == null) {
            otherSegment = new ArrayList<OtherSegment3>();
        }
        return this.otherSegment;
    }

    /**
     * Gets the value of the smeLoanMarketingState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smeLoanMarketingState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMELoanMarketingState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SMELoanMarketingState }
     * 
     * 
     */
    public List<SMELoanMarketingState> getSMELoanMarketingState() {
        if (smeLoanMarketingState == null) {
            smeLoanMarketingState = new ArrayList<SMELoanMarketingState>();
        }
        return this.smeLoanMarketingState;
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
     * {@link Segment6 }
     * 
     * 
     */
    public List<Segment6> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment6>();
        }
        return this.segment;
    }

}
