
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad Gateway
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.503+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateanAuthorisationServerforthegivenorganisation_502", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateanAuthorisationServerforthegivenorganisation502 extends Exception {

    private java.lang.Object postCreateanAuthorisationServerforthegivenorganisation502;

    public POSTCreateanAuthorisationServerforthegivenorganisation502() {
        super();
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation502(String message) {
        super(message);
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation502(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation502(String message, java.lang.Object postCreateanAuthorisationServerforthegivenorganisation502) {
        super(message);
        this.postCreateanAuthorisationServerforthegivenorganisation502 = postCreateanAuthorisationServerforthegivenorganisation502;
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation502(String message, java.lang.Object postCreateanAuthorisationServerforthegivenorganisation502, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateanAuthorisationServerforthegivenorganisation502 = postCreateanAuthorisationServerforthegivenorganisation502;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateanAuthorisationServerforthegivenorganisation502;
    }
}
