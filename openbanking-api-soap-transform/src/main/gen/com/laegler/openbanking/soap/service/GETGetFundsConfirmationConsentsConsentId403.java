
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.381+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFundsConfirmationConsentsConsentId_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFundsConfirmationConsentsConsentId403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFundsConfirmationConsentsConsentId403;

    public GETGetFundsConfirmationConsentsConsentId403() {
        super();
    }

    public GETGetFundsConfirmationConsentsConsentId403(String message) {
        super(message);
    }

    public GETGetFundsConfirmationConsentsConsentId403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFundsConfirmationConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFundsConfirmationConsentsConsentId403) {
        super(message);
        this.getGetFundsConfirmationConsentsConsentId403 = getGetFundsConfirmationConsentsConsentId403;
    }

    public GETGetFundsConfirmationConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFundsConfirmationConsentsConsentId403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFundsConfirmationConsentsConsentId403 = getGetFundsConfirmationConsentsConsentId403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetFundsConfirmationConsentsConsentId403;
    }
}