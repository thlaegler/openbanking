
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.873+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetDomesticPaymentsDomesticPaymentIdPaymentDetails_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails401 extends Exception {

    private java.lang.Object getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401;

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails401() {
        super();
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails401(String message) {
        super(message);
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails401(String message, java.lang.Object getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401) {
        super(message);
        this.getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401 = getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401;
    }

    public GETGetDomesticPaymentsDomesticPaymentIdPaymentDetails401(String message, java.lang.Object getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401 = getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetDomesticPaymentsDomesticPaymentIdPaymentDetails401;
    }
}
