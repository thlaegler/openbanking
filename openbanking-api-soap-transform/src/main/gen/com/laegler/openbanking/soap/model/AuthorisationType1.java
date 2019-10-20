
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorisationType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorisationType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Single"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorisationType1")
@XmlEnum
public enum AuthorisationType1 {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Single")
    SINGLE("Single");
    private final String value;

    AuthorisationType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorisationType1 fromValue(String v) {
        for (AuthorisationType1 c: AuthorisationType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
