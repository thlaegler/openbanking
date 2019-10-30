package com.finzsoft.sovse.occ.rest.attachment;

import java.io.InputStream;
import com.finzsoft.sovse.occ.rest.AbstractRestassured;
import com.finzsoft.sovse.occ.rest.JsonapiRestassured;
import com.finzsoft.sovse.occ.rest.TestUtil;

public class AttachmentsRestassured extends JsonapiRestassured {

    private static final String PATH = "/attachments";

    public void upload_attachement(String fileName) {
        InputStream fileStream = TestUtil.getFileStream(fileName, "");
        resp(newReq().when().multiPart("attachment", fileName, fileStream).contentType("multipart/mixed").get(PATH));
    }

}
