
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.065+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalStandingOrderConsentsConsentId_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalStandingOrderConsentsConsentId429 extends Exception {

    private java.lang.Object getGetInternationalStandingOrderConsentsConsentId429;

    public GETGetInternationalStandingOrderConsentsConsentId429() {
        super();
    }

    public GETGetInternationalStandingOrderConsentsConsentId429(String message) {
        super(message);
    }

    public GETGetInternationalStandingOrderConsentsConsentId429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalStandingOrderConsentsConsentId429(String message, java.lang.Object getGetInternationalStandingOrderConsentsConsentId429) {
        super(message);
        this.getGetInternationalStandingOrderConsentsConsentId429 = getGetInternationalStandingOrderConsentsConsentId429;
    }

    public GETGetInternationalStandingOrderConsentsConsentId429(String message, java.lang.Object getGetInternationalStandingOrderConsentsConsentId429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalStandingOrderConsentsConsentId429 = getGetInternationalStandingOrderConsentsConsentId429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetInternationalStandingOrderConsentsConsentId429;
    }
}
