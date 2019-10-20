
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.841+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Get.well-knownentity_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetWellKnownentity400 extends Exception {

    private java.lang.Object getGetWellKnownentity400;

    public GETGetWellKnownentity400() {
        super();
    }

    public GETGetWellKnownentity400(String message) {
        super(message);
    }

    public GETGetWellKnownentity400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetWellKnownentity400(String message, java.lang.Object getGetWellKnownentity400) {
        super(message);
        this.getGetWellKnownentity400 = getGetWellKnownentity400;
    }

    public GETGetWellKnownentity400(String message, java.lang.Object getGetWellKnownentity400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetWellKnownentity400 = getGetWellKnownentity400;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetWellKnownentity400;
    }
}