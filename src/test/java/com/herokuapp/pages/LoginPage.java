package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(how = How.ID, using = "id-here")
	private WebElement usernameField;
	
	@FindBy(how = How.ID, using = "id-here")
	private WebElement passwordField;
	
	@FindBy(how = How.ID, using = "id-here")
	private WebElement loginButton;
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void openLoginPage(String url) {
		
		driver.get(url);
		
	}
	

	public void login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
		
	}
	


}
