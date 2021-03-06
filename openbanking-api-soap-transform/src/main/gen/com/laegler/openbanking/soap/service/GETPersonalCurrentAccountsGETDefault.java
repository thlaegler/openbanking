
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * A standard error response.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.966+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_PersonalCurrentAccounts_GET_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETPersonalCurrentAccountsGETDefault extends Exception {

    private com.laegler.openbanking.soap.model.Errorobject getPersonalCurrentAccountsGETDefault;

    public GETPersonalCurrentAccountsGETDefault() {
        super();
    }

    public GETPersonalCurrentAccountsGETDefault(String message) {
        super(message);
    }

    public GETPersonalCurrentAccountsGETDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETPersonalCurrentAccountsGETDefault(String message, com.laegler.openbanking.soap.model.Errorobject getPersonalCurrentAccountsGETDefault) {
        super(message);
        this.getPersonalCurrentAccountsGETDefault = getPersonalCurrentAccountsGETDefault;
    }

    public GETPersonalCurrentAccountsGETDefault(String message, com.laegler.openbanking.soap.model.Errorobject getPersonalCurrentAccountsGETDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.getPersonalCurrentAccountsGETDefault = getPersonalCurrentAccountsGETDefault;
    }

    public com.laegler.openbanking.soap.model.Errorobject getFaultInfo() {
        return this.getPersonalCurrentAccountsGETDefault;
    }
}
