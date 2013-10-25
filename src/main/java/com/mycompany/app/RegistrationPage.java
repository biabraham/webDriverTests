package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	WebDriver driver;
	RegistrationSuccessPage registrationSuccessPage;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public RegistrationPage enterFirstName(String firstName){
		
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		return this;
	}
	
	public RegistrationPage enterLastName(String lastName) {
		
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		return this;
	}
	
	public RegistrationPage enterPhoneNumber(String phoneNumber){
		
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		return this;
	}
	
	public RegistrationPage enterEmail(String email) {
		
		driver.findElement(By.name("userName")).sendKeys(email);;
		return this;
	}
	
	public RegistrationPage enterUserName(String userName) {
		
		driver.findElement(By.name("email")).sendKeys(userName);
		return this;
	}
	
	public RegistrationPage enterPassword(String password){
		
		driver.findElement(By.name("password")).sendKeys(password);
		return this;
	}
	
	public RegistrationPage enterCofirmPassword(String password) {
		
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		return this;
	}
	
	public RegistrationSuccessPage clickSubmitButton() {
		driver.findElement(By.name("register")).click();
		return registrationSuccessPage;
		
	}
	
	public void enterDetails() {
		
		
		
		
		
		
		
		
		
	}
	
	

}
