
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Too Many Requests
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.865+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetBeneficiaries_429", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetBeneficiaries429 extends Exception {

    private java.lang.Object getGetBeneficiaries429;

    public GETGetBeneficiaries429() {
        super();
    }

    public GETGetBeneficiaries429(String message) {
        super(message);
    }

    public GETGetBeneficiaries429(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetBeneficiaries429(String message, java.lang.Object getGetBeneficiaries429) {
        super(message);
        this.getGetBeneficiaries429 = getGetBeneficiaries429;
    }

    public GETGetBeneficiaries429(String message, java.lang.Object getGetBeneficiaries429, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetBeneficiaries429 = getGetBeneficiaries429;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetBeneficiaries429;
    }
}
