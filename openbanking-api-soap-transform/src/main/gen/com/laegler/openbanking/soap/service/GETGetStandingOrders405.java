
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.839+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetStandingOrders_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetStandingOrders405 extends Exception {

    private java.lang.Object getGetStandingOrders405;

    public GETGetStandingOrders405() {
        super();
    }

    public GETGetStandingOrders405(String message) {
        super(message);
    }

    public GETGetStandingOrders405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetStandingOrders405(String message, java.lang.Object getGetStandingOrders405) {
        super(message);
        this.getGetStandingOrders405 = getGetStandingOrders405;
    }

    public GETGetStandingOrders405(String message, java.lang.Object getGetStandingOrders405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetStandingOrders405 = getGetStandingOrders405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetStandingOrders405;
    }
}
