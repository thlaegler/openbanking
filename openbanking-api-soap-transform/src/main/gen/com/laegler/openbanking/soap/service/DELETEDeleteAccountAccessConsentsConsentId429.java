
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.141+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteAccountAccessConsentsConsentId_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteAccountAccessConsentsConsentId429 extends Exception {

    private java.lang.Object deleteDeleteAccountAccessConsentsConsentId429;

    public DELETEDeleteAccountAccessConsentsConsentId429() {
        super();
    }

    public DELETEDeleteAccountAccessConsentsConsentId429(String message) {
        super(message);
    }

    public DELETEDeleteAccountAccessConsentsConsentId429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteAccountAccessConsentsConsentId429(String message, java.lang.Object deleteDeleteAccountAccessConsentsConsentId429) {
        super(message);
        this.deleteDeleteAccountAccessConsentsConsentId429 = deleteDeleteAccountAccessConsentsConsentId429;
    }

    public DELETEDeleteAccountAccessConsentsConsentId429(String message, java.lang.Object deleteDeleteAccountAccessConsentsConsentId429, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteAccountAccessConsentsConsentId429 = deleteDeleteAccountAccessConsentsConsentId429;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteAccountAccessConsentsConsentId429;
    }
}
