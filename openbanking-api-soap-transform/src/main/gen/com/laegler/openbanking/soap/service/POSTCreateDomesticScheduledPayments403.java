
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.073+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticScheduledPayments_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticScheduledPayments403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticScheduledPayments403;

    public POSTCreateDomesticScheduledPayments403() {
        super();
    }

    public POSTCreateDomesticScheduledPayments403(String message) {
        super(message);
    }

    public POSTCreateDomesticScheduledPayments403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticScheduledPayments403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticScheduledPayments403) {
        super(message);
        this.postCreateDomesticScheduledPayments403 = postCreateDomesticScheduledPayments403;
    }

    public POSTCreateDomesticScheduledPayments403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticScheduledPayments403, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticScheduledPayments403 = postCreateDomesticScheduledPayments403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateDomesticScheduledPayments403;
    }
}
