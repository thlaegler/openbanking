
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.411+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalPaymentConsentsConsentIdFundsConfirmation_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalPaymentConsentsConsentIdFundsConfirmation500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentConsentsConsentIdFundsConfirmation500;

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation500() {
        super();
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation500(String message) {
        super(message);
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentConsentsConsentIdFundsConfirmation500) {
        super(message);
        this.getGetInternationalPaymentConsentsConsentIdFundsConfirmation500 = getGetInternationalPaymentConsentsConsentIdFundsConfirmation500;
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentConsentsConsentIdFundsConfirmation500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalPaymentConsentsConsentIdFundsConfirmation500 = getGetInternationalPaymentConsentsConsentIdFundsConfirmation500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalPaymentConsentsConsentIdFundsConfirmation500;
    }
}
