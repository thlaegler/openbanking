
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.351+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatements_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatements400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatements400;

    public GETGetAccountsAccountIdStatements400() {
        super();
    }

    public GETGetAccountsAccountIdStatements400(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatements400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatements400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatements400) {
        super(message);
        this.getGetAccountsAccountIdStatements400 = getGetAccountsAccountIdStatements400;
    }

    public GETGetAccountsAccountIdStatements400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatements400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatements400 = getGetAccountsAccountIdStatements400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdStatements400;
    }
}
