
package com.laegler.openbanking.soap.service;

import javax.xml.ws.WebFault;


/**
 * Unauthorized
 *
 * This class was generated by Apache CXF 3.3.3
 * 2019-10-21T07:01:26.940+13:00
 * Generated source version: 3.3.3
 */

@WebFault(name = "PUT_UpdateaclientbywayofClientID_401", targetNamespace = "http://laegler.com/openbanking/soap/model")
public class PUTUpdateaclientbywayofClientID401 extends Exception {

    private java.lang.Object putUpdateaclientbywayofClientID401;

    public PUTUpdateaclientbywayofClientID401() {
        super();
    }

    public PUTUpdateaclientbywayofClientID401(String message) {
        super(message);
    }

    public PUTUpdateaclientbywayofClientID401(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PUTUpdateaclientbywayofClientID401(String message, java.lang.Object putUpdateaclientbywayofClientID401) {
        super(message);
        this.putUpdateaclientbywayofClientID401 = putUpdateaclientbywayofClientID401;
    }

    public PUTUpdateaclientbywayofClientID401(String message, java.lang.Object putUpdateaclientbywayofClientID401, java.lang.Throwable cause) {
        super(message, cause);
        this.putUpdateaclientbywayofClientID401 = putUpdateaclientbywayofClientID401;
    }

    public java.lang.Object getFaultInfo() {
        return this.putUpdateaclientbywayofClientID401;
    }
}
