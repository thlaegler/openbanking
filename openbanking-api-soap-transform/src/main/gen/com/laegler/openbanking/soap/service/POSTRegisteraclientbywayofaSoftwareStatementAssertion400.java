
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.475+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_RegisteraclientbywayofaSoftwareStatementAssertion_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTRegisteraclientbywayofaSoftwareStatementAssertion400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postRegisteraclientbywayofaSoftwareStatementAssertion400;

    public POSTRegisteraclientbywayofaSoftwareStatementAssertion400() {
        super();
    }

    public POSTRegisteraclientbywayofaSoftwareStatementAssertion400(String message) {
        super(message);
    }

    public POSTRegisteraclientbywayofaSoftwareStatementAssertion400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTRegisteraclientbywayofaSoftwareStatementAssertion400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postRegisteraclientbywayofaSoftwareStatementAssertion400) {
        super(message);
        this.postRegisteraclientbywayofaSoftwareStatementAssertion400 = postRegisteraclientbywayofaSoftwareStatementAssertion400;
    }

    public POSTRegisteraclientbywayofaSoftwareStatementAssertion400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postRegisteraclientbywayofaSoftwareStatementAssertion400, java.lang.Throwable cause) {
        super(message, cause);
        this.postRegisteraclientbywayofaSoftwareStatementAssertion400 = postRegisteraclientbywayofaSoftwareStatementAssertion400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postRegisteraclientbywayofaSoftwareStatementAssertion400;
    }
}
