
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Not found
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:27.438+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_Updateasoftwarestatement_404", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTUpdateasoftwarestatement404 extends Exception {

    private java.lang.Object putUpdateasoftwarestatement404;

    public PUTUpdateasoftwarestatement404() {
        super();
    }

    public PUTUpdateasoftwarestatement404(String message) {
        super(message);
    }

    public PUTUpdateasoftwarestatement404(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTUpdateasoftwarestatement404(String message, java.lang.Object putUpdateasoftwarestatement404) {
        super(message);
        this.putUpdateasoftwarestatement404 = putUpdateasoftwarestatement404;
    }

    public PUTUpdateasoftwarestatement404(String message, java.lang.Object putUpdateasoftwarestatement404, java.lang.Throwable cause) {
        super(message, cause);
        this.putUpdateasoftwarestatement404 = putUpdateasoftwarestatement404;
    }

    public java.lang.Object getFaultInfo() {
        return this.putUpdateasoftwarestatement404;
    }
}
