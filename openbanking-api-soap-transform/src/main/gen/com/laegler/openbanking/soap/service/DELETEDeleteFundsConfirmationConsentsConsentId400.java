
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.373+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteFundsConfirmationConsentsConsentId_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteFundsConfirmationConsentsConsentId400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 deleteDeleteFundsConfirmationConsentsConsentId400;

    public DELETEDeleteFundsConfirmationConsentsConsentId400() {
        super();
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId400(String message) {
        super(message);
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 deleteDeleteFundsConfirmationConsentsConsentId400) {
        super(message);
        this.deleteDeleteFundsConfirmationConsentsConsentId400 = deleteDeleteFundsConfirmationConsentsConsentId400;
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 deleteDeleteFundsConfirmationConsentsConsentId400, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteFundsConfirmationConsentsConsentId400 = deleteDeleteFundsConfirmationConsentsConsentId400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.deleteDeleteFundsConfirmationConsentsConsentId400;
    }
}
