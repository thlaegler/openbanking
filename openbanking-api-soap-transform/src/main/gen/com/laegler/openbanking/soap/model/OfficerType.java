
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Director"/&gt;
 *     &lt;enumeration value="Owner"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Partner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfficerType")
@XmlEnum
public enum OfficerType {

    @XmlEnumValue("Director")
    DIRECTOR("Director"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Partner")
    PARTNER("Partner");
    private final String value;

    OfficerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfficerType fromValue(String v) {
        for (OfficerType c: OfficerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
