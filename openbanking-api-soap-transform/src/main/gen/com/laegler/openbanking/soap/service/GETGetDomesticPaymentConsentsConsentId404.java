
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.603+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetDomesticPaymentConsentsConsentId_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetDomesticPaymentConsentsConsentId404 extends Exception {

    private java.lang.Object getGetDomesticPaymentConsentsConsentId404;

    public GETGetDomesticPaymentConsentsConsentId404() {
        super();
    }

    public GETGetDomesticPaymentConsentsConsentId404(String message) {
        super(message);
    }

    public GETGetDomesticPaymentConsentsConsentId404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetDomesticPaymentConsentsConsentId404(String message, java.lang.Object getGetDomesticPaymentConsentsConsentId404) {
        super(message);
        this.getGetDomesticPaymentConsentsConsentId404 = getGetDomesticPaymentConsentsConsentId404;
    }

    public GETGetDomesticPaymentConsentsConsentId404(String message, java.lang.Object getGetDomesticPaymentConsentsConsentId404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetDomesticPaymentConsentsConsentId404 = getGetDomesticPaymentConsentsConsentId404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetDomesticPaymentConsentsConsentId404;
    }
}
