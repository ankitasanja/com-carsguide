package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarsDealersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CarsDealersPage.class.getName());

    public CarsDealersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']")
    WebElement dealerName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']")
    List<WebElement> dealerNamePage;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextButton;

    public void clickOnNextButton() {
        clickOnElement(nextButton);
    }

    public String verifyDealersOnThePage() {
        String dealerName1 = getTextFromElement(dealerName);
        System.out.println(dealerName1);
        return dealerName1;
    }




     public void verifyDealersNameOnThePage() {


//       webElementList(dealersName);
        /*List<WebElement> elements = dealerNamePage;
        for (List<WebElement> elementList: elements) {

        }*/

        /*List<String> dealerNames = dataTable.asList(String.class);

        for (String dealerName : dealerNames) {
            // Find the dealer name element on the page using appropriate locator
            // Implement your logic here

            // Example: Checking if the dealer name is displayed
            WebElement dealerNameElement = driver.findElement(By.xpath("//div[@class='dealerListing--name']" + dealerName + "')]"));
            boolean isDisplayed = dealerNameElement.isDisplayed();
            Assert.assertTrue(isDisplayed);
            // Perform the necessary assertions or store the result for further verification
            // Implement your logic here
        }*/
     }
}
