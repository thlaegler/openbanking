
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Conflict
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.230+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_AddaredirectURItothegivenSoftwareStatement_409", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTAddaredirectURItothegivenSoftwareStatement409 extends Exception {

    private java.lang.Object postAddaredirectURItothegivenSoftwareStatement409;

    public POSTAddaredirectURItothegivenSoftwareStatement409() {
        super();
    }

    public POSTAddaredirectURItothegivenSoftwareStatement409(String message) {
        super(message);
    }

    public POSTAddaredirectURItothegivenSoftwareStatement409(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTAddaredirectURItothegivenSoftwareStatement409(String message, java.lang.Object postAddaredirectURItothegivenSoftwareStatement409) {
        super(message);
        this.postAddaredirectURItothegivenSoftwareStatement409 = postAddaredirectURItothegivenSoftwareStatement409;
    }

    public POSTAddaredirectURItothegivenSoftwareStatement409(String message, java.lang.Object postAddaredirectURItothegivenSoftwareStatement409, java.lang.Throwable cause) {
        super(message, cause);
        this.postAddaredirectURItothegivenSoftwareStatement409 = postAddaredirectURItothegivenSoftwareStatement409;
    }

    public java.lang.Object getFaultInfo() {
        return this.postAddaredirectURItothegivenSoftwareStatement409;
    }
}
