
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.105+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_Validatecertificate_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTValidatecertificate406 extends Exception {

    private java.lang.Object postValidatecertificate406;

    public POSTValidatecertificate406() {
        super();
    }

    public POSTValidatecertificate406(String message) {
        super(message);
    }

    public POSTValidatecertificate406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTValidatecertificate406(String message, java.lang.Object postValidatecertificate406) {
        super(message);
        this.postValidatecertificate406 = postValidatecertificate406;
    }

    public POSTValidatecertificate406(String message, java.lang.Object postValidatecertificate406, java.lang.Throwable cause) {
        super(message, cause);
        this.postValidatecertificate406 = postValidatecertificate406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postValidatecertificate406;
    }
}
