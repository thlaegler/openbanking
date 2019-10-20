
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * An error occurred while executing the operation
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.164+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "OBAccountPaymentServiceProviders_GET_Searchforoneormoreresources_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class OBAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault extends Exception {

    private com.laegler.openbanking.soap.model.ErrorResponse obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault;

    public OBAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault() {
        super();
    }

    public OBAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault(String message) {
        super(message);
    }

    public OBAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public OBAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault) {
        super(message);
        this.obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault = obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault;
    }

    public OBAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault = obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault;
    }

    public com.laegler.openbanking.soap.model.ErrorResponse getFaultInfo() {
        return this.obAccountPaymentServiceProvidersGETSearchforoneormoreresourcesDefault;
    }
}