
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenEndpointAuthMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenEndpointAuthMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="private_key_jwt"/&gt;
 *     &lt;enumeration value="client_secret_jwt"/&gt;
 *     &lt;enumeration value="client_secret_basic"/&gt;
 *     &lt;enumeration value="client_secret_post"/&gt;
 *     &lt;enumeration value="tls_client_auth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TokenEndpointAuthMethod")
@XmlEnum
public enum TokenEndpointAuthMethod {

    @XmlEnumValue("private_key_jwt")
    PRIVATE_KEY_JWT("private_key_jwt"),
    @XmlEnumValue("client_secret_jwt")
    CLIENT_SECRET_JWT("client_secret_jwt"),
    @XmlEnumValue("client_secret_basic")
    CLIENT_SECRET_BASIC("client_secret_basic"),
    @XmlEnumValue("client_secret_post")
    CLIENT_SECRET_POST("client_secret_post"),
    @XmlEnumValue("tls_client_auth")
    TLS_CLIENT_AUTH("tls_client_auth");
    private final String value;

    TokenEndpointAuthMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenEndpointAuthMethod fromValue(String v) {
        for (TokenEndpointAuthMethod c: TokenEndpointAuthMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
