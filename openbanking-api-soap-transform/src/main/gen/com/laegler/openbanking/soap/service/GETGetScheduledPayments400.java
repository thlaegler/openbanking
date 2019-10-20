
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.211+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetScheduledPayments_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetScheduledPayments400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetScheduledPayments400;

    public GETGetScheduledPayments400() {
        super();
    }

    public GETGetScheduledPayments400(String message) {
        super(message);
    }

    public GETGetScheduledPayments400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetScheduledPayments400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetScheduledPayments400) {
        super(message);
        this.getGetScheduledPayments400 = getGetScheduledPayments400;
    }

    public GETGetScheduledPayments400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetScheduledPayments400, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetScheduledPayments400 = getGetScheduledPayments400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetScheduledPayments400;
    }
}