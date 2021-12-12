package com.oragehrm.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactorySingeTone {
	private static DriverFactorySingeTone singleTestdriver = null;
	private WebDriver driver = null;

	private DriverFactorySingeTone() {
	}

	public WebDriver openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static DriverFactorySingeTone getInstanceDriver() {
		if (singleTestdriver == null) {
			singleTestdriver = new DriverFactorySingeTone();
		}
		return singleTestdriver;
	}
}
