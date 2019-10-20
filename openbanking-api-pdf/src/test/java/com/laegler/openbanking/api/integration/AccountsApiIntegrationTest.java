package com.laegler.openbanking.api.integration;

import com.laegler.openbanking.AbstractIntegrationTest;
import com.laegler.openbanking.api.*;
import com.laegler.openbanking.model.*;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;


import com.laegler.openbanking.model.OBReadAccount4;
import com.laegler.openbanking.model.OBErrorResponse1;
import com.laegler.openbanking.model.OBReadBalance1;
import com.laegler.openbanking.model.OBReadBeneficiary3;
import com.laegler.openbanking.model.OBReadDirectDebit1;
import com.laegler.openbanking.model.OBReadOffer1;
import com.laegler.openbanking.model.OBReadParty3;
import com.laegler.openbanking.model.OBReadParty2;
import com.laegler.openbanking.model.OBReadProduct2;
import com.laegler.openbanking.model.OBReadScheduledPayment2;
import com.laegler.openbanking.model.OBReadStandingOrder5;
import com.laegler.openbanking.model.OBReadStatement2;
import com.laegler.openbanking.model.OBReadTransaction5;

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

public class AccountsApiIntegrationTest extends AbstractIntegrationTest {

}
