
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * An error occurred while executing the operation
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.520+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Searchforoneormoreresources_Default", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETSearchforoneormoreresourcesDefault extends Exception {

    private com.laegler.openbanking.soap.model.ErrorResponse getSearchforoneormoreresourcesDefault;

    public GETSearchforoneormoreresourcesDefault() {
        super();
    }

    public GETSearchforoneormoreresourcesDefault(String message) {
        super(message);
    }

    public GETSearchforoneormoreresourcesDefault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETSearchforoneormoreresourcesDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse getSearchforoneormoreresourcesDefault) {
        super(message);
        this.getSearchforoneormoreresourcesDefault = getSearchforoneormoreresourcesDefault;
    }

    public GETSearchforoneormoreresourcesDefault(String message, com.laegler.openbanking.soap.model.ErrorResponse getSearchforoneormoreresourcesDefault, java.lang.Throwable cause) {
        super(message, cause);
        this.getSearchforoneormoreresourcesDefault = getSearchforoneormoreresourcesDefault;
    }

    public com.laegler.openbanking.soap.model.ErrorResponse getFaultInfo() {
        return this.getSearchforoneormoreresourcesDefault;
    }
}
