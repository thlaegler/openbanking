
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareStatementCertificateOrKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoftwareStatementCertificateOrKeyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="obtransport"/&gt;
 *     &lt;enumeration value="obsigning"/&gt;
 *     &lt;enumeration value="sigkey"/&gt;
 *     &lt;enumeration value="enckey"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SoftwareStatementCertificateOrKeyType")
@XmlEnum
public enum SoftwareStatementCertificateOrKeyType {

    @XmlEnumValue("obtransport")
    OBTRANSPORT("obtransport"),
    @XmlEnumValue("obsigning")
    OBSIGNING("obsigning"),
    @XmlEnumValue("sigkey")
    SIGKEY("sigkey"),
    @XmlEnumValue("enckey")
    ENCKEY("enckey");
    private final String value;

    SoftwareStatementCertificateOrKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoftwareStatementCertificateOrKeyType fromValue(String v) {
        for (SoftwareStatementCertificateOrKeyType c: SoftwareStatementCertificateOrKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
