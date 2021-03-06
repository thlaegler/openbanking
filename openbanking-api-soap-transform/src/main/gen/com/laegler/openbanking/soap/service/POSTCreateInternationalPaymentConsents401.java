
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.955+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalPaymentConsents_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalPaymentConsents401 extends Exception {

    private java.lang.Object postCreateInternationalPaymentConsents401;

    public POSTCreateInternationalPaymentConsents401() {
        super();
    }

    public POSTCreateInternationalPaymentConsents401(String message) {
        super(message);
    }

    public POSTCreateInternationalPaymentConsents401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalPaymentConsents401(String message, java.lang.Object postCreateInternationalPaymentConsents401) {
        super(message);
        this.postCreateInternationalPaymentConsents401 = postCreateInternationalPaymentConsents401;
    }

    public POSTCreateInternationalPaymentConsents401(String message, java.lang.Object postCreateInternationalPaymentConsents401, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalPaymentConsents401 = postCreateInternationalPaymentConsents401;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalPaymentConsents401;
    }
}
