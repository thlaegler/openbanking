
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.962+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalPaymentConsents_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalPaymentConsents403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalPaymentConsents403;

    public POSTCreateInternationalPaymentConsents403() {
        super();
    }

    public POSTCreateInternationalPaymentConsents403(String message) {
        super(message);
    }

    public POSTCreateInternationalPaymentConsents403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalPaymentConsents403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalPaymentConsents403) {
        super(message);
        this.postCreateInternationalPaymentConsents403 = postCreateInternationalPaymentConsents403;
    }

    public POSTCreateInternationalPaymentConsents403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalPaymentConsents403, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalPaymentConsents403 = postCreateInternationalPaymentConsents403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateInternationalPaymentConsents403;
    }
}
