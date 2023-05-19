package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySellTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCarsLink;
    @CacheLookup
    @FindBy(linkText = "Find a Dealer")
    WebElement findADealerLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedLink;

    public void mouseHoverToBuySellTab() {
        log.info("Mouse hover to buy + sell tab");
        mouseHoverToElement(buySellTab);
    }
    public void clickOnSearchCarsLink() {
        log.info("click on search cars link");
        clickOnElement(searchCarsLink);
    }
    public void clickOnFindADealerLink() {
        log.info("click on find a dealer link");
        clickOnElement(findADealerLink);
    }
    public void clickOnUsedLink() {
        log.info("click on used link");
        clickOnElement(usedLink);
    }
}
