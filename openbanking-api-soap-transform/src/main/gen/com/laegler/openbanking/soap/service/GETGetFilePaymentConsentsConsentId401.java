
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.200+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentConsentsConsentId_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentConsentsConsentId401 extends Exception {

    private java.lang.Object getGetFilePaymentConsentsConsentId401;

    public GETGetFilePaymentConsentsConsentId401() {
        super();
    }

    public GETGetFilePaymentConsentsConsentId401(String message) {
        super(message);
    }

    public GETGetFilePaymentConsentsConsentId401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentConsentsConsentId401(String message, java.lang.Object getGetFilePaymentConsentsConsentId401) {
        super(message);
        this.getGetFilePaymentConsentsConsentId401 = getGetFilePaymentConsentsConsentId401;
    }

    public GETGetFilePaymentConsentsConsentId401(String message, java.lang.Object getGetFilePaymentConsentsConsentId401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentConsentsConsentId401 = getGetFilePaymentConsentsConsentId401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentConsentsConsentId401;
    }
}