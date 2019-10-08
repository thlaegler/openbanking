
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBExternalStandingOrderStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBExternalStandingOrderStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBExternalStandingOrderStatus1Code")
@XmlEnum
public enum OBExternalStandingOrderStatus1Code {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    OBExternalStandingOrderStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBExternalStandingOrderStatus1Code fromValue(String v) {
        for (OBExternalStandingOrderStatus1Code c: OBExternalStandingOrderStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
