
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.622+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdProduct_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdProduct404 extends Exception {

    private java.lang.Object getGetAccountsAccountIdProduct404;

    public GETGetAccountsAccountIdProduct404() {
        super();
    }

    public GETGetAccountsAccountIdProduct404(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdProduct404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdProduct404(String message, java.lang.Object getGetAccountsAccountIdProduct404) {
        super(message);
        this.getGetAccountsAccountIdProduct404 = getGetAccountsAccountIdProduct404;
    }

    public GETGetAccountsAccountIdProduct404(String message, java.lang.Object getGetAccountsAccountIdProduct404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdProduct404 = getGetAccountsAccountIdProduct404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdProduct404;
    }
}
