
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankInterestRateType3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankInterestRateType3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LinkedBaseRate"/&gt;
 *     &lt;enumeration value="Gross"/&gt;
 *     &lt;enumeration value="Net"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BankInterestRateType3")
@XmlEnum
public enum BankInterestRateType3 {

    @XmlEnumValue("LinkedBaseRate")
    LINKED_BASE_RATE("LinkedBaseRate"),
    @XmlEnumValue("Gross")
    GROSS("Gross"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BankInterestRateType3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankInterestRateType3 fromValue(String v) {
        for (BankInterestRateType3 c: BankInterestRateType3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
