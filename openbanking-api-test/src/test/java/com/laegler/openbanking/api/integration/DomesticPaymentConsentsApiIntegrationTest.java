package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteDomesticConsent3;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3;
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

public class DomesticPaymentConsentsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createDomesticPaymentConsents_400() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createDomesticPaymentConsents_401() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createDomesticPaymentConsents_403() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createDomesticPaymentConsents_404() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createDomesticPaymentConsents_500() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createDomesticPaymentConsents_405() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createDomesticPaymentConsents_406() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createDomesticPaymentConsents_201() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(201);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createDomesticPaymentConsents_429() {
		given().spec(spec).when().post("/domestic-payment-consents/domestic-payment-consents").then().assertThat().statusCode(429);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getDomesticPaymentConsentsConsentId_400() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getDomesticPaymentConsentsConsentId_401() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getDomesticPaymentConsentsConsentId_403() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getDomesticPaymentConsentsConsentId_404() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getDomesticPaymentConsentsConsentId_500() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getDomesticPaymentConsentsConsentId_405() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getDomesticPaymentConsentsConsentId_406() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getDomesticPaymentConsentsConsentId_200() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getDomesticPaymentConsentsConsentId_429() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}").then().assertThat().statusCode(429);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_400() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_401() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_403() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_404() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_500() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_405() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_406() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_200() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getDomesticPaymentConsentsConsentIdFundsConfirmation_429() {
		given().spec(spec).when().get("/domestic-payment-consents/domestic-payment-consents/{ConsentId}/funds-confirmation").then().assertThat().statusCode(429);
	}

}
