
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.203+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentConsentsConsentId_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentConsentsConsentId405 extends Exception {

    private java.lang.Object getGetFilePaymentConsentsConsentId405;

    public GETGetFilePaymentConsentsConsentId405() {
        super();
    }

    public GETGetFilePaymentConsentsConsentId405(String message) {
        super(message);
    }

    public GETGetFilePaymentConsentsConsentId405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentConsentsConsentId405(String message, java.lang.Object getGetFilePaymentConsentsConsentId405) {
        super(message);
        this.getGetFilePaymentConsentsConsentId405 = getGetFilePaymentConsentsConsentId405;
    }

    public GETGetFilePaymentConsentsConsentId405(String message, java.lang.Object getGetFilePaymentConsentsConsentId405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentConsentsConsentId405 = getGetFilePaymentConsentsConsentId405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentConsentsConsentId405;
    }
}