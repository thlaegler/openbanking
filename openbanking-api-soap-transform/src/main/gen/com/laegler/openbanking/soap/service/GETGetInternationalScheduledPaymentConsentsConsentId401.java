
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.514+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalScheduledPaymentConsentsConsentId_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalScheduledPaymentConsentsConsentId401 extends Exception {

    private java.lang.Object getGetInternationalScheduledPaymentConsentsConsentId401;

    public GETGetInternationalScheduledPaymentConsentsConsentId401() {
        super();
    }

    public GETGetInternationalScheduledPaymentConsentsConsentId401(String message) {
        super(message);
    }

    public GETGetInternationalScheduledPaymentConsentsConsentId401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalScheduledPaymentConsentsConsentId401(String message, java.lang.Object getGetInternationalScheduledPaymentConsentsConsentId401) {
        super(message);
        this.getGetInternationalScheduledPaymentConsentsConsentId401 = getGetInternationalScheduledPaymentConsentsConsentId401;
    }

    public GETGetInternationalScheduledPaymentConsentsConsentId401(String message, java.lang.Object getGetInternationalScheduledPaymentConsentsConsentId401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalScheduledPaymentConsentsConsentId401 = getGetInternationalScheduledPaymentConsentsConsentId401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetInternationalScheduledPaymentConsentsConsentId401;
    }
}