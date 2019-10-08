
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Non repayment fee charges details
 * 
 * <p>Java class for NonRepaymentFeeCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonRepaymentFeeCharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonRepaymentFeeChargeCap" type="{http://laegler.com/openbanking/soap/model}NonRepaymentFeeChargeCap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NonRepaymentFeeChargeDetail" type="{http://laegler.com/openbanking/soap/model}NonRepaymentFeeChargeDetail" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonRepaymentFeeCharge", propOrder = {
    "nonRepaymentFeeChargeCap",
    "nonRepaymentFeeChargeDetail"
})
public class NonRepaymentFeeCharge {

    @XmlElement(name = "NonRepaymentFeeChargeCap")
    protected List<NonRepaymentFeeChargeCap> nonRepaymentFeeChargeCap;
    @XmlElement(name = "NonRepaymentFeeChargeDetail", required = true)
    protected List<NonRepaymentFeeChargeDetail> nonRepaymentFeeChargeDetail;

    /**
     * Gets the value of the nonRepaymentFeeChargeCap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonRepaymentFeeChargeCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonRepaymentFeeChargeCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonRepaymentFeeChargeCap }
     * 
     * 
     */
    public List<NonRepaymentFeeChargeCap> getNonRepaymentFeeChargeCap() {
        if (nonRepaymentFeeChargeCap == null) {
            nonRepaymentFeeChargeCap = new ArrayList<NonRepaymentFeeChargeCap>();
        }
        return this.nonRepaymentFeeChargeCap;
    }

    /**
     * Gets the value of the nonRepaymentFeeChargeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonRepaymentFeeChargeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonRepaymentFeeChargeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonRepaymentFeeChargeDetail }
     * 
     * 
     */
    public List<NonRepaymentFeeChargeDetail> getNonRepaymentFeeChargeDetail() {
        if (nonRepaymentFeeChargeDetail == null) {
            nonRepaymentFeeChargeDetail = new ArrayList<NonRepaymentFeeChargeDetail>();
        }
        return this.nonRepaymentFeeChargeDetail;
    }

}
