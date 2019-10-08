
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status22.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status22"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="InitiationCompleted"/&gt;
 *     &lt;enumeration value="InitiationFailed"/&gt;
 *     &lt;enumeration value="InitiationPending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status22")
@XmlEnum
public enum Status22 {

    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("InitiationCompleted")
    INITIATION_COMPLETED("InitiationCompleted"),
    @XmlEnumValue("InitiationFailed")
    INITIATION_FAILED("InitiationFailed"),
    @XmlEnumValue("InitiationPending")
    INITIATION_PENDING("InitiationPending");
    private final String value;

    Status22(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status22 fromValue(String v) {
        for (Status22 c: Status22 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
