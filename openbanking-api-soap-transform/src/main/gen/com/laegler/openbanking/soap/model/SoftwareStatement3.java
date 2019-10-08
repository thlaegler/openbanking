
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Software Statement Schema as defined by Open Banking
 * 
 * <p>Java class for SoftwareStatement3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareStatement3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SoftwareStatements" type="{http://laegler.com/openbanking/soap/model}SoftwareStatement4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareStatement3", propOrder = {
    "softwareStatements"
})
public class SoftwareStatement3 {

    @XmlElement(name = "SoftwareStatements")
    protected List<SoftwareStatement4> softwareStatements;

    /**
     * Gets the value of the softwareStatements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareStatements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareStatement4 }
     * 
     * 
     */
    public List<SoftwareStatement4> getSoftwareStatements() {
        if (softwareStatements == null) {
            softwareStatements = new ArrayList<SoftwareStatement4>();
        }
        return this.softwareStatements;
    }

}
