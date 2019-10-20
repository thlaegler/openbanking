
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Error.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Error"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="invalid_redirect_uri"/&gt;
 *     &lt;enumeration value="invalid_client_metadata"/&gt;
 *     &lt;enumeration value="invalid_software_statement"/&gt;
 *     &lt;enumeration value="unapproved_software_statement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Error")
@XmlEnum
public enum Error {

    @XmlEnumValue("invalid_redirect_uri")
    INVALID_REDIRECT_URI("invalid_redirect_uri"),
    @XmlEnumValue("invalid_client_metadata")
    INVALID_CLIENT_METADATA("invalid_client_metadata"),
    @XmlEnumValue("invalid_software_statement")
    INVALID_SOFTWARE_STATEMENT("invalid_software_statement"),
    @XmlEnumValue("unapproved_software_statement")
    UNAPPROVED_SOFTWARE_STATEMENT("unapproved_software_statement");
    private final String value;

    Error(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Error fromValue(String v) {
        for (Error c: Error.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
