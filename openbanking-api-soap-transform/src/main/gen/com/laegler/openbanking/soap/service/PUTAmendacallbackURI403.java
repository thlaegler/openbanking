
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.324+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_AmendacallbackURI_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTAmendacallbackURI403 extends Exception {

    private java.lang.Object putAmendacallbackURI403;

    public PUTAmendacallbackURI403() {
        super();
    }

    public PUTAmendacallbackURI403(String message) {
        super(message);
    }

    public PUTAmendacallbackURI403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTAmendacallbackURI403(String message, java.lang.Object putAmendacallbackURI403) {
        super(message);
        this.putAmendacallbackURI403 = putAmendacallbackURI403;
    }

    public PUTAmendacallbackURI403(String message, java.lang.Object putAmendacallbackURI403, java.lang.Throwable cause) {
        super(message, cause);
        this.putAmendacallbackURI403 = putAmendacallbackURI403;
    }

    public java.lang.Object getFaultInfo() {
        return this.putAmendacallbackURI403;
    }
}
