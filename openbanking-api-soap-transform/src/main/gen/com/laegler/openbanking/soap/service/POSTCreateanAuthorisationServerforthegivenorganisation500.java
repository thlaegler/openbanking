
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.505+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "POST_CreateanAuthorisationServerforthegivenorganisation_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class POSTCreateanAuthorisationServerforthegivenorganisation500 extends Exception {

    private java.lang.Object postCreateanAuthorisationServerforthegivenorganisation500;

    public POSTCreateanAuthorisationServerforthegivenorganisation500() {
        super();
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation500(String message) {
        super(message);
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation500(String message, java.lang.Object postCreateanAuthorisationServerforthegivenorganisation500) {
        super(message);
        this.postCreateanAuthorisationServerforthegivenorganisation500 = postCreateanAuthorisationServerforthegivenorganisation500;
    }

    public POSTCreateanAuthorisationServerforthegivenorganisation500(String message, java.lang.Object postCreateanAuthorisationServerforthegivenorganisation500, java.lang.Throwable cause) {
        super(message, cause);
        this.postCreateanAuthorisationServerforthegivenorganisation500 = postCreateanAuthorisationServerforthegivenorganisation500;
    }

    public java.lang.Object getFaultInfo() {
        return this.postCreateanAuthorisationServerforthegivenorganisation500;
    }
}