
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.550+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementIdTransactions_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementIdTransactions429 extends Exception {

    private java.lang.Object getGetAccountsAccountIdStatementsStatementIdTransactions429;

    public GETGetAccountsAccountIdStatementsStatementIdTransactions429() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions429(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions429(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementIdTransactions429) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementIdTransactions429 = getGetAccountsAccountIdStatementsStatementIdTransactions429;
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions429(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementIdTransactions429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementIdTransactions429 = getGetAccountsAccountIdStatementsStatementIdTransactions429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementIdTransactions429;
    }
}
