
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.555+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementIdTransactions_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementIdTransactions400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementIdTransactions400;

    public GETGetAccountsAccountIdStatementsStatementIdTransactions400() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions400(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementIdTransactions400) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementIdTransactions400 = getGetAccountsAccountIdStatementsStatementIdTransactions400;
    }

    public GETGetAccountsAccountIdStatementsStatementIdTransactions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdStatementsStatementIdTransactions400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementIdTransactions400 = getGetAccountsAccountIdStatementsStatementIdTransactions400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementIdTransactions400;
    }
}
