package com.orageHrm.Steps;

import org.openqa.selenium.WebDriver;

import com.oragehrm.utilites.DriverFactorySingeTone;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSetp {
	DriverFactorySingeTone singleObje = DriverFactorySingeTone.getInstanceDriver();
	LoginPage loginpage;
	WebDriver driver = null;

	@Given("login into Orange Applicaiton")
	public void login_into_orange_applicaiton() throws InterruptedException {
		driver = singleObje.openBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginpage = new LoginPage(driver);
		loginpage.login("Admin", "admin123");
		Thread.sleep(5000);
		driver.close();
	}

	@When("get Valid Title of page")
	public void get_valid_title_of_page() throws InterruptedException {
		driver = singleObje.openBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginpage = new LoginPage(driver);
		loginpage.login("Admin", "admin123");
		Thread.sleep(5000);
		System.out.println("get Valid Title of page");
		driver.close();
	}

	@Then("validate title of page")
	public void validate_title_of_page() {
		System.out.println("validate title of page");
	}
}
