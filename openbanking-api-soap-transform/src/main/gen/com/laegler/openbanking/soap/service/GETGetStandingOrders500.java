
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.834+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetStandingOrders_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetStandingOrders500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStandingOrders500;

    public GETGetStandingOrders500() {
        super();
    }

    public GETGetStandingOrders500(String message) {
        super(message);
    }

    public GETGetStandingOrders500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetStandingOrders500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStandingOrders500) {
        super(message);
        this.getGetStandingOrders500 = getGetStandingOrders500;
    }

    public GETGetStandingOrders500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStandingOrders500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetStandingOrders500 = getGetStandingOrders500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetStandingOrders500;
    }
}