
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Forbidden
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.106+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteEventSubscriptionsEventSubscriptionId_403", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteEventSubscriptionsEventSubscriptionId403 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 deleteDeleteEventSubscriptionsEventSubscriptionId403;

    public DELETEDeleteEventSubscriptionsEventSubscriptionId403() {
        super();
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId403(String message) {
        super(message);
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId403(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 deleteDeleteEventSubscriptionsEventSubscriptionId403) {
        super(message);
        this.deleteDeleteEventSubscriptionsEventSubscriptionId403 = deleteDeleteEventSubscriptionsEventSubscriptionId403;
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId403(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 deleteDeleteEventSubscriptionsEventSubscriptionId403, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteEventSubscriptionsEventSubscriptionId403 = deleteDeleteEventSubscriptionsEventSubscriptionId403;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.deleteDeleteEventSubscriptionsEventSubscriptionId403;
    }
}
