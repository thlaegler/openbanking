
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.767+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementId_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementId404 extends Exception {

    private java.lang.Object getGetAccountsAccountIdStatementsStatementId404;

    public GETGetAccountsAccountIdStatementsStatementId404() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementId404(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementId404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementId404(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementId404) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementId404 = getGetAccountsAccountIdStatementsStatementId404;
    }

    public GETGetAccountsAccountIdStatementsStatementId404(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementId404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementId404 = getGetAccountsAccountIdStatementsStatementId404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementId404;
    }
}