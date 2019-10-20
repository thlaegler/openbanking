
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficerType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficerType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Director"/&gt;
 *     &lt;enumeration value="Owner"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Partner"/&gt;
 *     &lt;enumeration value="SignificantControl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfficerType1")
@XmlEnum
public enum OfficerType1 {

    @XmlEnumValue("Director")
    DIRECTOR("Director"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Partner")
    PARTNER("Partner"),
    @XmlEnumValue("SignificantControl")
    SIGNIFICANT_CONTROL("SignificantControl");
    private final String value;

    OfficerType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfficerType1 fromValue(String v) {
        for (OfficerType1 c: OfficerType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
