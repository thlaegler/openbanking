
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.039+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalPayments_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalPayments406 extends Exception {

    private java.lang.Object postCreateInternationalPayments406;

    public POSTCreateInternationalPayments406() {
        super();
    }

    public POSTCreateInternationalPayments406(String message) {
        super(message);
    }

    public POSTCreateInternationalPayments406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalPayments406(String message, java.lang.Object postCreateInternationalPayments406) {
        super(message);
        this.postCreateInternationalPayments406 = postCreateInternationalPayments406;
    }

    public POSTCreateInternationalPayments406(String message, java.lang.Object postCreateInternationalPayments406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalPayments406 = postCreateInternationalPayments406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalPayments406;
    }
}
