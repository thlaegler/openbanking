
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.970+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetParty_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetParty406 extends Exception {

    private java.lang.Object getGetParty406;

    public GETGetParty406() {
        super();
    }

    public GETGetParty406(String message) {
        super(message);
    }

    public GETGetParty406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetParty406(String message, java.lang.Object getGetParty406) {
        super(message);
        this.getGetParty406 = getGetParty406;
    }

    public GETGetParty406(String message, java.lang.Object getGetParty406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetParty406 = getGetParty406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetParty406;
    }
}