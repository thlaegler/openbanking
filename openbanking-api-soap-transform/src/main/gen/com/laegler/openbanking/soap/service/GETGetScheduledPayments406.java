
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.207+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetScheduledPayments_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetScheduledPayments406 extends Exception {

    private java.lang.Object getGetScheduledPayments406;

    public GETGetScheduledPayments406() {
        super();
    }

    public GETGetScheduledPayments406(String message) {
        super(message);
    }

    public GETGetScheduledPayments406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetScheduledPayments406(String message, java.lang.Object getGetScheduledPayments406) {
        super(message);
        this.getGetScheduledPayments406 = getGetScheduledPayments406;
    }

    public GETGetScheduledPayments406(String message, java.lang.Object getGetScheduledPayments406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetScheduledPayments406 = getGetScheduledPayments406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetScheduledPayments406;
    }
}