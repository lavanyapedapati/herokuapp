package com.herokuapp.steps;

import cucumber.api.java.en.*;

public class LoginSteps {

	@Given("I am on Heroku login page")
	public void i_am_on_Heroku_login_page() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		
		
		System.out.println("=====================Step1=====================");
		
	}

	@When("I login using {string} and {string}")
	public void i_login_using_and(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		
		System.out.println("=====================Step2=====================");
	}

	@Then("I should be able to successfully login")
	public void i_should_be_able_to_successfully_login() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		
		System.out.println("=====================Step3=====================");
	}

}
