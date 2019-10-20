
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.699+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountId_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountId401 extends Exception {

    private java.lang.Object getGetAccountsAccountId401;

    public GETGetAccountsAccountId401() {
        super();
    }

    public GETGetAccountsAccountId401(String message) {
        super(message);
    }

    public GETGetAccountsAccountId401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountId401(String message, java.lang.Object getGetAccountsAccountId401) {
        super(message);
        this.getGetAccountsAccountId401 = getGetAccountsAccountId401;
    }

    public GETGetAccountsAccountId401(String message, java.lang.Object getGetAccountsAccountId401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountId401 = getGetAccountsAccountId401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountId401;
    }
}