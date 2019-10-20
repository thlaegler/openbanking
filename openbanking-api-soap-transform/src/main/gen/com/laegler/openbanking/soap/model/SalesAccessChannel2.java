
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesAccessChannel2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesAccessChannel2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="CallCentre"/&gt;
 *     &lt;enumeration value="Post"/&gt;
 *     &lt;enumeration value="Online"/&gt;
 *     &lt;enumeration value="RelationshipManager"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalesAccessChannel2")
@XmlEnum
public enum SalesAccessChannel2 {

    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("CallCentre")
    CALL_CENTRE("CallCentre"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("RelationshipManager")
    RELATIONSHIP_MANAGER("RelationshipManager");
    private final String value;

    SalesAccessChannel2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesAccessChannel2 fromValue(String v) {
        for (SalesAccessChannel2 c: SalesAccessChannel2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}