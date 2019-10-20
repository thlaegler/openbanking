
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType25.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType25"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FBAO"/&gt;
 *     &lt;enumeration value="FBAR"/&gt;
 *     &lt;enumeration value="FBEB"/&gt;
 *     &lt;enumeration value="FBIT"/&gt;
 *     &lt;enumeration value="FBOR"/&gt;
 *     &lt;enumeration value="FBOS"/&gt;
 *     &lt;enumeration value="FBSC"/&gt;
 *     &lt;enumeration value="FBTO"/&gt;
 *     &lt;enumeration value="FBUB"/&gt;
 *     &lt;enumeration value="FBUT"/&gt;
 *     &lt;enumeration value="FTOT"/&gt;
 *     &lt;enumeration value="FTUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType25")
@XmlEnum
public enum FeeType25 {

    FBAO,
    FBAR,
    FBEB,
    FBIT,
    FBOR,
    FBOS,
    FBSC,
    FBTO,
    FBUB,
    FBUT,
    FTOT,
    FTUT;

    public String value() {
        return name();
    }

    public static FeeType25 fromValue(String v) {
        return valueOf(v);
    }

}
