
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Segment6.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Segment6"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AgricultureSector"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="FlexibleBusinessLoan"/&gt;
 *     &lt;enumeration value="FixedGroup"/&gt;
 *     &lt;enumeration value="GovernmentScheme"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="SectorSpecific"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Segment6")
@XmlEnum
public enum Segment6 {

    @XmlEnumValue("AgricultureSector")
    AGRICULTURE_SECTOR("AgricultureSector"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("FlexibleBusinessLoan")
    FLEXIBLE_BUSINESS_LOAN("FlexibleBusinessLoan"),
    @XmlEnumValue("FixedGroup")
    FIXED_GROUP("FixedGroup"),
    @XmlEnumValue("GovernmentScheme")
    GOVERNMENT_SCHEME("GovernmentScheme"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SectorSpecific")
    SECTOR_SPECIFIC("SectorSpecific");
    private final String value;

    Segment6(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Segment6 fromValue(String v) {
        for (Segment6 c: Segment6 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
