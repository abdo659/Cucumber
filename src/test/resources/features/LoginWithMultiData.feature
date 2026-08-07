Feature: Login Into OrangeHRM

  In order to access home page
  As a registered user
  I want to login into OrangeHRM

  @SmokeTest
  Scenario Outline: Login with multiple data sets
    Given user is on the login page
    When I enter "<username>" and "<password>"
    And user click on the login button
    Then user should be redirected to the home page

    Examples:
      | username | password |
      | Admin    | admin123 |
      | Admin1   | admin123 |
      | Admin    | admin12  |

  //table

#    Scenario: Login with valid credentials
#      Given user is on the login page
#      When I enter "Admin" and "admin123"
#      And user click on the login button
#      Then user should be redirected to the home page