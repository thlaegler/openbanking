
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.875+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetDomesticPaymentsDomesticPaymentIdPaymentDetails_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500;

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails500() {
        super();
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails500(String message) {
        super(message);
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500) {
        super(message);
        this.getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500 = getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500;
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500 = getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetDomesticPaymentsDomesticPaymentIdPaymentDetails500;
    }
}