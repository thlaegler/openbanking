
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.260+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdBalances_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdBalances401 extends Exception {

    private java.lang.Object getGetAccountsAccountIdBalances401;

    public GETGetAccountsAccountIdBalances401() {
        super();
    }

    public GETGetAccountsAccountIdBalances401(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdBalances401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdBalances401(String message, java.lang.Object getGetAccountsAccountIdBalances401) {
        super(message);
        this.getGetAccountsAccountIdBalances401 = getGetAccountsAccountIdBalances401;
    }

    public GETGetAccountsAccountIdBalances401(String message, java.lang.Object getGetAccountsAccountIdBalances401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdBalances401 = getGetAccountsAccountIdBalances401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdBalances401;
    }
}
