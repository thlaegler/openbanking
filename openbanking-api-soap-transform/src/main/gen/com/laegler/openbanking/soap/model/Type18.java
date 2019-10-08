
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type18.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type18"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *     &lt;enumeration value="Emergency"/&gt;
 *     &lt;enumeration value="PreAgreed"/&gt;
 *     &lt;enumeration value="Temporary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type18")
@XmlEnum
public enum Type18 {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),
    @XmlEnumValue("PreAgreed")
    PRE_AGREED("PreAgreed"),
    @XmlEnumValue("Temporary")
    TEMPORARY("Temporary");
    private final String value;

    Type18(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type18 fromValue(String v) {
        for (Type18 c: Type18 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
