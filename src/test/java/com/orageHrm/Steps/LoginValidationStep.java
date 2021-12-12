package com.orageHrm.Steps;

import org.openqa.selenium.WebDriver;

import com.oragehrm.utilites.DriverFactorySingeTone;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginValidationStep {
	DriverFactorySingeTone singleObje = DriverFactorySingeTone.getInstanceDriver();
	LoginPage loginpage;
	WebDriver driver = null;

	@Given("login into invalid Applicaiton")
	public void login_into_invalid_applicaiton() throws InterruptedException {
		driver = singleObje.openBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginpage = new LoginPage(driver);
		loginpage.login("Admin", "admin12334");
		Thread.sleep(5000);
		String errorMessage = loginpage.getErrorMessage();
		System.out.println("Error Message as : " + errorMessage);
		driver.close();
	}

	@Then("validate error message")
	public void validate_error_message() {
		System.out.println("validate error message");
	}
}
