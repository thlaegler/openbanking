
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Method Not Allowed
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.116+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "DELETE_DeleteEventSubscriptionsEventSubscriptionId_405", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class DELETEDeleteEventSubscriptionsEventSubscriptionId405 extends Exception {

    private java.lang.Object deleteDeleteEventSubscriptionsEventSubscriptionId405;

    public DELETEDeleteEventSubscriptionsEventSubscriptionId405() {
        super();
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId405(String message) {
        super(message);
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId405(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId405(String message, java.lang.Object deleteDeleteEventSubscriptionsEventSubscriptionId405) {
        super(message);
        this.deleteDeleteEventSubscriptionsEventSubscriptionId405 = deleteDeleteEventSubscriptionsEventSubscriptionId405;
    }

    public DELETEDeleteEventSubscriptionsEventSubscriptionId405(String message, java.lang.Object deleteDeleteEventSubscriptionsEventSubscriptionId405, java.lang.Throwable cause) {
        super(message, cause);
        this.deleteDeleteEventSubscriptionsEventSubscriptionId405 = deleteDeleteEventSubscriptionsEventSubscriptionId405;
    }

    public java.lang.Object getFaultInfo() {
        return this.deleteDeleteEventSubscriptionsEventSubscriptionId405;
    }
}
