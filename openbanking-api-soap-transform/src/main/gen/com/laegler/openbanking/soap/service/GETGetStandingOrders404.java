
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.829+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetStandingOrders_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetStandingOrders404 extends Exception {

    private java.lang.Object getGetStandingOrders404;

    public GETGetStandingOrders404() {
        super();
    }

    public GETGetStandingOrders404(String message) {
        super(message);
    }

    public GETGetStandingOrders404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetStandingOrders404(String message, java.lang.Object getGetStandingOrders404) {
        super(message);
        this.getGetStandingOrders404 = getGetStandingOrders404;
    }

    public GETGetStandingOrders404(String message, java.lang.Object getGetStandingOrders404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetStandingOrders404 = getGetStandingOrders404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetStandingOrders404;
    }
}