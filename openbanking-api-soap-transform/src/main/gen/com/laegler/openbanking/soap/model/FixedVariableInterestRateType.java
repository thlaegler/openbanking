
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FixedVariableInterestRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FixedVariableInterestRateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fixed"/&gt;
 *     &lt;enumeration value="Variable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FixedVariableInterestRateType")
@XmlEnum
public enum FixedVariableInterestRateType {

    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Variable")
    VARIABLE("Variable");
    private final String value;

    FixedVariableInterestRateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FixedVariableInterestRateType fromValue(String v) {
        for (FixedVariableInterestRateType c: FixedVariableInterestRateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
