
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.017+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Getasoftwarestatement_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetasoftwarestatement400 extends Exception {

    private java.lang.Object getGetasoftwarestatement400;

    public GETGetasoftwarestatement400() {
        super();
    }

    public GETGetasoftwarestatement400(String message) {
        super(message);
    }

    public GETGetasoftwarestatement400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetasoftwarestatement400(String message, java.lang.Object getGetasoftwarestatement400) {
        super(message);
        this.getGetasoftwarestatement400 = getGetasoftwarestatement400;
    }

    public GETGetasoftwarestatement400(String message, java.lang.Object getGetasoftwarestatement400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetasoftwarestatement400 = getGetasoftwarestatement400;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetasoftwarestatement400;
    }
}
