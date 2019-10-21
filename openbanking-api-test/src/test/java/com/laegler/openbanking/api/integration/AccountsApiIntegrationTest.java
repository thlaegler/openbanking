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

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingTestCodegen", date = "2019-10-21T07:47:41.234+13:00")

public class AccountsApiIntegrationTest extends AbstractIntegrationTest {

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccounts_400() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccounts_401() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccounts_403() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccounts_404() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccounts_500() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccounts_405() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccounts_406() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccounts_200() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccounts_429() {
		given().spec(spec).when().get("/accounts/accounts").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountId_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountId_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountId_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountId_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountId_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountId_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountId_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountId_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountId_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdBalances_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdBalances_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdBalances_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdBalances_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdBalances_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdBalances_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdBalances_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdBalances_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdBalances_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/balances").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdBeneficiaries_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdBeneficiaries_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdBeneficiaries_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdBeneficiaries_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdBeneficiaries_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdBeneficiaries_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdBeneficiaries_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdBeneficiaries_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdBeneficiaries_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/beneficiaries").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdDirectDebits_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdDirectDebits_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdDirectDebits_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdDirectDebits_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdDirectDebits_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdDirectDebits_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdDirectDebits_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdDirectDebits_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdDirectDebits_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/direct-debits").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdOffers_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdOffers_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdOffers_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdOffers_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdOffers_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdOffers_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdOffers_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdOffers_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdOffers_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/offers").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdParties_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdParties_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdParties_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdParties_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdParties_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdParties_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdParties_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdParties_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdParties_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/parties").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdParty_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdParty_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdParty_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdParty_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdParty_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdParty_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdParty_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdParty_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdParty_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/party").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdProduct_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdProduct_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdProduct_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdProduct_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdProduct_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdProduct_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdProduct_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdProduct_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdProduct_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/product").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdScheduledPayments_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdScheduledPayments_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdScheduledPayments_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdScheduledPayments_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdScheduledPayments_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdScheduledPayments_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdScheduledPayments_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdScheduledPayments_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdScheduledPayments_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/scheduled-payments").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdStandingOrders_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdStandingOrders_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdStandingOrders_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdStandingOrders_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdStandingOrders_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdStandingOrders_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdStandingOrders_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdStandingOrders_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdStandingOrders_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/standing-orders").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdStatements_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdStatements_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdStatements_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdStatements_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdStatements_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdStatements_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdStatements_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdStatements_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdStatements_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdStatementsStatementId_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdStatementsStatementId_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdStatementsStatementId_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdStatementsStatementId_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdStatementsStatementId_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdStatementsStatementId_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdStatementsStatementId_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdStatementsStatementId_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdStatementsStatementId_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdStatementsStatementIdFile_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdStatementsStatementIdFile_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdStatementsStatementIdFile_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdStatementsStatementIdFile_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdStatementsStatementIdFile_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdStatementsStatementIdFile_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdStatementsStatementIdFile_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdStatementsStatementIdFile_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdStatementsStatementIdFile_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/file").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdStatementsStatementIdTransactions_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/statements/{StatementId}/transactions").then().assertThat().statusCode(429);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 400")
	public void test_getAccountsAccountIdTransactions_400() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(400);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 401")
	public void test_getAccountsAccountIdTransactions_401() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(401);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 403")
	public void test_getAccountsAccountIdTransactions_403() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(403);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 404")
	public void test_getAccountsAccountIdTransactions_404() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(404);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 500")
	public void test_getAccountsAccountIdTransactions_500() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(500);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 405")
	public void test_getAccountsAccountIdTransactions_405() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(405);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 406")
	public void test_getAccountsAccountIdTransactions_406() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(406);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 200")
	public void test_getAccountsAccountIdTransactions_200() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(200);
	}

	@Test
	// @Ignore("TODO: Define request to get HTTP status code 429")
	public void test_getAccountsAccountIdTransactions_429() {
		given().spec(spec).when().get("/accounts/accounts/{AccountId}/transactions").then().assertThat().statusCode(429);
	}

}
