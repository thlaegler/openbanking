
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.757+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdStatementsStatementId_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdStatementsStatementId401 extends Exception {

    private java.lang.Object getGetAccountsAccountIdStatementsStatementId401;

    public GETGetAccountsAccountIdStatementsStatementId401() {
        super();
    }

    public GETGetAccountsAccountIdStatementsStatementId401(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdStatementsStatementId401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdStatementsStatementId401(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementId401) {
        super(message);
        this.getGetAccountsAccountIdStatementsStatementId401 = getGetAccountsAccountIdStatementsStatementId401;
    }

    public GETGetAccountsAccountIdStatementsStatementId401(String message, java.lang.Object getGetAccountsAccountIdStatementsStatementId401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdStatementsStatementId401 = getGetAccountsAccountIdStatementsStatementId401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdStatementsStatementId401;
    }
}
