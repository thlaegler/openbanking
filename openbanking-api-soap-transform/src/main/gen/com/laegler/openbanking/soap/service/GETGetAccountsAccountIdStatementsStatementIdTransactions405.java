
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.551+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementIdTransactions_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementIdTransactions405 extends Exception {

    private java.lang.Object getGetAccountsAccountIdStatementsStatementIdTransactions405;

    public GETGetAccountsAccountIdStatementsStatementIdTransactions405() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions405(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions405(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementIdTransactions405) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementIdTransactions405 = getGetAccountsAccountIdStatementsStatementIdTransactions405;
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions405(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementIdTransactions405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementIdTransactions405 = getGetAccountsAccountIdStatementsStatementIdTransactions405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementIdTransactions405;
    }
}
