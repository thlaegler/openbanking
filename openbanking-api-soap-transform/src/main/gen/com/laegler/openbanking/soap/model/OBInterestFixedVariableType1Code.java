
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OB_InterestFixedVariableType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OB_InterestFixedVariableType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INFI"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OB_InterestFixedVariableType1Code")
@XmlEnum
public enum OBInterestFixedVariableType1Code {

    INFI,
    INVA;

    public String value() {
        return name();
    }

    public static OBInterestFixedVariableType1Code fromValue(String v) {
        return valueOf(v);
    }

}
