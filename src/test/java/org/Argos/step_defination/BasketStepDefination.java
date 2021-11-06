package org.Argos.step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.Argos.page_objects.ProductDescPage;
import org.Argos.page_objects.ResultPage;
import org.Argos.page_objects.TrolleyPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class BasketStepDefination {
    private ResultPage resultPage=new ResultPage();
    private ProductDescPage productDescPage=new ProductDescPage();
    private TrolleyPage trolleyPage=new TrolleyPage();
    private String expected;
    @When("^I select any product$")
    public void i_select_any_product() {
        expected=resultPage.selectAProduct();

    }
    @When("^I add a product to trolley$")
    public void  i_add_a_product_to_trolley()  {
        productDescPage.addToTrolley();

    }

    @When("^I go to trolley$")
    public void i_go_to_trolley() {
        productDescPage.goToTrolley();

    }

    @Then("^I should be able to see the selected product in trolley$")
    public void i_should_be_able_to_see_the_respective_product_in_trolley() {
         List<String> actual= trolleyPage.getAllProductsInTrolley();
         assertThat(actual,contains(expected));
    }

    @And("^I remove a product from trolley$")
    public void iRemoveAProductFromTrolley() {
        trolleyPage.removeProduct();
        String actual=trolleyPage.removeProduct();
        //assertThat(actual,contains(expected));
    }

    @Then("^I should see the empty trolley$")
    public void iShouldSeeTheEmptyTrolley() {
    }

    @And("^I continue shopping$")
    public void iContinueShopping() {
        resultPage.continueShopping();
    }

    @Then("^I should be able to see the selected products in trolley$")
    public void iShouldBeAbleToSeeTheSelectedProductsInTrolley() {
    }

    @And("^I increase quantity in trolley page$")
    public void iIncreaseQuantityInTrolleyPage() {
        trolleyPage.increaseQuantityInTrolley(3);
    }

    @Then("^I should be able to see increased quantity for the selected product in trolley page$")
    public void iShouldBeAbleToSeeIncreasedQuantityForTheSelectedProductInTrolleyPage() {
    }
}
