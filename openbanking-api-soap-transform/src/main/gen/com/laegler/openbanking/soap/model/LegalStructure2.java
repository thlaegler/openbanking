
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalStructure2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalStructure2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CIO"/&gt;
 *     &lt;enumeration value="ClubSociety"/&gt;
 *     &lt;enumeration value="Charity"/&gt;
 *     &lt;enumeration value="Ltd"/&gt;
 *     &lt;enumeration value="LBG"/&gt;
 *     &lt;enumeration value="LLP"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Partnership"/&gt;
 *     &lt;enumeration value="SoleTrader"/&gt;
 *     &lt;enumeration value="Trust"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegalStructure2")
@XmlEnum
public enum LegalStructure2 {

    CIO("CIO"),
    @XmlEnumValue("ClubSociety")
    CLUB_SOCIETY("ClubSociety"),
    @XmlEnumValue("Charity")
    CHARITY("Charity"),
    @XmlEnumValue("Ltd")
    LTD("Ltd"),
    LBG("LBG"),
    LLP("LLP"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Partnership")
    PARTNERSHIP("Partnership"),
    @XmlEnumValue("SoleTrader")
    SOLE_TRADER("SoleTrader"),
    @XmlEnumValue("Trust")
    TRUST("Trust");
    private final String value;

    LegalStructure2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegalStructure2 fromValue(String v) {
        for (LegalStructure2 c: LegalStructure2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
