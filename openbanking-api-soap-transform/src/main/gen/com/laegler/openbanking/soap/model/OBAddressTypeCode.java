
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBAddressTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBAddressTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Correspondence"/&gt;
 *     &lt;enumeration value="DeliveryTo"/&gt;
 *     &lt;enumeration value="MailTo"/&gt;
 *     &lt;enumeration value="POBox"/&gt;
 *     &lt;enumeration value="Postal"/&gt;
 *     &lt;enumeration value="Residential"/&gt;
 *     &lt;enumeration value="Statement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBAddressTypeCode")
@XmlEnum
public enum OBAddressTypeCode {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Correspondence")
    CORRESPONDENCE("Correspondence"),
    @XmlEnumValue("DeliveryTo")
    DELIVERY_TO("DeliveryTo"),
    @XmlEnumValue("MailTo")
    MAIL_TO("MailTo"),
    @XmlEnumValue("POBox")
    PO_BOX("POBox"),
    @XmlEnumValue("Postal")
    POSTAL("Postal"),
    @XmlEnumValue("Residential")
    RESIDENTIAL("Residential"),
    @XmlEnumValue("Statement")
    STATEMENT("Statement");
    private final String value;

    OBAddressTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBAddressTypeCode fromValue(String v) {
        for (OBAddressTypeCode c: OBAddressTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
