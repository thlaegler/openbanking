
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type10.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type10"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mobile"/&gt;
 *     &lt;enumeration value="Physical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type10")
@XmlEnum
public enum Type10 {

    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Physical")
    PHYSICAL("Physical");
    private final String value;

    Type10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type10 fromValue(String v) {
        for (Type10 c: Type10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
