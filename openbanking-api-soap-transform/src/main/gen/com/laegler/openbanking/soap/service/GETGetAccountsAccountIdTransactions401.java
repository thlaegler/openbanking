
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.172+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdTransactions_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdTransactions401 extends Exception {

    private java.lang.Object getGetAccountsAccountIdTransactions401;

    public GETGetAccountsAccountIdTransactions401() {
        super();
    }

    public GETGetAccountsAccountIdTransactions401(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdTransactions401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdTransactions401(String message, java.lang.Object getGetAccountsAccountIdTransactions401) {
        super(message);
        this.getGetAccountsAccountIdTransactions401 = getGetAccountsAccountIdTransactions401;
    }

    public GETGetAccountsAccountIdTransactions401(String message, java.lang.Object getGetAccountsAccountIdTransactions401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdTransactions401 = getGetAccountsAccountIdTransactions401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdTransactions401;
    }
}