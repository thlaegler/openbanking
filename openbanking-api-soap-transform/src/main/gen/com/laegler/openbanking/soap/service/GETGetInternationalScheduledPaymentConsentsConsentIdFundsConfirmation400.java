
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.283+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400;

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400() {
        super();
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400(String message) {
        super(message);
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400) {
        super(message);
        this.getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400 = getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400;
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400 = getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation400;
    }
}