
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.314+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetStatements_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetStatements400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStatements400;

    public GETGetStatements400() {
        super();
    }

    public GETGetStatements400(String message) {
        super(message);
    }

    public GETGetStatements400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetStatements400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStatements400) {
        super(message);
        this.getGetStatements400 = getGetStatements400;
    }

    public GETGetStatements400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetStatements400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetStatements400 = getGetStatements400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetStatements400;
    }
}
