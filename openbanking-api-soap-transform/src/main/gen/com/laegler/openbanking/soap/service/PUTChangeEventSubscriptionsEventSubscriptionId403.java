
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.898+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_ChangeEventSubscriptionsEventSubscriptionId_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTChangeEventSubscriptionsEventSubscriptionId403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 putChangeEventSubscriptionsEventSubscriptionId403;

    public PUTChangeEventSubscriptionsEventSubscriptionId403() {
        super();
    }

    public PUTChangeEventSubscriptionsEventSubscriptionId403(String message) {
        super(message);
    }

    public PUTChangeEventSubscriptionsEventSubscriptionId403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTChangeEventSubscriptionsEventSubscriptionId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 putChangeEventSubscriptionsEventSubscriptionId403) {
        super(message);
        this.putChangeEventSubscriptionsEventSubscriptionId403 = putChangeEventSubscriptionsEventSubscriptionId403;
    }

    public PUTChangeEventSubscriptionsEventSubscriptionId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 putChangeEventSubscriptionsEventSubscriptionId403, java.lang.Throwable cause) {
        super(message, cause);
        this.putChangeEventSubscriptionsEventSubscriptionId403 = putChangeEventSubscriptionsEventSubscriptionId403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.putChangeEventSubscriptionsEventSubscriptionId403;
    }
}
