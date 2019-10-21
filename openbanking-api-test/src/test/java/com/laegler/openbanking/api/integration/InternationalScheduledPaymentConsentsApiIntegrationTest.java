package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBWriteInternationalScheduledConsentResponse3;
import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteInternationalScheduledConsent3;
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

public class InternationalScheduledPaymentConsentsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createInternationalScheduledPaymentConsents_400() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createInternationalScheduledPaymentConsents_401() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createInternationalScheduledPaymentConsents_403() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createInternationalScheduledPaymentConsents_404() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createInternationalScheduledPaymentConsents_500() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createInternationalScheduledPaymentConsents_405() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createInternationalScheduledPaymentConsents_406() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createInternationalScheduledPaymentConsents_201() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(201);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createInternationalScheduledPaymentConsents_429() {
		given().spec(spec).when().post("/international-scheduled-payment-consents/international-scheduled-payment-consents").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getInternationalScheduledPaymentConsentsConsentId_400() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getInternationalScheduledPaymentConsentsConsentId_401() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getInternationalScheduledPaymentConsentsConsentId_403() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getInternationalScheduledPaymentConsentsConsentId_404() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getInternationalScheduledPaymentConsentsConsentId_500() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getInternationalScheduledPaymentConsentsConsentId_405() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getInternationalScheduledPaymentConsentsConsentId_406() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getInternationalScheduledPaymentConsentsConsentId_200() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getInternationalScheduledPaymentConsentsConsentId_429() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_400() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_401() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_403() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_404() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_500() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_405() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_406() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_200() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation_429() {
		given().spec(spec).when().get("/international-scheduled-payment-consents/international-scheduled-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(429);
	}

}
