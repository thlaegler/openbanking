
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.053+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentsFilePaymentIdPaymentDetails_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentsFilePaymentIdPaymentDetails429 extends Exception {

    private java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails429;

    public GETGetFilePaymentsFilePaymentIdPaymentDetails429() {
        super();
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails429(String message) {
        super(message);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails429(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails429) {
        super(message);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails429 = getGetFilePaymentsFilePaymentIdPaymentDetails429;
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails429(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails429 = getGetFilePaymentsFilePaymentIdPaymentDetails429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentsFilePaymentIdPaymentDetails429;
    }
}
