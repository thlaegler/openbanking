
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.304+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateAccountAccessConsents_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateAccountAccessConsents405 extends Exception {

    private java.lang.Object postCreateAccountAccessConsents405;

    public POSTCreateAccountAccessConsents405() {
        super();
    }

    public POSTCreateAccountAccessConsents405(String message) {
        super(message);
    }

    public POSTCreateAccountAccessConsents405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateAccountAccessConsents405(String message, java.lang.Object postCreateAccountAccessConsents405) {
        super(message);
        this.postCreateAccountAccessConsents405 = postCreateAccountAccessConsents405;
    }

    public POSTCreateAccountAccessConsents405(String message, java.lang.Object postCreateAccountAccessConsents405, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateAccountAccessConsents405 = postCreateAccountAccessConsents405;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateAccountAccessConsents405;
    }
}
