
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepaymentFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepaymentFrequency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMDA"/&gt;
 *     &lt;enumeration value="SMFL"/&gt;
 *     &lt;enumeration value="SMFO"/&gt;
 *     &lt;enumeration value="SMHY"/&gt;
 *     &lt;enumeration value="SMMO"/&gt;
 *     &lt;enumeration value="SMOT"/&gt;
 *     &lt;enumeration value="SMQU"/&gt;
 *     &lt;enumeration value="SMWE"/&gt;
 *     &lt;enumeration value="SMYE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepaymentFrequency")
@XmlEnum
public enum RepaymentFrequency {

    SMDA,
    SMFL,
    SMFO,
    SMHY,
    SMMO,
    SMOT,
    SMQU,
    SMWE,
    SMYE;

    public String value() {
        return name();
    }

    public static RepaymentFrequency fromValue(String v) {
        return valueOf(v);
    }

}
