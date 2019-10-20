
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unsupported Media Type
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.327+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_AmendacallbackURI_415", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTAmendacallbackURI415 extends Exception {

    private java.lang.Object putAmendacallbackURI415;

    public PUTAmendacallbackURI415() {
        super();
    }

    public PUTAmendacallbackURI415(String message) {
        super(message);
    }

    public PUTAmendacallbackURI415(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTAmendacallbackURI415(String message, java.lang.Object putAmendacallbackURI415) {
        super(message);
        this.putAmendacallbackURI415 = putAmendacallbackURI415;
    }

    public PUTAmendacallbackURI415(String message, java.lang.Object putAmendacallbackURI415, java.lang.Throwable cause) {
        super(message, cause);
        this.putAmendacallbackURI415 = putAmendacallbackURI415;
    }

    public java.lang.Object getFaultInfo() {
        return this.putAmendacallbackURI415;
    }
}