
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.448+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFundsConfirmationConsents_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFundsConfirmationConsents401 extends Exception {

    private java.lang.Object postCreateFundsConfirmationConsents401;

    public POSTCreateFundsConfirmationConsents401() {
        super();
    }

    public POSTCreateFundsConfirmationConsents401(String message) {
        super(message);
    }

    public POSTCreateFundsConfirmationConsents401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFundsConfirmationConsents401(String message, java.lang.Object postCreateFundsConfirmationConsents401) {
        super(message);
        this.postCreateFundsConfirmationConsents401 = postCreateFundsConfirmationConsents401;
    }

    public POSTCreateFundsConfirmationConsents401(String message, java.lang.Object postCreateFundsConfirmationConsents401, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFundsConfirmationConsents401 = postCreateFundsConfirmationConsents401;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFundsConfirmationConsents401;
    }
}
