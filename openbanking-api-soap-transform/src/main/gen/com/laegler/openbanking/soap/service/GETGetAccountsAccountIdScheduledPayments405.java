
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.399+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdScheduledPayments_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdScheduledPayments405 extends Exception {

    private java.lang.Object getGetAccountsAccountIdScheduledPayments405;

    public GETGetAccountsAccountIdScheduledPayments405() {
        super();
    }

    public GETGetAccountsAccountIdScheduledPayments405(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdScheduledPayments405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdScheduledPayments405(String message, java.lang.Object getGetAccountsAccountIdScheduledPayments405) {
        super(message);
        this.getGetAccountsAccountIdScheduledPayments405 = getGetAccountsAccountIdScheduledPayments405;
    }

    public GETGetAccountsAccountIdScheduledPayments405(String message, java.lang.Object getGetAccountsAccountIdScheduledPayments405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdScheduledPayments405 = getGetAccountsAccountIdScheduledPayments405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdScheduledPayments405;
    }
}
