
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.838+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetStandingOrders_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetStandingOrders406 extends Exception {

    private java.lang.Object getGetStandingOrders406;

    public GETGetStandingOrders406() {
        super();
    }

    public GETGetStandingOrders406(String message) {
        super(message);
    }

    public GETGetStandingOrders406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetStandingOrders406(String message, java.lang.Object getGetStandingOrders406) {
        super(message);
        this.getGetStandingOrders406 = getGetStandingOrders406;
    }

    public GETGetStandingOrders406(String message, java.lang.Object getGetStandingOrders406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetStandingOrders406 = getGetStandingOrders406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetStandingOrders406;
    }
}
