
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.446+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFundsConfirmationConsents_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFundsConfirmationConsents429 extends Exception {

    private java.lang.Object postCreateFundsConfirmationConsents429;

    public POSTCreateFundsConfirmationConsents429() {
        super();
    }

    public POSTCreateFundsConfirmationConsents429(String message) {
        super(message);
    }

    public POSTCreateFundsConfirmationConsents429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFundsConfirmationConsents429(String message, java.lang.Object postCreateFundsConfirmationConsents429) {
        super(message);
        this.postCreateFundsConfirmationConsents429 = postCreateFundsConfirmationConsents429;
    }

    public POSTCreateFundsConfirmationConsents429(String message, java.lang.Object postCreateFundsConfirmationConsents429, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFundsConfirmationConsents429 = postCreateFundsConfirmationConsents429;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFundsConfirmationConsents429;
    }
}
