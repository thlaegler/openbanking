
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.600+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetTransactions_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetTransactions404 extends Exception {

    private java.lang.Object getGetTransactions404;

    public GETGetTransactions404() {
        super();
    }

    public GETGetTransactions404(String message) {
        super(message);
    }

    public GETGetTransactions404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetTransactions404(String message, java.lang.Object getGetTransactions404) {
        super(message);
        this.getGetTransactions404 = getGetTransactions404;
    }

    public GETGetTransactions404(String message, java.lang.Object getGetTransactions404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetTransactions404 = getGetTransactions404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetTransactions404;
    }
}
