package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {
public WebDriver driver;
	
	public FileUpload() {
		

		
		System.setProperty("webdriver.chrome.driver","/home/surya/Downloads/chromedriver"); // Invoke chrome driver
		driver  = new ChromeDriver();
		
		
		
	
		
		
	}
	
	@Test
	public void firefoxProgram() {
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		//driver.get("https://files.fm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[@id='ng-app']/body[@class='ng-scope']/div[@class='container']/div[@class='row']/div[@class='col-md-3']/input[1]")).sendKeys("/home/surya/Desktop/Sorting/Selenium_Prog/InvokeFF.java");
		
		//sendKeys only work when the element has input tag and type = file.

	}

}
