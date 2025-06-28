package stepdefinitions;

import io.cucumber.java.en.*;

public class Search {

	@Given("User opens the application")
	public void user_opens_the_application() {
	    System.out.println(">> Application got opened");
	}

	@When("user enters valid product into search field")
	public void user_enters_valid_product_into_search_field() {
	    System.out.println(">> Valid product got entered into search field");
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	    System.out.println(">> User clicked on search button");
	}

	@Then("Valid product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
	    System.out.println(">> Valid product got entered into search field");
	}

	@When("user enters non-existing product into search field")
	public void user_enters_non_existing_product_into_search_field() {
	    System.out.println(">> Non-existing product got entered into search field");
	}

	@Then("Proper text informing the user about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
	    System.out.println("No product matching message got displayed");
	}

	@When("user dont enter any product into search field")
	public void user_dont_enter_any_product_into_search_field() {
	    System.out.println(">> No product entered into search field");
	}
	
}
