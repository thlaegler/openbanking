
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.613+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdDirectDebits_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdDirectDebits404 extends Exception {

    private java.lang.Object getGetAccountsAccountIdDirectDebits404;

    public GETGetAccountsAccountIdDirectDebits404() {
        super();
    }

    public GETGetAccountsAccountIdDirectDebits404(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdDirectDebits404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdDirectDebits404(String message, java.lang.Object getGetAccountsAccountIdDirectDebits404) {
        super(message);
        this.getGetAccountsAccountIdDirectDebits404 = getGetAccountsAccountIdDirectDebits404;
    }

    public GETGetAccountsAccountIdDirectDebits404(String message, java.lang.Object getGetAccountsAccountIdDirectDebits404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdDirectDebits404 = getGetAccountsAccountIdDirectDebits404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdDirectDebits404;
    }
}
