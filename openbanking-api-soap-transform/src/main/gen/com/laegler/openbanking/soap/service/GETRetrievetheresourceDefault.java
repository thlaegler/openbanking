
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * An error occurred while executing the operation
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.806+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Retrievetheresource_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETRetrievetheresourceDefault extends Exception {

    private com.laegler.openbanking.soap.model.ErrorResponse getRetrievetheresourceDefault;

    public GETRetrievetheresourceDefault() {
        super();
    }

    public GETRetrievetheresourceDefault(String message) {
        super(message);
    }

    public GETRetrievetheresourceDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETRetrievetheresourceDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse getRetrievetheresourceDefault) {
        super(message);
        this.getRetrievetheresourceDefault = getRetrievetheresourceDefault;
    }

    public GETRetrievetheresourceDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse getRetrievetheresourceDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.getRetrievetheresourceDefault = getRetrievetheresourceDefault;
    }

    public com.laegler.openbanking.soap.model.ErrorResponse getFaultInfo() {
        return this.getRetrievetheresourceDefault;
    }
}
