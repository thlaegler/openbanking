
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.181+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403;

    public GETGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403() {
        super();
    }

    public GETGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403(String message) {
        super(message);
    }

    public GETGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403) {
        super(message);
        this.getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403 = getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403;
    }

    public GETGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403 = getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails403;
    }
}
