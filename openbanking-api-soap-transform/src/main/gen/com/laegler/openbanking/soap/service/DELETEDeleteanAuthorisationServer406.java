
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.031+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteanAuthorisationServer_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteanAuthorisationServer406 extends Exception {

    private java.lang.Object deleteDeleteanAuthorisationServer406;

    public DELETEDeleteanAuthorisationServer406() {
        super();
    }

    public DELETEDeleteanAuthorisationServer406(String message) {
        super(message);
    }

    public DELETEDeleteanAuthorisationServer406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteanAuthorisationServer406(String message, java.lang.Object deleteDeleteanAuthorisationServer406) {
        super(message);
        this.deleteDeleteanAuthorisationServer406 = deleteDeleteanAuthorisationServer406;
    }

    public DELETEDeleteanAuthorisationServer406(String message, java.lang.Object deleteDeleteanAuthorisationServer406, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteanAuthorisationServer406 = deleteDeleteanAuthorisationServer406;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteanAuthorisationServer406;
    }
}
