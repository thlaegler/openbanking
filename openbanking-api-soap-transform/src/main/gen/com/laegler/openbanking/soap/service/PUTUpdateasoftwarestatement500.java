
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.435+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_Updateasoftwarestatement_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTUpdateasoftwarestatement500 extends Exception {

    private java.lang.Object putUpdateasoftwarestatement500;

    public PUTUpdateasoftwarestatement500() {
        super();
    }

    public PUTUpdateasoftwarestatement500(String message) {
        super(message);
    }

    public PUTUpdateasoftwarestatement500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTUpdateasoftwarestatement500(String message, java.lang.Object putUpdateasoftwarestatement500) {
        super(message);
        this.putUpdateasoftwarestatement500 = putUpdateasoftwarestatement500;
    }

    public PUTUpdateasoftwarestatement500(String message, java.lang.Object putUpdateasoftwarestatement500, java.lang.Throwable cause) {
        super(message, cause);
        this.putUpdateasoftwarestatement500 = putUpdateasoftwarestatement500;
    }

    public java.lang.Object getFaultInfo() {
        return this.putUpdateasoftwarestatement500;
    }
}