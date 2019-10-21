package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.InlineResponse201;

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

public class RegisterApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_registerClientIdDelete_401() {
		given().spec(spec).when().delete("/register/register/{ClientId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_registerClientIdDelete_403() {
		given().spec(spec).when().delete("/register/register/{ClientId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_registerClientIdDelete_405() {
		given().spec(spec).when().delete("/register/register/{ClientId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 204")
	public void test_registerClientIdDelete_204() {
		given().spec(spec).when().delete("/register/register/{ClientId}").then().assertThat().statusCode(204);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_registerClientIdGet_401() {
		given().spec(spec).when().get("/register/register/{ClientId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_registerClientIdGet_403() {
		given().spec(spec).when().get("/register/register/{ClientId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_registerClientIdGet_200() {
		given().spec(spec).when().get("/register/register/{ClientId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_registerClientIdPut_400() {
		given().spec(spec).when().put("/register/register/{ClientId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_registerClientIdPut_401() {
		given().spec(spec).when().put("/register/register/{ClientId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_registerClientIdPut_403() {
		given().spec(spec).when().put("/register/register/{ClientId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_registerClientIdPut_200() {
		given().spec(spec).when().put("/register/register/{ClientId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_registerPost_400() {
		given().spec(spec).when().post("/register/register").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 201")
	public void test_registerPost_201() {
		given().spec(spec).when().post("/register/register").then().assertThat().statusCode(201);
	}

}
