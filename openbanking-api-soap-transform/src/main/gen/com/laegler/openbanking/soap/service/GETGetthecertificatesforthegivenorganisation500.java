
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.120+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Getthecertificatesforthegivenorganisation_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetthecertificatesforthegivenorganisation500 extends Exception {

    private java.lang.Object getGetthecertificatesforthegivenorganisation500;

    public GETGetthecertificatesforthegivenorganisation500() {
        super();
    }

    public GETGetthecertificatesforthegivenorganisation500(String message) {
        super(message);
    }

    public GETGetthecertificatesforthegivenorganisation500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetthecertificatesforthegivenorganisation500(String message, java.lang.Object getGetthecertificatesforthegivenorganisation500) {
        super(message);
        this.getGetthecertificatesforthegivenorganisation500 = getGetthecertificatesforthegivenorganisation500;
    }

    public GETGetthecertificatesforthegivenorganisation500(String message, java.lang.Object getGetthecertificatesforthegivenorganisation500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetthecertificatesforthegivenorganisation500 = getGetthecertificatesforthegivenorganisation500;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetthecertificatesforthegivenorganisation500;
    }
}
