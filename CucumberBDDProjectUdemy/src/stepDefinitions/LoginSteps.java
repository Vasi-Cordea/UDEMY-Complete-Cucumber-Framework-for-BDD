package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	//Use Cucumber to bind the Feature File step to Java code
	// Glue code - step definitions - step implementation


	@Given("the user is on the login page")
	public void user_on_login_page() {
		System.out.println("user is on the login page");
	}
		@When("the user enters valid credentials")
		public void user_enters_valid_credentials(){
			System.out.println("user enters valid credentials");
			
			
		}
		
		@Then ("the user should be able to view their account balance")	
		public void user_should_see_account_balance() {
			System.out.println("user sees account balance");
			
			
			
			
		}
	
}
