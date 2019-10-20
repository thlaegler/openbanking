
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 * 
 * <p>Java class for LoanInterestFeesCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanInterestFeesCharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoanInterestFeeChargeCap" type="{http://laegler.com/openbanking/soap/model}LoanInterestFeeChargeCap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoanInterestFeeChargeDetail" type="{http://laegler.com/openbanking/soap/model}LoanInterestFeeChargeDetail" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanInterestFeesCharge", propOrder = {
    "loanInterestFeeChargeCap",
    "loanInterestFeeChargeDetail"
})
public class LoanInterestFeesCharge {

    @XmlElement(name = "LoanInterestFeeChargeCap")
    protected List<LoanInterestFeeChargeCap> loanInterestFeeChargeCap;
    @XmlElement(name = "LoanInterestFeeChargeDetail", required = true)
    protected List<LoanInterestFeeChargeDetail> loanInterestFeeChargeDetail;

    /**
     * Gets the value of the loanInterestFeeChargeCap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanInterestFeeChargeCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanInterestFeeChargeCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanInterestFeeChargeCap }
     * 
     * 
     */
    public List<LoanInterestFeeChargeCap> getLoanInterestFeeChargeCap() {
        if (loanInterestFeeChargeCap == null) {
            loanInterestFeeChargeCap = new ArrayList<LoanInterestFeeChargeCap>();
        }
        return this.loanInterestFeeChargeCap;
    }

    /**
     * Gets the value of the loanInterestFeeChargeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanInterestFeeChargeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanInterestFeeChargeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanInterestFeeChargeDetail }
     * 
     * 
     */
    public List<LoanInterestFeeChargeDetail> getLoanInterestFeeChargeDetail() {
        if (loanInterestFeeChargeDetail == null) {
            loanInterestFeeChargeDetail = new ArrayList<LoanInterestFeeChargeDetail>();
        }
        return this.loanInterestFeeChargeDetail;
    }

}
