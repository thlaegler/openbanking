
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.060+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalStandingOrderConsentsConsentId_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalStandingOrderConsentsConsentId403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrderConsentsConsentId403;

    public GETGetInternationalStandingOrderConsentsConsentId403() {
        super();
    }

    public GETGetInternationalStandingOrderConsentsConsentId403(String message) {
        super(message);
    }

    public GETGetInternationalStandingOrderConsentsConsentId403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalStandingOrderConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrderConsentsConsentId403) {
        super(message);
        this.getGetInternationalStandingOrderConsentsConsentId403 = getGetInternationalStandingOrderConsentsConsentId403;
    }

    public GETGetInternationalStandingOrderConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrderConsentsConsentId403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalStandingOrderConsentsConsentId403 = getGetInternationalStandingOrderConsentsConsentId403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalStandingOrderConsentsConsentId403;
    }
}
