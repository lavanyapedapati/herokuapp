package com.herokuapp.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void openDriver() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();// decide it from env
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}
	}

	@After
	public void after(Scenario scenario) {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
