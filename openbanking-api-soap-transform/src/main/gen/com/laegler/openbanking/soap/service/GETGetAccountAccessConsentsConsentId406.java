
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.853+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountAccessConsentsConsentId_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountAccessConsentsConsentId406 extends Exception {

    private java.lang.Object getGetAccountAccessConsentsConsentId406;

    public GETGetAccountAccessConsentsConsentId406() {
        super();
    }

    public GETGetAccountAccessConsentsConsentId406(String message) {
        super(message);
    }

    public GETGetAccountAccessConsentsConsentId406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountAccessConsentsConsentId406(String message, java.lang.Object getGetAccountAccessConsentsConsentId406) {
        super(message);
        this.getGetAccountAccessConsentsConsentId406 = getGetAccountAccessConsentsConsentId406;
    }

    public GETGetAccountAccessConsentsConsentId406(String message, java.lang.Object getGetAccountAccessConsentsConsentId406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountAccessConsentsConsentId406 = getGetAccountAccessConsentsConsentId406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountAccessConsentsConsentId406;
    }
}
