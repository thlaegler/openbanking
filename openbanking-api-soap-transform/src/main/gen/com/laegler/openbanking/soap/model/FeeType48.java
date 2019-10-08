
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType48.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType48"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Application"/&gt;
 *     &lt;enumeration value="Arrangement"/&gt;
 *     &lt;enumeration value="FeeChargeCap"/&gt;
 *     &lt;enumeration value="CreditReference"/&gt;
 *     &lt;enumeration value="EarlyRepayment"/&gt;
 *     &lt;enumeration value="LatePayment"/&gt;
 *     &lt;enumeration value="MissedPaymentFee"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="MissedPaymentRate"/&gt;
 *     &lt;enumeration value="OtherPaymentFee"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PrepaymentFee"/&gt;
 *     &lt;enumeration value="OtherPaymentRate"/&gt;
 *     &lt;enumeration value="ReStatement"/&gt;
 *     &lt;enumeration value="Statement"/&gt;
 *     &lt;enumeration value="SetUp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType48")
@XmlEnum
public enum FeeType48 {

    @XmlEnumValue("Application")
    APPLICATION("Application"),
    @XmlEnumValue("Arrangement")
    ARRANGEMENT("Arrangement"),
    @XmlEnumValue("FeeChargeCap")
    FEE_CHARGE_CAP("FeeChargeCap"),
    @XmlEnumValue("CreditReference")
    CREDIT_REFERENCE("CreditReference"),
    @XmlEnumValue("EarlyRepayment")
    EARLY_REPAYMENT("EarlyRepayment"),
    @XmlEnumValue("LatePayment")
    LATE_PAYMENT("LatePayment"),
    @XmlEnumValue("MissedPaymentFee")
    MISSED_PAYMENT_FEE("MissedPaymentFee"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("MissedPaymentRate")
    MISSED_PAYMENT_RATE("MissedPaymentRate"),
    @XmlEnumValue("OtherPaymentFee")
    OTHER_PAYMENT_FEE("OtherPaymentFee"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PrepaymentFee")
    PREPAYMENT_FEE("PrepaymentFee"),
    @XmlEnumValue("OtherPaymentRate")
    OTHER_PAYMENT_RATE("OtherPaymentRate"),
    @XmlEnumValue("ReStatement")
    RE_STATEMENT("ReStatement"),
    @XmlEnumValue("Statement")
    STATEMENT("Statement"),
    @XmlEnumValue("SetUp")
    SET_UP("SetUp");
    private final String value;

    FeeType48(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType48 fromValue(String v) {
        for (FeeType48 c: FeeType48 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
