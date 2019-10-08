
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OB_FeeCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OB_FeeCategory1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FCOT"/&gt;
 *     &lt;enumeration value="FCRE"/&gt;
 *     &lt;enumeration value="FCSV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OB_FeeCategory1Code")
@XmlEnum
public enum OBFeeCategory1Code {

    FCOT,
    FCRE,
    FCSV;

    public String value() {
        return name();
    }

    public static OBFeeCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
