
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.374+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteFundsConfirmationConsentsConsentId_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteFundsConfirmationConsentsConsentId401 extends Exception {

    private java.lang.Object deleteDeleteFundsConfirmationConsentsConsentId401;

    public DELETEDeleteFundsConfirmationConsentsConsentId401() {
        super();
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId401(String message) {
        super(message);
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId401(String message, java.lang.Object deleteDeleteFundsConfirmationConsentsConsentId401) {
        super(message);
        this.deleteDeleteFundsConfirmationConsentsConsentId401 = deleteDeleteFundsConfirmationConsentsConsentId401;
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId401(String message, java.lang.Object deleteDeleteFundsConfirmationConsentsConsentId401, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteFundsConfirmationConsentsConsentId401 = deleteDeleteFundsConfirmationConsentsConsentId401;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteFundsConfirmationConsentsConsentId401;
    }
}
