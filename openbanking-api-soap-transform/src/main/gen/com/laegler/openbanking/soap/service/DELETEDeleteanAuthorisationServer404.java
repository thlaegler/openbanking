
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.030+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteanAuthorisationServer_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteanAuthorisationServer404 extends Exception {

    private java.lang.Object deleteDeleteanAuthorisationServer404;

    public DELETEDeleteanAuthorisationServer404() {
        super();
    }

    public DELETEDeleteanAuthorisationServer404(String message) {
        super(message);
    }

    public DELETEDeleteanAuthorisationServer404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteanAuthorisationServer404(String message, java.lang.Object deleteDeleteanAuthorisationServer404) {
        super(message);
        this.deleteDeleteanAuthorisationServer404 = deleteDeleteanAuthorisationServer404;
    }

    public DELETEDeleteanAuthorisationServer404(String message, java.lang.Object deleteDeleteanAuthorisationServer404, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteanAuthorisationServer404 = deleteDeleteanAuthorisationServer404;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteanAuthorisationServer404;
    }
}
