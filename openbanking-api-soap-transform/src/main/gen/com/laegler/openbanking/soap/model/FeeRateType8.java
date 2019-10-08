
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeRateType8.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeRateType8"&gt;
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
@XmlType(name = "FeeRateType8")
@XmlEnum
public enum FeeRateType8 {

    @XmlEnumValue("LinkedBaseRate")
    LINKED_BASE_RATE("LinkedBaseRate"),
    @XmlEnumValue("Gross")
    GROSS("Gross"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FeeRateType8(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeRateType8 fromValue(String v) {
        for (FeeRateType8 c: FeeRateType8 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
