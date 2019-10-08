
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanApplicationFeeChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanApplicationFeeChargeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ChargedAfterLoanApproval"/&gt;
 *     &lt;enumeration value="ChargedIrrespectiveOfLoanApproval"/&gt;
 *     &lt;enumeration value="NoLoanApplicationFee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanApplicationFeeChargeType")
@XmlEnum
public enum LoanApplicationFeeChargeType {

    @XmlEnumValue("ChargedAfterLoanApproval")
    CHARGED_AFTER_LOAN_APPROVAL("ChargedAfterLoanApproval"),
    @XmlEnumValue("ChargedIrrespectiveOfLoanApproval")
    CHARGED_IRRESPECTIVE_OF_LOAN_APPROVAL("ChargedIrrespectiveOfLoanApproval"),
    @XmlEnumValue("NoLoanApplicationFee")
    NO_LOAN_APPLICATION_FEE("NoLoanApplicationFee");
    private final String value;

    LoanApplicationFeeChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanApplicationFeeChargeType fromValue(String v) {
        for (LoanApplicationFeeChargeType c: LoanApplicationFeeChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
