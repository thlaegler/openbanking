
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.523+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalStandingOrdersInternationalStandingOrderPaymentId_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalStandingOrdersInternationalStandingOrderPaymentId400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400;

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentId400() {
        super();
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentId400(String message) {
        super(message);
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentId400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400) {
        super(message);
        this.getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400 = getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400;
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400 = getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalStandingOrdersInternationalStandingOrderPaymentId400;
    }
}