
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.816+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalScheduledPayments_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalScheduledPayments429 extends Exception {

    private java.lang.Object postCreateInternationalScheduledPayments429;

    public POSTCreateInternationalScheduledPayments429() {
        super();
    }

    public POSTCreateInternationalScheduledPayments429(String message) {
        super(message);
    }

    public POSTCreateInternationalScheduledPayments429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalScheduledPayments429(String message, java.lang.Object postCreateInternationalScheduledPayments429) {
        super(message);
        this.postCreateInternationalScheduledPayments429 = postCreateInternationalScheduledPayments429;
    }

    public POSTCreateInternationalScheduledPayments429(String message, java.lang.Object postCreateInternationalScheduledPayments429, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalScheduledPayments429 = postCreateInternationalScheduledPayments429;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalScheduledPayments429;
    }
}