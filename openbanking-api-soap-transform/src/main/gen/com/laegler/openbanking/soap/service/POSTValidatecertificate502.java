
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Gateway
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.102+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_Validatecertificate_502", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTValidatecertificate502 extends Exception {

    private java.lang.Object postValidatecertificate502;

    public POSTValidatecertificate502() {
        super();
    }

    public POSTValidatecertificate502(String message) {
        super(message);
    }

    public POSTValidatecertificate502(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTValidatecertificate502(String message, java.lang.Object postValidatecertificate502) {
        super(message);
        this.postValidatecertificate502 = postValidatecertificate502;
    }

    public POSTValidatecertificate502(String message, java.lang.Object postValidatecertificate502, java.lang.Throwable cause) {
        super(message, cause);
        this.postValidatecertificate502 = postValidatecertificate502;
    }

    public java.lang.Object getFaultInfo() {
        return this.postValidatecertificate502;
    }
}