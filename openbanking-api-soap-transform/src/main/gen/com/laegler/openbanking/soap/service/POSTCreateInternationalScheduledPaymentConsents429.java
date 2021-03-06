
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.578+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalScheduledPaymentConsents_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalScheduledPaymentConsents429 extends Exception {

    private java.lang.Object postCreateInternationalScheduledPaymentConsents429;

    public POSTCreateInternationalScheduledPaymentConsents429() {
        super();
    }

    public POSTCreateInternationalScheduledPaymentConsents429(String message) {
        super(message);
    }

    public POSTCreateInternationalScheduledPaymentConsents429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalScheduledPaymentConsents429(String message, java.lang.Object postCreateInternationalScheduledPaymentConsents429) {
        super(message);
        this.postCreateInternationalScheduledPaymentConsents429 = postCreateInternationalScheduledPaymentConsents429;
    }

    public POSTCreateInternationalScheduledPaymentConsents429(String message, java.lang.Object postCreateInternationalScheduledPaymentConsents429, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalScheduledPaymentConsents429 = postCreateInternationalScheduledPaymentConsents429;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalScheduledPaymentConsents429;
    }
}
