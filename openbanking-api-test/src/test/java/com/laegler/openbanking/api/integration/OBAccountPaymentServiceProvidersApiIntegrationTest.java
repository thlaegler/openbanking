package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBAccountPaymentServiceProvidersResponse;
import com.laegler.openbanking.model.ErrorResponse;
import com.laegler.openbanking.model.OBAccountPaymentServiceProviders;
import com.laegler.openbanking.model.SearchRequest;
import com.laegler.openbanking.model.InlineResponse200;

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

public class OBAccountPaymentServiceProvidersApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_oBAccountPaymentServiceProvidersGet_200() {
		given().spec(spec).when().get("/OBAccountPaymentServiceProviders/OBAccountPaymentServiceProviders").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_oBAccountPaymentServiceProvidersIdGet_200() {
		given().spec(spec).when().get("/OBAccountPaymentServiceProviders/OBAccountPaymentServiceProviders/{id}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_oBAccountPaymentServiceProvidersSearchPost_200() {
		given().spec(spec).when().post("/OBAccountPaymentServiceProviders/OBAccountPaymentServiceProviders/.search").then().assertThat().statusCode(200);
	}

}
