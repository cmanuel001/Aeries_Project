
  Feature: Lost Password Functionality

    Scenario: User creates a new password
      Given I navigate to the login page
      And I click on forgotten password
      When I enter "email" address
      Then header "Email Verification"
      And a success message box should be displayed

      Scenario: User enters email verification code
        Given I am on 
        And email code number
        When I click next
        Then a success message box should be displayed
