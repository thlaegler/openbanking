
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.925+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFilePayments_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFilePayments403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePayments403;

    public POSTCreateFilePayments403() {
        super();
    }

    public POSTCreateFilePayments403(String message) {
        super(message);
    }

    public POSTCreateFilePayments403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFilePayments403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePayments403) {
        super(message);
        this.postCreateFilePayments403 = postCreateFilePayments403;
    }

    public POSTCreateFilePayments403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePayments403, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFilePayments403 = postCreateFilePayments403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateFilePayments403;
    }
}
