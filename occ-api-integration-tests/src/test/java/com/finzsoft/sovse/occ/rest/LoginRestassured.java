package com.finzsoft.sovse.occ.rest;

public class LoginRestassured extends AbstractRestassured {

    public void get_access_token() {
        resp(newNonAuthReq().when().post());
    }

}
