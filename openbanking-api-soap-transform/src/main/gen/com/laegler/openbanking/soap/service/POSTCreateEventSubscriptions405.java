
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.292+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateEventSubscriptions_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateEventSubscriptions405 extends Exception {

    private java.lang.Object postCreateEventSubscriptions405;

    public POSTCreateEventSubscriptions405() {
        super();
    }

    public POSTCreateEventSubscriptions405(String message) {
        super(message);
    }

    public POSTCreateEventSubscriptions405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateEventSubscriptions405(String message, java.lang.Object postCreateEventSubscriptions405) {
        super(message);
        this.postCreateEventSubscriptions405 = postCreateEventSubscriptions405;
    }

    public POSTCreateEventSubscriptions405(String message, java.lang.Object postCreateEventSubscriptions405, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateEventSubscriptions405 = postCreateEventSubscriptions405;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateEventSubscriptions405;
    }
}
