package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class WebdriverSetup {
	
	WebDriver driver = null;

	@BeforeMethod
	@Parameters({ "browser", "location" })
	public void setUp(String browserName, String loc) {
		
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Setting up Firefox Browser");
		} 
		
		else if (browserName.equalsIgnoreCase("chrome") && loc != null) {
			System.setProperty("webdriver.chrome.driver", loc);
			System.out.println("Setting up Chrome Browser");
			driver = new ChromeDriver();
		}

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Closing the browser");
		driver.close();
		driver.quit();
	}


}
