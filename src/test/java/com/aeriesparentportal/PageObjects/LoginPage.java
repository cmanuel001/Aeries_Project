package com.aeriesparentportal.PageObjects;

import com.aeriesparentportal.Utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "portalAccountUsername")
    public WebElement emailField;

    @FindBy(id = "portalAccountPassword")
    public WebElement passwordField;

    @FindBy(id = "LoginButton")
    public WebElement loginBtn;


    public void login(String email, String password){
     emailField.sendKeys(email + Keys.ENTER);
        BrowserUtils.waitFor(2);
     passwordField.sendKeys(password + Keys.ENTER);

    }
}
