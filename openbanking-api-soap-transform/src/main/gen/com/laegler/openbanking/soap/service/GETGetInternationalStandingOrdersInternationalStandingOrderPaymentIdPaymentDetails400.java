
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.488+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400;

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400() {
        super();
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400(String message) {
        super(message);
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400) {
        super(message);
        this.getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400 = getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400;
    }

    public GETGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400 = getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails400;
    }
}
