
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * A standard error response.
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.934+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_UnsecuredSmeLoans_GET_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETUnsecuredSmeLoansGETDefault extends Exception {

    private com.laegler.openbanking.soap.model.Errorobject getUnsecuredSmeLoansGETDefault;

    public GETUnsecuredSmeLoansGETDefault() {
        super();
    }

    public GETUnsecuredSmeLoansGETDefault(String message) {
        super(message);
    }

    public GETUnsecuredSmeLoansGETDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETUnsecuredSmeLoansGETDefault(String message, com.laegler.openbanking.soap.model.Errorobject getUnsecuredSmeLoansGETDefault) {
        super(message);
        this.getUnsecuredSmeLoansGETDefault = getUnsecuredSmeLoansGETDefault;
    }

    public GETUnsecuredSmeLoansGETDefault(String message, com.laegler.openbanking.soap.model.Errorobject getUnsecuredSmeLoansGETDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.getUnsecuredSmeLoansGETDefault = getUnsecuredSmeLoansGETDefault;
    }

    public com.laegler.openbanking.soap.model.Errorobject getFaultInfo() {
        return this.getUnsecuredSmeLoansGETDefault;
    }
}
