
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.575+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalScheduledPaymentConsents_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalScheduledPaymentConsents404 extends Exception {

    private java.lang.Object postCreateInternationalScheduledPaymentConsents404;

    public POSTCreateInternationalScheduledPaymentConsents404() {
        super();
    }

    public POSTCreateInternationalScheduledPaymentConsents404(String message) {
        super(message);
    }

    public POSTCreateInternationalScheduledPaymentConsents404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalScheduledPaymentConsents404(String message, java.lang.Object postCreateInternationalScheduledPaymentConsents404) {
        super(message);
        this.postCreateInternationalScheduledPaymentConsents404 = postCreateInternationalScheduledPaymentConsents404;
    }

    public POSTCreateInternationalScheduledPaymentConsents404(String message, java.lang.Object postCreateInternationalScheduledPaymentConsents404, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalScheduledPaymentConsents404 = postCreateInternationalScheduledPaymentConsents404;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalScheduledPaymentConsents404;
    }
}
