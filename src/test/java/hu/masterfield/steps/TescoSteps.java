package hu.masterfield.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TescoSteps {

    @BeforeAll
    public static void setup() {

    }

    @AfterAll
    public static void cleanup() {

    }


    @Given("I open the home page")
    public void iOpenTheHomePage() {
        
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
    }

    @When("I search for the {string}")
    public void iSearchForThe(String productName) {
    }

    @Then("{string} product are displayed")
    public void productAreDisplayed(String numberOfProducts) {
    }

    @And("the product's name contains {string}")
    public void theProductSNameContains(String productName) {
    }

    @And("header contains the word {string}")
    public void headerContainsTheWord(String productName) {
    }

    @When("I search for {string}")
    public void iSearchFor(String productName) {
    }

    @Then("search function does nothing")
    public void searchFunctionDoesNothing() {

    }

    @Then("message displayed that the search didn't find anything")
    public void messageDisplayedThatTheSearchDidnTFindAnything() {

    }

    @And("{string} button is available")
    public void buttonIsAvailable(String productName) {
    }
}
