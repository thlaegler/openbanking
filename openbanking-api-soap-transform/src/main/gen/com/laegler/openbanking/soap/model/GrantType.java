
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrantType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="client_credentials"/&gt;
 *     &lt;enumeration value="authorization_code"/&gt;
 *     &lt;enumeration value="refresh_token"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GrantType")
@XmlEnum
public enum GrantType {

    @XmlEnumValue("client_credentials")
    CLIENT_CREDENTIALS("client_credentials"),
    @XmlEnumValue("authorization_code")
    AUTHORIZATION_CODE("authorization_code"),
    @XmlEnumValue("refresh_token")
    REFRESH_TOKEN("refresh_token");
    private final String value;

    GrantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrantType fromValue(String v) {
        for (GrantType c: GrantType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
