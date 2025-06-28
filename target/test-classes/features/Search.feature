Feature: Search functionality

  Background: 
    Given User opens the application
	
	@Search @smoke
  Scenario: Search for a valid product
    When user enters valid product into search field
    And User clicks on search button
    Then Valid product should get displayed in search results
	
	@Search
  Scenario: Search for a non-existing product
    When user enters non-existing product into search field
    And User clicks on search button
    Then Proper text informing the user about no product matching should be displayed

	@Search
  Scenario: Search without providing providing any product
    When user dont enter any product into search field
    And User clicks on search button
    Then Proper text informing the user about no product matching should be displayed
