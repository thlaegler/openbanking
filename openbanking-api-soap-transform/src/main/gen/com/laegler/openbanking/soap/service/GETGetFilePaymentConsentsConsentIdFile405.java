
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.910+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentConsentsConsentIdFile_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentConsentsConsentIdFile405 extends Exception {

    private java.lang.Object getGetFilePaymentConsentsConsentIdFile405;

    public GETGetFilePaymentConsentsConsentIdFile405() {
        super();
    }

    public GETGetFilePaymentConsentsConsentIdFile405(String message) {
        super(message);
    }

    public GETGetFilePaymentConsentsConsentIdFile405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentConsentsConsentIdFile405(String message, java.lang.Object getGetFilePaymentConsentsConsentIdFile405) {
        super(message);
        this.getGetFilePaymentConsentsConsentIdFile405 = getGetFilePaymentConsentsConsentIdFile405;
    }

    public GETGetFilePaymentConsentsConsentIdFile405(String message, java.lang.Object getGetFilePaymentConsentsConsentIdFile405, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentConsentsConsentIdFile405 = getGetFilePaymentConsentsConsentIdFile405;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetFilePaymentConsentsConsentIdFile405;
    }
}
