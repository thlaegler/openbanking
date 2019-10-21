package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBWriteDomesticResponse3;
import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteDomestic2;
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

public class DomesticPaymentsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createDomesticPayments_400() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createDomesticPayments_401() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createDomesticPayments_403() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createDomesticPayments_404() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createDomesticPayments_500() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createDomesticPayments_405() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createDomesticPayments_406() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createDomesticPayments_201() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(201);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createDomesticPayments_429() {
		given().spec(spec).when().post("/domestic-payments/domestic-payments").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getDomesticPaymentsDomesticPaymentId_400() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getDomesticPaymentsDomesticPaymentId_401() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getDomesticPaymentsDomesticPaymentId_403() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getDomesticPaymentsDomesticPaymentId_404() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getDomesticPaymentsDomesticPaymentId_500() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getDomesticPaymentsDomesticPaymentId_405() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getDomesticPaymentsDomesticPaymentId_406() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getDomesticPaymentsDomesticPaymentId_200() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getDomesticPaymentsDomesticPaymentId_429() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_400() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_401() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_403() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_404() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_500() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_405() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_406() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_200() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getDomesticPaymentsDomesticPaymentIdPaymentDetails_429() {
		given().spec(spec).when().get("/domestic-payments/domestic-payments/{DomesticPaymentId}/payment-details").then().assertThat().statusCode(429);
	}

}
