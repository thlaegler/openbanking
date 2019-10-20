
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepaymentFrequency1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepaymentFrequency1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="Flexible"/&gt;
 *     &lt;enumeration value="Fortnightly"/&gt;
 *     &lt;enumeration value="HalfYearly"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Quarterly"/&gt;
 *     &lt;enumeration value="Weekly"/&gt;
 *     &lt;enumeration value="Yearly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepaymentFrequency1")
@XmlEnum
public enum RepaymentFrequency1 {

    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Flexible")
    FLEXIBLE("Flexible"),
    @XmlEnumValue("Fortnightly")
    FORTNIGHTLY("Fortnightly"),
    @XmlEnumValue("HalfYearly")
    HALF_YEARLY("HalfYearly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly");
    private final String value;

    RepaymentFrequency1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RepaymentFrequency1 fromValue(String v) {
        for (RepaymentFrequency1 c: RepaymentFrequency1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
