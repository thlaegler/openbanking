
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.326+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_AmendacallbackURI_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTAmendacallbackURI404 extends Exception {

    private java.lang.Object putAmendacallbackURI404;

    public PUTAmendacallbackURI404() {
        super();
    }

    public PUTAmendacallbackURI404(String message) {
        super(message);
    }

    public PUTAmendacallbackURI404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTAmendacallbackURI404(String message, java.lang.Object putAmendacallbackURI404) {
        super(message);
        this.putAmendacallbackURI404 = putAmendacallbackURI404;
    }

    public PUTAmendacallbackURI404(String message, java.lang.Object putAmendacallbackURI404, java.lang.Throwable cause) {
        super(message, cause);
        this.putAmendacallbackURI404 = putAmendacallbackURI404;
    }

    public java.lang.Object getFaultInfo() {
        return this.putAmendacallbackURI404;
    }
}