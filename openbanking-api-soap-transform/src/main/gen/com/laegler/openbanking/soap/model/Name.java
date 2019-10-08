
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Name.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Name"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Friday"/&gt;
 *     &lt;enumeration value="Monday"/&gt;
 *     &lt;enumeration value="Saturday"/&gt;
 *     &lt;enumeration value="Sunday"/&gt;
 *     &lt;enumeration value="Thursday"/&gt;
 *     &lt;enumeration value="Tuesday"/&gt;
 *     &lt;enumeration value="Wednesday"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Name")
@XmlEnum
public enum Name {

    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday"),
    @XmlEnumValue("Sunday")
    SUNDAY("Sunday"),
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday");
    private final String value;

    Name(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Name fromValue(String v) {
        for (Name c: Name.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
