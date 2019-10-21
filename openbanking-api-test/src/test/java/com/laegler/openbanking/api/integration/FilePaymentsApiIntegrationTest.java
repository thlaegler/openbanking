package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBWriteFile2;
import com.laegler.openbanking.model.OBWriteFileResponse2;
import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWritePaymentDetailsResponse1;

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

public class FilePaymentsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createFilePayments_400() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createFilePayments_401() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createFilePayments_403() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createFilePayments_404() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createFilePayments_500() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createFilePayments_405() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createFilePayments_406() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createFilePayments_201() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(201);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createFilePayments_429() {
		given().spec(spec).when().post("/file-payments/file-payments").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getFilePaymentsFilePaymentId_400() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getFilePaymentsFilePaymentId_401() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getFilePaymentsFilePaymentId_403() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getFilePaymentsFilePaymentId_404() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getFilePaymentsFilePaymentId_500() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getFilePaymentsFilePaymentId_405() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getFilePaymentsFilePaymentId_406() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getFilePaymentsFilePaymentId_200() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getFilePaymentsFilePaymentId_429() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_400() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_401() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_403() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_404() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_500() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_405() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_406() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_200() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getFilePaymentsFilePaymentIdPaymentDetails_429() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/payment-details").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getFilePaymentsFilePaymentIdReportFile_400() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getFilePaymentsFilePaymentIdReportFile_401() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getFilePaymentsFilePaymentIdReportFile_403() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getFilePaymentsFilePaymentIdReportFile_404() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getFilePaymentsFilePaymentIdReportFile_500() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getFilePaymentsFilePaymentIdReportFile_405() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getFilePaymentsFilePaymentIdReportFile_406() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getFilePaymentsFilePaymentIdReportFile_200() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getFilePaymentsFilePaymentIdReportFile_429() {
		given().spec(spec).when().get("/file-payments/file-payments/{FilePaymentId}/report-file").then().assertThat().statusCode(429);
	}

}
