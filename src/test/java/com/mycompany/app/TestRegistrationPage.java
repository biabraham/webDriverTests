package com.mycompany.app;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestRegistrationPage extends WebdriverSetup{

	@Test
	public void testRegistrationPage(){
		
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.enterFirstName("bibin");
		registrationPage.enterLastName("abraham");
		registrationPage.enterPhoneNumber("123456789");
		registrationPage.enterEmail("bibin@yahoo.com");
		registrationPage.enterUserName("bibin");
		registrationPage.enterPassword("password");
		registrationPage.enterCofirmPassword("password");
		registrationPage.clickSubmitButton();
		
		
		assert driver.findElement(By.tagName("body")).getText().contains("Thank you for registering. " +
				"You may now sign-in using the user name " +
				"and password you've just entered.");
		 
	}
	
	

}
