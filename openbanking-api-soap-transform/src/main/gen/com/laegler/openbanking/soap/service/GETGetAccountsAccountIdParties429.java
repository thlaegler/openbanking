
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.222+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdParties_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdParties429 extends Exception {

    private java.lang.Object getGetAccountsAccountIdParties429;

    public GETGetAccountsAccountIdParties429() {
        super();
    }

    public GETGetAccountsAccountIdParties429(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdParties429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdParties429(String message, java.lang.Object getGetAccountsAccountIdParties429) {
        super(message);
        this.getGetAccountsAccountIdParties429 = getGetAccountsAccountIdParties429;
    }

    public GETGetAccountsAccountIdParties429(String message, java.lang.Object getGetAccountsAccountIdParties429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdParties429 = getGetAccountsAccountIdParties429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdParties429;
    }
}
