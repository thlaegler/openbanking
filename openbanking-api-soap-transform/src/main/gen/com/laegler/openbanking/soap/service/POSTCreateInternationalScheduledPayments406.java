
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.818+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalScheduledPayments_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalScheduledPayments406 extends Exception {

    private java.lang.Object postCreateInternationalScheduledPayments406;

    public POSTCreateInternationalScheduledPayments406() {
        super();
    }

    public POSTCreateInternationalScheduledPayments406(String message) {
        super(message);
    }

    public POSTCreateInternationalScheduledPayments406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalScheduledPayments406(String message, java.lang.Object postCreateInternationalScheduledPayments406) {
        super(message);
        this.postCreateInternationalScheduledPayments406 = postCreateInternationalScheduledPayments406;
    }

    public POSTCreateInternationalScheduledPayments406(String message, java.lang.Object postCreateInternationalScheduledPayments406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalScheduledPayments406 = postCreateInternationalScheduledPayments406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalScheduledPayments406;
    }
}