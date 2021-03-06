
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Your client has failed to submit a request, and a timeout has occurred.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.127+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Atms_GET_408", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETAtmsGET408 extends Exception {

    private com.laegler.openbanking.soap.model.Error503Object getAtmsGET408;

    public GETAtmsGET408() {
        super();
    }

    public GETAtmsGET408(String message) {
        super(message);
    }

    public GETAtmsGET408(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETAtmsGET408(String message, com.laegler.openbanking.soap.model.Error503Object getAtmsGET408) {
        super(message);
        this.getAtmsGET408 = getAtmsGET408;
    }

    public GETAtmsGET408(String message, com.laegler.openbanking.soap.model.Error503Object getAtmsGET408, java.lang.Throwable cause) {
        super(message, cause);
        this.getAtmsGET408 = getAtmsGET408;
    }

    public com.laegler.openbanking.soap.model.Error503Object getFaultInfo() {
        return this.getAtmsGET408;
    }
}
