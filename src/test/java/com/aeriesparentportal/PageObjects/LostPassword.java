package com.aeriesparentportal.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LostPassword extends BasePage {

    @FindBy(id = "txtEmail")
    public WebElement inputEmail;

    @FindBy(id = "btnStep1Next")
    public WebElement nextBtn;

    @FindBy(className = "NotificationBox")
    public WebElement notificationBox;

    @FindBy(xpath = "//span[.='Email Verification']")
    public WebElement getEmailVerHeader;

    @FindBy(xpath = "//span[.='Send Email Verification']")
    public WebElement sendEmailVerMsg;

    @FindBy(className = "HCell")
    public WebElement lossPwInstructionMsg;

    @FindBy(id = "lblStep1Warning")
    public WebElement warningMsg;

    @FindBy(xpath = "//span[.='Email Verification']")
    public WebElement emailVerHeader;

    @FindBy(className = "SuccessBox")
    public WebElement successBoxMsg;

    @FindBy(id = "txtEmail2")
    public WebElement enterEmailEmailVer;

    @FindBy(id = "txtEmailCode")
    public WebElement inputEmailCode;

   @FindBy(xpath = "//input[@name='txtPassword']")
   public WebElement inputNewPassword;

    @FindBy(xpath = "//input[@name='txtPassword2']")
    public WebElement retypeNewPassword;

    @FindBy(xpath = "//input[@id='btnStep3Next']")
    public WebElement getNextBtn;

}
