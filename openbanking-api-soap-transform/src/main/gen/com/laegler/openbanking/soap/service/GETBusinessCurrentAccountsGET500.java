
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * An error occurred on the server. No further information is available.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.005+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_BusinessCurrentAccounts_GET_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETBusinessCurrentAccountsGET500 extends Exception {

    private com.laegler.openbanking.soap.model.Error503Object getBusinessCurrentAccountsGET500;

    public GETBusinessCurrentAccountsGET500() {
        super();
    }

    public GETBusinessCurrentAccountsGET500(String message) {
        super(message);
    }

    public GETBusinessCurrentAccountsGET500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETBusinessCurrentAccountsGET500(String message, com.laegler.openbanking.soap.model.Error503Object getBusinessCurrentAccountsGET500) {
        super(message);
        this.getBusinessCurrentAccountsGET500 = getBusinessCurrentAccountsGET500;
    }

    public GETBusinessCurrentAccountsGET500(String message, com.laegler.openbanking.soap.model.Error503Object getBusinessCurrentAccountsGET500, java.lang.Throwable cause) {
        super(message, cause);
        this.getBusinessCurrentAccountsGET500 = getBusinessCurrentAccountsGET500;
    }

    public com.laegler.openbanking.soap.model.Error503Object getFaultInfo() {
        return this.getBusinessCurrentAccountsGET500;
    }
}