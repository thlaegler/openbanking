
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationFrequency4.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationFrequency4"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="HalfYearly"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Quarterly"/&gt;
 *     &lt;enumeration value="PerStatementDate"/&gt;
 *     &lt;enumeration value="Weekly"/&gt;
 *     &lt;enumeration value="Yearly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplicationFrequency4")
@XmlEnum
public enum ApplicationFrequency4 {

    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("HalfYearly")
    HALF_YEARLY("HalfYearly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("PerStatementDate")
    PER_STATEMENT_DATE("PerStatementDate"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly");
    private final String value;

    ApplicationFrequency4(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationFrequency4 fromValue(String v) {
        for (ApplicationFrequency4 c: ApplicationFrequency4 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
