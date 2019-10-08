
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Data18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data18"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DirectDebit" type="{http://laegler.com/openbanking/soap/model}DirectDebit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data18", propOrder = {
    "directDebit"
})
public class Data18 {

    @XmlElement(name = "DirectDebit")
    protected List<DirectDebit> directDebit;

    /**
     * Gets the value of the directDebit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directDebit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectDebit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectDebit }
     * 
     * 
     */
    public List<DirectDebit> getDirectDebit() {
        if (directDebit == null) {
            directDebit = new ArrayList<DirectDebit>();
        }
        return this.directDebit;
    }

}
