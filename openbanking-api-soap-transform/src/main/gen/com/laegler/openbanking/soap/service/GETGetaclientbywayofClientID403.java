
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.184+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetaclientbywayofClientID_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetaclientbywayofClientID403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetaclientbywayofClientID403;

    public GETGetaclientbywayofClientID403() {
        super();
    }

    public GETGetaclientbywayofClientID403(String message) {
        super(message);
    }

    public GETGetaclientbywayofClientID403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetaclientbywayofClientID403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetaclientbywayofClientID403) {
        super(message);
        this.getGetaclientbywayofClientID403 = getGetaclientbywayofClientID403;
    }

    public GETGetaclientbywayofClientID403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetaclientbywayofClientID403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetaclientbywayofClientID403 = getGetaclientbywayofClientID403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetaclientbywayofClientID403;
    }
}
