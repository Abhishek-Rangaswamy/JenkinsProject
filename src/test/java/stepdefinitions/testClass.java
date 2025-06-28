package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.core.cli.Main;


public class testClass {

	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
		System.out.println(">> User got navigated to login page");
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String emailAddressText) {
		System.out.println(">> User has entered valid email address: "+emailAddressText);
	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String emailAddressText) {
		System.out.println(">> User enters valid email address: "+emailAddressText);
	}

	@And("^Enters valid password (.+)$")
	public void enters_valid_password(String passwordText) {
		System.out.println(">> User has entered valid password: "+passwordText);
	}
	
	@And("Enters invalid password {string}")
	public void enters_invalid_password(String passwordText) {
		System.out.println(">> User enters valid password: "+passwordText);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		System.out.println(">> User clicks on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println(">> User got logged in suucessfully");
	}

}
