
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.384+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFundsConfirmationConsentsConsentId_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFundsConfirmationConsentsConsentId406 extends Exception {

    private java.lang.Object getGetFundsConfirmationConsentsConsentId406;

    public GETGetFundsConfirmationConsentsConsentId406() {
        super();
    }

    public GETGetFundsConfirmationConsentsConsentId406(String message) {
        super(message);
    }

    public GETGetFundsConfirmationConsentsConsentId406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFundsConfirmationConsentsConsentId406(String message, java.lang.Object getGetFundsConfirmationConsentsConsentId406) {
        super(message);
        this.getGetFundsConfirmationConsentsConsentId406 = getGetFundsConfirmationConsentsConsentId406;
    }

    public GETGetFundsConfirmationConsentsConsentId406(String message, java.lang.Object getGetFundsConfirmationConsentsConsentId406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFundsConfirmationConsentsConsentId406 = getGetFundsConfirmationConsentsConsentId406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFundsConfirmationConsentsConsentId406;
    }
}