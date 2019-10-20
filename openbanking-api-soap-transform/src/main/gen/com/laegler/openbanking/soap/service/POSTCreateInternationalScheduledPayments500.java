
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.822+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalScheduledPayments_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalScheduledPayments500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalScheduledPayments500;

    public POSTCreateInternationalScheduledPayments500() {
        super();
    }

    public POSTCreateInternationalScheduledPayments500(String message) {
        super(message);
    }

    public POSTCreateInternationalScheduledPayments500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalScheduledPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalScheduledPayments500) {
        super(message);
        this.postCreateInternationalScheduledPayments500 = postCreateInternationalScheduledPayments500;
    }

    public POSTCreateInternationalScheduledPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalScheduledPayments500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalScheduledPayments500 = postCreateInternationalScheduledPayments500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateInternationalScheduledPayments500;
    }
}
