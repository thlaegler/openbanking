
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.094+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdOffers_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdOffers404 extends Exception {

    private java.lang.Object getGetAccountsAccountIdOffers404;

    public GETGetAccountsAccountIdOffers404() {
        super();
    }

    public GETGetAccountsAccountIdOffers404(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdOffers404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdOffers404(String message, java.lang.Object getGetAccountsAccountIdOffers404) {
        super(message);
        this.getGetAccountsAccountIdOffers404 = getGetAccountsAccountIdOffers404;
    }

    public GETGetAccountsAccountIdOffers404(String message, java.lang.Object getGetAccountsAccountIdOffers404, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdOffers404 = getGetAccountsAccountIdOffers404;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdOffers404;
    }
}
