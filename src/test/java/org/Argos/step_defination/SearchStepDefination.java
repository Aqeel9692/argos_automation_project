package org.Argos.step_defination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.Argos.page_objects.HomePage;

public class SearchStepDefination {
    private HomePage homePage=new HomePage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage() {

    }

    @When("^I Search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String searchItem) {
        homePage.search(searchItem);
    }

    @Then("^I should be able to see the respective product$")
    public void i_should_be_able_to_see_the_respective_product()  {

    }


}
