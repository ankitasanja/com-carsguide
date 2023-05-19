package com.carsguide.steps;

import com.carsguide.pages.CarsDealersPage;
import com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class FindDealersSteps {
    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0)  {
        new HomePage().clickOnFindADealerLink();

    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(DataTable dataTable)  {
        String dealerName1 = new CarsDealersPage().verifyDealersOnThePage();
        for (int i = 1; i<8; i++) {
            List<List<String>> data = dataTable.cells(i);
            while (!dealerName1.equalsIgnoreCase(data.get(i).toString())) {
                new CarsDealersPage().clickOnNextButton();
            }
        }
    }
}
