
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.535+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFilePaymentConsents_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFilePaymentConsents406 extends Exception {

    private java.lang.Object postCreateFilePaymentConsents406;

    public POSTCreateFilePaymentConsents406() {
        super();
    }

    public POSTCreateFilePaymentConsents406(String message) {
        super(message);
    }

    public POSTCreateFilePaymentConsents406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFilePaymentConsents406(String message, java.lang.Object postCreateFilePaymentConsents406) {
        super(message);
        this.postCreateFilePaymentConsents406 = postCreateFilePaymentConsents406;
    }

    public POSTCreateFilePaymentConsents406(String message, java.lang.Object postCreateFilePaymentConsents406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFilePaymentConsents406 = postCreateFilePaymentConsents406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFilePaymentConsents406;
    }
}