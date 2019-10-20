
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBChargeBearerType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBChargeBearerType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BorneByCreditor"/&gt;
 *     &lt;enumeration value="BorneByDebtor"/&gt;
 *     &lt;enumeration value="FollowingServiceLevel"/&gt;
 *     &lt;enumeration value="Shared"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBChargeBearerType1Code")
@XmlEnum
public enum OBChargeBearerType1Code {

    @XmlEnumValue("BorneByCreditor")
    BORNE_BY_CREDITOR("BorneByCreditor"),
    @XmlEnumValue("BorneByDebtor")
    BORNE_BY_DEBTOR("BorneByDebtor"),
    @XmlEnumValue("FollowingServiceLevel")
    FOLLOWING_SERVICE_LEVEL("FollowingServiceLevel"),
    @XmlEnumValue("Shared")
    SHARED("Shared");
    private final String value;

    OBChargeBearerType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBChargeBearerType1Code fromValue(String v) {
        for (OBChargeBearerType1Code c: OBChargeBearerType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
