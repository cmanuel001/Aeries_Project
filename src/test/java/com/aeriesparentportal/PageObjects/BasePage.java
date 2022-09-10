package com.aeriesparentportal.PageObjects;

import com.aeriesparentportal.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
