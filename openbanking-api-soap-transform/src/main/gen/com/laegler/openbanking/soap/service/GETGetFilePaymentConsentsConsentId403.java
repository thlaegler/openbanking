
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.202+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentConsentsConsentId_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentConsentsConsentId403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentConsentsConsentId403;

    public GETGetFilePaymentConsentsConsentId403() {
        super();
    }

    public GETGetFilePaymentConsentsConsentId403(String message) {
        super(message);
    }

    public GETGetFilePaymentConsentsConsentId403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentConsentsConsentId403) {
        super(message);
        this.getGetFilePaymentConsentsConsentId403 = getGetFilePaymentConsentsConsentId403;
    }

    public GETGetFilePaymentConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentConsentsConsentId403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentConsentsConsentId403 = getGetFilePaymentConsentsConsentId403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetFilePaymentConsentsConsentId403;
    }
}
