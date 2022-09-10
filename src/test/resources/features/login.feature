@smoke
Feature: Login Functionality

  Scenario : User is logged in
    Given I navigate to the login page
    When I enter  username and password
    Then I should be logged in


#    Scenario: User logs in with invalid password
#      Given I navigate to the login page
#      When User enters "username"
#      And wrong "password"
#      Then error message will be displayed

