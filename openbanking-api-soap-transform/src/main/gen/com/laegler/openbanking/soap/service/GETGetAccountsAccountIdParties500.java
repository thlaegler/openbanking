
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.217+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdParties_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdParties500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdParties500;

    public GETGetAccountsAccountIdParties500() {
        super();
    }

    public GETGetAccountsAccountIdParties500(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdParties500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdParties500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdParties500) {
        super(message);
        this.getGetAccountsAccountIdParties500 = getGetAccountsAccountIdParties500;
    }

    public GETGetAccountsAccountIdParties500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdParties500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdParties500 = getGetAccountsAccountIdParties500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdParties500;
    }
}
