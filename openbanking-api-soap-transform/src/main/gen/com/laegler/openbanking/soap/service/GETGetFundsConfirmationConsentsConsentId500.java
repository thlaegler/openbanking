
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.380+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFundsConfirmationConsentsConsentId_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFundsConfirmationConsentsConsentId500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFundsConfirmationConsentsConsentId500;

    public GETGetFundsConfirmationConsentsConsentId500() {
        super();
    }

    public GETGetFundsConfirmationConsentsConsentId500(String message) {
        super(message);
    }

    public GETGetFundsConfirmationConsentsConsentId500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFundsConfirmationConsentsConsentId500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFundsConfirmationConsentsConsentId500) {
        super(message);
        this.getGetFundsConfirmationConsentsConsentId500 = getGetFundsConfirmationConsentsConsentId500;
    }

    public GETGetFundsConfirmationConsentsConsentId500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFundsConfirmationConsentsConsentId500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFundsConfirmationConsentsConsentId500 = getGetFundsConfirmationConsentsConsentId500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetFundsConfirmationConsentsConsentId500;
    }
}
