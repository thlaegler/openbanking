
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.922+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFilePayments_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFilePayments405 extends Exception {

    private java.lang.Object postCreateFilePayments405;

    public POSTCreateFilePayments405() {
        super();
    }

    public POSTCreateFilePayments405(String message) {
        super(message);
    }

    public POSTCreateFilePayments405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFilePayments405(String message, java.lang.Object postCreateFilePayments405) {
        super(message);
        this.postCreateFilePayments405 = postCreateFilePayments405;
    }

    public POSTCreateFilePayments405(String message, java.lang.Object postCreateFilePayments405, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFilePayments405 = postCreateFilePayments405;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFilePayments405;
    }
}
