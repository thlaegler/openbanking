
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.454+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetDirectDebits_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetDirectDebits406 extends Exception {

    private java.lang.Object getGetDirectDebits406;

    public GETGetDirectDebits406() {
        super();
    }

    public GETGetDirectDebits406(String message) {
        super(message);
    }

    public GETGetDirectDebits406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetDirectDebits406(String message, java.lang.Object getGetDirectDebits406) {
        super(message);
        this.getGetDirectDebits406 = getGetDirectDebits406;
    }

    public GETGetDirectDebits406(String message, java.lang.Object getGetDirectDebits406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetDirectDebits406 = getGetDirectDebits406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetDirectDebits406;
    }
}