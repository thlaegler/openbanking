
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.070+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticScheduledPayments_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticScheduledPayments404 extends Exception {

    private java.lang.Object postCreateDomesticScheduledPayments404;

    public POSTCreateDomesticScheduledPayments404() {
        super();
    }

    public POSTCreateDomesticScheduledPayments404(String message) {
        super(message);
    }

    public POSTCreateDomesticScheduledPayments404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticScheduledPayments404(String message, java.lang.Object postCreateDomesticScheduledPayments404) {
        super(message);
        this.postCreateDomesticScheduledPayments404 = postCreateDomesticScheduledPayments404;
    }

    public POSTCreateDomesticScheduledPayments404(String message, java.lang.Object postCreateDomesticScheduledPayments404, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticScheduledPayments404 = postCreateDomesticScheduledPayments404;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateDomesticScheduledPayments404;
    }
}
