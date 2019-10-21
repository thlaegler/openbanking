package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.InlineResponse2003;
import com.laegler.openbanking.model.ErrorResponse;
import com.laegler.openbanking.model.OBThirdPartyProviders;
import com.laegler.openbanking.model.SearchRequest;

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

public class OBThirdPartyProvidersApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_oBThirdPartyProvidersGet_200() {
		given().spec(spec).when().get("/OBThirdPartyProviders/OBThirdPartyProviders").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_oBThirdPartyProvidersIdGet_200() {
		given().spec(spec).when().get("/OBThirdPartyProviders/OBThirdPartyProviders/{id}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_oBThirdPartyProvidersSearchPost_200() {
		given().spec(spec).when().post("/OBThirdPartyProviders/OBThirdPartyProviders/.search").then().assertThat().statusCode(200);
	}

}
