
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.508+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetBalances_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetBalances406 extends Exception {

    private java.lang.Object getGetBalances406;

    public GETGetBalances406() {
        super();
    }

    public GETGetBalances406(String message) {
        super(message);
    }

    public GETGetBalances406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetBalances406(String message, java.lang.Object getGetBalances406) {
        super(message);
        this.getGetBalances406 = getGetBalances406;
    }

    public GETGetBalances406(String message, java.lang.Object getGetBalances406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetBalances406 = getGetBalances406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetBalances406;
    }
}
