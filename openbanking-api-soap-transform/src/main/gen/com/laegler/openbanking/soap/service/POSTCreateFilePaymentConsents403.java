
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.534+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFilePaymentConsents_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFilePaymentConsents403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePaymentConsents403;

    public POSTCreateFilePaymentConsents403() {
        super();
    }

    public POSTCreateFilePaymentConsents403(String message) {
        super(message);
    }

    public POSTCreateFilePaymentConsents403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFilePaymentConsents403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePaymentConsents403) {
        super(message);
        this.postCreateFilePaymentConsents403 = postCreateFilePaymentConsents403;
    }

    public POSTCreateFilePaymentConsents403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePaymentConsents403, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFilePaymentConsents403 = postCreateFilePaymentConsents403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateFilePaymentConsents403;
    }
}