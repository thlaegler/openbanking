
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.961+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalPaymentConsents_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalPaymentConsents404 extends Exception {

    private java.lang.Object postCreateInternationalPaymentConsents404;

    public POSTCreateInternationalPaymentConsents404() {
        super();
    }

    public POSTCreateInternationalPaymentConsents404(String message) {
        super(message);
    }

    public POSTCreateInternationalPaymentConsents404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalPaymentConsents404(String message, java.lang.Object postCreateInternationalPaymentConsents404) {
        super(message);
        this.postCreateInternationalPaymentConsents404 = postCreateInternationalPaymentConsents404;
    }

    public POSTCreateInternationalPaymentConsents404(String message, java.lang.Object postCreateInternationalPaymentConsents404, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalPaymentConsents404 = postCreateInternationalPaymentConsents404;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalPaymentConsents404;
    }
}