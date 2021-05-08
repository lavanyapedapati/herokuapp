package com.herokuapp.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.LogoutPage;

import cucumber.api.java.en.*;

public class LoginSteps {
	
	
	private static final String loginPageURL = "http://the-internet.herokuapp.com/login";
	
	private WebDriver driver;
	
	private LoginPage loginPage;
	

	public LoginSteps() {
		driver = Hooks.driver;
	}
	

	@Given("I am on Heroku login page")
	public void i_am_on_Heroku_login_page() {
	
		System.out.println("=====================Step1=====================");
		
		
		loginPage = new LoginPage(driver);
		loginPage.openLoginPage(loginPageURL);
		
	}

	@When("I login using {string} and {string}")
	public void i_login_using_and(String username, String password) {
	
		
		System.out.println("=====================Step2=====================");
		
		loginPage.login(username, password);
	}

	@Then("I should be able to successfully login")
	public void i_should_be_able_to_successfully_login() {
		
		
		System.out.println("=====================Step3=====================");
		
		LogoutPage logoutPage = new LogoutPage(driver);
		boolean isLogoutLinkDisplayed = logoutPage.checkLogoutLink();
		
		Assert.assertTrue(isLogoutLinkDisplayed);
		
		
	}

}
