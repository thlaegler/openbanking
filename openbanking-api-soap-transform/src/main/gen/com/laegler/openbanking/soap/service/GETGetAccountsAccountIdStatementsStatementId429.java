
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.770+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementId_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementId429 extends Exception {

    private java.lang.Object getGetAccountsAccountIdStatementsStatementId429;

    public GETGetAccountsAccountIdStatementsStatementId429() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementId429(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementId429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementId429(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementId429) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementId429 = getGetAccountsAccountIdStatementsStatementId429;
    }

    public GETGetAccountsAccountIdStatementsStatementId429(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementId429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementId429 = getGetAccountsAccountIdStatementsStatementId429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementId429;
    }
}
