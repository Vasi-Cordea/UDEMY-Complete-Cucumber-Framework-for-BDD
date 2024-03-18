package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	// Use Cucumber to bind the Feature File step to Java code
	// Glue code - step definitions - step implementation

	WebDriver driver = Hooks.driver;

	@Given("the user is on the login page")
	public void user_on_login_page() {
		System.out.println("user is on the login page");

// Navigate to login page
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@When("the user enters valid credentials")
	public void user_enters_valid_credentials() {
		System.out.println("user enters valid credentials");

		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}

	@Then("the user should be able to view their account balance")
	public void user_should_see_account_balance() {
		System.out.println("user sees account balance");

		String bodyText = findElement(By.xpath("html/body")).getText();
		String logOutMessage = "Log out";
		Assert.assertTrue(bodyText.contains(logOutMessage));

	}

	@When("the user enters bad credentials")
	public void user_enters_bad_credentials() {
		driver.findElement(By.id("username")).sendKeys("student12");
		driver.findElement(By.id("password")).sendKeys("badPassword42");
		driver.findElement(By.id("submit")).click();
	}

	@Then("the user should not be able to login")
	public void user_should_not_login() {
		String bodyText = findElement(By.xpath("html/body")).getText();
		Assert.assertTrue(bodyText.contains("Log out"));

	}

	@And("the user should bet an invalid login message")
	public void user_gets_invalid_message() {
		String bodyText = findElement(By.xpath("html/body")).getText();
		String usernameInvalid = "Your username is invalid!";
		Assert.assertTrue(bodyText.contains("usernameInvalid"));

	}

	@When ("^user enters username as \"(.*)\"$")
	public void enter_username(String username) {
		
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And ("^username enters password as \"(.*)\"$")
public void enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	
}

	@And("user clicks on login")
	public void click_login() {

		driver.findElement(By.id("submit")).click();
	}
	@When ("user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	click_login();
}
    @When("^the user enters set of username and password")
    public void  user_enters_credentials(DataTable credentials) {
    	
    	// Extract data into a Map and iterate over a Map
    	for (Map<String, String> data: credentials.asMaps(String.class, String.class)) {
	
    		//Parse map into local variables
    		String username =data.get("username");
    		String password =data.get("passsword");
    		
    		//Perform action
    		driver.findElement(By.id("username")).clear();
    		driver.findElement(By.id("username")).sendKeys(username);
    		driver.findElement(By.id("password")).clear();
    		driver.findElement(By.id("password")).sendKeys(password);
    	click_login();
    		
    }	
}}