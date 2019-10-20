
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.509+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetBalances_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetBalances400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBalances400;

    public GETGetBalances400() {
        super();
    }

    public GETGetBalances400(String message) {
        super(message);
    }

    public GETGetBalances400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetBalances400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBalances400) {
        super(message);
        this.getGetBalances400 = getGetBalances400;
    }

    public GETGetBalances400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBalances400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetBalances400 = getGetBalances400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetBalances400;
    }
}
