
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationAssociativeCertificateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationAssociativeCertificateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="qseal"/&gt;
 *     &lt;enumeration value="obseal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganisationAssociativeCertificateType")
@XmlEnum
public enum OrganisationAssociativeCertificateType {

    @XmlEnumValue("qseal")
    QSEAL("qseal"),
    @XmlEnumValue("obseal")
    OBSEAL("obseal");
    private final String value;

    OrganisationAssociativeCertificateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationAssociativeCertificateType fromValue(String v) {
        for (OrganisationAssociativeCertificateType c: OrganisationAssociativeCertificateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
