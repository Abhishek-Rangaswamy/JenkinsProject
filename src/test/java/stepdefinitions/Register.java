package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	    System.out.println(">> User got navigated to Register Account page");
	}
	
	@When("User enters below details into the fields")
	public void User_enters_below_details_into_the_fields(DataTable datatable) {
		Map<String, String> map = datatable.asMap(String.class, String.class);
		System.out.println(">> User has entered the firstname as: "+map.get("firstname"));
		System.out.println(">> User has entered the lastname as: "+map.get("lastname"));
		System.out.println(">> User has entered the emailaddress as: "+map.get("emailaddress"));
		System.out.println(">> User has entered the telephone as: "+map.get("telephone"));
		System.out.println(">> User has entered the password as: "+map.get("password"));
	}

	@When("Selects Privacy Policy field")
	public void selects_privacy_policy_field() {
	    System.out.println(">> User has selected the privacy policy field");
	}

	@When("Clicks on continue button")
	public void clicks_on_continue_button() {
	    System.out.println(">> User has clicked on Continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
	    System.out.println(">> User account got successfully created");
	}

	@When("Selects Yes for Newsletter")
	public void selects_yes_for_newsletter() {
	    System.out.println(">> User has selected Yes for Newsletter");
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {
	    System.out.println(">> User has kept all the fields blank");
	}

	@Then("Warning messsages should be displayed for the mandatory fields")
	public void warning_messsages_should_be_displayed_for_the_mandatory_fields() {
	    System.out.println(">> Warning message for all the mandatory fields got displayed");
	}

	@Then("Warning message informating the User about duplicate email should should be displayed")
	public void warning_message_informating_the_user_about_duplicate_email_should_should_be_displayed() {
		System.out.println(">> Warning message informing the user about duplicate email is displayed");
	}

}
