
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.560+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_Update.well-knownentity_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTUpdateWellKnownentity400 extends Exception {

    private java.lang.Object putUpdateWellKnownentity400;

    public PUTUpdateWellKnownentity400() {
        super();
    }

    public PUTUpdateWellKnownentity400(String message) {
        super(message);
    }

    public PUTUpdateWellKnownentity400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTUpdateWellKnownentity400(String message, java.lang.Object putUpdateWellKnownentity400) {
        super(message);
        this.putUpdateWellKnownentity400 = putUpdateWellKnownentity400;
    }

    public PUTUpdateWellKnownentity400(String message, java.lang.Object putUpdateWellKnownentity400, java.lang.Throwable cause) {
        super(message, cause);
        this.putUpdateWellKnownentity400 = putUpdateWellKnownentity400;
    }

    public java.lang.Object getFaultInfo() {
        return this.putUpdateWellKnownentity400;
    }
}
