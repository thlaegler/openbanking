
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Internal Server Error
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.989+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "GET_Getallsoftwarestatementsforthegivenorganisation_500", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class GETGetallsoftwarestatementsforthegivenorganisation500 extends Exception {

    private java.lang.Object getGetallsoftwarestatementsforthegivenorganisation500;

    public GETGetallsoftwarestatementsforthegivenorganisation500() {
        super();
    }

    public GETGetallsoftwarestatementsforthegivenorganisation500(String message) {
        super(message);
    }

    public GETGetallsoftwarestatementsforthegivenorganisation500(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GETGetallsoftwarestatementsforthegivenorganisation500(String message, java.lang.Object getGetallsoftwarestatementsforthegivenorganisation500) {
        super(message);
        this.getGetallsoftwarestatementsforthegivenorganisation500 = getGetallsoftwarestatementsforthegivenorganisation500;
    }

    public GETGetallsoftwarestatementsforthegivenorganisation500(String message, java.lang.Object getGetallsoftwarestatementsforthegivenorganisation500, java.lang.Throwable cause) {
        super(message, cause);
        this.getGetallsoftwarestatementsforthegivenorganisation500 = getGetallsoftwarestatementsforthegivenorganisation500;
    }

    public java.lang.Object getFaultInfo() {
        return this.getGetallsoftwarestatementsforthegivenorganisation500;
    }
}