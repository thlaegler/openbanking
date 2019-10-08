
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Authorised"/&gt;
 *     &lt;enumeration value="AwaitingFurtherAuthorisation"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status3")
@XmlEnum
public enum Status3 {

    @XmlEnumValue("Authorised")
    AUTHORISED("Authorised"),
    @XmlEnumValue("AwaitingFurtherAuthorisation")
    AWAITING_FURTHER_AUTHORISATION("AwaitingFurtherAuthorisation"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    Status3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status3 fromValue(String v) {
        for (Status3 c: Status3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
