
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not Acceptable
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.092+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdOffers_406", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdOffers406 extends Exception {

    private java.lang.Object getGetAccountsAccountIdOffers406;

    public GETGetAccountsAccountIdOffers406() {
        super();
    }

    public GETGetAccountsAccountIdOffers406(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdOffers406(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdOffers406(String message, java.lang.Object getGetAccountsAccountIdOffers406) {
        super(message);
        this.getGetAccountsAccountIdOffers406 = getGetAccountsAccountIdOffers406;
    }

    public GETGetAccountsAccountIdOffers406(String message, java.lang.Object getGetAccountsAccountIdOffers406, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdOffers406 = getGetAccountsAccountIdOffers406;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdOffers406;
    }
}