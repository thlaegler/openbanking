
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBExternalAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBExternalAccountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBExternalAccountType1Code")
@XmlEnum
public enum OBExternalAccountType1Code {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal");
    private final String value;

    OBExternalAccountType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBExternalAccountType1Code fromValue(String v) {
        for (OBExternalAccountType1Code c: OBExternalAccountType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
