
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.015+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Getasoftwarestatement_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetasoftwarestatement500 extends Exception {

    private java.lang.Object getGetasoftwarestatement500;

    public GETGetasoftwarestatement500() {
        super();
    }

    public GETGetasoftwarestatement500(String message) {
        super(message);
    }

    public GETGetasoftwarestatement500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetasoftwarestatement500(String message, java.lang.Object getGetasoftwarestatement500) {
        super(message);
        this.getGetasoftwarestatement500 = getGetasoftwarestatement500;
    }

    public GETGetasoftwarestatement500(String message, java.lang.Object getGetasoftwarestatement500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetasoftwarestatement500 = getGetasoftwarestatement500;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetasoftwarestatement500;
    }
}
