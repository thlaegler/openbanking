
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status11.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status11"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Authorised"/&gt;
 *     &lt;enumeration value="AwaitingAuthorisation"/&gt;
 *     &lt;enumeration value="AwaitingUpload"/&gt;
 *     &lt;enumeration value="Consumed"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status11")
@XmlEnum
public enum Status11 {

    @XmlEnumValue("Authorised")
    AUTHORISED("Authorised"),
    @XmlEnumValue("AwaitingAuthorisation")
    AWAITING_AUTHORISATION("AwaitingAuthorisation"),
    @XmlEnumValue("AwaitingUpload")
    AWAITING_UPLOAD("AwaitingUpload"),
    @XmlEnumValue("Consumed")
    CONSUMED("Consumed"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    Status11(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status11 fromValue(String v) {
        for (Status11 c: Status11 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
