
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * An error occurred while executing the operation
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.186+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "OBQualifiedTrustServiceProviders_GET_Searchforoneormoreresources_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class OBQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault extends Exception {

    private com.laegler.openbanking.soap.model.ErrorResponse obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault;

    public OBQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault() {
        super();
    }

    public OBQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault(String message) {
        super(message);
    }

    public OBQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public OBQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault) {
        super(message);
        this.obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault = obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault;
    }

    public OBQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault = obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault;
    }

    public com.laegler.openbanking.soap.model.ErrorResponse getFaultInfo() {
        return this.obQualifiedTrustServiceProvidersGETSearchforoneormoreresourcesDefault;
    }
}
