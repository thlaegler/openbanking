
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.212+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetScheduledPayments_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetScheduledPayments405 extends Exception {

    private java.lang.Object getGetScheduledPayments405;

    public GETGetScheduledPayments405() {
        super();
    }

    public GETGetScheduledPayments405(String message) {
        super(message);
    }

    public GETGetScheduledPayments405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetScheduledPayments405(String message, java.lang.Object getGetScheduledPayments405) {
        super(message);
        this.getGetScheduledPayments405 = getGetScheduledPayments405;
    }

    public GETGetScheduledPayments405(String message, java.lang.Object getGetScheduledPayments405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetScheduledPayments405 = getGetScheduledPayments405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetScheduledPayments405;
    }
}