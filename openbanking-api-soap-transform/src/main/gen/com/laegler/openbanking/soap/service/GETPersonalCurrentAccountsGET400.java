
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * You have sent a request which could not be understood.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.965+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_PersonalCurrentAccounts_GET_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETPersonalCurrentAccountsGET400 extends Exception {

    private com.laegler.openbanking.soap.model.Error503Object getPersonalCurrentAccountsGET400;

    public GETPersonalCurrentAccountsGET400() {
        super();
    }

    public GETPersonalCurrentAccountsGET400(String message) {
        super(message);
    }

    public GETPersonalCurrentAccountsGET400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETPersonalCurrentAccountsGET400(String message, com.laegler.openbanking.soap.model.Error503Object getPersonalCurrentAccountsGET400) {
        super(message);
        this.getPersonalCurrentAccountsGET400 = getPersonalCurrentAccountsGET400;
    }

    public GETPersonalCurrentAccountsGET400(String message, com.laegler.openbanking.soap.model.Error503Object getPersonalCurrentAccountsGET400, java.lang.Throwable cause) {
        super(message, cause);
        this.getPersonalCurrentAccountsGET400 = getPersonalCurrentAccountsGET400;
    }

    public com.laegler.openbanking.soap.model.Error503Object getFaultInfo() {
        return this.getPersonalCurrentAccountsGET400;
    }
}
