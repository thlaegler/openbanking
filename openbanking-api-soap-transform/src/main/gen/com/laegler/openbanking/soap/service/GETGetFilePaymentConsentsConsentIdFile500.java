
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.906+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetFilePaymentConsentsConsentIdFile_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetFilePaymentConsentsConsentIdFile500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentConsentsConsentIdFile500;

    public GETGetFilePaymentConsentsConsentIdFile500() {
        super();
    }

    public GETGetFilePaymentConsentsConsentIdFile500(String message) {
        super(message);
    }

    public GETGetFilePaymentConsentsConsentIdFile500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetFilePaymentConsentsConsentIdFile500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentConsentsConsentIdFile500) {
        super(message);
        this.getGetFilePaymentConsentsConsentIdFile500 = getGetFilePaymentConsentsConsentIdFile500;
    }

    public GETGetFilePaymentConsentsConsentIdFile500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetFilePaymentConsentsConsentIdFile500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetFilePaymentConsentsConsentIdFile500 = getGetFilePaymentConsentsConsentIdFile500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetFilePaymentConsentsConsentIdFile500;
    }
}