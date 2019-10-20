
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicingAccessChannel3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServicingAccessChannel3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="CallCentre"/&gt;
 *     &lt;enumeration value="Post"/&gt;
 *     &lt;enumeration value="MobileBankingApp"/&gt;
 *     &lt;enumeration value="Online"/&gt;
 *     &lt;enumeration value="PostOffice"/&gt;
 *     &lt;enumeration value="RelationshipManager"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServicingAccessChannel3")
@XmlEnum
public enum ServicingAccessChannel3 {

    ATM("ATM"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("CallCentre")
    CALL_CENTRE("CallCentre"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("MobileBankingApp")
    MOBILE_BANKING_APP("MobileBankingApp"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("PostOffice")
    POST_OFFICE("PostOffice"),
    @XmlEnumValue("RelationshipManager")
    RELATIONSHIP_MANAGER("RelationshipManager"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    ServicingAccessChannel3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServicingAccessChannel3 fromValue(String v) {
        for (ServicingAccessChannel3 c: ServicingAccessChannel3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
