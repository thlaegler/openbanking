package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteFileConsent3;
import com.laegler.openbanking.model.OBWriteFileConsentResponse3;

import java.util.List;
import com.laegler.openbanking.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.junit.Test;
import org.junit.Ignore;

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingTestCodegen", date = "2019-10-21T07:47:41.234+13:00")

public class FilePaymentConsentsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createFilePaymentConsents_400() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createFilePaymentConsents_401() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createFilePaymentConsents_403() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createFilePaymentConsents_404() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createFilePaymentConsents_500() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createFilePaymentConsents_405() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createFilePaymentConsents_406() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createFilePaymentConsents_201() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(201);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createFilePaymentConsents_429() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createFilePaymentConsentsConsentIdFile_400() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createFilePaymentConsentsConsentIdFile_401() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createFilePaymentConsentsConsentIdFile_403() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createFilePaymentConsentsConsentIdFile_404() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createFilePaymentConsentsConsentIdFile_500() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createFilePaymentConsentsConsentIdFile_405() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createFilePaymentConsentsConsentIdFile_406() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_createFilePaymentConsentsConsentIdFile_200() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createFilePaymentConsentsConsentIdFile_429() {
		given().spec(spec).when().post("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getFilePaymentConsentsConsentId_400() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getFilePaymentConsentsConsentId_401() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getFilePaymentConsentsConsentId_403() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getFilePaymentConsentsConsentId_404() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getFilePaymentConsentsConsentId_500() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getFilePaymentConsentsConsentId_405() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getFilePaymentConsentsConsentId_406() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getFilePaymentConsentsConsentId_200() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getFilePaymentConsentsConsentId_429() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getFilePaymentConsentsConsentIdFile_400() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getFilePaymentConsentsConsentIdFile_401() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getFilePaymentConsentsConsentIdFile_403() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getFilePaymentConsentsConsentIdFile_404() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getFilePaymentConsentsConsentIdFile_500() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getFilePaymentConsentsConsentIdFile_405() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getFilePaymentConsentsConsentIdFile_406() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getFilePaymentConsentsConsentIdFile_200() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getFilePaymentConsentsConsentIdFile_429() {
		given().spec(spec).when().get("/file-payment-consents/file-payment-consents/{ConsentId}/file").then().assertThat().statusCode(429);
	}

}
