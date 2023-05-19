package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsForSalePage extends Utility {

    private static final Logger log = LogManager.getLogger(UsedCarsForSalePage.class.getName());

    public UsedCarsForSalePage() {
        PageFactory.initElements(driver, this);
    }
}
