
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationFrequency17.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationFrequency17"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PerAcademicTerm"/&gt;
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
@XmlType(name = "ApplicationFrequency17")
@XmlEnum
public enum ApplicationFrequency17 {

    @XmlEnumValue("PerAcademicTerm")
    PER_ACADEMIC_TERM("PerAcademicTerm"),
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

    ApplicationFrequency17(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationFrequency17 fromValue(String v) {
        for (ApplicationFrequency17 c: ApplicationFrequency17 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}