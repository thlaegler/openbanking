
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.471+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetOffers_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetOffers400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetOffers400;

    public GETGetOffers400() {
        super();
    }

    public GETGetOffers400(String message) {
        super(message);
    }

    public GETGetOffers400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetOffers400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetOffers400) {
        super(message);
        this.getGetOffers400 = getGetOffers400;
    }

    public GETGetOffers400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetOffers400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetOffers400 = getGetOffers400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetOffers400;
    }
}