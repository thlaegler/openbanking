
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.708+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountId_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountId404 extends Exception {

    private java.lang.Object getGetAccountsAccountId404;

    public GETGetAccountsAccountId404() {
        super();
    }

    public GETGetAccountsAccountId404(String message) {
        super(message);
    }

    public GETGetAccountsAccountId404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountId404(String message, java.lang.Object getGetAccountsAccountId404) {
        super(message);
        this.getGetAccountsAccountId404 = getGetAccountsAccountId404;
    }

    public GETGetAccountsAccountId404(String message, java.lang.Object getGetAccountsAccountId404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountId404 = getGetAccountsAccountId404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountId404;
    }
}