
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.855+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountAccessConsentsConsentId_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountAccessConsentsConsentId403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountAccessConsentsConsentId403;

    public GETGetAccountAccessConsentsConsentId403() {
        super();
    }

    public GETGetAccountAccessConsentsConsentId403(String message) {
        super(message);
    }

    public GETGetAccountAccessConsentsConsentId403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountAccessConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountAccessConsentsConsentId403) {
        super(message);
        this.getGetAccountAccessConsentsConsentId403 = getGetAccountAccessConsentsConsentId403;
    }

    public GETGetAccountAccessConsentsConsentId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountAccessConsentsConsentId403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountAccessConsentsConsentId403 = getGetAccountAccessConsentsConsentId403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountAccessConsentsConsentId403;
    }
}