Feature: User Login
  Registered user should be able to login to access account details

  Background: 
    Given User navigates to Login page

  @login @smoke
  Scenario Outline: Login with valid credentials
    When User enters valid email address <email>
    And Enters valid password <password>
    And Clicks on login button
    Then User should login successfully
    Examples:
    |email                 |password|
    |amotooricap9@gmail.com|12345   |
    |amotooricap3@gmail.com|12345   |
    |amotooricap1@gmail.com|12345   |

	@login
  Scenario: Login with invalid credentials
    When User enters invalid email address "amotooricap8296@gmail.com"
    And Enters invalid password "123456789"
    And Clicks on login button
    Then User should login successfully

	@login
  Scenario: Login with valid email address and invalid password
    When User enters valid email address "amotooricap9@gmail.com"
    And Enters invalid password "123456789"
    And Clicks on login button
    Then User should login successfully
