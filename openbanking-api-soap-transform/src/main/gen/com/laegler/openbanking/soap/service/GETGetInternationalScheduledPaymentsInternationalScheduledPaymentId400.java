
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.538+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalScheduledPaymentsInternationalScheduledPaymentId_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400;

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId400() {
        super();
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId400(String message) {
        super(message);
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400) {
        super(message);
        this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400 = getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400;
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400 = getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentId400;
    }
}