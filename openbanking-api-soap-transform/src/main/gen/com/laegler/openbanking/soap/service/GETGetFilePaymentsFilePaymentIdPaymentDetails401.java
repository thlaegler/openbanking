
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.055+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentsFilePaymentIdPaymentDetails_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentsFilePaymentIdPaymentDetails401 extends Exception {

    private java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails401;

    public GETGetFilePaymentsFilePaymentIdPaymentDetails401() {
        super();
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails401(String message) {
        super(message);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails401(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails401) {
        super(message);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails401 = getGetFilePaymentsFilePaymentIdPaymentDetails401;
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails401(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails401 = getGetFilePaymentsFilePaymentIdPaymentDetails401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentsFilePaymentIdPaymentDetails401;
    }
}
