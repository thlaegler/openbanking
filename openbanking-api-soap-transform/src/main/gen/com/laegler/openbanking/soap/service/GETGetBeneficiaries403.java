
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.870+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetBeneficiaries_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetBeneficiaries403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBeneficiaries403;

    public GETGetBeneficiaries403() {
        super();
    }

    public GETGetBeneficiaries403(String message) {
        super(message);
    }

    public GETGetBeneficiaries403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetBeneficiaries403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBeneficiaries403) {
        super(message);
        this.getGetBeneficiaries403 = getGetBeneficiaries403;
    }

    public GETGetBeneficiaries403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetBeneficiaries403, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetBeneficiaries403 = getGetBeneficiaries403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetBeneficiaries403;
    }
}