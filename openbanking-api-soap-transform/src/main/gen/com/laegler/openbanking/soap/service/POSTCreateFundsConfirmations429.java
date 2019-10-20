
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.307+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFundsConfirmations_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFundsConfirmations429 extends Exception {

    private java.lang.Object postCreateFundsConfirmations429;

    public POSTCreateFundsConfirmations429() {
        super();
    }

    public POSTCreateFundsConfirmations429(String message) {
        super(message);
    }

    public POSTCreateFundsConfirmations429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFundsConfirmations429(String message, java.lang.Object postCreateFundsConfirmations429) {
        super(message);
        this.postCreateFundsConfirmations429 = postCreateFundsConfirmations429;
    }

    public POSTCreateFundsConfirmations429(String message, java.lang.Object postCreateFundsConfirmations429, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFundsConfirmations429 = postCreateFundsConfirmations429;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFundsConfirmations429;
    }
}