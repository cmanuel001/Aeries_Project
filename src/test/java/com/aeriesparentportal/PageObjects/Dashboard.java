package com.aeriesparentportal.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage {

    @FindBy(id= "ctl00_lblSchoolName")
    public WebElement schoolName;

    @FindBy(id= "ctl00_lblSchoolYear")
    public WebElement schoolYear;

    @FindBy(id="ctl00_lblWelcomeName")
    public WebElement welcomeEmail;

    @FindBy(tagName = "Aeries Parent Portal")
    public WebElement pageTitle;





}
