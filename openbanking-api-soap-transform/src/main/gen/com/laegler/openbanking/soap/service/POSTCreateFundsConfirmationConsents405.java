
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.444+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFundsConfirmationConsents_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFundsConfirmationConsents405 extends Exception {

    private java.lang.Object postCreateFundsConfirmationConsents405;

    public POSTCreateFundsConfirmationConsents405() {
        super();
    }

    public POSTCreateFundsConfirmationConsents405(String message) {
        super(message);
    }

    public POSTCreateFundsConfirmationConsents405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFundsConfirmationConsents405(String message, java.lang.Object postCreateFundsConfirmationConsents405) {
        super(message);
        this.postCreateFundsConfirmationConsents405 = postCreateFundsConfirmationConsents405;
    }

    public POSTCreateFundsConfirmationConsents405(String message, java.lang.Object postCreateFundsConfirmationConsents405, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFundsConfirmationConsents405 = postCreateFundsConfirmationConsents405;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFundsConfirmationConsents405;
    }
}
