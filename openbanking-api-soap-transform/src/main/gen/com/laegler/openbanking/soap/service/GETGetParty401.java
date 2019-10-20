
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.977+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetParty_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetParty401 extends Exception {

    private java.lang.Object getGetParty401;

    public GETGetParty401() {
        super();
    }

    public GETGetParty401(String message) {
        super(message);
    }

    public GETGetParty401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetParty401(String message, java.lang.Object getGetParty401) {
        super(message);
        this.getGetParty401 = getGetParty401;
    }

    public GETGetParty401(String message, java.lang.Object getGetParty401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetParty401 = getGetParty401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetParty401;
    }
}