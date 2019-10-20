
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * You have sent a request which could not be understood.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.129+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Atms_GET_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETAtmsGET400 extends Exception {

    private com.laegler.openbanking.soap.model.Error503Object getAtmsGET400;

    public GETAtmsGET400() {
        super();
    }

    public GETAtmsGET400(String message) {
        super(message);
    }

    public GETAtmsGET400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETAtmsGET400(String message, com.laegler.openbanking.soap.model.Error503Object getAtmsGET400) {
        super(message);
        this.getAtmsGET400 = getAtmsGET400;
    }

    public GETAtmsGET400(String message, com.laegler.openbanking.soap.model.Error503Object getAtmsGET400, java.lang.Throwable cause) {
        super(message, cause);
        this.getAtmsGET400 = getAtmsGET400;
    }

    public com.laegler.openbanking.soap.model.Error503Object getFaultInfo() {
        return this.getAtmsGET400;
    }
}