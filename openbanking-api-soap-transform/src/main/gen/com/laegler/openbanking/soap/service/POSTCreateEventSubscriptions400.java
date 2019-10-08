
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.294+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateEventSubscriptions_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateEventSubscriptions400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateEventSubscriptions400;

    public POSTCreateEventSubscriptions400() {
        super();
    }

    public POSTCreateEventSubscriptions400(String message) {
        super(message);
    }

    public POSTCreateEventSubscriptions400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateEventSubscriptions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateEventSubscriptions400) {
        super(message);
        this.postCreateEventSubscriptions400 = postCreateEventSubscriptions400;
    }

    public POSTCreateEventSubscriptions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 postCreateEventSubscriptions400, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateEventSubscriptions400 = postCreateEventSubscriptions400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.postCreateEventSubscriptions400;
    }
}
