
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.600+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetTransactions_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetTransactions401 extends Exception {

    private java.lang.Object getGetTransactions401;

    public GETGetTransactions401() {
        super();
    }

    public GETGetTransactions401(String message) {
        super(message);
    }

    public GETGetTransactions401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetTransactions401(String message, java.lang.Object getGetTransactions401) {
        super(message);
        this.getGetTransactions401 = getGetTransactions401;
    }

    public GETGetTransactions401(String message, java.lang.Object getGetTransactions401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetTransactions401 = getGetTransactions401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetTransactions401;
    }
}
