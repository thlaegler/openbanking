
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.400+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdScheduledPayments_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdScheduledPayments403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdScheduledPayments403;

    public GETGetAccountsAccountIdScheduledPayments403() {
        super();
    }

    public GETGetAccountsAccountIdScheduledPayments403(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdScheduledPayments403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdScheduledPayments403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdScheduledPayments403) {
        super(message);
        this.getGetAccountsAccountIdScheduledPayments403 = getGetAccountsAccountIdScheduledPayments403;
    }

    public GETGetAccountsAccountIdScheduledPayments403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdScheduledPayments403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdScheduledPayments403 = getGetAccountsAccountIdScheduledPayments403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdScheduledPayments403;
    }
}
