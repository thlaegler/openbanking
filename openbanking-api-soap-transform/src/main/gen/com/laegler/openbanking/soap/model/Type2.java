
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BusinessQuickLodgeCard"/&gt;
 *     &lt;enumeration value="CashCard"/&gt;
 *     &lt;enumeration value="DebitCard"/&gt;
 *     &lt;enumeration value="DepositCard"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type2")
@XmlEnum
public enum Type2 {

    @XmlEnumValue("BusinessQuickLodgeCard")
    BUSINESS_QUICK_LODGE_CARD("BusinessQuickLodgeCard"),
    @XmlEnumValue("CashCard")
    CASH_CARD("CashCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("DepositCard")
    DEPOSIT_CARD("DepositCard"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    Type2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type2 fromValue(String v) {
        for (Type2 c: Type2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
