
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.619+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdProduct_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdProduct401 extends Exception {

    private java.lang.Object getGetAccountsAccountIdProduct401;

    public GETGetAccountsAccountIdProduct401() {
        super();
    }

    public GETGetAccountsAccountIdProduct401(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdProduct401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdProduct401(String message, java.lang.Object getGetAccountsAccountIdProduct401) {
        super(message);
        this.getGetAccountsAccountIdProduct401 = getGetAccountsAccountIdProduct401;
    }

    public GETGetAccountsAccountIdProduct401(String message, java.lang.Object getGetAccountsAccountIdProduct401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdProduct401 = getGetAccountsAccountIdProduct401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdProduct401;
    }
}
