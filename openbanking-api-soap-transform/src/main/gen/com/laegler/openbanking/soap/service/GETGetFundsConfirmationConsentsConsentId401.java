
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.379+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFundsConfirmationConsentsConsentId_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFundsConfirmationConsentsConsentId401 extends Exception {

    private java.lang.Object getGetFundsConfirmationConsentsConsentId401;

    public GETGetFundsConfirmationConsentsConsentId401() {
        super();
    }

    public GETGetFundsConfirmationConsentsConsentId401(String message) {
        super(message);
    }

    public GETGetFundsConfirmationConsentsConsentId401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFundsConfirmationConsentsConsentId401(String message, java.lang.Object getGetFundsConfirmationConsentsConsentId401) {
        super(message);
        this.getGetFundsConfirmationConsentsConsentId401 = getGetFundsConfirmationConsentsConsentId401;
    }

    public GETGetFundsConfirmationConsentsConsentId401(String message, java.lang.Object getGetFundsConfirmationConsentsConsentId401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFundsConfirmationConsentsConsentId401 = getGetFundsConfirmationConsentsConsentId401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFundsConfirmationConsentsConsentId401;
    }
}