
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.920+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetEventSubscriptions_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetEventSubscriptions429 extends Exception {

    private java.lang.Object getGetEventSubscriptions429;

    public GETGetEventSubscriptions429() {
        super();
    }

    public GETGetEventSubscriptions429(String message) {
        super(message);
    }

    public GETGetEventSubscriptions429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetEventSubscriptions429(String message, java.lang.Object getGetEventSubscriptions429) {
        super(message);
        this.getGetEventSubscriptions429 = getGetEventSubscriptions429;
    }

    public GETGetEventSubscriptions429(String message, java.lang.Object getGetEventSubscriptions429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetEventSubscriptions429 = getGetEventSubscriptions429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetEventSubscriptions429;
    }
}
