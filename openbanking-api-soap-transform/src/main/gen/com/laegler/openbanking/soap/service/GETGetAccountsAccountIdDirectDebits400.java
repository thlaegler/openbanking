
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.617+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdDirectDebits_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdDirectDebits400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdDirectDebits400;

    public GETGetAccountsAccountIdDirectDebits400() {
        super();
    }

    public GETGetAccountsAccountIdDirectDebits400(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdDirectDebits400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdDirectDebits400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdDirectDebits400) {
        super(message);
        this.getGetAccountsAccountIdDirectDebits400 = getGetAccountsAccountIdDirectDebits400;
    }

    public GETGetAccountsAccountIdDirectDebits400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdDirectDebits400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdDirectDebits400 = getGetAccountsAccountIdDirectDebits400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdDirectDebits400;
    }
}
