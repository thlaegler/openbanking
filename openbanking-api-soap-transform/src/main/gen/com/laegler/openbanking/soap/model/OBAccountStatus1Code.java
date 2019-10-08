
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBAccountStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBAccountStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="ProForma"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBAccountStatus1Code")
@XmlEnum
public enum OBAccountStatus1Code {

    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("ProForma")
    PRO_FORMA("ProForma");
    private final String value;

    OBAccountStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBAccountStatus1Code fromValue(String v) {
        for (OBAccountStatus1Code c: OBAccountStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
