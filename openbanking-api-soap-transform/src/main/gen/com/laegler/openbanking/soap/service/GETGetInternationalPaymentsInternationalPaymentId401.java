
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.527+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalPaymentsInternationalPaymentId_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalPaymentsInternationalPaymentId401 extends Exception {

    private java.lang.Object getGetInternationalPaymentsInternationalPaymentId401;

    public GETGetInternationalPaymentsInternationalPaymentId401() {
        super();
    }

    public GETGetInternationalPaymentsInternationalPaymentId401(String message) {
        super(message);
    }

    public GETGetInternationalPaymentsInternationalPaymentId401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalPaymentsInternationalPaymentId401(String message, java.lang.Object getGetInternationalPaymentsInternationalPaymentId401) {
        super(message);
        this.getGetInternationalPaymentsInternationalPaymentId401 = getGetInternationalPaymentsInternationalPaymentId401;
    }

    public GETGetInternationalPaymentsInternationalPaymentId401(String message, java.lang.Object getGetInternationalPaymentsInternationalPaymentId401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalPaymentsInternationalPaymentId401 = getGetInternationalPaymentsInternationalPaymentId401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetInternationalPaymentsInternationalPaymentId401;
    }
}
