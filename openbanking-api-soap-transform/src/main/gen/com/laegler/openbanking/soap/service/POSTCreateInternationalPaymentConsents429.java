
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.963+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalPaymentConsents_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalPaymentConsents429 extends Exception {

    private java.lang.Object postCreateInternationalPaymentConsents429;

    public POSTCreateInternationalPaymentConsents429() {
        super();
    }

    public POSTCreateInternationalPaymentConsents429(String message) {
        super(message);
    }

    public POSTCreateInternationalPaymentConsents429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalPaymentConsents429(String message, java.lang.Object postCreateInternationalPaymentConsents429) {
        super(message);
        this.postCreateInternationalPaymentConsents429 = postCreateInternationalPaymentConsents429;
    }

    public POSTCreateInternationalPaymentConsents429(String message, java.lang.Object postCreateInternationalPaymentConsents429, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalPaymentConsents429 = postCreateInternationalPaymentConsents429;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalPaymentConsents429;
    }
}