
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Gateway
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.848+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Get.well-knownentity_502", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetWellKnownentity502 extends Exception {

    private java.lang.Object getGetWellKnownentity502;

    public GETGetWellKnownentity502() {
        super();
    }

    public GETGetWellKnownentity502(String message) {
        super(message);
    }

    public GETGetWellKnownentity502(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetWellKnownentity502(String message, java.lang.Object getGetWellKnownentity502) {
        super(message);
        this.getGetWellKnownentity502 = getGetWellKnownentity502;
    }

    public GETGetWellKnownentity502(String message, java.lang.Object getGetWellKnownentity502, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetWellKnownentity502 = getGetWellKnownentity502;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetWellKnownentity502;
    }
}
