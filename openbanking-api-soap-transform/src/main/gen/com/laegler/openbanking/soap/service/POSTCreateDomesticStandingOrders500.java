
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.786+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticStandingOrders_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticStandingOrders500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticStandingOrders500;

    public POSTCreateDomesticStandingOrders500() {
        super();
    }

    public POSTCreateDomesticStandingOrders500(String message) {
        super(message);
    }

    public POSTCreateDomesticStandingOrders500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticStandingOrders500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticStandingOrders500) {
        super(message);
        this.postCreateDomesticStandingOrders500 = postCreateDomesticStandingOrders500;
    }

    public POSTCreateDomesticStandingOrders500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateDomesticStandingOrders500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticStandingOrders500 = postCreateDomesticStandingOrders500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateDomesticStandingOrders500;
    }
}