
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.303+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateAccountAccessConsents_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateAccountAccessConsents404 extends Exception {

    private java.lang.Object postCreateAccountAccessConsents404;

    public POSTCreateAccountAccessConsents404() {
        super();
    }

    public POSTCreateAccountAccessConsents404(String message) {
        super(message);
    }

    public POSTCreateAccountAccessConsents404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateAccountAccessConsents404(String message, java.lang.Object postCreateAccountAccessConsents404) {
        super(message);
        this.postCreateAccountAccessConsents404 = postCreateAccountAccessConsents404;
    }

    public POSTCreateAccountAccessConsents404(String message, java.lang.Object postCreateAccountAccessConsents404, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateAccountAccessConsents404 = postCreateAccountAccessConsents404;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateAccountAccessConsents404;
    }
}
