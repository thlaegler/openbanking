
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.973+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetParty_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetParty404 extends Exception {

    private java.lang.Object getGetParty404;

    public GETGetParty404() {
        super();
    }

    public GETGetParty404(String message) {
        super(message);
    }

    public GETGetParty404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetParty404(String message, java.lang.Object getGetParty404) {
        super(message);
        this.getGetParty404 = getGetParty404;
    }

    public GETGetParty404(String message, java.lang.Object getGetParty404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetParty404 = getGetParty404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetParty404;
    }
}
