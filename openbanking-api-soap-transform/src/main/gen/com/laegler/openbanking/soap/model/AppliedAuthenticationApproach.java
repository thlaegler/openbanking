
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppliedAuthenticationApproach.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppliedAuthenticationApproach"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="SCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AppliedAuthenticationApproach")
@XmlEnum
public enum AppliedAuthenticationApproach {

    CA,
    SCA;

    public String value() {
        return name();
    }

    public static AppliedAuthenticationApproach fromValue(String v) {
        return valueOf(v);
    }

}
