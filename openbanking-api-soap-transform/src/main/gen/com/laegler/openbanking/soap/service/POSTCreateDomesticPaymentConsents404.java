
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.465+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticPaymentConsents_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticPaymentConsents404 extends Exception {

    private java.lang.Object postCreateDomesticPaymentConsents404;

    public POSTCreateDomesticPaymentConsents404() {
        super();
    }

    public POSTCreateDomesticPaymentConsents404(String message) {
        super(message);
    }

    public POSTCreateDomesticPaymentConsents404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticPaymentConsents404(String message, java.lang.Object postCreateDomesticPaymentConsents404) {
        super(message);
        this.postCreateDomesticPaymentConsents404 = postCreateDomesticPaymentConsents404;
    }

    public POSTCreateDomesticPaymentConsents404(String message, java.lang.Object postCreateDomesticPaymentConsents404, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticPaymentConsents404 = postCreateDomesticPaymentConsents404;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateDomesticPaymentConsents404;
    }
}
