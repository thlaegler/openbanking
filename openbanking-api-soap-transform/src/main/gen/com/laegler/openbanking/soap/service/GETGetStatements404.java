
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.319+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetStatements_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetStatements404 extends Exception {

    private java.lang.Object getGetStatements404;

    public GETGetStatements404() {
        super();
    }

    public GETGetStatements404(String message) {
        super(message);
    }

    public GETGetStatements404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetStatements404(String message, java.lang.Object getGetStatements404) {
        super(message);
        this.getGetStatements404 = getGetStatements404;
    }

    public GETGetStatements404(String message, java.lang.Object getGetStatements404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetStatements404 = getGetStatements404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetStatements404;
    }
}