
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Period2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Day"/&gt;
 *     &lt;enumeration value="HalfYear"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *     &lt;enumeration value="Quarter"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="AcademicTerm"/&gt;
 *     &lt;enumeration value="Year"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Period2")
@XmlEnum
public enum Period2 {

    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("HalfYear")
    HALF_YEAR("HalfYear"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("AcademicTerm")
    ACADEMIC_TERM("AcademicTerm"),
    @XmlEnumValue("Year")
    YEAR("Year");
    private final String value;

    Period2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Period2 fromValue(String v) {
        for (Period2 c: Period2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
