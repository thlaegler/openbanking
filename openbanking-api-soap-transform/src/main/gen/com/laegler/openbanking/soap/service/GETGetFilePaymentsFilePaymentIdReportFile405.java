
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.996+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentsFilePaymentIdReportFile_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentsFilePaymentIdReportFile405 extends Exception {

    private java.lang.Object getGetFilePaymentsFilePaymentIdReportFile405;

    public GETGetFilePaymentsFilePaymentIdReportFile405() {
        super();
    }

    public GETGetFilePaymentsFilePaymentIdReportFile405(String message) {
        super(message);
    }

    public GETGetFilePaymentsFilePaymentIdReportFile405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentsFilePaymentIdReportFile405(String message, java.lang.Object getGetFilePaymentsFilePaymentIdReportFile405) {
        super(message);
        this.getGetFilePaymentsFilePaymentIdReportFile405 = getGetFilePaymentsFilePaymentIdReportFile405;
    }

    public GETGetFilePaymentsFilePaymentIdReportFile405(String message, java.lang.Object getGetFilePaymentsFilePaymentIdReportFile405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentsFilePaymentIdReportFile405 = getGetFilePaymentsFilePaymentIdReportFile405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentsFilePaymentIdReportFile405;
    }
}
