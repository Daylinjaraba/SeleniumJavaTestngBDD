package steps;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homeGooglePage;
import pages.resultsGooglePage;
import utils.initialize;

public class googleSearchSteps {

    private String searchPhrase; 
    private homeGooglePage homeGooglePage;
    private resultsGooglePage resultsGooglePage;

    public googleSearchSteps() {
        this.homeGooglePage = new homeGooglePage();
        this.resultsGooglePage = new resultsGooglePage();
    }
    @Before
    public void createDriver() {
    	initialize.getDriver();
    }
    @After
    public void closeDriver() {
    	initialize.tearDown();
    }
    

    @Given("I visit the page {string}")
    public void iVisitThePage(String url) {
        initialize.openPage(url);
    }

    @When("^I search the following item or phrase: \"([^\"]*)\"$")
    public void iSearchTheFollowingItemOrPhrase(String phrase) {
        this.searchPhrase = phrase; // Store phrase for later use
        homeGooglePage.searchPhrase(phrase);
    }

    @Then("I validate the outcomes contain the phrase")
    public void iValidateTheOutcomesContainThePhrase() {
        boolean result = resultsGooglePage.endResult(searchPhrase); // Use stored phrase
        assertTrue(result);
    }
}
