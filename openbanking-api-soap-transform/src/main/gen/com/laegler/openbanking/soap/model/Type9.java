
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type9.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type9"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AndroidPay"/&gt;
 *     &lt;enumeration value="ApplePay"/&gt;
 *     &lt;enumeration value="GooglePay"/&gt;
 *     &lt;enumeration value="IssuerMobileApp"/&gt;
 *     &lt;enumeration value="MobileBankingApp"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PayM"/&gt;
 *     &lt;enumeration value="SamsungPay"/&gt;
 *     &lt;enumeration value="VodafoneWallet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type9")
@XmlEnum
public enum Type9 {

    @XmlEnumValue("AndroidPay")
    ANDROID_PAY("AndroidPay"),
    @XmlEnumValue("ApplePay")
    APPLE_PAY("ApplePay"),
    @XmlEnumValue("GooglePay")
    GOOGLE_PAY("GooglePay"),
    @XmlEnumValue("IssuerMobileApp")
    ISSUER_MOBILE_APP("IssuerMobileApp"),
    @XmlEnumValue("MobileBankingApp")
    MOBILE_BANKING_APP("MobileBankingApp"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PayM")
    PAY_M("PayM"),
    @XmlEnumValue("SamsungPay")
    SAMSUNG_PAY("SamsungPay"),
    @XmlEnumValue("VodafoneWallet")
    VODAFONE_WALLET("VodafoneWallet");
    private final String value;

    Type9(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type9 fromValue(String v) {
        for (Type9 c: Type9 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
