
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.555+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_Update.well-knownentity_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTUpdateWellKnownentity406 extends Exception {

    private java.lang.Object putUpdateWellKnownentity406;

    public PUTUpdateWellKnownentity406() {
        super();
    }

    public PUTUpdateWellKnownentity406(String message) {
        super(message);
    }

    public PUTUpdateWellKnownentity406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTUpdateWellKnownentity406(String message, java.lang.Object putUpdateWellKnownentity406) {
        super(message);
        this.putUpdateWellKnownentity406 = putUpdateWellKnownentity406;
    }

    public PUTUpdateWellKnownentity406(String message, java.lang.Object putUpdateWellKnownentity406, java.lang.Throwable cause) {
        super(message, cause);
        this.putUpdateWellKnownentity406 = putUpdateWellKnownentity406;
    }

    public java.lang.Object getFaultInfo() {
        return this.putUpdateWellKnownentity406;
    }
}
