
Feature: Login Functionality


  Scenario: User is logged in
  Given I navigate to the login page
  When I enter "email" and "password"
  Then I should be logged in

    Scenario: User unable to log in with invalid password
      Given I navigate to the login page
      When I enter "email" and invalid "password"
      Then error message "The Username and Password entered are incorrect." be displayed

     Scenario: User enters empty entry on email field
       Given I navigate to the login page
       When no email entered
       Then error message "You must enter a User Name!" be displayed

    Scenario: User enters empty entry on password field
    Given I navigate to the login page
    When no password entered
    Then error message "You must enter a password!" be displayed



