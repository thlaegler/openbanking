
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.942+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalPaymentsInternationalPaymentIdPaymentDetails_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails429 extends Exception {

    private java.lang.Object getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429;

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails429() {
        super();
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails429(String message) {
        super(message);
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails429(String message, java.lang.Object getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429) {
        super(message);
        this.getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429 = getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429;
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails429(String message, java.lang.Object getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429 = getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetInternationalPaymentsInternationalPaymentIdPaymentDetails429;
    }
}