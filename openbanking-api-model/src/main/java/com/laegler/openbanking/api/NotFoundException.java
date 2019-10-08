package com.laegler.openbanking.api;

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingTestCodegen", date = "2019-10-19T07:54:46.825+13:00")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
