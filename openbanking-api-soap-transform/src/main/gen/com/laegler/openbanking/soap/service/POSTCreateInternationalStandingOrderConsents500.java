
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.155+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateInternationalStandingOrderConsents_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateInternationalStandingOrderConsents500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalStandingOrderConsents500;

    public POSTCreateInternationalStandingOrderConsents500() {
        super();
    }

    public POSTCreateInternationalStandingOrderConsents500(String message) {
        super(message);
    }

    public POSTCreateInternationalStandingOrderConsents500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateInternationalStandingOrderConsents500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalStandingOrderConsents500) {
        super(message);
        this.postCreateInternationalStandingOrderConsents500 = postCreateInternationalStandingOrderConsents500;
    }

    public POSTCreateInternationalStandingOrderConsents500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateInternationalStandingOrderConsents500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateInternationalStandingOrderConsents500 = postCreateInternationalStandingOrderConsents500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateInternationalStandingOrderConsents500;
    }
}