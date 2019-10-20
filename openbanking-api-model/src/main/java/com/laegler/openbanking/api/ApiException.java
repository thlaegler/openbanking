package com.laegler.openbanking.api;

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingTestCodegen", date = "2019-10-19T07:54:46.825+13:00")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
