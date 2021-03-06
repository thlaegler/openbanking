package com.laegler.openbanking.api.feature.personalCurrentAccounts;

import com.laegler.openbanking.AbstractFeatureSteps;
import com.laegler.openbanking.api.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.StringContains.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import com.laegler.openbanking.model.Error503;
import com.laegler.openbanking.model.Error429;
import com.laegler.openbanking.model.Error408;
import com.laegler.openbanking.model.ErrorDefault;
import com.laegler.openbanking.model.PersonalCurrentAccountResponse;
import com.laegler.openbanking.model.Error400;
import com.laegler.openbanking.model.Error500;

@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T12:58:35.879+13:00")

public class PersonalCurrentAccountsApiFeatureSteps extends AbstractFeatureSteps {

	//TODO: Create your custom steps here
	//@Given("^an example step$")
	//public void an_example_step() throws Throwable {
	//	given().spec(spec());
	//}

}
