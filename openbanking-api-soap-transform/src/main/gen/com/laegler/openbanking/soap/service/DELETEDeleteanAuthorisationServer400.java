
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.034+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteanAuthorisationServer_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteanAuthorisationServer400 extends Exception {

    private java.lang.Object deleteDeleteanAuthorisationServer400;

    public DELETEDeleteanAuthorisationServer400() {
        super();
    }

    public DELETEDeleteanAuthorisationServer400(String message) {
        super(message);
    }

    public DELETEDeleteanAuthorisationServer400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteanAuthorisationServer400(String message, java.lang.Object deleteDeleteanAuthorisationServer400) {
        super(message);
        this.deleteDeleteanAuthorisationServer400 = deleteDeleteanAuthorisationServer400;
    }

    public DELETEDeleteanAuthorisationServer400(String message, java.lang.Object deleteDeleteanAuthorisationServer400, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteanAuthorisationServer400 = deleteDeleteanAuthorisationServer400;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteanAuthorisationServer400;
    }
}