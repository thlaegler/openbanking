
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.463+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticPaymentConsents_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticPaymentConsents500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticPaymentConsents500;

    public POSTCreateDomesticPaymentConsents500() {
        super();
    }

    public POSTCreateDomesticPaymentConsents500(String message) {
        super(message);
    }

    public POSTCreateDomesticPaymentConsents500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticPaymentConsents500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticPaymentConsents500) {
        super(message);
        this.postCreateDomesticPaymentConsents500 = postCreateDomesticPaymentConsents500;
    }

    public POSTCreateDomesticPaymentConsents500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticPaymentConsents500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticPaymentConsents500 = postCreateDomesticPaymentConsents500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateDomesticPaymentConsents500;
    }
}
