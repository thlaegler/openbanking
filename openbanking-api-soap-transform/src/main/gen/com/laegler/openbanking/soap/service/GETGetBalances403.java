
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.507+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetBalances_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetBalances403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBalances403;

    public GETGetBalances403() {
        super();
    }

    public GETGetBalances403(String message) {
        super(message);
    }

    public GETGetBalances403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetBalances403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBalances403) {
        super(message);
        this.getGetBalances403 = getGetBalances403;
    }

    public GETGetBalances403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBalances403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetBalances403 = getGetBalances403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetBalances403;
    }
}
