
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.946+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalPaymentsInternationalPaymentIdPaymentDetails_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400;

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails400() {
        super();
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails400(String message) {
        super(message);
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400) {
        super(message);
        this.getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400 = getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400;
    }

    public GETGetInternationalPaymentsInternationalPaymentIdPaymentDetails400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400 = getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalPaymentsInternationalPaymentIdPaymentDetails400;
    }
}