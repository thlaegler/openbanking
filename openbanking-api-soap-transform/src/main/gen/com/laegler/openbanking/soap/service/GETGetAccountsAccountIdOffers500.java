
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.097+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdOffers_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdOffers500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdOffers500;

    public GETGetAccountsAccountIdOffers500() {
        super();
    }

    public GETGetAccountsAccountIdOffers500(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdOffers500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdOffers500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdOffers500) {
        super(message);
        this.getGetAccountsAccountIdOffers500 = getGetAccountsAccountIdOffers500;
    }

    public GETGetAccountsAccountIdOffers500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdOffers500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdOffers500 = getGetAccountsAccountIdOffers500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdOffers500;
    }
}
