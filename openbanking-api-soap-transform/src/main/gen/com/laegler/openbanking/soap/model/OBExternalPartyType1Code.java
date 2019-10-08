
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBExternalPartyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBExternalPartyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Delegate"/&gt;
 *     &lt;enumeration value="Joint"/&gt;
 *     &lt;enumeration value="Sole"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBExternalPartyType1Code")
@XmlEnum
public enum OBExternalPartyType1Code {

    @XmlEnumValue("Delegate")
    DELEGATE("Delegate"),
    @XmlEnumValue("Joint")
    JOINT("Joint"),
    @XmlEnumValue("Sole")
    SOLE("Sole");
    private final String value;

    OBExternalPartyType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBExternalPartyType1Code fromValue(String v) {
        for (OBExternalPartyType1Code c: OBExternalPartyType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
