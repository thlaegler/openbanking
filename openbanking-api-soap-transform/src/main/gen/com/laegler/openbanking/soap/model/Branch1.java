
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information that locates and identifies a specific branch of a financial institution.
 * 
 * <p>Java class for Branch1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Branch1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accessibility" type="{http://laegler.com/openbanking/soap/model}Accessibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Availability" type="{http://laegler.com/openbanking/soap/model}Availability" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://laegler.com/openbanking/soap/model}ContactInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSegment" type="{http://laegler.com/openbanking/soap/model}CustomerSegment" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Identification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="140"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Note" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherAccessibility" type="{http://laegler.com/openbanking/soap/model}OtherAccessibility1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherCustomerSegment" type="{http://laegler.com/openbanking/soap/model}OtherCustomerSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherServiceAndFacility" type="{http://laegler.com/openbanking/soap/model}OtherServiceAndFacility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Photo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalAddress" type="{http://laegler.com/openbanking/soap/model}PostalAddress2"/&gt;
 *         &lt;element name="SequenceNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceAndFacility" type="{http://laegler.com/openbanking/soap/model}ServiceAndFacility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SortCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Type" type="{http://laegler.com/openbanking/soap/model}Type10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Branch1", propOrder = {
    "accessibility",
    "availability",
    "contactInfo",
    "customerSegment",
    "identification",
    "name",
    "note",
    "otherAccessibility",
    "otherCustomerSegment",
    "otherServiceAndFacility",
    "photo",
    "postalAddress",
    "sequenceNumber",
    "serviceAndFacility",
    "sortCode",
    "type"
})
public class Branch1 {

    @XmlElement(name = "Accessibility")
    @XmlSchemaType(name = "string")
    protected List<Accessibility1> accessibility;
    @XmlElement(name = "Availability")
    protected Availability availability;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfo> contactInfo;
    @XmlElement(name = "CustomerSegment", required = true)
    @XmlSchemaType(name = "string")
    protected List<CustomerSegment> customerSegment;
    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "OtherAccessibility")
    protected List<OtherAccessibility1> otherAccessibility;
    @XmlElement(name = "OtherCustomerSegment")
    protected List<OtherCustomerSegment> otherCustomerSegment;
    @XmlElement(name = "OtherServiceAndFacility")
    protected List<OtherServiceAndFacility> otherServiceAndFacility;
    @XmlElement(name = "Photo")
    protected String photo;
    @XmlElement(name = "PostalAddress", required = true)
    protected PostalAddress2 postalAddress;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "ServiceAndFacility")
    @XmlSchemaType(name = "string")
    protected List<ServiceAndFacility> serviceAndFacility;
    @XmlElement(name = "SortCode")
    protected List<String> sortCode;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected Type10 type;

    /**
     * Gets the value of the accessibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accessibility1 }
     * 
     * 
     */
    public List<Accessibility1> getAccessibility() {
        if (accessibility == null) {
            accessibility = new ArrayList<Accessibility1>();
        }
        return this.accessibility;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link Availability }
     *     
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Availability }
     *     
     */
    public void setAvailability(Availability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfo }
     * 
     * 
     */
    public List<ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the customerSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSegment }
     * 
     * 
     */
    public List<CustomerSegment> getCustomerSegment() {
        if (customerSegment == null) {
            customerSegment = new ArrayList<CustomerSegment>();
        }
        return this.customerSegment;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the otherAccessibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAccessibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAccessibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAccessibility1 }
     * 
     * 
     */
    public List<OtherAccessibility1> getOtherAccessibility() {
        if (otherAccessibility == null) {
            otherAccessibility = new ArrayList<OtherAccessibility1>();
        }
        return this.otherAccessibility;
    }

    /**
     * Gets the value of the otherCustomerSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCustomerSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCustomerSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCustomerSegment }
     * 
     * 
     */
    public List<OtherCustomerSegment> getOtherCustomerSegment() {
        if (otherCustomerSegment == null) {
            otherCustomerSegment = new ArrayList<OtherCustomerSegment>();
        }
        return this.otherCustomerSegment;
    }

    /**
     * Gets the value of the otherServiceAndFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherServiceAndFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherServiceAndFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherServiceAndFacility }
     * 
     * 
     */
    public List<OtherServiceAndFacility> getOtherServiceAndFacility() {
        if (otherServiceAndFacility == null) {
            otherServiceAndFacility = new ArrayList<OtherServiceAndFacility>();
        }
        return this.otherServiceAndFacility;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoto(String value) {
        this.photo = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress2 }
     *     
     */
    public PostalAddress2 getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress2 }
     *     
     */
    public void setPostalAddress(PostalAddress2 value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the serviceAndFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAndFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAndFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAndFacility }
     * 
     * 
     */
    public List<ServiceAndFacility> getServiceAndFacility() {
        if (serviceAndFacility == null) {
            serviceAndFacility = new ArrayList<ServiceAndFacility>();
        }
        return this.serviceAndFacility;
    }

    /**
     * Gets the value of the sortCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSortCode() {
        if (sortCode == null) {
            sortCode = new ArrayList<String>();
        }
        return this.sortCode;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type10 }
     *     
     */
    public Type10 getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type10 }
     *     
     */
    public void setType(Type10 value) {
        this.type = value;
    }

}
