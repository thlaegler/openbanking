
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USBA"/&gt;
 *     &lt;enumeration value="USBU"/&gt;
 *     &lt;enumeration value="USCI"/&gt;
 *     &lt;enumeration value="USCS"/&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="USFA"/&gt;
 *     &lt;enumeration value="USFB"/&gt;
 *     &lt;enumeration value="USFI"/&gt;
 *     &lt;enumeration value="USIO"/&gt;
 *     &lt;enumeration value="USOT"/&gt;
 *     &lt;enumeration value="USPF"/&gt;
 *     &lt;enumeration value="USRW"/&gt;
 *     &lt;enumeration value="USSL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepaymentType")
@XmlEnum
public enum RepaymentType {

    USBA,
    USBU,
    USCI,
    USCS,
    USER,
    USFA,
    USFB,
    USFI,
    USIO,
    USOT,
    USPF,
    USRW,
    USSL;

    public String value() {
        return name();
    }

    public static RepaymentType fromValue(String v) {
        return valueOf(v);
    }

}
