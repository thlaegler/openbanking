
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.790+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetAccountsAccountIdBeneficiaries_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetAccountsAccountIdBeneficiaries403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdBeneficiaries403;

    public GETGetAccountsAccountIdBeneficiaries403() {
        super();
    }

    public GETGetAccountsAccountIdBeneficiaries403(String message) {
        super(message);
    }

    public GETGetAccountsAccountIdBeneficiaries403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetAccountsAccountIdBeneficiaries403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdBeneficiaries403) {
        super(message);
        this.getGetAccountsAccountIdBeneficiaries403 = getGetAccountsAccountIdBeneficiaries403;
    }

    public GETGetAccountsAccountIdBeneficiaries403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetAccountsAccountIdBeneficiaries403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetAccountsAccountIdBeneficiaries403 = getGetAccountsAccountIdBeneficiaries403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetAccountsAccountIdBeneficiaries403;
    }
}