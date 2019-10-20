
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinMaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MinMaxType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Minimum"/&gt;
 *     &lt;enumeration value="Maximum"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MinMaxType")
@XmlEnum
public enum MinMaxType {

    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum");
    private final String value;

    MinMaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MinMaxType fromValue(String v) {
        for (MinMaxType c: MinMaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
