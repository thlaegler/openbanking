
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="business"/&gt;
 *     &lt;enumeration value="technical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactType1")
@XmlEnum
public enum ContactType1 {

    @XmlEnumValue("business")
    BUSINESS("business"),
    @XmlEnumValue("technical")
    TECHNICAL("technical");
    private final String value;

    ContactType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactType1 fromValue(String v) {
        for (ContactType1 c: ContactType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
