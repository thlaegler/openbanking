
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.389+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementIdFile_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementIdFile403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementIdFile403;

    public GETGetAccountsAccountIdStatementsStatementIdFile403() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementIdFile403(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementIdFile403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementIdFile403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementIdFile403) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementIdFile403 = getGetAccountsAccountIdStatementsStatementIdFile403;
    }

    public GETGetAccountsAccountIdStatementsStatementIdFile403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementIdFile403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementIdFile403 = getGetAccountsAccountIdStatementsStatementIdFile403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementIdFile403;
    }
}