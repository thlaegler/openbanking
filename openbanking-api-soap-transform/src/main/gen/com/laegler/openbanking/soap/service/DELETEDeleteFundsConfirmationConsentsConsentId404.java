
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.370+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteFundsConfirmationConsentsConsentId_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteFundsConfirmationConsentsConsentId404 extends Exception {

    private java.lang.Object deleteDeleteFundsConfirmationConsentsConsentId404;

    public DELETEDeleteFundsConfirmationConsentsConsentId404() {
        super();
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId404(String message) {
        super(message);
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId404(String message, java.lang.Object deleteDeleteFundsConfirmationConsentsConsentId404) {
        super(message);
        this.deleteDeleteFundsConfirmationConsentsConsentId404 = deleteDeleteFundsConfirmationConsentsConsentId404;
    }

    public DELETEDeleteFundsConfirmationConsentsConsentId404(String message, java.lang.Object deleteDeleteFundsConfirmationConsentsConsentId404, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteFundsConfirmationConsentsConsentId404 = deleteDeleteFundsConfirmationConsentsConsentId404;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteFundsConfirmationConsentsConsentId404;
    }
}
