
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.584+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetProducts_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetProducts401 extends Exception {

    private java.lang.Object getGetProducts401;

    public GETGetProducts401() {
        super();
    }

    public GETGetProducts401(String message) {
        super(message);
    }

    public GETGetProducts401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetProducts401(String message, java.lang.Object getGetProducts401) {
        super(message);
        this.getGetProducts401 = getGetProducts401;
    }

    public GETGetProducts401(String message, java.lang.Object getGetProducts401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetProducts401 = getGetProducts401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetProducts401;
    }
}
