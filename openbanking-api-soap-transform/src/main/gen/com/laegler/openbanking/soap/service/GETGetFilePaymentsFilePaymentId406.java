
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.084+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentsFilePaymentId_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentsFilePaymentId406 extends Exception {

    private java.lang.Object getGetFilePaymentsFilePaymentId406;

    public GETGetFilePaymentsFilePaymentId406() {
        super();
    }

    public GETGetFilePaymentsFilePaymentId406(String message) {
        super(message);
    }

    public GETGetFilePaymentsFilePaymentId406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentsFilePaymentId406(String message, java.lang.Object getGetFilePaymentsFilePaymentId406) {
        super(message);
        this.getGetFilePaymentsFilePaymentId406 = getGetFilePaymentsFilePaymentId406;
    }

    public GETGetFilePaymentsFilePaymentId406(String message, java.lang.Object getGetFilePaymentsFilePaymentId406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentsFilePaymentId406 = getGetFilePaymentsFilePaymentId406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentsFilePaymentId406;
    }
}