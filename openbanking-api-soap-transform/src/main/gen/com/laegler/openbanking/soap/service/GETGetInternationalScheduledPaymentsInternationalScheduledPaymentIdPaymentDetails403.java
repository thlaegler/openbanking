
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.429+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403;

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403() {
        super();
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403(String message) {
        super(message);
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403) {
        super(message);
        this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403 = getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403;
    }

    public GETGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403 = getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails403;
    }
}
