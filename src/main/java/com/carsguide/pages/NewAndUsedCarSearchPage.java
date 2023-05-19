package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement modelDropDown;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement locationDropDown;
    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement priceDropDown;
    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCarTab;

    @CacheLookup
    @FindBy(xpath = "//h5[@class='carListing--textHeading']")
    WebElement resultActualText;

    public void selectOptionsFromMakeDropDown(String make) {
        log.info("Select option from make drop down");
        selectByVisibleTextFromDropDown(makeDropDown,make);
    }
    public void selectOptionsFromModelDropDown(String model) {
        log.info("Select option from model drop down");
        selectByVisibleTextFromDropDown(modelDropDown,model);
    }
    public void selectOptionsFromLocationDropDown(String location) {
        log.info("Select option from location drop down");
        selectByVisibleTextFromDropDown(locationDropDown,location);
    }
    public void selectOptionsFromPriceDropDown(String price) {
        log.info("Select option from location drop down");
        selectByVisibleTextFromDropDown(priceDropDown,price);
    }
    public void clickOnFindMyNextCarTab() {
        log.info("Click on find my next car tab");
        clickOnElement(findMyNextCarTab);
    }
    public String verifyActualTextInResult() {
        return getTextFromElement(resultActualText);

    }

}
