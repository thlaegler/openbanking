
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.490+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdParty_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdParty404 extends Exception {

    private java.lang.Object getGetAccountsAccountIdParty404;

    public GETGetAccountsAccountIdParty404() {
        super();
    }

    public GETGetAccountsAccountIdParty404(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdParty404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdParty404(String message, java.lang.Object getGetAccountsAccountIdParty404) {
        super(message);
        this.getGetAccountsAccountIdParty404 = getGetAccountsAccountIdParty404;
    }

    public GETGetAccountsAccountIdParty404(String message, java.lang.Object getGetAccountsAccountIdParty404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdParty404 = getGetAccountsAccountIdParty404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdParty404;
    }
}
