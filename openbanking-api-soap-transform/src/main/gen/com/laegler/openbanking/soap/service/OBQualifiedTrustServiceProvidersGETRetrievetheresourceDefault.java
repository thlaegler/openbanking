
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * An error occurred while executing the operation
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.537+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "OBQualifiedTrustServiceProviders_GET_Retrievetheresource_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class OBQualifiedTrustServiceProvidersGETRetrievetheresourceDefault extends Exception {

    private com.laegler.openbanking.soap.model.ErrorResponse obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault;

    public OBQualifiedTrustServiceProvidersGETRetrievetheresourceDefault() {
        super();
    }

    public OBQualifiedTrustServiceProvidersGETRetrievetheresourceDefault(String message) {
        super(message);
    }

    public OBQualifiedTrustServiceProvidersGETRetrievetheresourceDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public OBQualifiedTrustServiceProvidersGETRetrievetheresourceDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault) {
        super(message);
        this.obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault = obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault;
    }

    public OBQualifiedTrustServiceProvidersGETRetrievetheresourceDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault = obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault;
    }

    public com.laegler.openbanking.soap.model.ErrorResponse getFaultInfo() {
        return this.obQualifiedTrustServiceProvidersGETRetrievetheresourceDefault;
    }
}