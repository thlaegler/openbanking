
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.702+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountId_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountId500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountId500;

    public GETGetAccountsAccountId500() {
        super();
    }

    public GETGetAccountsAccountId500(String message) {
        super(message);
    }

    public GETGetAccountsAccountId500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountId500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountId500) {
        super(message);
        this.getGetAccountsAccountId500 = getGetAccountsAccountId500;
    }

    public GETGetAccountsAccountId500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountId500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountId500 = getGetAccountsAccountId500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountId500;
    }
}
