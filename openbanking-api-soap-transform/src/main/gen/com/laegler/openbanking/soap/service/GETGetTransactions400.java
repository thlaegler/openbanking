
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.602+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetTransactions_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetTransactions400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetTransactions400;

    public GETGetTransactions400() {
        super();
    }

    public GETGetTransactions400(String message) {
        super(message);
    }

    public GETGetTransactions400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetTransactions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetTransactions400) {
        super(message);
        this.getGetTransactions400 = getGetTransactions400;
    }

    public GETGetTransactions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetTransactions400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetTransactions400 = getGetTransactions400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetTransactions400;
    }
}