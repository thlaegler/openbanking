
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aspsp"/&gt;
 *     &lt;enumeration value="tpp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganisationType")
@XmlEnum
public enum OrganisationType {

    @XmlEnumValue("aspsp")
    ASPSP("aspsp"),
    @XmlEnumValue("tpp")
    TPP("tpp");
    private final String value;

    OrganisationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationType fromValue(String v) {
        for (OrganisationType c: OrganisationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
