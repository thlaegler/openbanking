
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.286+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403;

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403() {
        super();
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403(String message) {
        super(message);
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403) {
        super(message);
        this.getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403 = getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403;
    }

    public GETGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403 = getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalScheduledPaymentConsentsConsentIdFundsConfirmation403;
    }
}
