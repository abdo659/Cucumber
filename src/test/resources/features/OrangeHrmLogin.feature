Feature: Login Into OrangeHRM

  In order to access home page
  As a registered user
  I want to login into OrangeHRM

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the home page