
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.982+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalStandingOrders_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalStandingOrders406 extends Exception {

    private java.lang.Object postCreateInternationalStandingOrders406;

    public POSTCreateInternationalStandingOrders406() {
        super();
    }

    public POSTCreateInternationalStandingOrders406(String message) {
        super(message);
    }

    public POSTCreateInternationalStandingOrders406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalStandingOrders406(String message, java.lang.Object postCreateInternationalStandingOrders406) {
        super(message);
        this.postCreateInternationalStandingOrders406 = postCreateInternationalStandingOrders406;
    }

    public POSTCreateInternationalStandingOrders406(String message, java.lang.Object postCreateInternationalStandingOrders406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalStandingOrders406 = postCreateInternationalStandingOrders406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateInternationalStandingOrders406;
    }
}
