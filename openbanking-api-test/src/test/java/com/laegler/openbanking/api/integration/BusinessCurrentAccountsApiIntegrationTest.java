package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import java.util.Map;
import com.laegler.openbanking.model.BranchCurrentAccountResponse;

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

public class BusinessCurrentAccountsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_businessCurrentAccountsGet_400() {
		given().spec(spec).when().get("/business-current-accounts/business-current-accounts").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_businessCurrentAccountsGet_500() {
		given().spec(spec).when().get("/business-current-accounts/business-current-accounts").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 503")
	public void test_businessCurrentAccountsGet_503() {
		given().spec(spec).when().get("/business-current-accounts/business-current-accounts").then().assertThat().statusCode(503);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_businessCurrentAccountsGet_200() {
		given().spec(spec).when().get("/business-current-accounts/business-current-accounts").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 408")
	public void test_businessCurrentAccountsGet_408() {
		given().spec(spec).when().get("/business-current-accounts/business-current-accounts").then().assertThat().statusCode(408);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_businessCurrentAccountsGet_429() {
		given().spec(spec).when().get("/business-current-accounts/business-current-accounts").then().assertThat().statusCode(429);
	}

}
