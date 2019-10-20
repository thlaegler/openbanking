package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBFundsConfirmationConsentResponse1;
import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBFundsConfirmationConsent1;

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

public class FundsConfirmationConsentsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createFundsConfirmationConsents_400() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createFundsConfirmationConsents_401() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createFundsConfirmationConsents_403() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createFundsConfirmationConsents_404() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createFundsConfirmationConsents_500() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createFundsConfirmationConsents_405() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createFundsConfirmationConsents_406() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createFundsConfirmationConsents_201() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(201);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createFundsConfirmationConsents_429() {
		given().spec(spec).when().post("/funds-confirmation-consents/funds-confirmation-consents").then().assertThat().statusCode(429);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_deleteFundsConfirmationConsentsConsentId_400() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_deleteFundsConfirmationConsentsConsentId_401() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_deleteFundsConfirmationConsentsConsentId_403() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_deleteFundsConfirmationConsentsConsentId_404() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_deleteFundsConfirmationConsentsConsentId_500() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_deleteFundsConfirmationConsentsConsentId_405() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_deleteFundsConfirmationConsentsConsentId_406() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 204")
	public void test_deleteFundsConfirmationConsentsConsentId_204() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(204);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_deleteFundsConfirmationConsentsConsentId_429() {
		given().spec(spec).when().delete("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(429);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getFundsConfirmationConsentsConsentId_400() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getFundsConfirmationConsentsConsentId_401() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getFundsConfirmationConsentsConsentId_403() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getFundsConfirmationConsentsConsentId_404() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getFundsConfirmationConsentsConsentId_500() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getFundsConfirmationConsentsConsentId_405() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getFundsConfirmationConsentsConsentId_406() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getFundsConfirmationConsentsConsentId_200() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getFundsConfirmationConsentsConsentId_429() {
		given().spec(spec).when().get("/funds-confirmation-consents/funds-confirmation-consents/{ConsentId}").then().assertThat().statusCode(429);
	}

}
