
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.350+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatements_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatements500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatements500;

    public GETGetAccountsAccountIdStatements500() {
        super();
    }

    public GETGetAccountsAccountIdStatements500(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatements500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatements500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatements500) {
        super(message);
        this.getGetAccountsAccountIdStatements500 = getGetAccountsAccountIdStatements500;
    }

    public GETGetAccountsAccountIdStatements500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatements500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatements500 = getGetAccountsAccountIdStatements500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdStatements500;
    }
}
