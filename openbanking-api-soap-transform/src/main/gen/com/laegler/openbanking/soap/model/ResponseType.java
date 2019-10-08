
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="code"/&gt;
 *     &lt;enumeration value="codeIdToken"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseType")
@XmlEnum
public enum ResponseType {

    @XmlEnumValue("code")
    CODE("code"),
    @XmlEnumValue("codeIdToken")
    CODE_ID_TOKEN("codeIdToken");
    private final String value;

    ResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseType fromValue(String v) {
        for (ResponseType c: ResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
