package com.selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeFF {
	// to initialize browser WebDriver instance is called.
	public WebDriver driver;
	
	public InvokeFF() {
		
		//path to set the driver.
		System.setProperty("webdriver.chrome.driver","/home/surya/Downloads/chromedriver"); // Invoke chrome driver
		driver  = new ChromeDriver();
		
		
//		 Invoke firefox driver
		
//		System.setProperty("webdriver.gecko.driver","/home/surya/Downloads/geckodriver"); 
//		driver  = new FirefoxDriver();
//		
		
	
		
		driver.manage().window().maximize();// max window size
	}
	
	@Test
	public void firefoxProgram() {
		
	}
	


}
