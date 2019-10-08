
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedSCAExemptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestedSCAExemptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BillPayment"/&gt;
 *     &lt;enumeration value="ContactlessTravel"/&gt;
 *     &lt;enumeration value="EcommerceGoods"/&gt;
 *     &lt;enumeration value="EcommerceServices"/&gt;
 *     &lt;enumeration value="Kiosk"/&gt;
 *     &lt;enumeration value="Parking"/&gt;
 *     &lt;enumeration value="PartyToParty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestedSCAExemptionType")
@XmlEnum
public enum RequestedSCAExemptionType {

    @XmlEnumValue("BillPayment")
    BILL_PAYMENT("BillPayment"),
    @XmlEnumValue("ContactlessTravel")
    CONTACTLESS_TRAVEL("ContactlessTravel"),
    @XmlEnumValue("EcommerceGoods")
    ECOMMERCE_GOODS("EcommerceGoods"),
    @XmlEnumValue("EcommerceServices")
    ECOMMERCE_SERVICES("EcommerceServices"),
    @XmlEnumValue("Kiosk")
    KIOSK("Kiosk"),
    @XmlEnumValue("Parking")
    PARKING("Parking"),
    @XmlEnumValue("PartyToParty")
    PARTY_TO_PARTY("PartyToParty");
    private final String value;

    RequestedSCAExemptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestedSCAExemptionType fromValue(String v) {
        for (RequestedSCAExemptionType c: RequestedSCAExemptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
