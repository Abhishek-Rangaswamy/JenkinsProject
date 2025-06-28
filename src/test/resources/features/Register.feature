Feature: User Registration

  Background: 
    Given User navigates to Register Account page
	
	@register @smoke
  Scenario: Register with mandatory fields
    When User enters below details into the fields
    |firstname    |Arun|
    |lastname     |Motoori|
    |emailaddress |arun.motoori@gmail.com|
    |telephone    |12345567890|
    |password     |12345|
    And Selects Privacy Policy field
    And Clicks on continue button
    Then Account should get successfully created
	
	@register @smoke
  Scenario: Register with all fields
     When User enters below details into the fields
    |firstname    |Arun|
    |lastname     |Motoori|
    |emailaddress |arun.motoori@gmail.com|
    |telephone    |12345567890|
    |password     |12345|
    And Selects Yes for Newsletter
    And Selects Privacy Policy field
    And Clicks on continue button
    Then Account should get successfully created

	@register
  Scenario: Register without providing any fields
    When User dont enter details into any fields
    And Clicks on continue button
    Then Warning messsages should be displayed for the mandatory fields
	
	@register
  Scenario: Register with duplicate email address
     When User enters below details into the fields
    |firstname    |Arun|
    |lastname     |Motoori|
    |emailaddress |amotooricap9@gmail.com|
    |telephone    |12345567890|
    |password     |12345|
    And Selects Privacy Policy field
    And Clicks on continue button
    Then Warning message informating the User about duplicate email should should be displayed
