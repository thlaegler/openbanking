
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.579+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetProducts_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetProducts429 extends Exception {

    private java.lang.Object getGetProducts429;

    public GETGetProducts429() {
        super();
    }

    public GETGetProducts429(String message) {
        super(message);
    }

    public GETGetProducts429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetProducts429(String message, java.lang.Object getGetProducts429) {
        super(message);
        this.getGetProducts429 = getGetProducts429;
    }

    public GETGetProducts429(String message, java.lang.Object getGetProducts429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetProducts429 = getGetProducts429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetProducts429;
    }
}
