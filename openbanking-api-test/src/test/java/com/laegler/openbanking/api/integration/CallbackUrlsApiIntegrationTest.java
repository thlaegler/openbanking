package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBCallbackUrlResponse1;
import com.laegler.openbanking.model.OBCallbackUrl1;
import com.laegler.openbanking.model.OBCallbackUrlsResponse1;

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

public class CallbackUrlsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_callbackUrlsCallbackUrlIdDelete_400() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_callbackUrlsCallbackUrlIdDelete_401() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_callbackUrlsCallbackUrlIdDelete_403() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_callbackUrlsCallbackUrlIdDelete_404() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_callbackUrlsCallbackUrlIdDelete_500() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_callbackUrlsCallbackUrlIdDelete_405() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_callbackUrlsCallbackUrlIdDelete_406() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 204")
	public void test_callbackUrlsCallbackUrlIdDelete_204() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(204);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_callbackUrlsCallbackUrlIdDelete_429() {
		given().spec(spec).when().delete("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_callbackUrlsCallbackUrlIdPut_400() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_callbackUrlsCallbackUrlIdPut_401() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_callbackUrlsCallbackUrlIdPut_403() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_callbackUrlsCallbackUrlIdPut_404() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_callbackUrlsCallbackUrlIdPut_500() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_callbackUrlsCallbackUrlIdPut_405() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_callbackUrlsCallbackUrlIdPut_406() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_callbackUrlsCallbackUrlIdPut_200() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_callbackUrlsCallbackUrlIdPut_429() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 415")
	public void test_callbackUrlsCallbackUrlIdPut_415() {
		given().spec(spec).when().put("/callback-urls/callback-urls/{CallbackUrlId}").then().assertThat().statusCode(415);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_callbackUrlsGet_400() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_callbackUrlsGet_401() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_callbackUrlsGet_403() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_callbackUrlsGet_404() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_callbackUrlsGet_500() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_callbackUrlsGet_405() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_callbackUrlsGet_406() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_callbackUrlsGet_200() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_callbackUrlsGet_429() {
		given().spec(spec).when().get("/callback-urls/callback-urls").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_callbackUrlsPost_400() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_callbackUrlsPost_401() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_callbackUrlsPost_403() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_callbackUrlsPost_500() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_callbackUrlsPost_405() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_callbackUrlsPost_406() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 201")
	public void test_callbackUrlsPost_201() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(201);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_callbackUrlsPost_429() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 415")
	public void test_callbackUrlsPost_415() {
		given().spec(spec).when().post("/callback-urls/callback-urls").then().assertThat().statusCode(415);
	}

}
