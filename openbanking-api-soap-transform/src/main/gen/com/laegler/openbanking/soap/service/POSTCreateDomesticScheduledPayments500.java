
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.076+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticScheduledPayments_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticScheduledPayments500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticScheduledPayments500;

    public POSTCreateDomesticScheduledPayments500() {
        super();
    }

    public POSTCreateDomesticScheduledPayments500(String message) {
        super(message);
    }

    public POSTCreateDomesticScheduledPayments500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticScheduledPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticScheduledPayments500) {
        super(message);
        this.postCreateDomesticScheduledPayments500 = postCreateDomesticScheduledPayments500;
    }

    public POSTCreateDomesticScheduledPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticScheduledPayments500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticScheduledPayments500 = postCreateDomesticScheduledPayments500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateDomesticScheduledPayments500;
    }
}