
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBExternalScheduleType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBExternalScheduleType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Arrival"/&gt;
 *     &lt;enumeration value="Execution"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBExternalScheduleType1Code")
@XmlEnum
public enum OBExternalScheduleType1Code {

    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival"),
    @XmlEnumValue("Execution")
    EXECUTION("Execution");
    private final String value;

    OBExternalScheduleType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBExternalScheduleType1Code fromValue(String v) {
        for (OBExternalScheduleType1Code c: OBExternalScheduleType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
