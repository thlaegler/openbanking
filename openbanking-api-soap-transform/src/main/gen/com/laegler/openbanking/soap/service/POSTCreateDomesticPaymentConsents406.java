
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.467+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticPaymentConsents_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticPaymentConsents406 extends Exception {

    private java.lang.Object postCreateDomesticPaymentConsents406;

    public POSTCreateDomesticPaymentConsents406() {
        super();
    }

    public POSTCreateDomesticPaymentConsents406(String message) {
        super(message);
    }

    public POSTCreateDomesticPaymentConsents406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticPaymentConsents406(String message, java.lang.Object postCreateDomesticPaymentConsents406) {
        super(message);
        this.postCreateDomesticPaymentConsents406 = postCreateDomesticPaymentConsents406;
    }

    public POSTCreateDomesticPaymentConsents406(String message, java.lang.Object postCreateDomesticPaymentConsents406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticPaymentConsents406 = postCreateDomesticPaymentConsents406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateDomesticPaymentConsents406;
    }
}
