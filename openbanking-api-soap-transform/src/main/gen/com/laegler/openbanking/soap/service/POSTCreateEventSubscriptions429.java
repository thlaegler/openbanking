
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.290+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateEventSubscriptions_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateEventSubscriptions429 extends Exception {

    private java.lang.Object postCreateEventSubscriptions429;

    public POSTCreateEventSubscriptions429() {
        super();
    }

    public POSTCreateEventSubscriptions429(String message) {
        super(message);
    }

    public POSTCreateEventSubscriptions429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateEventSubscriptions429(String message, java.lang.Object postCreateEventSubscriptions429) {
        super(message);
        this.postCreateEventSubscriptions429 = postCreateEventSubscriptions429;
    }

    public POSTCreateEventSubscriptions429(String message, java.lang.Object postCreateEventSubscriptions429, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateEventSubscriptions429 = postCreateEventSubscriptions429;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateEventSubscriptions429;
    }
}
