
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.206+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetScheduledPayments_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetScheduledPayments429 extends Exception {

    private java.lang.Object getGetScheduledPayments429;

    public GETGetScheduledPayments429() {
        super();
    }

    public GETGetScheduledPayments429(String message) {
        super(message);
    }

    public GETGetScheduledPayments429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetScheduledPayments429(String message, java.lang.Object getGetScheduledPayments429) {
        super(message);
        this.getGetScheduledPayments429 = getGetScheduledPayments429;
    }

    public GETGetScheduledPayments429(String message, java.lang.Object getGetScheduledPayments429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetScheduledPayments429 = getGetScheduledPayments429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetScheduledPayments429;
    }
}