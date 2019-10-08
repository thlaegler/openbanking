
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OB_FeeFrequency1Code_0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OB_FeeFrequency1Code_0"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEAC"/&gt;
 *     &lt;enumeration value="FEAO"/&gt;
 *     &lt;enumeration value="FECP"/&gt;
 *     &lt;enumeration value="FEDA"/&gt;
 *     &lt;enumeration value="FEHO"/&gt;
 *     &lt;enumeration value="FEI"/&gt;
 *     &lt;enumeration value="FEMO"/&gt;
 *     &lt;enumeration value="FEOA"/&gt;
 *     &lt;enumeration value="FEOT"/&gt;
 *     &lt;enumeration value="FEPC"/&gt;
 *     &lt;enumeration value="FEPH"/&gt;
 *     &lt;enumeration value="FEPO"/&gt;
 *     &lt;enumeration value="FEPS"/&gt;
 *     &lt;enumeration value="FEPT"/&gt;
 *     &lt;enumeration value="FEPTA"/&gt;
 *     &lt;enumeration value="FEPTP"/&gt;
 *     &lt;enumeration value="FEQU"/&gt;
 *     &lt;enumeration value="FESM"/&gt;
 *     &lt;enumeration value="FEST"/&gt;
 *     &lt;enumeration value="FEWE"/&gt;
 *     &lt;enumeration value="FEYE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OB_FeeFrequency1Code_0")
@XmlEnum
public enum OBFeeFrequency1Code0 {

    FEAC,
    FEAO,
    FECP,
    FEDA,
    FEHO,
    FEI,
    FEMO,
    FEOA,
    FEOT,
    FEPC,
    FEPH,
    FEPO,
    FEPS,
    FEPT,
    FEPTA,
    FEPTP,
    FEQU,
    FESM,
    FEST,
    FEWE,
    FEYE;

    public String value() {
        return name();
    }

    public static OBFeeFrequency1Code0 fromValue(String v) {
        return valueOf(v);
    }

}
