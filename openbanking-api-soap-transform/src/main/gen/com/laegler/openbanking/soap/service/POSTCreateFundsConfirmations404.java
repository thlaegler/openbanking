
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.305+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFundsConfirmations_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFundsConfirmations404 extends Exception {

    private java.lang.Object postCreateFundsConfirmations404;

    public POSTCreateFundsConfirmations404() {
        super();
    }

    public POSTCreateFundsConfirmations404(String message) {
        super(message);
    }

    public POSTCreateFundsConfirmations404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFundsConfirmations404(String message, java.lang.Object postCreateFundsConfirmations404) {
        super(message);
        this.postCreateFundsConfirmations404 = postCreateFundsConfirmations404;
    }

    public POSTCreateFundsConfirmations404(String message, java.lang.Object postCreateFundsConfirmations404, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFundsConfirmations404 = postCreateFundsConfirmations404;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateFundsConfirmations404;
    }
}
