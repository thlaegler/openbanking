
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.582+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetProducts_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetProducts403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetProducts403;

    public GETGetProducts403() {
        super();
    }

    public GETGetProducts403(String message) {
        super(message);
    }

    public GETGetProducts403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetProducts403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetProducts403) {
        super(message);
        this.getGetProducts403 = getGetProducts403;
    }

    public GETGetProducts403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetProducts403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetProducts403 = getGetProducts403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetProducts403;
    }
}