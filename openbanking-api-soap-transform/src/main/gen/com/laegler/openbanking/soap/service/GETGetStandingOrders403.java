
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.831+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetStandingOrders_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetStandingOrders403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStandingOrders403;

    public GETGetStandingOrders403() {
        super();
    }

    public GETGetStandingOrders403(String message) {
        super(message);
    }

    public GETGetStandingOrders403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetStandingOrders403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStandingOrders403) {
        super(message);
        this.getGetStandingOrders403 = getGetStandingOrders403;
    }

    public GETGetStandingOrders403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStandingOrders403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetStandingOrders403 = getGetStandingOrders403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetStandingOrders403;
    }
}
