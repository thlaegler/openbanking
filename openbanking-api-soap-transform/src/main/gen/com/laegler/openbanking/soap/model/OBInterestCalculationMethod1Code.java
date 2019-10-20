
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OB_InterestCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OB_InterestCalculationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ITCO"/&gt;
 *     &lt;enumeration value="ITOT"/&gt;
 *     &lt;enumeration value="ITSI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OB_InterestCalculationMethod1Code")
@XmlEnum
public enum OBInterestCalculationMethod1Code {

    ITCO,
    ITOT,
    ITSI;

    public String value() {
        return name();
    }

    public static OBInterestCalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
