
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.778+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateDomesticStandingOrders_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateDomesticStandingOrders405 extends Exception {

    private java.lang.Object postCreateDomesticStandingOrders405;

    public POSTCreateDomesticStandingOrders405() {
        super();
    }

    public POSTCreateDomesticStandingOrders405(String message) {
        super(message);
    }

    public POSTCreateDomesticStandingOrders405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateDomesticStandingOrders405(String message, java.lang.Object postCreateDomesticStandingOrders405) {
        super(message);
        this.postCreateDomesticStandingOrders405 = postCreateDomesticStandingOrders405;
    }

    public POSTCreateDomesticStandingOrders405(String message, java.lang.Object postCreateDomesticStandingOrders405, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateDomesticStandingOrders405 = postCreateDomesticStandingOrders405;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateDomesticStandingOrders405;
    }
}