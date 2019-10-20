
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BalanceToDate"/&gt;
 *     &lt;enumeration value="Balloon"/&gt;
 *     &lt;enumeration value="CapitalAndInterest"/&gt;
 *     &lt;enumeration value="FeeChargeCap"/&gt;
 *     &lt;enumeration value="InterestOnly"/&gt;
 *     &lt;enumeration value="Bullet"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountType1")
@XmlEnum
public enum AmountType1 {

    @XmlEnumValue("BalanceToDate")
    BALANCE_TO_DATE("BalanceToDate"),
    @XmlEnumValue("Balloon")
    BALLOON("Balloon"),
    @XmlEnumValue("CapitalAndInterest")
    CAPITAL_AND_INTEREST("CapitalAndInterest"),
    @XmlEnumValue("FeeChargeCap")
    FEE_CHARGE_CAP("FeeChargeCap"),
    @XmlEnumValue("InterestOnly")
    INTEREST_ONLY("InterestOnly"),
    @XmlEnumValue("Bullet")
    BULLET("Bullet"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AmountType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountType1 fromValue(String v) {
        for (AmountType1 c: AmountType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
