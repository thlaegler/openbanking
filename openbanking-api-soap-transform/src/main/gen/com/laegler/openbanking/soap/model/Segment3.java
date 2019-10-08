
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Segment3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Segment3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GEAS"/&gt;
 *     &lt;enumeration value="GEBA"/&gt;
 *     &lt;enumeration value="GEBR"/&gt;
 *     &lt;enumeration value="GEBU"/&gt;
 *     &lt;enumeration value="GECI"/&gt;
 *     &lt;enumeration value="GECS"/&gt;
 *     &lt;enumeration value="GEFB"/&gt;
 *     &lt;enumeration value="GEFG"/&gt;
 *     &lt;enumeration value="GEG"/&gt;
 *     &lt;enumeration value="GEGR"/&gt;
 *     &lt;enumeration value="GEGS"/&gt;
 *     &lt;enumeration value="GEOT"/&gt;
 *     &lt;enumeration value="GEOV"/&gt;
 *     &lt;enumeration value="GEPA"/&gt;
 *     &lt;enumeration value="GEPR"/&gt;
 *     &lt;enumeration value="GERE"/&gt;
 *     &lt;enumeration value="GEST"/&gt;
 *     &lt;enumeration value="GEYA"/&gt;
 *     &lt;enumeration value="GEYO"/&gt;
 *     &lt;enumeration value="PSCA"/&gt;
 *     &lt;enumeration value="PSES"/&gt;
 *     &lt;enumeration value="PSNC"/&gt;
 *     &lt;enumeration value="PSNP"/&gt;
 *     &lt;enumeration value="PSRG"/&gt;
 *     &lt;enumeration value="PSSS"/&gt;
 *     &lt;enumeration value="PSST"/&gt;
 *     &lt;enumeration value="PSSW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Segment3")
@XmlEnum
public enum Segment3 {

    GEAS,
    GEBA,
    GEBR,
    GEBU,
    GECI,
    GECS,
    GEFB,
    GEFG,
    GEG,
    GEGR,
    GEGS,
    GEOT,
    GEOV,
    GEPA,
    GEPR,
    GERE,
    GEST,
    GEYA,
    GEYO,
    PSCA,
    PSES,
    PSNC,
    PSNP,
    PSRG,
    PSSS,
    PSST,
    PSSW;

    public String value() {
        return name();
    }

    public static Segment3 fromValue(String v) {
        return valueOf(v);
    }

}
