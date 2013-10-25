package com.mycompany.app;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebdriverTest1 extends WebdriverSetup{
	
	@Test
	public void launchBrowser() {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("gbqfq")).sendKeys("webdriver");
		driver.findElement(By.id("gbqfb")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
