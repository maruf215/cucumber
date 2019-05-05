package steps_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objs.CucumberProjectObjs;

public class CucumberProjectTest {
	
	WebDriver driver;
	UI ui;
	CucumberProjectObjs objs;
	String url = "https://www.google.com/";

	@Given("^I want to login$")
	public void i_want_to_login() throws Throwable {
		
		driver=Hooks.driver;
		ui=Hooks.ui;
		driver.get(url);
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		objs = new CucumberProjectObjs(driver, ui);
		objs.test();
	}

	@Then("^I validate the actions$")
	public void i_validate_the_actions() throws Throwable {
		System.out.println("Validate");
	}

}
