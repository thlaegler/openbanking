
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.261+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdBalances_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdBalances500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdBalances500;

    public GETGetAccountsAccountIdBalances500() {
        super();
    }

    public GETGetAccountsAccountIdBalances500(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdBalances500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdBalances500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdBalances500) {
        super(message);
        this.getGetAccountsAccountIdBalances500 = getGetAccountsAccountIdBalances500;
    }

    public GETGetAccountsAccountIdBalances500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdBalances500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdBalances500 = getGetAccountsAccountIdBalances500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdBalances500;
    }
}