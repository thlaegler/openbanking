
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="PendingFailingSettlement"/&gt;
 *     &lt;enumeration value="PendingSettlement"/&gt;
 *     &lt;enumeration value="Proprietary"/&gt;
 *     &lt;enumeration value="ProprietaryRejection"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *     &lt;enumeration value="Unmatched"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusReason")
@XmlEnum
public enum StatusReason {

    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("PendingFailingSettlement")
    PENDING_FAILING_SETTLEMENT("PendingFailingSettlement"),
    @XmlEnumValue("PendingSettlement")
    PENDING_SETTLEMENT("PendingSettlement"),
    @XmlEnumValue("Proprietary")
    PROPRIETARY("Proprietary"),
    @XmlEnumValue("ProprietaryRejection")
    PROPRIETARY_REJECTION("ProprietaryRejection"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),
    @XmlEnumValue("Unmatched")
    UNMATCHED("Unmatched");
    private final String value;

    StatusReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusReason fromValue(String v) {
        for (StatusReason c: StatusReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
