
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.911+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentConsentsConsentIdFile_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentConsentsConsentIdFile406 extends Exception {

    private java.lang.Object getGetFilePaymentConsentsConsentIdFile406;

    public GETGetFilePaymentConsentsConsentIdFile406() {
        super();
    }

    public GETGetFilePaymentConsentsConsentIdFile406(String message) {
        super(message);
    }

    public GETGetFilePaymentConsentsConsentIdFile406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentConsentsConsentIdFile406(String message, java.lang.Object getGetFilePaymentConsentsConsentIdFile406) {
        super(message);
        this.getGetFilePaymentConsentsConsentIdFile406 = getGetFilePaymentConsentsConsentIdFile406;
    }

    public GETGetFilePaymentConsentsConsentIdFile406(String message, java.lang.Object getGetFilePaymentConsentsConsentIdFile406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentConsentsConsentIdFile406 = getGetFilePaymentConsentsConsentIdFile406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentConsentsConsentIdFile406;
    }
}
