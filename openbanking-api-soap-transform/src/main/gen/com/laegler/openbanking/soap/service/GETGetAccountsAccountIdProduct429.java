
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.619+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdProduct_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdProduct429 extends Exception {

    private java.lang.Object getGetAccountsAccountIdProduct429;

    public GETGetAccountsAccountIdProduct429() {
        super();
    }

    public GETGetAccountsAccountIdProduct429(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdProduct429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdProduct429(String message, java.lang.Object getGetAccountsAccountIdProduct429) {
        super(message);
        this.getGetAccountsAccountIdProduct429 = getGetAccountsAccountIdProduct429;
    }

    public GETGetAccountsAccountIdProduct429(String message, java.lang.Object getGetAccountsAccountIdProduct429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdProduct429 = getGetAccountsAccountIdProduct429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdProduct429;
    }
}
