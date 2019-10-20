
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.069+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticScheduledPayments_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticScheduledPayments429 extends Exception {

    private java.lang.Object postCreateDomesticScheduledPayments429;

    public POSTCreateDomesticScheduledPayments429() {
        super();
    }

    public POSTCreateDomesticScheduledPayments429(String message) {
        super(message);
    }

    public POSTCreateDomesticScheduledPayments429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticScheduledPayments429(String message, java.lang.Object postCreateDomesticScheduledPayments429) {
        super(message);
        this.postCreateDomesticScheduledPayments429 = postCreateDomesticScheduledPayments429;
    }

    public POSTCreateDomesticScheduledPayments429(String message, java.lang.Object postCreateDomesticScheduledPayments429, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticScheduledPayments429 = postCreateDomesticScheduledPayments429;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateDomesticScheduledPayments429;
    }
}