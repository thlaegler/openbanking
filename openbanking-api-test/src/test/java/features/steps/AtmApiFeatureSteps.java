package features.steps;

import static org.hamcrest.CoreMatchers.equalTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AtmApiFeatureSteps extends AbstractFeatureSteps {

  @Given("I'm authorized")
  public void i_m_authorized() {
    // TODO
  }

  @When("I request to get all ATM positions")
  public void i_request_to_get_all_ATM_positions() {
    res(req().when().get());
  }

  @Then("the response should contain a list of ATM positions")
  public void the_response_should_contain_a_list_of_ATM_positions() {
    // res().then().assertThat().body("id", equalTo(5));
  }

  @Then("the list should have an ATM position with ID {int}")
  public void the_list_should_have_an_ATM_position_with_ID(Integer id) {
    res().then().assertThat().body("id", equalTo(id));
  }

}
