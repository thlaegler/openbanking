
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.584+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetProducts_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetProducts500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetProducts500;

    public GETGetProducts500() {
        super();
    }

    public GETGetProducts500(String message) {
        super(message);
    }

    public GETGetProducts500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetProducts500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetProducts500) {
        super(message);
        this.getGetProducts500 = getGetProducts500;
    }

    public GETGetProducts500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetProducts500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetProducts500 = getGetProducts500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetProducts500;
    }
}
