package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBWriteInternationalConsent3;
import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteInternationalConsentResponse3;
import com.laegler.openbanking.model.OBWriteFundsConfirmationResponse1;

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

public class InternationalPaymentConsentsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createInternationalPaymentConsents_400() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createInternationalPaymentConsents_401() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createInternationalPaymentConsents_403() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createInternationalPaymentConsents_404() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createInternationalPaymentConsents_500() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createInternationalPaymentConsents_405() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createInternationalPaymentConsents_406() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createInternationalPaymentConsents_201() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(201);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createInternationalPaymentConsents_429() {
		given().spec(spec).when().post("/international-payment-consents/international-payment-consents").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getInternationalPaymentConsentsConsentId_400() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getInternationalPaymentConsentsConsentId_401() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getInternationalPaymentConsentsConsentId_403() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getInternationalPaymentConsentsConsentId_404() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getInternationalPaymentConsentsConsentId_500() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getInternationalPaymentConsentsConsentId_405() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getInternationalPaymentConsentsConsentId_406() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getInternationalPaymentConsentsConsentId_200() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getInternationalPaymentConsentsConsentId_429() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_400() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_401() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_403() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_404() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_500() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_405() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_406() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_200() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getInternationalPaymentConsentsConsentIdFundsConfirmation_429() {
		given().spec(spec).when().get("/international-payment-consents/international-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(429);
	}

}
