
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Gateway
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.227+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_AddaredirectURItothegivenSoftwareStatement_502", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTAddaredirectURItothegivenSoftwareStatement502 extends Exception {

    private java.lang.Object postAddaredirectURItothegivenSoftwareStatement502;

    public POSTAddaredirectURItothegivenSoftwareStatement502() {
        super();
    }

    public POSTAddaredirectURItothegivenSoftwareStatement502(String message) {
        super(message);
    }

    public POSTAddaredirectURItothegivenSoftwareStatement502(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTAddaredirectURItothegivenSoftwareStatement502(String message, java.lang.Object postAddaredirectURItothegivenSoftwareStatement502) {
        super(message);
        this.postAddaredirectURItothegivenSoftwareStatement502 = postAddaredirectURItothegivenSoftwareStatement502;
    }

    public POSTAddaredirectURItothegivenSoftwareStatement502(String message, java.lang.Object postAddaredirectURItothegivenSoftwareStatement502, java.lang.Throwable cause) {
        super(message, cause);
        this.postAddaredirectURItothegivenSoftwareStatement502 = postAddaredirectURItothegivenSoftwareStatement502;
    }

    public java.lang.Object getFaultInfo() {
        return this.postAddaredirectURItothegivenSoftwareStatement502;
    }
}