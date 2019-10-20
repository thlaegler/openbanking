
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeRateType9.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeRateType9"&gt;
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
@XmlType(name = "FeeRateType9")
@XmlEnum
public enum FeeRateType9 {

    @XmlEnumValue("LinkedBaseRate")
    LINKED_BASE_RATE("LinkedBaseRate"),
    @XmlEnumValue("Gross")
    GROSS("Gross"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FeeRateType9(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeRateType9 fromValue(String v) {
        for (FeeRateType9 c: FeeRateType9 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
