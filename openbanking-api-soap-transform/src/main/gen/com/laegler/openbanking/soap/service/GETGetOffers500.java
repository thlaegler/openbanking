
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.473+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetOffers_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetOffers500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetOffers500;

    public GETGetOffers500() {
        super();
    }

    public GETGetOffers500(String message) {
        super(message);
    }

    public GETGetOffers500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetOffers500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetOffers500) {
        super(message);
        this.getGetOffers500 = getGetOffers500;
    }

    public GETGetOffers500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetOffers500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetOffers500 = getGetOffers500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetOffers500;
    }
}
