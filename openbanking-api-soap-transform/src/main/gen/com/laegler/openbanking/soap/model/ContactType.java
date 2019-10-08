
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AlternateEmail"/&gt;
 *     &lt;enumeration value="AlternateFax"/&gt;
 *     &lt;enumeration value="AlternatePhone"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Fax"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactType")
@XmlEnum
public enum ContactType {

    @XmlEnumValue("AlternateEmail")
    ALTERNATE_EMAIL("AlternateEmail"),
    @XmlEnumValue("AlternateFax")
    ALTERNATE_FAX("AlternateFax"),
    @XmlEnumValue("AlternatePhone")
    ALTERNATE_PHONE("AlternatePhone"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Phone")
    PHONE("Phone");
    private final String value;

    ContactType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactType fromValue(String v) {
        for (ContactType c: ContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
