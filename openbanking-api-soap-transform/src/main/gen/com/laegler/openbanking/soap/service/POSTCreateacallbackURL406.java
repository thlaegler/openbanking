
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.665+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateacallbackURL_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateacallbackURL406 extends Exception {

    private java.lang.Object postCreateacallbackURL406;

    public POSTCreateacallbackURL406() {
        super();
    }

    public POSTCreateacallbackURL406(String message) {
        super(message);
    }

    public POSTCreateacallbackURL406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateacallbackURL406(String message, java.lang.Object postCreateacallbackURL406) {
        super(message);
        this.postCreateacallbackURL406 = postCreateacallbackURL406;
    }

    public POSTCreateacallbackURL406(String message, java.lang.Object postCreateacallbackURL406, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateacallbackURL406 = postCreateacallbackURL406;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateacallbackURL406;
    }
}
