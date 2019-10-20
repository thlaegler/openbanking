
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status20.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status20"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Authorised"/&gt;
 *     &lt;enumeration value="AwaitingAuthorisation"/&gt;
 *     &lt;enumeration value="Consumed"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status20")
@XmlEnum
public enum Status20 {

    @XmlEnumValue("Authorised")
    AUTHORISED("Authorised"),
    @XmlEnumValue("AwaitingAuthorisation")
    AWAITING_AUTHORISATION("AwaitingAuthorisation"),
    @XmlEnumValue("Consumed")
    CONSUMED("Consumed"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    Status20(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status20 fromValue(String v) {
        for (Status20 c: Status20 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
