
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Compound"/&gt;
 *     &lt;enumeration value="SimpleInterest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalculationMethod")
@XmlEnum
public enum CalculationMethod {

    @XmlEnumValue("Compound")
    COMPOUND("Compound"),
    @XmlEnumValue("SimpleInterest")
    SIMPLE_INTEREST("SimpleInterest");
    private final String value;

    CalculationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculationMethod fromValue(String v) {
        for (CalculationMethod c: CalculationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
