package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.AuthorisationServerRequestSchema;
import com.laegler.openbanking.model.CertificateOrKeyGetSchema;
import com.laegler.openbanking.model.ContactSchema;
import com.laegler.openbanking.model.SoftwareStatementCreateSchema;
import com.laegler.openbanking.model.CertificateOrKeyAssociationSchema;
import com.laegler.openbanking.model.SoftwareStatementStateSchema;
import com.laegler.openbanking.model.SoftwareStatementRedirectURISchema;
import com.laegler.openbanking.model.EnrolSchema;

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

public class OrganisationApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete_400() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete_401() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete_404() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete_500() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete_406() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete_502() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 204")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete_204() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(204);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut_400() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut_401() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut_404() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut_500() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut_406() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut_502() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 202")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut_202() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId}").then().assertThat().statusCode(202);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerPost_400() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerPost_401() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerPost_404() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerPost_500() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerPost_406() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerPost_502() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_organisationOrganisationTypeOrganisationIdAuthorisationServerPost_201() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/authorisation-server").then().assertThat().statusCode(201);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdCertificateGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdCertificateGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdCertificateGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdCertificateGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdCertificateGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdCertificateGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdCertificateGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete_400() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete_401() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete_404() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete_500() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete_406() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete_502() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 204")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete_204() {
		given().spec(spec).when().delete("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(204);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost_400() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost_401() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost_404() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost_500() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost_406() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost_502() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost_201() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType}").then().assertThat().statusCode(201);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypeGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypeGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypeGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypeGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypeGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypeGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypePut_400() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypePut_401() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypePut_500() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypePut_406() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypePut_502() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdContactContactTypePut_200() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementPost_400() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementPost_401() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementPost_500() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementPost_406() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementPost_502() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementPost_201() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement").then().assertThat().statusCode(201);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_400() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_401() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_404() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_500() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_406() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_502() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_200() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 409")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_409() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(409);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 204")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut_204() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId}").then().assertThat().statusCode(204);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost_400() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost_401() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost_404() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost_500() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost_406() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost_502() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost_201() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType}").then().assertThat().statusCode(201);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut_400() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut_401() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut_404() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut_500() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut_406() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut_502() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut_200() {
		given().spec(spec).when().put("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_400() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_401() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_404() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_500() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_406() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_502() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_200() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 409")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost_409() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri").then().assertThat().statusCode(409);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet_400() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet_401() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 404")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet_404() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion").then().assertThat().statusCode(404);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet_500() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet_406() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet_502() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 200")
	public void test_organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet_200() {
		given().spec(spec).when().get("/organisation/organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion").then().assertThat().statusCode(200);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 400")
	public void test_organisationOrganisationTypePost_400() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(400);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 401")
	public void test_organisationOrganisationTypePost_401() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(401);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 500")
	public void test_organisationOrganisationTypePost_500() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(500);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 406")
	public void test_organisationOrganisationTypePost_406() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(406);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 502")
	public void test_organisationOrganisationTypePost_502() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(502);
	}

	@Test
	@Ignore("TODO: Define request to get HTTP status code 201")
	public void test_organisationOrganisationTypePost_201() {
		given().spec(spec).when().post("/organisation/organisation/{OrganisationType}").then().assertThat().statusCode(201);
	}

}
