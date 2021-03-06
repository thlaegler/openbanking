
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.586+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticPayments_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticPayments500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticPayments500;

    public POSTCreateDomesticPayments500() {
        super();
    }

    public POSTCreateDomesticPayments500(String message) {
        super(message);
    }

    public POSTCreateDomesticPayments500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticPayments500) {
        super(message);
        this.postCreateDomesticPayments500 = postCreateDomesticPayments500;
    }

    public POSTCreateDomesticPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticPayments500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticPayments500 = postCreateDomesticPayments500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateDomesticPayments500;
    }
}
