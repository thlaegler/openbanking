
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.210+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_GetScheduledPayments_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetScheduledPayments500 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 getGetScheduledPayments500;

    public GETGetScheduledPayments500() {
        super();
    }

    public GETGetScheduledPayments500(String message) {
        super(message);
    }

    public GETGetScheduledPayments500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetScheduledPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetScheduledPayments500) {
        super(message);
        this.getGetScheduledPayments500 = getGetScheduledPayments500;
    }

    public GETGetScheduledPayments500(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 getGetScheduledPayments500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetScheduledPayments500 = getGetScheduledPayments500;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.getGetScheduledPayments500;
    }
}
