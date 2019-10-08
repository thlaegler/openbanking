
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Overdraft fees and charges
 * 
 * <p>Java class for OverdraftFeesCharge3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdraftFeesCharge3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OverdraftFeeChargeCap" type="{http://laegler.com/openbanking/soap/model}OverdraftFeeChargeCap4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftFeeChargeDetail" type="{http://laegler.com/openbanking/soap/model}OverdraftFeeChargeDetail2" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdraftFeesCharge3", propOrder = {
    "overdraftFeeChargeCap",
    "overdraftFeeChargeDetail"
})
public class OverdraftFeesCharge3 {

    @XmlElement(name = "OverdraftFeeChargeCap")
    protected List<OverdraftFeeChargeCap4> overdraftFeeChargeCap;
    @XmlElement(name = "OverdraftFeeChargeDetail", required = true)
    protected List<OverdraftFeeChargeDetail2> overdraftFeeChargeDetail;

    /**
     * Gets the value of the overdraftFeeChargeCap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftFeeChargeCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftFeeChargeCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftFeeChargeCap4 }
     * 
     * 
     */
    public List<OverdraftFeeChargeCap4> getOverdraftFeeChargeCap() {
        if (overdraftFeeChargeCap == null) {
            overdraftFeeChargeCap = new ArrayList<OverdraftFeeChargeCap4>();
        }
        return this.overdraftFeeChargeCap;
    }

    /**
     * Gets the value of the overdraftFeeChargeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftFeeChargeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftFeeChargeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftFeeChargeDetail2 }
     * 
     * 
     */
    public List<OverdraftFeeChargeDetail2> getOverdraftFeeChargeDetail() {
        if (overdraftFeeChargeDetail == null) {
            overdraftFeeChargeDetail = new ArrayList<OverdraftFeeChargeDetail2>();
        }
        return this.overdraftFeeChargeDetail;
    }

}
