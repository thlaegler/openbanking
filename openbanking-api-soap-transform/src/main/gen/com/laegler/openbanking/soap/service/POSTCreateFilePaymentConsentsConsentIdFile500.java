
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.478+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateFilePaymentConsentsConsentIdFile_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateFilePaymentConsentsConsentIdFile500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePaymentConsentsConsentIdFile500;

    public POSTCreateFilePaymentConsentsConsentIdFile500() {
        super();
    }

    public POSTCreateFilePaymentConsentsConsentIdFile500(String message) {
        super(message);
    }

    public POSTCreateFilePaymentConsentsConsentIdFile500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateFilePaymentConsentsConsentIdFile500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePaymentConsentsConsentIdFile500) {
        super(message);
        this.postCreateFilePaymentConsentsConsentIdFile500 = postCreateFilePaymentConsentsConsentIdFile500;
    }

    public POSTCreateFilePaymentConsentsConsentIdFile500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateFilePaymentConsentsConsentIdFile500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateFilePaymentConsentsConsentIdFile500 = postCreateFilePaymentConsentsConsentIdFile500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateFilePaymentConsentsConsentIdFile500;
    }
}
