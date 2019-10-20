
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * The service is temporarily unavailable.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.968+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_PersonalCurrentAccounts_GET_503", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETPersonalCurrentAccountsGET503 extends Exception {

    private com.laegler.openbanking.soap.model.Error503Object getPersonalCurrentAccountsGET503;

    public GETPersonalCurrentAccountsGET503() {
        super();
    }

    public GETPersonalCurrentAccountsGET503(String message) {
        super(message);
    }

    public GETPersonalCurrentAccountsGET503(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETPersonalCurrentAccountsGET503(String message, com.laegler.openbanking.soap.model.Error503Object getPersonalCurrentAccountsGET503) {
        super(message);
        this.getPersonalCurrentAccountsGET503 = getPersonalCurrentAccountsGET503;
    }

    public GETPersonalCurrentAccountsGET503(String message, com.laegler.openbanking.soap.model.Error503Object getPersonalCurrentAccountsGET503, java.lang.Throwable cause) {
        super(message, cause);
        this.getPersonalCurrentAccountsGET503 = getPersonalCurrentAccountsGET503;
    }

    public com.laegler.openbanking.soap.model.Error503Object getFaultInfo() {
        return this.getPersonalCurrentAccountsGET503;
    }
}