
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.237+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalPaymentConsentsConsentId_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalPaymentConsentsConsentId404 extends Exception {

    private java.lang.Object getGetInternationalPaymentConsentsConsentId404;

    public GETGetInternationalPaymentConsentsConsentId404() {
        super();
    }

    public GETGetInternationalPaymentConsentsConsentId404(String message) {
        super(message);
    }

    public GETGetInternationalPaymentConsentsConsentId404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalPaymentConsentsConsentId404(String message, java.lang.Object getGetInternationalPaymentConsentsConsentId404) {
        super(message);
        this.getGetInternationalPaymentConsentsConsentId404 = getGetInternationalPaymentConsentsConsentId404;
    }

    public GETGetInternationalPaymentConsentsConsentId404(String message, java.lang.Object getGetInternationalPaymentConsentsConsentId404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalPaymentConsentsConsentId404 = getGetInternationalPaymentConsentsConsentId404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetInternationalPaymentConsentsConsentId404;
    }
}
