package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;

public class UsedCarSteps {
    @And("^I click \"([^\"]*)\" link$")
    public void iClickLink(String arg0) {
        new HomePage().clickOnUsedLink();
    }

}
