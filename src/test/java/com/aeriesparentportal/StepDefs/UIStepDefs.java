package com.aeriesparentportal.StepDefs;

import com.aeriesparentportal.PageObjects.Dashboard;
import com.aeriesparentportal.PageObjects.LoginPage;
import com.aeriesparentportal.PageObjects.LostPassword;
import com.aeriesparentportal.Utilities.ConfigurationReader;
import static com.aeriesparentportal.Utilities.Driver.*;

import com.aeriesparentportal.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;
import static com.aeriesparentportal.Utilities.BrowserUtils.*;


public class UIStepDefs {
    LoginPage login = new LoginPage();
    Dashboard dashboard = new Dashboard();
    LostPassword lostPassword = new LostPassword();

    @Given("I navigate to the login page")
    public void iNavigateToLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("aeriesportal.url"));
     waitFor(2);
    }
    @When("I enter {string} and {string}")
    public void iEnterAnd(String email, String password) {
        email = ConfigurationReader.getProperty("aeries.username");
        password = ConfigurationReader.getProperty("aeries.password");
        login.login(email, password);
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
        assertEquals("Aeries Parent Portal", getDriver().getTitle());
    }
    @When("I enter {string} and invalid {string}")
    public void iEnterAndInvalid(String email, String password) {
        login.login(ConfigurationReader.getProperty("aeries.username"), "jkjstet");
    }
    @When("no email entered")
    public void noEmailEntered() {
        login.emailField.sendKeys("" + Keys.ENTER);
    }
    @Then("error message {string} be displayed")
    public void errorMessageBeDisplayed(String errorMsg) {
        assertEquals(errorMsg, login.errorMsg.getText());
    }
    @When("no password entered")
    public void noPasswordEntered() {
        login.login(ConfigurationReader.getProperty("aeries.username"), "");
    }


    @And("I click on forgotten password")
    public void iClickOnForgottenPassword() {
        login.forgotPassword.click();
        waitFor(3);
    }

    @When("I enter {string} address")
    public void iEnterAddress(String email) {
        email = ConfigurationReader.getProperty("aeries.username");
        lostPassword.inputEmail.sendKeys(email);
        waitFor(2);
        lostPassword.nextBtn.click();
    }

    @Then("header {string}")
    public void header(String header) {
        assertEquals(header, lostPassword.getEmailVerHeader.getText());
    }


    @And("a success message box should be displayed")
    public void aSuccessMessageBoxShouldBeDisplayed() {
        assertTrue(lostPassword.successBoxMsg.isDisplayed());
    }
}
