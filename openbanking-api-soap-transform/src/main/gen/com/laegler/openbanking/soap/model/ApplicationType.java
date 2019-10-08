
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="web"/&gt;
 *     &lt;enumeration value="mobile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplicationType")
@XmlEnum
public enum ApplicationType {

    @XmlEnumValue("web")
    WEB("web"),
    @XmlEnumValue("mobile")
    MOBILE("mobile");
    private final String value;

    ApplicationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationType fromValue(String v) {
        for (ApplicationType c: ApplicationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
