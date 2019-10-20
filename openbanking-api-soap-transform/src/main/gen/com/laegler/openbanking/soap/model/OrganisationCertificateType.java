
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationCertificateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationCertificateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="qwac"/&gt;
 *     &lt;enumeration value="qseal"/&gt;
 *     &lt;enumeration value="obwac"/&gt;
 *     &lt;enumeration value="obseal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganisationCertificateType")
@XmlEnum
public enum OrganisationCertificateType {

    @XmlEnumValue("qwac")
    QWAC("qwac"),
    @XmlEnumValue("qseal")
    QSEAL("qseal"),
    @XmlEnumValue("obwac")
    OBWAC("obwac"),
    @XmlEnumValue("obseal")
    OBSEAL("obseal");
    private final String value;

    OrganisationCertificateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationCertificateType fromValue(String v) {
        for (OrganisationCertificateType c: OrganisationCertificateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
