
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.998+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentsFilePaymentIdReportFile_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentsFilePaymentIdReportFile403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentsFilePaymentIdReportFile403;

    public GETGetFilePaymentsFilePaymentIdReportFile403() {
        super();
    }

    public GETGetFilePaymentsFilePaymentIdReportFile403(String message) {
        super(message);
    }

    public GETGetFilePaymentsFilePaymentIdReportFile403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentsFilePaymentIdReportFile403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentsFilePaymentIdReportFile403) {
        super(message);
        this.getGetFilePaymentsFilePaymentIdReportFile403 = getGetFilePaymentsFilePaymentIdReportFile403;
    }

    public GETGetFilePaymentsFilePaymentIdReportFile403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentsFilePaymentIdReportFile403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentsFilePaymentIdReportFile403 = getGetFilePaymentsFilePaymentIdReportFile403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetFilePaymentsFilePaymentIdReportFile403;
    }
}