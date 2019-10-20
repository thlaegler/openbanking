
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBBalanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBBalanceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ClosingAvailable"/&gt;
 *     &lt;enumeration value="ClosingBooked"/&gt;
 *     &lt;enumeration value="ClosingCleared"/&gt;
 *     &lt;enumeration value="Expected"/&gt;
 *     &lt;enumeration value="ForwardAvailable"/&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="InterimAvailable"/&gt;
 *     &lt;enumeration value="InterimBooked"/&gt;
 *     &lt;enumeration value="InterimCleared"/&gt;
 *     &lt;enumeration value="OpeningAvailable"/&gt;
 *     &lt;enumeration value="OpeningBooked"/&gt;
 *     &lt;enumeration value="OpeningCleared"/&gt;
 *     &lt;enumeration value="PreviouslyClosedBooked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBBalanceType1Code")
@XmlEnum
public enum OBBalanceType1Code {

    @XmlEnumValue("ClosingAvailable")
    CLOSING_AVAILABLE("ClosingAvailable"),
    @XmlEnumValue("ClosingBooked")
    CLOSING_BOOKED("ClosingBooked"),
    @XmlEnumValue("ClosingCleared")
    CLOSING_CLEARED("ClosingCleared"),
    @XmlEnumValue("Expected")
    EXPECTED("Expected"),
    @XmlEnumValue("ForwardAvailable")
    FORWARD_AVAILABLE("ForwardAvailable"),
    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("InterimAvailable")
    INTERIM_AVAILABLE("InterimAvailable"),
    @XmlEnumValue("InterimBooked")
    INTERIM_BOOKED("InterimBooked"),
    @XmlEnumValue("InterimCleared")
    INTERIM_CLEARED("InterimCleared"),
    @XmlEnumValue("OpeningAvailable")
    OPENING_AVAILABLE("OpeningAvailable"),
    @XmlEnumValue("OpeningBooked")
    OPENING_BOOKED("OpeningBooked"),
    @XmlEnumValue("OpeningCleared")
    OPENING_CLEARED("OpeningCleared"),
    @XmlEnumValue("PreviouslyClosedBooked")
    PREVIOUSLY_CLOSED_BOOKED("PreviouslyClosedBooked");
    private final String value;

    OBBalanceType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBBalanceType1Code fromValue(String v) {
        for (OBBalanceType1Code c: OBBalanceType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
