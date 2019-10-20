
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.915+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetEventSubscriptions_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetEventSubscriptions400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetEventSubscriptions400;

    public GETGetEventSubscriptions400() {
        super();
    }

    public GETGetEventSubscriptions400(String message) {
        super(message);
    }

    public GETGetEventSubscriptions400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetEventSubscriptions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetEventSubscriptions400) {
        super(message);
        this.getGetEventSubscriptions400 = getGetEventSubscriptions400;
    }

    public GETGetEventSubscriptions400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetEventSubscriptions400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetEventSubscriptions400 = getGetEventSubscriptions400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetEventSubscriptions400;
    }
}
