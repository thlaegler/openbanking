
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.132+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetDomesticPaymentsDomesticPaymentId_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetDomesticPaymentsDomesticPaymentId404 extends Exception {

    private java.lang.Object getGetDomesticPaymentsDomesticPaymentId404;

    public GETGetDomesticPaymentsDomesticPaymentId404() {
        super();
    }

    public GETGetDomesticPaymentsDomesticPaymentId404(String message) {
        super(message);
    }

    public GETGetDomesticPaymentsDomesticPaymentId404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetDomesticPaymentsDomesticPaymentId404(String message, java.lang.Object getGetDomesticPaymentsDomesticPaymentId404) {
        super(message);
        this.getGetDomesticPaymentsDomesticPaymentId404 = getGetDomesticPaymentsDomesticPaymentId404;
    }

    public GETGetDomesticPaymentsDomesticPaymentId404(String message, java.lang.Object getGetDomesticPaymentsDomesticPaymentId404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetDomesticPaymentsDomesticPaymentId404 = getGetDomesticPaymentsDomesticPaymentId404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetDomesticPaymentsDomesticPaymentId404;
    }
}