
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.604+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetDomesticPaymentConsentsConsentId_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetDomesticPaymentConsentsConsentId403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticPaymentConsentsConsentId403;

    public GETGetDomesticPaymentConsentsConsentId403() {
        super();
    }

    public GETGetDomesticPaymentConsentsConsentId403(String message) {
        super(message);
    }

    public GETGetDomesticPaymentConsentsConsentId403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetDomesticPaymentConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticPaymentConsentsConsentId403) {
        super(message);
        this.getGetDomesticPaymentConsentsConsentId403 = getGetDomesticPaymentConsentsConsentId403;
    }

    public GETGetDomesticPaymentConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticPaymentConsentsConsentId403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetDomesticPaymentConsentsConsentId403 = getGetDomesticPaymentConsentsConsentId403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetDomesticPaymentConsentsConsentId403;
    }
}
