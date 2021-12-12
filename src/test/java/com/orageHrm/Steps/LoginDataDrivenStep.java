package com.orageHrm.Steps;

import org.openqa.selenium.WebDriver;

import com.oragehrm.utilites.DriverFactorySingeTone;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;

public class LoginDataDrivenStep {
	DriverFactorySingeTone singleObje = DriverFactorySingeTone.getInstanceDriver();
	LoginPage loginpage;
	WebDriver driver = null;

	@Given("I enter Username as {string} and Password as {string}")
	public void i_enter_username_as_and_password_as(String string, String string2) throws InterruptedException {
		driver = singleObje.openBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginpage = new LoginPage(driver);
		loginpage.login(string, string2);
		Thread.sleep(5000);
		driver.close();
	}

	@Given("login into ORANGE Applicaiton")
	public void login_into_orange_applicaiton(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("login into ORANGE Applicaiton");
	}

}
