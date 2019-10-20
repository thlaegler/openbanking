
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Segment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Segment"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ClientAccount"/&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="NonCommercialChaitiesClbSoc"/&gt;
 *     &lt;enumeration value="NonCommercialPublicAuthGovt"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Religious"/&gt;
 *     &lt;enumeration value="SectorSpecific"/&gt;
 *     &lt;enumeration value="Startup"/&gt;
 *     &lt;enumeration value="Switcher"/&gt;
 *     &lt;enumeration value="NonCommercial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Segment")
@XmlEnum
public enum Segment {

    @XmlEnumValue("ClientAccount")
    CLIENT_ACCOUNT("ClientAccount"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("NonCommercialChaitiesClbSoc")
    NON_COMMERCIAL_CHAITIES_CLB_SOC("NonCommercialChaitiesClbSoc"),
    @XmlEnumValue("NonCommercialPublicAuthGovt")
    NON_COMMERCIAL_PUBLIC_AUTH_GOVT("NonCommercialPublicAuthGovt"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Religious")
    RELIGIOUS("Religious"),
    @XmlEnumValue("SectorSpecific")
    SECTOR_SPECIFIC("SectorSpecific"),
    @XmlEnumValue("Startup")
    STARTUP("Startup"),
    @XmlEnumValue("Switcher")
    SWITCHER("Switcher"),
    @XmlEnumValue("NonCommercial")
    NON_COMMERCIAL("NonCommercial");
    private final String value;

    Segment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Segment fromValue(String v) {
        for (Segment c: Segment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
