
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.610+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdDirectDebits_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdDirectDebits406 extends Exception {

    private java.lang.Object getGetAccountsAccountIdDirectDebits406;

    public GETGetAccountsAccountIdDirectDebits406() {
        super();
    }

    public GETGetAccountsAccountIdDirectDebits406(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdDirectDebits406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdDirectDebits406(String message, java.lang.Object getGetAccountsAccountIdDirectDebits406) {
        super(message);
        this.getGetAccountsAccountIdDirectDebits406 = getGetAccountsAccountIdDirectDebits406;
    }

    public GETGetAccountsAccountIdDirectDebits406(String message, java.lang.Object getGetAccountsAccountIdDirectDebits406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdDirectDebits406 = getGetAccountsAccountIdDirectDebits406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdDirectDebits406;
    }
}