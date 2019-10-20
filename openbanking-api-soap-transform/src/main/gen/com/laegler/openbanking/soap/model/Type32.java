
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type32.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type32"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EarlySettlement"/&gt;
 *     &lt;enumeration value="FlexibleRepayment"/&gt;
 *     &lt;enumeration value="OverPayment"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PaymentHolidays"/&gt;
 *     &lt;enumeration value="RepaymentHoliday"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type32")
@XmlEnum
public enum Type32 {

    @XmlEnumValue("EarlySettlement")
    EARLY_SETTLEMENT("EarlySettlement"),
    @XmlEnumValue("FlexibleRepayment")
    FLEXIBLE_REPAYMENT("FlexibleRepayment"),
    @XmlEnumValue("OverPayment")
    OVER_PAYMENT("OverPayment"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PaymentHolidays")
    PAYMENT_HOLIDAYS("PaymentHolidays"),
    @XmlEnumValue("RepaymentHoliday")
    REPAYMENT_HOLIDAY("RepaymentHoliday");
    private final String value;

    Type32(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type32 fromValue(String v) {
        for (Type32 c: Type32 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
