
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.308+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFundsConfirmations_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFundsConfirmations406 extends Exception {

    private java.lang.Object postCreateFundsConfirmations406;

    public POSTCreateFundsConfirmations406() {
        super();
    }

    public POSTCreateFundsConfirmations406(String message) {
        super(message);
    }

    public POSTCreateFundsConfirmations406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFundsConfirmations406(String message, java.lang.Object postCreateFundsConfirmations406) {
        super(message);
        this.postCreateFundsConfirmations406 = postCreateFundsConfirmations406;
    }

    public POSTCreateFundsConfirmations406(String message, java.lang.Object postCreateFundsConfirmations406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFundsConfirmations406 = postCreateFundsConfirmations406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFundsConfirmations406;
    }
}
