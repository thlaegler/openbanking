
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.051+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentsFilePaymentIdPaymentDetails_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentsFilePaymentIdPaymentDetails405 extends Exception {

    private java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails405;

    public GETGetFilePaymentsFilePaymentIdPaymentDetails405() {
        super();
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails405(String message) {
        super(message);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails405(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails405) {
        super(message);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails405 = getGetFilePaymentsFilePaymentIdPaymentDetails405;
    }

    public GETGetFilePaymentsFilePaymentIdPaymentDetails405(String message, java.lang.Object getGetFilePaymentsFilePaymentIdPaymentDetails405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentsFilePaymentIdPaymentDetails405 = getGetFilePaymentsFilePaymentIdPaymentDetails405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentsFilePaymentIdPaymentDetails405;
    }
}
