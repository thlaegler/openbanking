
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.471+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetOffers_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetOffers406 extends Exception {

    private java.lang.Object getGetOffers406;

    public GETGetOffers406() {
        super();
    }

    public GETGetOffers406(String message) {
        super(message);
    }

    public GETGetOffers406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetOffers406(String message, java.lang.Object getGetOffers406) {
        super(message);
        this.getGetOffers406 = getGetOffers406;
    }

    public GETGetOffers406(String message, java.lang.Object getGetOffers406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetOffers406 = getGetOffers406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetOffers406;
    }
}
