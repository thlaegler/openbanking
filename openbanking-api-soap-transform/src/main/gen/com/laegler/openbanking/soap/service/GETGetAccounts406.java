
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.628+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccounts_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccounts406 extends Exception {

    private java.lang.Object getGetAccounts406;

    public GETGetAccounts406() {
        super();
    }

    public GETGetAccounts406(String message) {
        super(message);
    }

    public GETGetAccounts406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccounts406(String message, java.lang.Object getGetAccounts406) {
        super(message);
        this.getGetAccounts406 = getGetAccounts406;
    }

    public GETGetAccounts406(String message, java.lang.Object getGetAccounts406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccounts406 = getGetAccounts406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccounts406;
    }
}