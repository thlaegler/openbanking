
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * A standard error response.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.002+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_BusinessCurrentAccounts_GET_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETBusinessCurrentAccountsGETDefault extends Exception {

    private com.laegler.openbanking.soap.model.Errorobject getBusinessCurrentAccountsGETDefault;

    public GETBusinessCurrentAccountsGETDefault() {
        super();
    }

    public GETBusinessCurrentAccountsGETDefault(String message) {
        super(message);
    }

    public GETBusinessCurrentAccountsGETDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETBusinessCurrentAccountsGETDefault(String message, com.laegler.openbanking.soap.model.Errorobject getBusinessCurrentAccountsGETDefault) {
        super(message);
        this.getBusinessCurrentAccountsGETDefault = getBusinessCurrentAccountsGETDefault;
    }

    public GETBusinessCurrentAccountsGETDefault(String message, com.laegler.openbanking.soap.model.Errorobject getBusinessCurrentAccountsGETDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.getBusinessCurrentAccountsGETDefault = getBusinessCurrentAccountsGETDefault;
    }

    public com.laegler.openbanking.soap.model.Errorobject getFaultInfo() {
        return this.getBusinessCurrentAccountsGETDefault;
    }
}
