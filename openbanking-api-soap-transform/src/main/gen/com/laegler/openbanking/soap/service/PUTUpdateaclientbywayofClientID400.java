
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Bad request
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.941+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_UpdateaclientbywayofClientID_400", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTUpdateaclientbywayofClientID400 extends Exception {

    private com.laegler.openbanking.soap.model.OBErrorResponse1 putUpdateaclientbywayofClientID400;

    public PUTUpdateaclientbywayofClientID400() {
        super();
    }

    public PUTUpdateaclientbywayofClientID400(String message) {
        super(message);
    }

    public PUTUpdateaclientbywayofClientID400(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTUpdateaclientbywayofClientID400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 putUpdateaclientbywayofClientID400) {
        super(message);
        this.putUpdateaclientbywayofClientID400 = putUpdateaclientbywayofClientID400;
    }

    public PUTUpdateaclientbywayofClientID400(String message, com.laegler.openbanking.soap.model.OBErrorResponse1 putUpdateaclientbywayofClientID400, java.lang.Throwable cause) {
        super(message, cause);
        this.putUpdateaclientbywayofClientID400 = putUpdateaclientbywayofClientID400;
    }

    public com.laegler.openbanking.soap.model.OBErrorResponse1 getFaultInfo() {
        return this.putUpdateaclientbywayofClientID400;
    }
}
