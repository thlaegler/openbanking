
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.409+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalPaymentConsentsConsentIdFundsConfirmation_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalPaymentConsentsConsentIdFundsConfirmation403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentConsentsConsentIdFundsConfirmation403;

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation403() {
        super();
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation403(String message) {
        super(message);
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentConsentsConsentIdFundsConfirmation403) {
        super(message);
        this.getGetInternationalPaymentConsentsConsentIdFundsConfirmation403 = getGetInternationalPaymentConsentsConsentIdFundsConfirmation403;
    }

    public GETGetInternationalPaymentConsentsConsentIdFundsConfirmation403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentConsentsConsentIdFundsConfirmation403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalPaymentConsentsConsentIdFundsConfirmation403 = getGetInternationalPaymentConsentsConsentIdFundsConfirmation403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalPaymentConsentsConsentIdFundsConfirmation403;
    }
}