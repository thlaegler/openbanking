
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.844+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Get.well-knownentity_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetWellKnownentity500 extends Exception {

    private java.lang.Object getGetWellKnownentity500;

    public GETGetWellKnownentity500() {
        super();
    }

    public GETGetWellKnownentity500(String message) {
        super(message);
    }

    public GETGetWellKnownentity500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetWellKnownentity500(String message, java.lang.Object getGetWellKnownentity500) {
        super(message);
        this.getGetWellKnownentity500 = getGetWellKnownentity500;
    }

    public GETGetWellKnownentity500(String message, java.lang.Object getGetWellKnownentity500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetWellKnownentity500 = getGetWellKnownentity500;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetWellKnownentity500;
    }
}