package com.aeriesparentportal.StepDefs;

import com.aeriesparentportal.PageObjects.LoginPage;
import com.aeriesparentportal.Utilities.BrowserUtils;
import com.aeriesparentportal.Utilities.ConfigurationReader;
import static com.aeriesparentportal.Utilities.Driver.*;
import com.aeriesparentportal.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class UIStepDefs {
    LoginPage login = new LoginPage();

    @Given("I navigate to the login page")
    public void iNavigateToLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("aeriesportal.url"));
       BrowserUtils.waitFor(2);
    }
    
    @When("I enter  username and password")
    public void iEnterUsernameAndPassword() {
        login.login(ConfigurationReader.getProperty("aeries.username"), ConfigurationReader.getProperty("earies.password"));
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
        System.out.println(Driver.getDriver().getTitle());
        String actual = getDriver().getTitle();
       assertEquals("Aeries Parent Portal", actual);
    }
    //==========================

}
