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

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T12:58:35.879+13:00")

public class OrganisationApiIntegrationTest extends AbstractIntegrationTest {

}
