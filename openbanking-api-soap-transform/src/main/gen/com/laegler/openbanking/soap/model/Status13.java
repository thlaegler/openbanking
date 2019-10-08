
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status13.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status13"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InitiationCompleted"/&gt;
 *     &lt;enumeration value="InitiationFailed"/&gt;
 *     &lt;enumeration value="InitiationPending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status13")
@XmlEnum
public enum Status13 {

    @XmlEnumValue("InitiationCompleted")
    INITIATION_COMPLETED("InitiationCompleted"),
    @XmlEnumValue("InitiationFailed")
    INITIATION_FAILED("InitiationFailed"),
    @XmlEnumValue("InitiationPending")
    INITIATION_PENDING("InitiationPending");
    private final String value;

    Status13(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status13 fromValue(String v) {
        for (Status13 c: Status13 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
