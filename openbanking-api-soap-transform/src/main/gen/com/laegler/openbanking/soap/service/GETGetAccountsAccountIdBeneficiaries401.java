
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.794+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdBeneficiaries_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdBeneficiaries401 extends Exception {

    private java.lang.Object getGetAccountsAccountIdBeneficiaries401;

    public GETGetAccountsAccountIdBeneficiaries401() {
        super();
    }

    public GETGetAccountsAccountIdBeneficiaries401(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdBeneficiaries401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdBeneficiaries401(String message, java.lang.Object getGetAccountsAccountIdBeneficiaries401) {
        super(message);
        this.getGetAccountsAccountIdBeneficiaries401 = getGetAccountsAccountIdBeneficiaries401;
    }

    public GETGetAccountsAccountIdBeneficiaries401(String message, java.lang.Object getGetAccountsAccountIdBeneficiaries401, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdBeneficiaries401 = getGetAccountsAccountIdBeneficiaries401;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetAccountsAccountIdBeneficiaries401;
    }
}