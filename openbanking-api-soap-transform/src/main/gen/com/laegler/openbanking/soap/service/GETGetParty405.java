
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.974+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetParty_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetParty405 extends Exception {

    private java.lang.Object getGetParty405;

    public GETGetParty405() {
        super();
    }

    public GETGetParty405(String message) {
        super(message);
    }

    public GETGetParty405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetParty405(String message, java.lang.Object getGetParty405) {
        super(message);
        this.getGetParty405 = getGetParty405;
    }

    public GETGetParty405(String message, java.lang.Object getGetParty405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetParty405 = getGetParty405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetParty405;
    }
}
