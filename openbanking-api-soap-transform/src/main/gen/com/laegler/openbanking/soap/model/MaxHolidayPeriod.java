
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaxHolidayPeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaxHolidayPeriod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACT"/&gt;
 *     &lt;enumeration value="PDAY"/&gt;
 *     &lt;enumeration value="PHYR"/&gt;
 *     &lt;enumeration value="PMTH"/&gt;
 *     &lt;enumeration value="PQTR"/&gt;
 *     &lt;enumeration value="PWEK"/&gt;
 *     &lt;enumeration value="PYER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaxHolidayPeriod")
@XmlEnum
public enum MaxHolidayPeriod {

    PACT,
    PDAY,
    PHYR,
    PMTH,
    PQTR,
    PWEK,
    PYER;

    public String value() {
        return name();
    }

    public static MaxHolidayPeriod fromValue(String v) {
        return valueOf(v);
    }

}
