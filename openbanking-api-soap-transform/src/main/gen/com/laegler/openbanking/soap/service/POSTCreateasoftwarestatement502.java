
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Gateway
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.954+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_Createasoftwarestatement_502", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateasoftwarestatement502 extends Exception {

    private java.lang.Object postCreateasoftwarestatement502;

    public POSTCreateasoftwarestatement502() {
        super();
    }

    public POSTCreateasoftwarestatement502(String message) {
        super(message);
    }

    public POSTCreateasoftwarestatement502(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateasoftwarestatement502(String message, java.lang.Object postCreateasoftwarestatement502) {
        super(message);
        this.postCreateasoftwarestatement502 = postCreateasoftwarestatement502;
    }

    public POSTCreateasoftwarestatement502(String message, java.lang.Object postCreateasoftwarestatement502, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateasoftwarestatement502 = postCreateasoftwarestatement502;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateasoftwarestatement502;
    }
}
