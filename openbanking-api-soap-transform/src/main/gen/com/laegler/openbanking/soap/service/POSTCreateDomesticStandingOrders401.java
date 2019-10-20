
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.785+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticStandingOrders_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticStandingOrders401 extends Exception {

    private java.lang.Object postCreateDomesticStandingOrders401;

    public POSTCreateDomesticStandingOrders401() {
        super();
    }

    public POSTCreateDomesticStandingOrders401(String message) {
        super(message);
    }

    public POSTCreateDomesticStandingOrders401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticStandingOrders401(String message, java.lang.Object postCreateDomesticStandingOrders401) {
        super(message);
        this.postCreateDomesticStandingOrders401 = postCreateDomesticStandingOrders401;
    }

    public POSTCreateDomesticStandingOrders401(String message, java.lang.Object postCreateDomesticStandingOrders401, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticStandingOrders401 = postCreateDomesticStandingOrders401;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateDomesticStandingOrders401;
    }
}
