package com.finzsoft.sovse.occ.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import com.finzsoft.sovse.occ.MavenProperties;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public abstract class AbstractRestassured {

    protected String authorizationCode = "";
    protected String accessToken;

    protected String defaultApplicationNumber = "000123123123";
    protected String defaultClientNumber = "000123123123";

    private RequestSpecification req;
    private Response resp;

    protected RequestSpecification req() {
        if (req == null) {
            newReq();
        }
        return req;
    }

    protected RequestSpecification newReq() {
        accessToken = get_access_token_by_client_credentials();
    // @formatter:off
    req = given()
        .baseUri(MavenProperties.getBaseUri())
        .basePath(MavenProperties.getBasePath())
        .header("x-occapi-request-by-client", MavenProperties.getClientNumber())
        .auth()
          .preemptive()
          .oauth2(accessToken)
          .and()
        .accept(ContentType.OCC_JSON.contentType)
        .log().all();
    // @formatter:on
        return req;
    }

    protected RequestSpecification newNonAuthReq() {
    // @formatter:off
    req = given()
//        .baseUri("gets overwritten")
//        .basePath("gets overwritten")
        .accept(io.restassured.http.ContentType.JSON)
        .log().all();
    // @formatter:on
        return req;
    }

    protected RequestSpecification req(RequestSpecification req) {
        this.req = req;
        return this.req;
    }

    protected Response resp() {
        return resp;
    }

    protected Response resp(Response resp) {
        this.resp = resp;
        return this.resp;
    }

    public String get_access_token_by_client_credentials() {
    // @formatter:off
    resp(
      newNonAuthReq()
        .auth()
          .preemptive()
          .basic(MavenProperties.getClientId(), MavenProperties.getClientSecret())
        .contentType(io.restassured.http.ContentType.URLENC)
        .formParam("grant_type", "client_credentials")
        .formParam("scope", "TODO")
      .when()
        .post(MavenProperties.getTokenUrl()));
    // @formatter:on

        resp().then().assertThat().statusCode(200).and().body("access_token", notNullValue());
        accessToken = resp().body().jsonPath().getString("access_token");
        return accessToken;
    }

    public String get_access_token_by_username_password() {
    // @formatter:off
    resp(
      newNonAuthReq()
        .auth()
          .preemptive()
          .basic(MavenProperties.getClientId(), MavenProperties.getClientSecret())
        .contentType(io.restassured.http.ContentType.URLENC)
        .formParam("grant_type", "password")
        .formParam("username", MavenProperties.getUsername())
        .formParam("password", MavenProperties.getPassword())
        .formParam("scope", "TODO")
      .when()
        .post(MavenProperties.getTokenUrl()));
    // @formatter:on

        resp().then().assertThat().statusCode(200).and().body("access_token", notNullValue());
        accessToken = resp().body().jsonPath().getString("access_token");
        return accessToken;
    }

    public String get_access_token_by_refresh_token() {
    // @formatter:off
    resp(
      newNonAuthReq()
        .auth()
          .preemptive()
          .basic(MavenProperties.getClientId(), MavenProperties.getClientSecret())
        .contentType(io.restassured.http.ContentType.URLENC)
        .formParam("grant_type", "client_credentials")
        .formParam("scope", "TODO")
      .when()
        .post(MavenProperties.getTokenUrl()));
    // @formatter:on

        resp().then().assertThat().statusCode(200).and().body("access_token", notNullValue());
        accessToken = resp().body().jsonPath().getString("access_token");
        return accessToken;
    }

    public String get_access_token_by_authorization_code() {
    // @formatter:off
    resp(
      newNonAuthReq()
        .auth()
          .preemptive()
          .basic(MavenProperties.getClientId(), MavenProperties.getClientSecret())
        .contentType(io.restassured.http.ContentType.URLENC)
        .formParam("grant_type", "authorization_code")
        .formParam("redirect_uri", MavenProperties.getRedirectUrl())
        .formParam("response_type", "code")
        .formParam("code", authorizationCode)
        .formParam("client_id", MavenProperties.getClientId())
        .formParam("client_secret", MavenProperties.getClientSecret())
      .when()
        .post(MavenProperties.getTokenUrl()));
    // @formatter:on

        resp().then().assertThat().statusCode(200).and().body("access_token", notNullValue());
        accessToken = resp().body().jsonPath().getString("access_token");
        return accessToken;
    }

    // +++++++ //
    // Asserts //
    // +++++++ //

    public void assert_status_code_equals(int httpStatusCode) {
        resp().then().assertThat().statusCode(httpStatusCode);
    }

    public void assert_status_bad_request() {
        assert_status_code_equals(400);
    }

    public void assert_status_not_authorized() {
        assert_status_code_equals(401);
    }

    public void assert_status_server_error() {
        assert_status_code_equals(500);
    }
    
    public void assert_status_not_found() {
        assert_status_code_equals(404);
    }
    
    public void assert_status_forbidden() {
        assert_status_code_equals(403);
    }

}
