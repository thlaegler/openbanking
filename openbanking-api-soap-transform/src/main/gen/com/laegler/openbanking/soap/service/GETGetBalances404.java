
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.506+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetBalances_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetBalances404 extends Exception {

    private java.lang.Object getGetBalances404;

    public GETGetBalances404() {
        super();
    }

    public GETGetBalances404(String message) {
        super(message);
    }

    public GETGetBalances404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetBalances404(String message, java.lang.Object getGetBalances404) {
        super(message);
        this.getGetBalances404 = getGetBalances404;
    }

    public GETGetBalances404(String message, java.lang.Object getGetBalances404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetBalances404 = getGetBalances404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetBalances404;
    }
}
