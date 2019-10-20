
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.477+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFilePaymentConsentsConsentIdFile_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFilePaymentConsentsConsentIdFile401 extends Exception {

    private java.lang.Object postCreateFilePaymentConsentsConsentIdFile401;

    public POSTCreateFilePaymentConsentsConsentIdFile401() {
        super();
    }

    public POSTCreateFilePaymentConsentsConsentIdFile401(String message) {
        super(message);
    }

    public POSTCreateFilePaymentConsentsConsentIdFile401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFilePaymentConsentsConsentIdFile401(String message, java.lang.Object postCreateFilePaymentConsentsConsentIdFile401) {
        super(message);
        this.postCreateFilePaymentConsentsConsentIdFile401 = postCreateFilePaymentConsentsConsentIdFile401;
    }

    public POSTCreateFilePaymentConsentsConsentIdFile401(String message, java.lang.Object postCreateFilePaymentConsentsConsentIdFile401, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFilePaymentConsentsConsentIdFile401 = postCreateFilePaymentConsentsConsentIdFile401;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFilePaymentConsentsConsentIdFile401;
    }
}