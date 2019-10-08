
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeFreeLengthPeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeFreeLengthPeriod"&gt;
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
@XmlType(name = "FeeFreeLengthPeriod")
@XmlEnum
public enum FeeFreeLengthPeriod {

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

    FeeFreeLengthPeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeFreeLengthPeriod fromValue(String v) {
        for (FeeFreeLengthPeriod c: FeeFreeLengthPeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
