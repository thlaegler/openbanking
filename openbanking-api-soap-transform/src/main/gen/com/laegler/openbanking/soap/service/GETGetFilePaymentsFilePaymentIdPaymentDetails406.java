
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.054+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentsFilePaymentIdPaymentDetails_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentsFilePaymentIdPaymentDetails406 extends Exception {

    private java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails406;

    public GETGetFilePaymentsFilePaymentIdPaymentDetails406() {
        super();
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails406(String message) {
        super(message);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails406(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails406) {
        super(message);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails406 = getGetFilePaymentsFilePaymentIdPaymentDetails406;
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails406(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails406 = getGetFilePaymentsFilePaymentIdPaymentDetails406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentsFilePaymentIdPaymentDetails406;
    }
}