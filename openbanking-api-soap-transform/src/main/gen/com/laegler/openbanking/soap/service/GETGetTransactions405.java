
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.598+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetTransactions_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetTransactions405 extends Exception {

    private java.lang.Object getGetTransactions405;

    public GETGetTransactions405() {
        super();
    }

    public GETGetTransactions405(String message) {
        super(message);
    }

    public GETGetTransactions405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetTransactions405(String message, java.lang.Object getGetTransactions405) {
        super(message);
        this.getGetTransactions405 = getGetTransactions405;
    }

    public GETGetTransactions405(String message, java.lang.Object getGetTransactions405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetTransactions405 = getGetTransactions405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetTransactions405;
    }
}
