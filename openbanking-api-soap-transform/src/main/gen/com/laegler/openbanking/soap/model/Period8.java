
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period8.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Period8"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Day"/&gt;
 *     &lt;enumeration value="Half Year"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *     &lt;enumeration value="Quarter"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="Year"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Period8")
@XmlEnum
public enum Period8 {

    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Half Year")
    HALF_YEAR("Half Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Year")
    YEAR("Year");
    private final String value;

    Period8(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Period8 fromValue(String v) {
        for (Period8 c: Period8 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
