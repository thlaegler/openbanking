
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.761+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementId_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementId400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementId400;

    public GETGetAccountsAccountIdStatementsStatementId400() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementId400(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementId400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementId400) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementId400 = getGetAccountsAccountIdStatementsStatementId400;
    }

    public GETGetAccountsAccountIdStatementsStatementId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementId400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementId400 = getGetAccountsAccountIdStatementsStatementId400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementId400;
    }
}