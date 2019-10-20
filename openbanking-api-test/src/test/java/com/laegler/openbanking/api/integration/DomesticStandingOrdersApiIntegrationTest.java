package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrderResponse4;
import com.laegler.openbanking.model.OBWriteDomesticStandingOrder3;
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

public class DomesticStandingOrdersApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_createDomesticStandingOrders_400() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_createDomesticStandingOrders_401() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_createDomesticStandingOrders_403() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_createDomesticStandingOrders_404() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_createDomesticStandingOrders_500() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_createDomesticStandingOrders_405() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_createDomesticStandingOrders_406() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_createDomesticStandingOrders_201() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(201);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_createDomesticStandingOrders_429() {
		given().spec(spec).when().post("/domestic-standing-orders/domestic-standing-orders").then().assertThat().statusCode(429);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_400() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_401() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_403() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_404() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_500() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_405() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_406() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_200() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getDomesticStandingOrdersDomesticStandingOrderId_429() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}").then().assertThat().statusCode(429);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_400() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_401() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_403() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(403);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_404() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_500() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_405() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(405);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_406() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_200() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails_429() {
		given().spec(spec).when().get("/domestic-standing-orders/domestic-standing-orders/{DomesticStandingOrderId}/payment-details").then().assertThat().statusCode(429);
	}

}
