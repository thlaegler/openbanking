
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.543+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalScheduledPaymentsInternationalScheduledPaymentId_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId429 extends Exception {

    private java.lang.Object getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429;

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId429() {
        super();
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId429(String message) {
        super(message);
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId429(String message, java.lang.Object getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429) {
        super(message);
        this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429 = getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429;
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId429(String message, java.lang.Object getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429 = getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentId429;
    }
}
