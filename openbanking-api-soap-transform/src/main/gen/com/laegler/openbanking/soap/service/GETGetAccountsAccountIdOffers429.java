
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.089+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdOffers_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdOffers429 extends Exception {

    private java.lang.Object getGetAccountsAccountIdOffers429;

    public GETGetAccountsAccountIdOffers429() {
        super();
    }

    public GETGetAccountsAccountIdOffers429(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdOffers429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdOffers429(String message, java.lang.Object getGetAccountsAccountIdOffers429) {
        super(message);
        this.getGetAccountsAccountIdOffers429 = getGetAccountsAccountIdOffers429;
    }

    public GETGetAccountsAccountIdOffers429(String message, java.lang.Object getGetAccountsAccountIdOffers429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdOffers429 = getGetAccountsAccountIdOffers429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdOffers429;
    }
}