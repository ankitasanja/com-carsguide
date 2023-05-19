package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String arg0) {
        new HomePage().mouseHoverToBuySellTab();
    }

    @And("^I click on \"([^\"]*)\" link$")
    public void iClickOnLink(String arg0) {
        new HomePage().clickOnSearchCarsLink();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String arg0) {

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarSearchPage().selectOptionsFromMakeDropDown(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectOptionsFromModelDropDown(model);
    }

    @And("^I select any location \"([^\"]*)\"$")
    public void iSelectAnyLocation(String location)  {
        new NewAndUsedCarSearchPage().selectOptionsFromLocationDropDown(location);
    }

    @And("^I select price\\(max\\) \"([^\"]*)\"$")
    public void iSelectPriceMax(String price)  {
        new NewAndUsedCarSearchPage().selectOptionsFromPriceDropDown(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        System.out.println(new NewAndUsedCarSearchPage().verifyActualTextInResult());
        Assert.assertTrue(new NewAndUsedCarSearchPage().verifyActualTextInResult().contains(make));


    }





}
