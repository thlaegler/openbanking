
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.446+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFundsConfirmationConsents_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFundsConfirmationConsents406 extends Exception {

    private java.lang.Object postCreateFundsConfirmationConsents406;

    public POSTCreateFundsConfirmationConsents406() {
        super();
    }

    public POSTCreateFundsConfirmationConsents406(String message) {
        super(message);
    }

    public POSTCreateFundsConfirmationConsents406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFundsConfirmationConsents406(String message, java.lang.Object postCreateFundsConfirmationConsents406) {
        super(message);
        this.postCreateFundsConfirmationConsents406 = postCreateFundsConfirmationConsents406;
    }

    public POSTCreateFundsConfirmationConsents406(String message, java.lang.Object postCreateFundsConfirmationConsents406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFundsConfirmationConsents406 = postCreateFundsConfirmationConsents406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFundsConfirmationConsents406;
    }
}