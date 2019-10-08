
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OB_FeeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OB_FeeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEPF"/&gt;
 *     &lt;enumeration value="FTOT"/&gt;
 *     &lt;enumeration value="FYAF"/&gt;
 *     &lt;enumeration value="FYAM"/&gt;
 *     &lt;enumeration value="FYAQ"/&gt;
 *     &lt;enumeration value="FYCP"/&gt;
 *     &lt;enumeration value="FYDB"/&gt;
 *     &lt;enumeration value="FYMI"/&gt;
 *     &lt;enumeration value="FYXX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OB_FeeType1Code")
@XmlEnum
public enum OBFeeType1Code {

    FEPF,
    FTOT,
    FYAF,
    FYAM,
    FYAQ,
    FYCP,
    FYDB,
    FYMI,
    FYXX;

    public String value() {
        return name();
    }

    public static OBFeeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
