
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ArrangedOverdraft"/&gt;
 *     &lt;enumeration value="AnnualReview"/&gt;
 *     &lt;enumeration value="EmergencyBorrowing"/&gt;
 *     &lt;enumeration value="BorrowingItem"/&gt;
 *     &lt;enumeration value="OverdraftRenewal"/&gt;
 *     &lt;enumeration value="OverdraftSetup"/&gt;
 *     &lt;enumeration value="Surcharge"/&gt;
 *     &lt;enumeration value="TempOverdraft"/&gt;
 *     &lt;enumeration value="UnauthorisedBorrowing"/&gt;
 *     &lt;enumeration value="UnauthorisedPaidTrans"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="UnauthorisedUnpaidTrans"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType2")
@XmlEnum
public enum FeeType2 {

    @XmlEnumValue("ArrangedOverdraft")
    ARRANGED_OVERDRAFT("ArrangedOverdraft"),
    @XmlEnumValue("AnnualReview")
    ANNUAL_REVIEW("AnnualReview"),
    @XmlEnumValue("EmergencyBorrowing")
    EMERGENCY_BORROWING("EmergencyBorrowing"),
    @XmlEnumValue("BorrowingItem")
    BORROWING_ITEM("BorrowingItem"),
    @XmlEnumValue("OverdraftRenewal")
    OVERDRAFT_RENEWAL("OverdraftRenewal"),
    @XmlEnumValue("OverdraftSetup")
    OVERDRAFT_SETUP("OverdraftSetup"),
    @XmlEnumValue("Surcharge")
    SURCHARGE("Surcharge"),
    @XmlEnumValue("TempOverdraft")
    TEMP_OVERDRAFT("TempOverdraft"),
    @XmlEnumValue("UnauthorisedBorrowing")
    UNAUTHORISED_BORROWING("UnauthorisedBorrowing"),
    @XmlEnumValue("UnauthorisedPaidTrans")
    UNAUTHORISED_PAID_TRANS("UnauthorisedPaidTrans"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("UnauthorisedUnpaidTrans")
    UNAUTHORISED_UNPAID_TRANS("UnauthorisedUnpaidTrans");
    private final String value;

    FeeType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType2 fromValue(String v) {
        for (FeeType2 c: FeeType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
