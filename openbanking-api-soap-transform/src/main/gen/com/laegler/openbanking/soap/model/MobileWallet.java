
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about the mobile application services that may be available with the BCA product
 * 
 * <p>Java class for MobileWallet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileWallet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherType" type="{http://laegler.com/openbanking/soap/model}OtherType9" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://laegler.com/openbanking/soap/model}Type9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileWallet", propOrder = {
    "notes",
    "otherType",
    "type"
})
public class MobileWallet {

    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherType")
    protected OtherType9 otherType;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected Type9 type;

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherType9 }
     *     
     */
    public OtherType9 getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherType9 }
     *     
     */
    public void setOtherType(OtherType9 value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type9 }
     *     
     */
    public Type9 getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type9 }
     *     
     */
    public void setType(Type9 value) {
        this.type = value;
    }

}
