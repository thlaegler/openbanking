
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.216+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdParties_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdParties401 extends Exception {

    private java.lang.Object getGetAccountsAccountIdParties401;

    public GETGetAccountsAccountIdParties401() {
        super();
    }

    public GETGetAccountsAccountIdParties401(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdParties401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdParties401(String message, java.lang.Object getGetAccountsAccountIdParties401) {
        super(message);
        this.getGetAccountsAccountIdParties401 = getGetAccountsAccountIdParties401;
    }

    public GETGetAccountsAccountIdParties401(String message, java.lang.Object getGetAccountsAccountIdParties401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdParties401 = getGetAccountsAccountIdParties401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdParties401;
    }
}