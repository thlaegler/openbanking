
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.458+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteacallbackURI_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteacallbackURI401 extends Exception {

    private java.lang.Object deleteDeleteacallbackURI401;

    public DELETEDeleteacallbackURI401() {
        super();
    }

    public DELETEDeleteacallbackURI401(String message) {
        super(message);
    }

    public DELETEDeleteacallbackURI401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteacallbackURI401(String message, java.lang.Object deleteDeleteacallbackURI401) {
        super(message);
        this.deleteDeleteacallbackURI401 = deleteDeleteacallbackURI401;
    }

    public DELETEDeleteacallbackURI401(String message, java.lang.Object deleteDeleteacallbackURI401, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteacallbackURI401 = deleteDeleteacallbackURI401;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteacallbackURI401;
    }
}