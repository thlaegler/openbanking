
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status4.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status4"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AcceptedCreditSettlementCompleted"/&gt;
 *     &lt;enumeration value="AcceptedSettlementCompleted"/&gt;
 *     &lt;enumeration value="AcceptedSettlementInProcess"/&gt;
 *     &lt;enumeration value="AcceptedWithoutPosting"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status4")
@XmlEnum
public enum Status4 {

    @XmlEnumValue("AcceptedCreditSettlementCompleted")
    ACCEPTED_CREDIT_SETTLEMENT_COMPLETED("AcceptedCreditSettlementCompleted"),
    @XmlEnumValue("AcceptedSettlementCompleted")
    ACCEPTED_SETTLEMENT_COMPLETED("AcceptedSettlementCompleted"),
    @XmlEnumValue("AcceptedSettlementInProcess")
    ACCEPTED_SETTLEMENT_IN_PROCESS("AcceptedSettlementInProcess"),
    @XmlEnumValue("AcceptedWithoutPosting")
    ACCEPTED_WITHOUT_POSTING("AcceptedWithoutPosting"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    Status4(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status4 fromValue(String v) {
        for (Status4 c: Status4 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
